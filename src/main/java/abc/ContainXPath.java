package abc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContainXPath {
	
	@Test
	public void test() throws InterruptedException
	{
		// Starts-with and Contains
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,600)");
	
    List<WebElement>list1=driver.findElements(By.xpath("(//div[@class='_3xGbi-'])[1]//a[starts-with(text(),'iPhone')]"));
    
    for(WebElement a:list1)
    {
    	System.out.println(a.getText());
    }
    
    
    Thread.sleep(5000);
	List <WebElement> list=driver.findElements(By.xpath("(//div[@class='_3xGbi-'])[4]//a[contains(text(),'Laptops')]"));
	
	for(WebElement i:list)
	{
		System.out.println(i.getText());
	}
	 
	
	

	
	}
	

};
