package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		WebElement popup1=driver.findElement(By.id("alertBox"));
		popup1.click();
		
		driver.switchTo().alert().accept();
		
		WebElement popup2=driver.findElement(By.id("promptBox"));
		popup2.click();
		
		driver.switchTo().alert().getText();
		
		
	}

}
