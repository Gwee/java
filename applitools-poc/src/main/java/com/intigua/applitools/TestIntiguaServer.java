package com.intigua.applitools;

import com.applitools.eyes.Eyes;
import com.applitools.eyes.RectangleSize;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by guy on 24/05/2016.
 */
public class TestIntiguaServer {
    public static void main(String[] args) throws InterruptedException {
        IntiguaApplitoolsDriver myApplitools = new IntiguaApplitoolsDriver();
        myApplitools.initTest("Intigua","Test", new RectangleSize(1200, 700));
        WebDriver driver = myApplitools.getWebDriver();
        driver.get("https://bughunt.intigua.local/vmanage-server/");
        Eyes eyes = myApplitools.getEyes();
        eyes.checkWindow("Login Page");
        driver.findElement(By.id("loginPage_userNameInput")).sendKeys("admin");
        driver.findElement(By.id("loginPage_passwordInput")).sendKeys("admin");
        driver.findElement(By.id("loginPage_loginButton")).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
//        Change to dashboard iFrame
        Thread.sleep(8000); // FIXME: 5/24/2016 cannot find by iFrame so using Thread.sleep
//        driver.switchTo().defaultContent();
//        driver.switchTo().frame(driver.findElement(By.className("dashboardContainer")));
//        wait.until(ExpectedConditions.presenceOfElementLocated((By.id("dashboardTab_servers_number"))));
//        driver.switchTo().defaultContent();

//        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        eyes.checkWindow("Dashboard");
        driver.findElement(By.id("homePage_switchToNewWorkspace")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((By.id("compliance-dashboard_refresh-button"))));
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        eyes.checkWindow("Compliance Dashboard");
        driver.findElement(By.id("page-tools")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".servers-map__endpoint--transparent")));
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        eyes.checkWindow("Tools Overview");
        eyes.close();
        eyes.abortIfNotClosed();
        driver.close();
    }

}
