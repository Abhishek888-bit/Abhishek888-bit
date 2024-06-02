package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");

		String title=driver.getTitle();
		System.out.println(title);
		
		String URL= driver.getCurrentUrl();
		System.out.println(URL);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		WebElement search =driver.findElement(By.id("APjFqb"));
		search.sendKeys("rediffmail");
		
	    Actions action= new Actions(driver);
	    
	  
		
		//driver.close();
		
		
	}

}
