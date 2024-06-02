package TestNGpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class autoselect {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void test(String name) throws InterruptedException
	{
		if(name.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(name.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(name.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("not found");
		}
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement SearchBar=driver.findElement(By.name("q"));
		SearchBar.sendKeys("Sachin Tendulakr");
		
		List<WebElement> SuggestionList=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	      
		for ( WebElement list: SuggestionList) {
			
			System.out.println(list.getText());
		}
	
		
//		Thread.sleep(2000);
//        int count=SuggestionList.size();
//        System.out.println(count);
//        
//        SuggestionList.get(count-6).click();
//        //driver.close();
	}
}
