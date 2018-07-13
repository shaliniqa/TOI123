package com.qait.demo.keywords;

import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.GetPage;

public class TOIHomePageAction extends GetPage {

	public TOIHomePageAction(WebDriver driver) {
		super(driver, "TOIHomePage");
		// TODO Auto-generated constructor stub
	}
	

	public void verifyIsOnRightPage()
	{
		wait.waitForPageToLoadCompletely();
		isElementDisplayed("TOI_title");
		handleAlert("dismiss");

		//verifyPageTitleContains();


	}
	/*public void HandlePopUp()
	{
		handleAlert("dismiss");
		//isElementEnabled("PopUp", false);
		
	}
*/
}
