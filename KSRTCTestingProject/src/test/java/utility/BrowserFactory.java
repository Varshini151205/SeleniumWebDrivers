package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    public static WebDriver getBrowser(String browser) {

        WebDriver driver = null;

        if (browser.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();

        } else {

            System.out.println("Browser not supported: " + browser);
        }

        return driver;
    }

    public static void quitBrowser(WebDriver driver) {

        if (driver != null) {
            driver.quit();
        }
    }
}