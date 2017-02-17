package com.testautomationassignment.pom.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testautomationassignment.pom.base.BasePage;
import com.testautomationassignment.pom.util.ABCNewsConstants;

public class LaunchPage extends BasePage {
	
     
	
	
	//Creating constructor
		public LaunchPage(WebDriver driver,ExtentTest test)
		{
			super(driver,test);
			
		}
		
		public LandingPage goToLandingPage()
		{
			test.log(LogStatus.INFO, "Opening the URL- "+ ABCNewsConstants.HOMEPAGE_URL);
			driver.get(ABCNewsConstants.HOMEPAGE_URL);
			test.log(LogStatus.PASS, "Navigated to the specified URL Successfully - "+ ABCNewsConstants.HOMEPAGE_URL);
			
			LandingPage landingPage = new LandingPage(driver, test);
			return landingPage;
			
			
			return PageFactory.initElements(driver,LaunchPage.class);
		}

}
