package TestNgSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassInCrmTest extends BaseTest{		
	
	@Test(priority=1)
	public void crmTitleTest() {
		String title = driver.getTitle();
		System.out.println("page title is : " + title);
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	@Test(priority=2)
	public void urlTest() {
		String actualUrl= driver.getCurrentUrl();
		System.out.println("The URL is" +actualUrl);
		Assert.assertTrue(actualUrl.contains("classic"));
			
	}
	@Test(priority=3)
	public void logoTest() {
		Assert.assertTrue(driver.findElement(By.xpath("//a[@class='navbar-brand']/img")).isDisplayed());
		
	}
	
	
	
}
