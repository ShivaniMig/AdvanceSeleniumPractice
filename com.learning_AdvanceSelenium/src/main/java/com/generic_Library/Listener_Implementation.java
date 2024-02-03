package com.generic_Library;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
//source<
public class Listener_Implementation implements ITestListener {

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		
		String time = new Date().toString().replace(" ","_").replace(":","_");
		String name = result.getMethod().getMethodName();
		
		TakesScreenshot ts = (TakesScreenshot) Base_Test_2.sDriver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("./src/test/resources/screenshots/"+ name + time +".jpeg");
        try {
        FileHandler.copy(source, destination);
        
}
        catch (IOException e) {
        	e.printStackTrace();
        }
		
	}

}
