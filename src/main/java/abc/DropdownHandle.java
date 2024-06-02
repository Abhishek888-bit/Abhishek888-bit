package abc;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandle {
	
	public static void main(String [] arg) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement dropdwn=driver.findElement(By.xpath("//select[@id='first']"));
		dropdwn.click();
		Select sc=new Select(dropdwn);
		sc.selectByIndex(1);
		Thread.sleep(2000);
		sc.selectByValue("Yahoo");
		Thread.sleep(2000);
		sc.selectByVisibleText("Google");
		
		
		TakesScreenshot tc=(TakesScreenshot)driver;
		File src=tc.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Feb_19\\MavenProject19\\img.png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
		
		
	}
}
