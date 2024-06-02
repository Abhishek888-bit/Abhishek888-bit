package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class staleelementRef {
	
	@Test
	public void  handleStale()
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		try {
		 WebElement textBox=driver.findElement(By.id("ta1"));
		 textBox.sendKeys("Abhishek");
		 driver.findElement(By.linkText("onlytestingblog")).click();
		 driver.navigate().back();
		}
	     finally {
	    	 WebElement textBox=driver.findElement(By.id("ta1"));
			 
			 textBox.clear();
			 
			 System.out.println("script executed successfully");
		}
		 
		
	}

}
