package TestNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class DataProvide {
	WebDriver driver;
	@Test(dataProvider = "mydemo")
	public void one(String text)
	{
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchbar=driver.findElement(By.name("q"));
		searchbar.sendKeys(text);
		searchbar.sendKeys(Keys.ENTER);
		
		driver.quit();
		
	}
	
	@DataProvider(name="mydemo")
	public Object keysWord()
	{
		
		Object list[][]=new Object[2][2];
		list[0][0]="Hello";
		list[0][1]="Admin";
		list[1][0]="srk";
		list[1][1]="Ranbir";
		return list;	
		
	}

}
