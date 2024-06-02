package TestNGpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PracticeWindows {
	
	@Test
	public void test()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions ac=new Actions(driver);
		
		ac.keyDown(Keys.CONTROL).click(email).perform();
		
		Set<String> window=driver.getWindowHandles();
		for(String list:window)
		{   
			System.out.println(list);
		}
		
		Iterator<String> it=window.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
	}
	

}
