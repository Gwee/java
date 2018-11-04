package com.intigua.applitools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by guy on 26/05/2016.
 */
public class IntiguaHomePage {
    protected WebDriver driver;
    private String site = "https://199.203.63.204/vmanage-server/"; // FIXME: 26/05/2016 get this from property file

    public IntiguaHomePage(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(site);
    }
    public void login(String user, String pass){
        driver.findElement(By.id("loginPage_userNameInput")).sendKeys(user);
        driver.findElement(By.id("loginPage_passwordInput")).sendKeys(pass);
        driver.findElement(By.id("loginPage_loginButton")).click();
    }
    public void goToIntigua(){
        driver.findElement(By.cssSelector("body > app-root > app-page-layout > div > div.header-wrapper > div > div.header-icon.module.btn-div")).click();
    }
    public TabMenu tabMenu(){
        TabMenu tabMenu = PageFactory.initElements(driver,TabMenu.class);
        tabMenu.setDriver(driver);
        return tabMenu;
    }

//    public ComplianceDashboardPage switchToCompliancePage(){
//        driver.findElement(By.id("homePage_switchToNewWorkspace")).click();
//        ComplianceDashboardPage compliancePage = PageFactory.initElements(driver,ComplianceDashboardPage.class);
//        return compliancePage;
//    }
}
