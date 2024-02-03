package com.generic_Library;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_Test {
	
	public WebDriver driver;
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	//@BeforeClass(groups = {"regressionTesting","smokeTesting"})
	public void openBrowser(String BROWSER) {
		
		if(BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		else if(BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		else if(BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		}
		else {
			driver = new ChromeDriver();
		}
		
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginToDWS() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("shivanimiglani13@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Test@123");
		driver.findElement(By.xpath("(//input[@type = 'submit'])[2]")).click();
	}
	
	@AfterMethod(alwaysRun = true)
	public void logoutFromDWS() {
		driver.findElement(By.linkText("Log out")).click();
		
	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
	}
}
