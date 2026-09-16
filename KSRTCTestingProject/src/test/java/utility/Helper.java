package utility;
import java.io.File;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	
		public static void capturedScreenShot(WebDriver driver) {
			try {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, 
						new File("./ScreenShots/KSRTCLogin_"+ getCurrentDateTime()+".png"));
				System.out.println("captured screenshot - on failure");
			}
			catch (Exception e) {
				System.out.println("Exception while taking Screenshot"+e.getMessage());
			}
		}
		public static String getCurrentDateTime() {
			DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
			Date currentdate = new Date();
			return customFormat.format(currentdate);
			
		}
}
