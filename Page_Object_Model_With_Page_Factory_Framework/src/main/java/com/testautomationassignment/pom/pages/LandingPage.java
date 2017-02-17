package com.testautomationassignment.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testautomationassignment.pom.base.BasePage;
import com.testautomationassignment.pom.util.ABCNewsConstants;

public class LandingPage extends BasePage {
	        
	        @FindBy(xpath=ABCNewsConstants.JUSTINPAGE_LINK)
	        public WebElement justInLink;
	
	   
	        //Creating constructor
			public LandingPage(WebDriver driver,ExtentTest test)
			{
				super(driver,test);
			}
			
	        public JustInPage goToJustInPage()
	        {
	        	
	        	test.log(LogStatus.INFO, "Navigating to JustIn Page");
	        	justInLink.click();
	        	
	        	JustInPage justInPage = new JustInPage(driver,test);
	        	PageFactory.initElements(driver, justInPage);
	        	return justInPage;
	        }

}
