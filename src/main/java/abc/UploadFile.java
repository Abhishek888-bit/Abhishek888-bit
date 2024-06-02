package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {
	
	
	@Test
	public void fileUpload()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
		String projectpath = System.getProperty("user.dir");
		
		WebElement upload=driver.findElement(By.xpath("//input[@name=\"userfile\"]"));
		upload.sendKeys("C:\\Users\\PC\\OneDrive\\Desktop\\Testing\\AUTOMATION.png");
		upload.clear();
		upload.sendKeys(projectpath+"/File/APPIUM TESTING.png");
		driver.quit();
		
	}

}
