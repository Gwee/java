package com.intigua.applitools;

import com.applitools.eyes.Eyes;
import com.applitools.eyes.EyesException;
import com.applitools.eyes.RectangleSize;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by guy on 24/05/2016.
 */
public class IntiguaApplitoolsDriver{
    private String apiKey = "yRu3101FSVdkFNlzRn0X9Qr9M1adjodm94okVQq80LFPw110";
    private Eyes eyes;
    private WebDriver webDriver;
    private WebDriverWait wait;
    private enum Browsers{
        Chrome, Firefox
    }

    public IntiguaApplitoolsDriver(){
        this.webDriver = new ChromeDriver();
        this.eyes = new Eyes();
        eyes.setApiKey(apiKey);
    }
    public IntiguaApplitoolsDriver(String testName){
        this.webDriver = new FirefoxDriver();
        this.eyes = new Eyes();
        eyes.setApiKey(apiKey);
        try {
            initTest("Intigua", testName, new RectangleSize(1200, 700));
        }catch (EyesException e){
            System.out.println(e.toString());
        }
    }
    public IntiguaApplitoolsDriver(String apiKey, Browsers browser){
        switch (browser){
            case Firefox:
                this.webDriver = new FirefoxDriver();
                break;
            case Chrome:
                this.webDriver = new ChromeDriver();
                break;
        }
        this.eyes = new Eyes();
        this.apiKey = apiKey;
    }

    protected WebDriver getWebDriver() {
        return webDriver;
    }
    public void captureScreen(String screenName){
        eyes.checkWindow(screenName);
    }
    protected Eyes getEyes() {
        return eyes;
    }
    protected void getSite(String url){
        webDriver.get(url);
    }
    protected void waitForElementPresent(By by, int waitTime){
        this.wait = new WebDriverWait(webDriver,waitTime);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    protected void initTest(String appName, String testName, RectangleSize resolution) throws EyesException{ //// FIXME: 24/05/2016 use ENUM for resolutions
        try {
            this.webDriver = eyes.open(webDriver,appName,testName,resolution);
        }catch (EyesException e){
            throw new EyesException(e.toString());
        }
    }
    protected void tearDown(){
        eyes.close();
        eyes.abortIfNotClosed();
        webDriver.close();

    }
}
