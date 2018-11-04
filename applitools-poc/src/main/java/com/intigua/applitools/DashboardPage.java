package com.intigua.applitools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by guy on 26/05/2016.
 */
public class DashboardPage {
    WebDriver driver;
    private Object libraryPage;

    public void setDriver(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(id = "homePage_library")
    private WebElement libraryTab;


    public Object getLibraryPage() {
        libraryTab.click();
        return libraryPage;
    }
}
