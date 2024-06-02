package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class April29 {
	
	
	
	@Test(groups = "sanity")
	@Parameters("key")
	public void test(@Optional String key)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys(key);
	}
	
	@Test(groups = "sanity")
	public void test2()
	{
		System.out.println("passed");
	}
	@Test(groups = "regression")
	public void test3()
	{
		System.out.println("Regression");
	}

}
