package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframeHandling {
	
	
	@Test
	public void two() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		WebElement frame1=driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(frame1);
		Thread.sleep(200);
		WebElement textbox=driver.findElement(By.id("tinymce"));
		System.out.println(textbox.getText());
		
	}

}
