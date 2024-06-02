package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovder {
	WebDriver driver;
	@Test(dataProvider="abc")
	public void search(String place,String city)
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys(place +" "+city);
		
		WebElement btn=driver.findElement(By.name("btnK"));
		btn.click();
		
		
	}

	
	@DataProvider(name="abc")
	public Object[][] getData()
	{
		Object[][] searchword=new Object[3][2];
		searchword[0][0]="India Gate";
		searchword[0][1]="Delhi";
		searchword[1][0]="Taj Mahal";
		searchword[1][1]="Agra";
		
		
		
		return searchword;
		
		
	}
}


