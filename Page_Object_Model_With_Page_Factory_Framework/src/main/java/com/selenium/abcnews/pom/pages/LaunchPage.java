package com.selenium.abcnews.pom.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.abcnews.pom.base.BasePage;
import com.selenium.abcnews.pom.util.ABCNewsConstants;

public class LaunchPage extends BasePage {
	
     
	
	//Creating constructor
		public LaunchPage(WebDriver driver)
		{
			super(driver);
		}
		
		public LaunchPage goToABCNewsPage()
		{
			driver.get(ABCNewsConstants.HOMEPAGE_URL);
			return PageFactory.initElements(driver,LaunchPage.class);
		}

}
