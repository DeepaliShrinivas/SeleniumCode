package TestNgSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest extends BaseTest{

	@Test(priority=1)
	public void titleTest() {
		String title= driver.getTitle();
		System.out.println("The title is" +title);
		Assert.assertEquals(title, "Amazon.com.au: Shop online for Electronics, Apparel, Toys, Books, DVDs & more");
	}
	@Test(priority=2)
	public void urlTest() {
		String actualUrl= driver.getCurrentUrl();
		System.out.println("The URL is" +actualUrl);
		Assert.assertTrue(actualUrl.contains("amazon"));
			
	}
	@Test(priority=3)
	public void logoTest() {
		Assert.assertTrue(driver.findElement(By.cssSelector("#nav-logo")).isDisplayed());
		
	}
	

}
