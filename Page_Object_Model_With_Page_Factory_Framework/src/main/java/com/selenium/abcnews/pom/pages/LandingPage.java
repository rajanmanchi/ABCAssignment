package com.selenium.abcnews.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.abcnews.pom.base.BasePage;
import com.selenium.abcnews.pom.util.ABCNewsConstants;

public class LandingPage extends BasePage {
	        
	        @FindBy(xpath=ABCNewsConstants.JUSTINPAGE_LINK)
	        public WebElement justInLink;
	
	   
	        //Creating constructor
			public LandingPage(WebDriver driver)
			{
				super(driver);
			}
			
	        public JustInPage goToJustInPage()
	        {
	        	justInLink.click();
	        	return PageFactory.initElements(driver,JustInPage.class);
	        }

}
