package com.learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Learning_Enabled_Attribute {
	@Test(priority = 2)
	public void loginTest() {		
	
		Reporter.log("Executing Login Test case...!!!", true);	
	}

	@Test(enabled = false)
	public void registerTest() {
		Reporter.log("Executing register Test case...!!!", true);
	}
	
	@Test(priority = 3)
	public void searchTest() {
		Reporter.log("Executing Search Test case...!!!", true);
	}

}
