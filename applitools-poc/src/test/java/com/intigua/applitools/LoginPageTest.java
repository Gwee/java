package com.intigua.applitools;

import com.applitools.eyes.RectangleSize;
import org.testng.annotations.*;

import java.lang.reflect.Method;

/**
 * Created by guy on 26/05/2016.
 */
public class LoginPageTest {
    private IntiguaApplitoolsDriver intiguaDriver = new IntiguaApplitoolsDriver();
    private IntiguaHomePage intiguaHomePage = new IntiguaHomePage(intiguaDriver.getWebDriver());
    private TabMenu tabMenu;
    private String testName;

    @BeforeMethod
    public void handleTestMethodName(Method method) throws Exception {
        testName = method.getName();
        intiguaDriver.initTest("Intigua",testName,new RectangleSize(1200,700));
    }
    @BeforeTest
    public void login(){
        intiguaHomePage.login("guy@intigua.local","53593593Dc");
        intiguaHomePage.goToIntigua();
        tabMenu = intiguaHomePage.tabMenu();
    }

    @Test
    public void clickLibrary(){
        tabMenu.getLibraryPage();
        intiguaDriver.captureScreen("Library Page");
    }
    @Test
    public void newClickLibrary(){
        LibraryPage libraryPage = (LibraryPage)tabMenu.goTo(TabMenuType.LIBRARY);
        intiguaDriver.captureScreen("New Library Page");

    }
    @Test
    public void clickServers(){
        tabMenu.getServersPage();
    }

    @Test
    public void clickCompliancePage(){
        tabMenu.getComplianceDashboardPage();
    }

    @AfterMethod
    public void captureScreen(){
        // FIXME: 6/11/2016 can capture screen here if needed
    }
    @AfterTest
    public void close(){
        intiguaDriver.tearDown();
    }
}
