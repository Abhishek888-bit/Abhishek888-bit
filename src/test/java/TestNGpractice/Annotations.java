 package TestNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestNGpractice.ListDemo.class)
public class Annotations extends ListDemo {
	
    static WebDriver driver;
	@BeforeSuite(description ="browser open", alwaysRun = true)
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		driver.get("https://profile.w3schools.com/log-in?");
		
	}
	
	@Test(priority=0,invocationCount = 2,groups="regretion", enabled = true,dependsOnMethods = "loginPage")
	public void  title()
	{
		String actual=driver.getTitle();
		System.out.println(actual); 
		String expected ="Log in - W3Schools";
		Assert.assertEquals(actual, expected);
		
		
	}
	
	@Test(description="Enter userId ", priority=1, groups="regretion")
	public void loginPage()
	{
		 WebElement email = driver.findElement(By.id("modalusername"));
		 email.sendKeys("saykarabhishek90@gmail.com");
		 
		 boolean mail=email.isDisplayed();
		 SoftAssert sc=new SoftAssert();
		 sc.assertTrue(mail);
	}
	
	@Test(description = "enter password", priority=2)
	public void pass()
	{
		WebElement passw = driver.findElement(By.name("current-password"));
		passw.sendKeys("12345");
	}
	
	@Test(description = "click on login btn", priority = 3, dependsOnMethods ="loginPage",groups="regretion")
	public void logbtn()
	{
		WebElement btn=driver.findElement(By.xpath("//span[text()='Log in']"));
		boolean btn1=btn.isDisplayed();
		btn.click();
		Assert.assertFalse(btn1);
	}
	
	
	@AfterSuite(description="close browser",enabled=true)
	public void tearup()
	{
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	

}
