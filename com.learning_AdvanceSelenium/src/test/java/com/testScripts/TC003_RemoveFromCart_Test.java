package com.testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.generic_Library.WebDriver_Utility;

public class TC003_RemoveFromCart_Test extends TC002_AddToCart_Test{

	@Test(groups = {"regressionTesting"})
	
	public void removeFromCart() throws InterruptedException{
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		driver.findElement(By.xpath("(//a[text() = 'Casual Golf Belt'])[2]/ancestor::tr[@class = 'cart-item-row']/descendant::td[@class = 'remove-from-cart']")).click();
		driver.findElement(By.cssSelector("[name = 'updatecart']")).click();
WebDriver_Utility.scrollToWebElement(driver,driver.findElement(By.xpath("//h1[text() = 'Shopping cart']")));
		
		try {
			Reporter.log("Element is Present....",true);
			WebDriver_Utility.takesSreenShotOfWebPage(driver, "removefromshoppingCart");
			
		} catch (Exception e) {
			// TODO: handle exception
			Reporter.log("Element is not Present....",true);
		}
		Thread.sleep(1000);
		
		
	}
}
