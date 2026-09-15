package screenShotsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import library.Reusability;

public class TakeScreenShot1 {

	public void Browser() throws Exception{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
		
		Reusability.capturedScreenShot(driver, "A. Launch Application-Take screenshot");
		driver.findElement(By.id("username")).sendKeys("bobbalavarshini1512@gmail.com");
		driver.findElement(By.id("password")).sendKeys("varshini123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("///button[@name=action]")).click();
		
		Reusability.capturedScreenShot(driver,"B. Click Sign In button - Take screenshot");
		driver.quit();
	}
}
