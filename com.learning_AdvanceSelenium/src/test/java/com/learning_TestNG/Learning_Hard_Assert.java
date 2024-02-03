package com.learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Learning_Hard_Assert {
	
	@Test
	public void loginTest() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		//Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "I am validating Title");//for passing test case
		Assert.assertEquals(driver.getTitle(), "Flipkart", "I am validating Title"); //for failing test case
		driver.findElement(By.linkText("Log in")).click();
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("shivanimiglani13@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Test@123");
		driver.findElement(By.xpath("(//input[@type = 'submit'])[2]")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
