package PracticeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class abc 
{
	WebDriver driver;
	
	@BeforeMethod	
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\PROJECT QSP\\chromedriver-win32\\chromedriver-win32");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void m2()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@AfterMethod	
	public void m3()
	{
		driver.quit();
	}

}
