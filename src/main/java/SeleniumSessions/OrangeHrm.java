package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm {

	
WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	}
	
	@Test(priority=1)
	public void titleTest() {
		String title= driver.getTitle();
		System.out.println("The title is" +title);
		Assert.assertEquals(title, "Free Human Resource Management Software | 30 Day Trial Creation");
	}
	@Test(priority=2)
	public void urlTest() {
		String actualUrl= driver.getCurrentUrl();
		System.out.println("The URL is" +actualUrl);
		Assert.assertTrue(actualUrl.contains("orangehrm"));
			
	}
	@Test(priority=3)
	public void logoTest() {
		Assert.assertTrue(driver.findElement(By.xpath("//img[@class='nav-logo']")).isDisplayed());
		
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
