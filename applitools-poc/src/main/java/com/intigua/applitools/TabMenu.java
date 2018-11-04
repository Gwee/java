package com.intigua.applitools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Guy on 5/26/2016.
 */
public class TabMenu {
    WebDriver driver;
    @FindBy(id = "homePage_dashboard")
    WebElement dashboardTab;
    @FindBy(id = "homePage_policy")
    WebElement policyTab;
    @FindBy(id = "homePage_servers")
    WebElement serversTab;
    @FindBy(id = "homePage_library")
    WebElement libraryTab;
    @FindBy(id = "homePage_activities")
    WebElement activitiesTab;
    @FindBy(id = "homePage_logs")
    WebElement logsTab;
    @FindBy(id = "homePage_users")
    WebElement usersTab;
    @FindBy(id = "homePage_settings")
    WebElement settingsTab;
    @FindBy(id = "homePage_switchToNewWorkspace")
    WebElement complianceTab;

    private Object dashboardPage, policyPage, serversPage, libraryPage, activitiesPage, logsPage, usersPage, settingsPage;
    private ComplianceDashboardPage complianceDashboardPage;

    // FIXME: 6/18/2016 change every Object to the relevant object (see for example LibraryPage)
    public Object getDashboardPage() {
        dashboardTab.click();
        return dashboardPage;
    }
    public Object getPolicyPage() {
        policyTab.click();
        return policyPage;
    }
    public Object getServersPage() {
        serversTab.click();
        return serversPage;
    }
    public LibraryPage getLibraryPage() {
        libraryTab.click();
        return (LibraryPage)libraryPage;
    }
    public Object getActivitiesPage() {
        activitiesTab.click();
        return activitiesPage;
    }
    public Object getLogsPage() {
        logsTab.click();
        return logsPage;
    }
    public Object getUsersPage() {
        usersTab.click();
        return usersPage;
    }
    public Object getSettingsPage() {
        settingsTab.click();
        return settingsPage;
    }
    public ComplianceDashboardPage getComplianceDashboardPage() {
        complianceTab.click();
        complianceDashboardPage = PageFactory.initElements(driver,ComplianceDashboardPage.class);
        return complianceDashboardPage;
    }
    public void logout(){
        // FIXME: 6/18/2016 add WebElement and implement here
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WithTabs goTo(TabMenuType type) {
        switch (type){
            case LIBRARY:
                return getLibraryPage();
            default:
                throw new RuntimeException("Type is not supported yet");
        }
    }
}
