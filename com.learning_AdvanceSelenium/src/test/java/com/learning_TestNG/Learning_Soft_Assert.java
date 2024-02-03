package com.learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Learning_Soft_Assert {

	@Test
	public void loginTest() throws InterruptedException {
		
		SoftAssert ast = new SoftAssert();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		ast.assertEquals(driver.getTitle(), "Demo Web Shop", "I am validating Title");//for passing test case
		//ast.assertEquals(driver.getTitle(), "Flipkart", "I am validating Title");//for passing test case
		driver.findElement(By.linkText("Log in")).click();
		
		//ast.assertEquals(driver.getTitle(), "Demo Web Shop. Login" ,"I am validating Title");//for passing
		ast.assertEquals(driver.getTitle(), "Demo Web" ,"I am validating Title");//for failing
		
		driver.findElement(By.id("Email")).sendKeys("shivanimiglani13@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Test@123");
		driver.findElement(By.xpath("(//input[@type = 'submit'])[2]")).click();
		
		ast.assertEquals(driver.getTitle(), "Demo Web Shop");
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(2000);
		driver.quit();
		ast.assertAll();//where it get assert all execution will stop.so we will write it after driver.quit
}
}
