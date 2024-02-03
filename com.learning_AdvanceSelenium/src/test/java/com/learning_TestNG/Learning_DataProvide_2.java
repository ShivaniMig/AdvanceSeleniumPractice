package com.learning_TestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Learning_DataProvide_2 {

	
	@Test(dataProvider = "searchData")
	public void searchItems(String item) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys(item,Keys.ENTER);
		Thread.sleep(1000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("./src/test/resources/screenshots/"+item+".jpeg");
       
        try {
        FileHandler.copy(source, destination);
        
}
        catch (IOException e) {
        	e.printStackTrace();
        }
		driver.quit();
		
	}
	
	@DataProvider(name = "searchData")
	public Object [][] searchData()
	{
	
	
	 Object [][] data = new Object[10][1];
	 
	
	 data[0][0] = "mobile";
	 data[1][0] = "shirts";
	 data[2][0] = "toys";
	 data[3][0] = "charger";
	 data[4][0] = "blanket";
	 data[5][0] = "laptop";
	 data[6][0] = "bedsheet";
	 data[7][0] = "curtain";
	 data[8][0] = "pillow";
	 data[9][0] = "almirah";
	  return data;
}
}
