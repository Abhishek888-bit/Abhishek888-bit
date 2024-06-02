package abc;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;



public class AssertionTest {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String expected="Googl";
		
		String actual=driver.getTitle();
		
	//System.out.println(actual);
	
    // Assert.assertEquals(actual, expected);
		
     SoftAssert softAs=new SoftAssert();
     
     softAs.assertEquals(actual, expected);
     
	   System.out.println("hello");
       System.out.println("hello1");
       System.out.println("heello2");
       softAs.assertAll();
	}

}
