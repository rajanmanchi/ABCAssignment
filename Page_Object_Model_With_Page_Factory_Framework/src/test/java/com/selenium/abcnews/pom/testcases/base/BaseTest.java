package com.selenium.abcnews.pom.testcases.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.selenium.abcnews.pom.util.ABCNewsConstants;

public class BaseTest {
	
	public WebDriver driver;
	
	public void init(String bType)
	{
		
		
		
			    if(bType.equals("Mozilla"))
			    {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ABCNewsConstants.FIREFOX_DRIVER_EXE);
			    driver = new FirefoxDriver();
			    }
			    else if(bType.equals("Chrome"))
			    {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ABCNewsConstants.CHROME_DRIVER_EXE);
			    driver = new ChromeDriver();
			    }
			    else if(bType.equals("IE"))
			    {
			    System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ABCNewsConstants.IE_DRIVER_EXE);
			    driver = new InternetExplorerDriver();
			    }
			
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        driver.manage().window().maximize();
		
	}

}
