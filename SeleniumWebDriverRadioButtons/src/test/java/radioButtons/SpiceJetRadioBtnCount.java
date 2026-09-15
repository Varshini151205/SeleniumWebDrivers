package radioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpiceJetRadioBtnCount {

	@Test
	public void TestRadioBtn() throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//input[@id='male']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='female']]")).click();
		Thread.sleep(5000);
		
		
	}

}
