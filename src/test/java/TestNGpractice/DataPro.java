package TestNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataPro {
	WebDriver driver;
	@Test(dataProvider = "city")
	public void test(String name)
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement wb=driver.findElement(By.name("q"));
		wb.sendKeys(name);
		
		
	}

	@DataProvider(name="city")
	public Object getData()
	{
		Object keys[][]=new Object[2][2];
		keys[0][0]="Srk";
		keys[0][1]="salaman";
		keys[1][0]="pune";
		keys[1][1]="mumbai";
		return keys;
	}
	
	
}
