package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

import utility.Baseclass;

public class Registration extends Baseclass {
	
	@Test 
	//Registration link
	public void Registeration() throws InterruptedException {
				
		
		driver.findElement(AppiumBy.accessibilityId("Register")).click();
    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		WebElement element = driver.findElement(By.xpath("(//android.widget.EditText)[1]"));
		element.click();
		Thread.sleep(2000);										
		element.sendKeys("Walter");
	
		WebElement Email = driver.findElement(By.xpath("(//android.widget.EditText)[2]"));
		Email.click();							
		Thread.sleep(2000);									
		Email.sendKeys("Walter987@gmail.com");
	    
		WebElement password = driver.findElement(By.xpath("(//android.widget.EditText)[3]"));
	    password.click();
		Thread.sleep(2000);
	    password.sendKeys("Walter@9876");
	    
	    Thread.sleep(2000);
	    driver.findElement(AppiumBy.accessibilityId("Sign Up")).click();
		
		
		
		
		
	}
	

}
