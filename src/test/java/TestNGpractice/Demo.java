package TestNGpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;



public class Demo {
	
	@Parameters({"URL"})
	@Test
	public void testbrowser(@Optional String url)
	{
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	
}
}
