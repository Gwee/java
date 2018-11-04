package com.intigua.applitools; /**
 * Created by guy on 24/05/2016.
 */
import com.applitools.eyes.Eyes;
import com.applitools.eyes.RectangleSize;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.net.URISyntaxException;

public class TestApplitoolsWebsite {

    public static void main(String[] args) throws URISyntaxException, InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "/Users/guy/Documents/Dev/JavaDev/chromedriver");
        WebDriver driver = new FirefoxDriver();

        Eyes eyes = new Eyes();
        // This is your api key, make sure you use it in all your tests.
        eyes.setApiKey("yRu3101FSVdkFNlzRn0X9Qr9M1adjodm94okVQq80LFPw110");

        try {
            // Start visual testing with browser viewport set to 1024x768.
            // Make sure to use the returned driver from this point on.
            driver = eyes.open(driver, "Applitools", "Test Web Page", new RectangleSize(990, 700));

            driver.get("http://applitools.com");

            // Visual validation point #1
            eyes.checkWindow("Main Page");

            driver.findElement(By.cssSelector(".features>a")).click();

            // Visual validation point #2
            eyes.checkWindow("Features page");

            // End visual testing. Validate visual correctness.
            eyes.close();
        } finally {
            // Abort test in case of an unexpected error.
            eyes.abortIfNotClosed();
            driver.close();
        }
    }
}