package com.learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class First_TestNG_Class {
	@Test//acts like a main method.Also we have to bind this with a method everytime.
	public void loginTest() {		//acts like a test case
	
		Reporter.log("Executing Login Test case...!!!", true);		//steps of test case
	}

	@Test
	public void registerTest() {
		Reporter.log("Executing register Test case...!!!", true);
	}
	
	@Test
	public void searchTest() {
		Reporter.log("Executing Search Test case...!!!", true);
	}
	
}
