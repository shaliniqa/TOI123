package com.qait.demo.tests;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;

public class TOI_isRightPage {
	private TestSessionInitiator testSessionInitiator;
	
	@BeforeTest
    public void initializeVariable(){
        testSessionInitiator = new TestSessionInitiator(this.getClass().getName());
	}
	
	@Test
	public void verifyPage()
	{
		testSessionInitiator.launchApplication();
		testSessionInitiator.toiHomePageAction.verifyIsOnRightPage();
		//testSessionInitiator.toiHomePageAction.HandlePopUp();

	}
	
}
