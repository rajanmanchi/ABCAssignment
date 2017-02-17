package com.selenium.abcnews.pom.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.selenium.abcnews.pom.pages.LaunchPage;
import com.selenium.abcnews.pom.testcases.base.BaseTest;

public class ABCNewsHomePage extends BaseTest {
	
	@Test
	public void testABCNewsHomePage()
	{
		init("Chrome");
		LaunchPage lp= PageFactory.initElements(driver,LaunchPage.class);
		Object page = lp.goToABCNewsPage();
		
		        //Verify the ABC News Page Loads Successfully
				if(page instanceof LaunchPage)
					System.out.println("ABC News Page launched successfully");
				else
					System.out.println("ABC News Page not launched");
		
				//verifyTitle
				lp.verifyTitle("ABC News (Australian Broadcasting Corporation)");
					
				//TopMenu
				lp.getMenu().JustIn();
				
				
	}

}
