package test;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import utility.Baseclass;
import utility.Excelsheet;


public class Sign_In_Page extends Baseclass{

public static Excelsheet excel;

	@Test
	
	public void sign_in() throws InterruptedException, IOException {
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	  excel=new Excelsheet();
	
	    WebElement Email = driver.findElement(By.xpath("(//android.widget.EditText)[1]"));
	    
	    Email.click();
	    
	    Thread.sleep(2000);
	    
	    Email.sendKeys(excel.getStringData("Signin_data", 0, 1));
	    
	  // Email .sendKeys("vpatil@gmail.com");	
		
	 
	   WebElement Password = driver.findElement(By.xpath("(//android.widget.EditText)[2]"));

	   Password.click();
	   Thread.sleep(2000);
	   
     	 // Password.sendKeys("vpatil@123");
	   
	     Password.sendKeys(excel.getStringData("Signin_data", 1, 1));
		
	     Thread.sleep(2000);
	     
	   
	     driver.findElement(By.xpath("//android.widget.Button[@content-desc='Sign In']")).click();

	     Thread.sleep(2000);
	     
	     
	    // driver.findElement(AppiumBy.accessibilityId("Tab 2 of 3")).click();//logout 
	     
		
	}
	
	
	
	

}
