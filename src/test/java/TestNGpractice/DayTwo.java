package TestNGpractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.asserts.Assertion;
public class DayTwo {
	
	WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver.get("https://profile.w3schools.com/");
	
	}
	@Test
	public void titles()
	{
		String actual=driver.getTitle();
		String expected ="Log in - W3Schools";
		
        org.testng.Assert.assertEquals(actual, expected);
	}
	
	
	
	@AfterSuite
	public void tearUp()
	{
		driver.close();
	}

}
