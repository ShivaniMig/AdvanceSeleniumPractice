package com.learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//for multiple @Test order will be this always
//BM-testcase-AM
//before method-registertest-after method,again = before method-logintest-aftermethod,again=before method-searchtest-aftermethod
public class Learning_Configuration_Annotation {
	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Executing before suite...!!!", true);
	}
	@AfterSuite
	public void AfterSuite() {
		Reporter.log("Executing After suite...!!!", true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Executing before Test...!!!", true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("Executing after Test...!!!", true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("Executing before class...!!!", true);
	}
	@AfterClass
	public void afterClass() {
		Reporter.log("Executing after class...!!!", true);
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Executing before method...!!!", true);
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("Executing after method...!!!", true);
	}
	
	@Test(priority = 2)
	public void loginTest() {		
	
		Reporter.log("Executing Login Test case...!!!", true);	
	}

	@Test(priority = 1)
	public void registerTest() {
		Reporter.log("Executing register Test case...!!!", true);
	}
	
	@Test(priority = 3)
	public void searchTest() {
		Reporter.log("Executing Search Test case...!!!", true);
	}
	

}
