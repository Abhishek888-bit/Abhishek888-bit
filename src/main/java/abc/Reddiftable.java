package abc;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reddiftable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/indices/nse?src=moneyhome_nseIndices_more");
		driver.findElement(By.xpath("//a[@id='showMoreLess']")).click();
		
		List<WebElement>list=driver.findElements(By.xpath("//table[@id='dataTable']//tr"));
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2000));
		//wait.until(ExpectedConditions.invisibilityOfAllElements(list));
		for(WebElement data:list)
		{
			System.out.println(" "+data.getText());
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
