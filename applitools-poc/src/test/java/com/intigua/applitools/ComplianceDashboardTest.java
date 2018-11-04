package com.intigua.applitools;

import org.testng.annotations.*;

/**
 * Created by Guy on 5/24/2016.
 */
public class ComplianceDashboardTest {
    private String site = "https://bughunt.intigua.local/vmanage-server/";
    private String testName = this.getClass().getName();

    @BeforeTest
    public void login(){
    }

    @Test
    public void testDashboard(){
        //Assert.assertEquals(actual, 12);// FIXME: 26/05/2016 try using assert
    }

    @AfterTest
    public void close(){
    }

}
