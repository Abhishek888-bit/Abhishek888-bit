package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action {

	public static void main(String[] arg) throws InterruptedException
	{
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://phptravels.org/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
		
		WebElement home=driver.findElement(By.id("Primary_Navbar-Home"));

		Actions ac=new Actions(driver);
		 
		 Thread.sleep(2000);
         ac.contextClick(home).build().perform();
		 
         driver.get("https://www.amazon.in/");
		 
         
         
         WebElement flag=driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span"));
         
         ac.moveToElement(flag).build().perform();
         
         WebElement login=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
         ac.keyDown(Keys.CONTROL).click(login).keyUp(Keys.CONTROL).build().perform();
         
         
		 //driver.close();
		
	}
	
	
}
