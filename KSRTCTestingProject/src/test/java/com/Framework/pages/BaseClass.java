package com.Framework.pages;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import utility.BrowserFactory;
import utility.ConfigDataProvider;
import utility.ExcelDataProvider;
import utility.Helper;
public class BaseClass {
    public WebDriver driver;
    public ExcelDataProvider excel;
    public ConfigDataProvider config;
    @BeforeSuite
    public void Setup() {

        excel = new ExcelDataProvider();
        config = new ConfigDataProvider();
    }
    @BeforeClass
    public void LaunchApplication() {
        driver = BrowserFactory.getBrowser(config.getBrowser());
        driver.manage().window().maximize();
        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));
        driver.get(config.getAppUrl());
    }
    @AfterClass
    public void tearDown() {
        Helper.capturedScreenShot(driver);
        BrowserFactory.quitBrowser(driver);
    }
}