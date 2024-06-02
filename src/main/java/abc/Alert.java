package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	
	public static void main(String [] args) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 
		 driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		 driver.manage().window().maximize();
		 
		 WebElement alert1=driver.findElement(By.name("alert"));
		 alert1.click();
		 driver.switchTo().alert().accept();
		 
		 Thread.sleep(2000);
		 
		 WebElement alert2=driver.findElement(By.name("confirmation"));
		 alert2.click();
		 driver.switchTo().alert().dismiss();
		 
		 Thread.sleep(2000);
		 
		 WebElement alert3 = driver.findElement(By.name("prompt"));
		 alert3.click();
		 driver.switchTo().alert().sendKeys("yes");
		 
		 
	}

}
