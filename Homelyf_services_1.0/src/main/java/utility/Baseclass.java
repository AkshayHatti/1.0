package utility;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Baseclass {
	
	public AppiumDriverLocalService service;
	
	public AndroidDriver driver;
	
	@BeforeMethod
	
	public void appiumtest() throws MalformedURLException {
		
		 service = new AppiumServiceBuilder ().withAppiumJS(new File("C:\\Users\\AKSHAY\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
			
			service.start();
		
//			AppiumDriverLocalService service = new AppiumServiceBuilder ().withAppiumJS(new File("C:\\Users\\AKSHAY\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//					.withIPAddress("127.0.0.1").usingPort(4723).build();
				
		
		
		
     		UiAutomator2Options options = new UiAutomator2Options ();
			
			options.setDeviceName("Pixel 6a");
			
	//		options.setPlatformName(null)
			
			options.setApp("E:\\software testing and automation\\latest eclipse\\Homelyf_services_1.0\\src\\test\\resources\\apk'\\app-release.apk");
			
		     driver= new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("newCommandTimeout", 100);
			
//			
	}
	
//	@AfterMethod
//	public void failScreenshot(ITestResult result) throws IOException {
//		
//		if(ITestResult.SUCCESS==result.getStatus()) {
//			appiumscreenshot.getscreenshot(driver);
//		}else
//		
//		if(ITestResult.FAILURE==result.getStatus()) {
//			appiumscreenshot.getscreenshot(driver);
//		}
//	}
	
//	@AfterMethod
//	
//	public void tearDown() {
//		
//	driver.quit();
//
//	    service.stop();
//	
//	}
//	
	
	
	

}
