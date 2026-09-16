package com.Framework.pages;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[contains(@class,'payee-info-inputs')]//input[@type='text' and not(@readonly)]")
    List<WebElement> emailFields;

    @FindBy(xpath = "//div[contains(@class,'payee-info-inputs')]//input[@type='tel']")
    List<WebElement> mobileFields;

    @FindBy(xpath = "//div[contains(@class,'payee-info-inputs')]//input[@type='password']")
    List<WebElement> passwordFields;

    @FindBy(xpath = "//input[@type='checkbox']")
    List<WebElement> checkboxes;

    @FindBy(xpath = "//div[contains(@class,'btn') and contains(@class,'payee') and normalize-space()='Login']")
    List<WebElement> loginButtons;
    public void loginKSRTC(String emailId, String mobile, String pass) {
        for (WebElement element : emailFields) {
            if (element.isDisplayed() && element.isEnabled()) {
                element.click();
                element.sendKeys(emailId);
                break;
            }
        }
        for (WebElement element : mobileFields) {
            if (element.isDisplayed() && element.isEnabled()) {
                element.click();
                element.sendKeys(mobile);
                break;
            }
        }
        for (WebElement element : passwordFields) {
            if (element.isDisplayed() && element.isEnabled()) {
                element.click();
                element.sendKeys(pass);
                break;
            }
        }
        for (WebElement element : checkboxes) {
            if (element.isDisplayed() && element.isEnabled()) {
                if (!element.isSelected()) {
                    element.click();
                }
                break;
            }
        }
        for (WebElement element : loginButtons) {
            if (element.isDisplayed() && element.isEnabled()) {
                element.click();
                break;
            }
        }
    }
    public void tearDown() {
        driver.quit();
    }
}