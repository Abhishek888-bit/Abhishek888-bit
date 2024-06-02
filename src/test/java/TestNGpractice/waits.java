package TestNGpractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waits {
	
	WebDriver driver;
	WebDriverWait wait;
	@BeforeSuite
	public void setUp()
	{
		
		
		WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //Implicitly wait
		 
		driver.get("https://profile.w3schools.com/log-in?");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void loginForm()
	{
		 
		WebElement email = driver.findElement(By.id("modalusername"));
		 email.sendKeys("saykarabhishek90@gmail.com");
		 
		  wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.visibilityOf(email));         //exciplitlywait
		  
		  
		 WebElement passw = driver.findElement(By.name("current-password"));
			passw.sendKeys("12345");
			
			WebElement btn=driver.findElement(By.xpath("//span[text()='Log in']"));
			btn.click();
	}

}
