package abc;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SiblingPath {
	
	
	@Test
	public void table()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		 List<WebElement> list=driver.findElements(By.xpath("//*[text()='Burj Khalifa']//following::td[1]"));
		 for(WebElement data:list)
		 {
			 
			System.out.println(data.getText());
		}
		
	}

}
