package TestNGpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoPara {
	
	WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void para(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
	     WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
		}
	     else if(browser.equalsIgnoreCase("firefox"))
	     {
	    	 WebDriverManager.firefoxdriver().setup();
	    	 driver=new FirefoxDriver();
	     }
	     else if(browser.equalsIgnoreCase("edge"))
	     {
	    	 WebDriverManager.edgedriver().setup();
	    	 driver=new EdgeDriver();
	     }
	     
	     else
	     {
	    	 System.out.println("Invalid Browser");
	     }
		
	     driver.get("https://profile.w3schools.com/log-in");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     driver.manage().deleteAllCookies();
	     driver.manage().window().maximize();
	
	}
	
	@Test
	@Parameters({"id","paas"})
	public void loginPage(String id,String paas )
	{
		WebElement userId=driver.findElement(By.name("email"));
		userId.sendKeys(id);
		
		WebElement pass=driver.findElement(By.name("current-password"));
		pass.sendKeys(paas);
		
		
	}

}
