package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PressEnterKey {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchbar=driver.findElement(By.name("q"));
		searchbar.sendKeys("Hello");
		//searchbar.sendKeys(Keys.ENTER);
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.ENTER).build().perform();

	}

}
