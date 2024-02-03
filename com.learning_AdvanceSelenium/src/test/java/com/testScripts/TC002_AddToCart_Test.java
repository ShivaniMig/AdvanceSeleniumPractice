package com.testScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.generic_Library.Base_Test;
import com.generic_Library.WebDriver_Utility;

public class TC002_AddToCart_Test extends Base_Test {
	
	@Test(groups = {"regressionTesting"})
	
	public void addToCart() throws InterruptedException {
		
		driver.findElement(By.partialLinkText("APPAREL & SHOES")).click();
		driver.findElement(By.xpath("//a[text() = 'Casual Golf Belt']/ancestor::div[@class = 'details']/descendant::input[@type = 'button']")).click();
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		
		WebDriver_Utility.scrollToWebElement(driver,driver.findElement(By.xpath("//h1[text() = 'Shopping cart']")));
		
		try {
			Reporter.log("Element is Present....",true);
			WebDriver_Utility.takesSreenShotOfWebPage(driver, "addtoshoppingCart");
			
		} catch (Exception e) {
			// TODO: handle exception
			Reporter.log("Element is not Present....",true);
		}
		Thread.sleep(1000);
		
	}
	

}
