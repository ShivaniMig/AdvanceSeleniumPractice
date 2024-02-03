package com.learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Learning_Depends_On_Methods_Attribute {

	@Test(dependsOnMethods = "registerTest")
	public void loginTest() {		
	
		Reporter.log("Executing Login Test case...!!!", true);	
	}

	@Test
	public void registerTest() {
		Reporter.log("Executing register Test case...!!!", true);
	}
	
	@Test(dependsOnMethods = {"registerTest","loginTest"})
	public void searchTest() {
		Reporter.log("Executing Search Test case...!!!", true);
	}
	
}
