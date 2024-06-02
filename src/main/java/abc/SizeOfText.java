package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SizeOfText {
	
	@Test
	public void sizeText()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		WebElement text=driver.findElement(By.id("cart-total"));
		String btnsize=text.getCssValue("font-size");
		System.out.println(btnsize);
		
	}

}
