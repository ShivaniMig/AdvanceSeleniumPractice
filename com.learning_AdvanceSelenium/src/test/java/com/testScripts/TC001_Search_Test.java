package com.testScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.generic_Library.Base_Test;
import com.generic_Library.Base_Test_2;
import com.generic_Library.WebDriver_Utility;

public class TC001_Search_Test extends Base_Test_2{

	@Test(groups = {"smokeTesting"})
	
	public void searchTest() throws InterruptedException {
		
		driver.findElement(By.name("q")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@value = 'Search']")).click();
		Thread.sleep(1000);
		WebDriver_Utility.scrollToWebElement(driver, driver.findElement(By.xpath("//h1[text() = 'Search']")));
		test.log(Status.PASS,"Product Searched");
		
		WebDriver_Utility.takesSreenShotOfWebPage(driver, "mobileSearch");
	}
}
