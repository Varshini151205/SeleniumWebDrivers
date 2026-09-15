package selenium.navigationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class NavigationCommands {

    WebDriver driver;
    String URL;

    @Test(priority = 0)
    public void NavigateDemo() {

        driver = new ChromeDriver();

        driver.navigate().to("https://www.google.co.in");

        driver.manage().window().maximize();

        String BrowserTitle = driver.getTitle();
        System.out.println(BrowserTitle);

        String BrowserURL = driver.getCurrentUrl();
        System.out.println(BrowserURL);

        driver.quit();
    }

    @Test(priority = 1)
    public void NavigateBackDemo() throws Exception {

        driver = new ChromeDriver();

        driver.get("https://www.google.co.in/");

        driver.manage().window().maximize();

        String BrowserTitle = driver.getTitle();
        System.out.println(BrowserTitle);

        driver.navigate().to("https://login.yahoo.com/");

        URL = driver.getCurrentUrl();
        System.out.println(URL);

        Thread.sleep(5000);

        driver.navigate().back();

        URL = driver.getCurrentUrl();
        System.out.println(URL);

        Thread.sleep(5000);

        driver.quit();
    }
    
    @Test(priority = 4)
    public void RefreshDemo() throws Exception {

        driver = new ChromeDriver();

        driver.navigate().to("https://www.google.co.in");

        driver.manage().window().maximize();

        String BrowserTitle = driver.getTitle();
        System.out.println(BrowserTitle);

        String BrowserURL = driver.getCurrentUrl();
        System.out.println(BrowserURL);

        Thread.sleep(5000);

        // Refresh the page
        driver.navigate().refresh();

        Thread.sleep(5000);

        // Get URL after refresh
        BrowserURL = driver.getCurrentUrl();
        System.out.println(BrowserURL);

        driver.quit();
    }

    @Test(priority = 2)
    public void NavigateForward() throws Exception {

        driver = new ChromeDriver();

        driver.get("https://www.google.co.in/");

        driver.manage().window().maximize();

        String BrowserTitle = driver.getTitle();
        System.out.println(BrowserTitle);

        driver.navigate().to("https://login.yahoo.com/");

        URL = driver.getCurrentUrl();
        System.out.println(URL);

        Thread.sleep(5000);

        driver.navigate().back();

        URL = driver.getCurrentUrl();
        System.out.println(URL);

        Thread.sleep(5000);

        driver.navigate().forward();

        URL = driver.getCurrentUrl();
        System.out.println(URL);

        driver.quit();
    }
}