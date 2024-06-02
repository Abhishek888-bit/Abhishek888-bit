package abc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		for (WebElement list : links) {
			
			System.out.println(list.getText());
			
		}

	}
}
