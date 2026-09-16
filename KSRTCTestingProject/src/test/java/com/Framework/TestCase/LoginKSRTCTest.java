package com.Framework.TestCase;

import org.testng.annotations.Test;

import com.Framework.pages.BaseClass;
import com.Framework.pages.LoginPage;

import utility.ExcelDataProvider;

public class LoginKSRTCTest extends BaseClass {

    @Test
    public void loginApp() throws Exception {

        ExcelDataProvider excel = new ExcelDataProvider();

        LoginPage loginKSRTC = new LoginPage(driver);

        loginKSRTC.loginKSRTC(
                excel.getStringData("LoginKSRTC", 0, 0),
                excel.getStringData("LoginKSRTC", 0, 1),
                excel.getStringData("LoginKSRTC", 0, 2)
        );

        Thread.sleep(5000);
    }
}