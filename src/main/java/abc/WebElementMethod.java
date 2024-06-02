package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethod {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		
		WebElement SearchBar=driver.findElement(By.id("search2"));
		SearchBar.sendKeys("java");
	    
		WebElement logIn = driver.findElement(By.xpath("//a[@title='Login to your account'][1]"));
		logIn.click();
		
		WebElement email= driver.findElement(By.xpath("//input[@id='modalusername']"));
		email.sendKeys("abhishek");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='current-password']"));
		password.sendKeys("123456");
		
		
		
		
		WebElement LogInForm=driver.findElement(By.xpath("//span[text()='Log in']"));
		LogInForm.getTagName();
		
	    boolean result = LogInForm.isDisplayed(); //The isDisplayed command in Selenium verifies if a particular element is present and displayed. If the element is displayed, then the value returned is true.
	                                               //If not, then the value returned is a NoSuchElementFound exception.
	    System.out.println(result);
	    
	    LogInForm.isEnabled(); 
	    
	    
	    LogInForm.isSelected();
	    
	    
	    
	    
	    
	    
	    
		
		driver.close();
		
		
		
		
		

	}

}
