package utility;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class appiumscreenshot {
	
	
public static void getscreenshot(WebDriver driver) throws IOException {
		
		Date currentdate = new Date();
		String  a = currentdate.toString().replace(":","");
		File s  = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File d = new File (System.getProperty("user.dir")  +"//screenshot/fail"+a+".png");
		
		FileUtils.copyFile(s, d);
		

	}
	
}