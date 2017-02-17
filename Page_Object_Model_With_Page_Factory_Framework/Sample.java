package Module_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.abc.net.au/news/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//*[@id='n-justin']/a")).click();
        
       // String text =driver.findElement(By.xpath("//*[@class='noprint']")).getAttribute("href");
       // System.out.println(text);
        
		

	}

}
