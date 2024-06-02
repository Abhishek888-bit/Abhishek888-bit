package abc;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageScrolled {
	
	@Test
	public void one() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(300);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(300);
		js.executeScript("window.scrollBy(0,-300)");
		

}
}
