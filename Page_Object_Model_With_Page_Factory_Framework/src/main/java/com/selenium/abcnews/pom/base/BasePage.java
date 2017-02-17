package com.selenium.abcnews.pom.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.abcnews.pom.pages.common.TopMenu;

public class BasePage {
	
	public WebDriver driver;
	public TopMenu menu;
	
	
	//it is mandatory to declare a default constructor
	public BasePage()
	{
		
	}
	
	//Create a constructor
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
		menu = PageFactory.initElements(driver, TopMenu.class);
	}

	public void verifyTitle(String expTitle)
	{
		
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
