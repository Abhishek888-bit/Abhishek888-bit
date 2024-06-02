 package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class JavaScript {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		WebElement bar=driver.findElement(By.name("q"));
		WebElement email=driver.findElement(By.xpath("//a[text()=\"Gmail\"]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();",email);
        //js.executeScript("arguments[0].value='india';",bar);
        
        //js.executeScript("window.scrollBy(0,600)");
       // js.executeScript("location.reload()");
        
        
       Actions ac=new Actions(driver);
      // ac.click(email).perform();
       ac.sendKeys("Abhishek").perform();
        
	}

}
