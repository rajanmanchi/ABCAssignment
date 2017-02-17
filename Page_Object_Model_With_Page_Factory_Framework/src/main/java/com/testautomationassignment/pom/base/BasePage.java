package com.testautomationassignment.pom.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testautomationassignment.pom.pages.common.TopMenu;

public class BasePage {
	
	public ExtentTest test;
	public WebDriver driver;
	public TopMenu menu;
	
	
	//it is mandatory to declare a default constructor
	public BasePage()
	{
		
	}
	
	//Create a constructor
	public BasePage(WebDriver driver,ExtentTest test)
	{
		this.driver = driver;
		this.test = test;
		menu = PageFactory.initElements(driver, TopMenu.class);
	}

	public void verifyTitle(String expTitle)
	{
		test.log(LogStatus.INFO, "Verifying the title "+ expTitle);
	}
	
	public boolean isElementPresent(String locatorkey)
	{
		return false;
	}
	
	public TopMenu getMenu()
	{
		return menu;
	}

}
