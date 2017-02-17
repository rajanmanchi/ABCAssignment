package com.testautomationassignment.pom.pages;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testautomationassignment.pom.base.BasePage;

public class JustInPage extends BasePage{
	
           //Creating constructor
			public JustInPage(WebDriver driver,ExtentTest test)
			{
				super(driver,test);
			}
	
	       public void verifyTitle()
	       {
	    	   test.log(LogStatus.INFO, "Verifying the title of the page");
	       }
}
