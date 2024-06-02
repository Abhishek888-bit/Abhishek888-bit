package TestNGpractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WindowsHandling {
	
	@Test
	public void windowHandle()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		
	
		WebElement gmail=driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]"));
		Actions ac=new Actions(driver);
	    ac.keyDown(Keys.CONTROL).click(gmail).perform();
	    
	    Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]

		Iterator<String> it=windows.iterator();
		//System.out.println(it);
		String p1=it.next();
		String p2=it.next();
		System.out.println(p1);
		System.out.println(p2);
		driver.switchTo().window(p2);
		String title=driver.getTitle();
		System.out.println(title);
        WebElement createAc=driver.findElement(By.xpath(""));
        ac.keyDown(Keys.CONTROL).click(createAc).build().perform();
        String p3=it.next();
        System.out.println(p3);
		
		
	}

}
