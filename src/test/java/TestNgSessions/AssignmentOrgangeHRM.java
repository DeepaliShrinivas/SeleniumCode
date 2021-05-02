package TestNgSessions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentOrgangeHRM {
	
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
		System.out.println("The Title is"+title);
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
		Assert.assertTrue(driver.findElement(By.className("nav-logo")).isDisplayed());
	}
	
	@Test(priority=4)
	public void diffMenuTest() {
		List<WebElement> menus=driver.findElements(By.xpath("//ul[@class='nav navbar-nav navbar-left default-nav']/li"));
		int menusSize= menus.size();
		//System.out.println(menusSize);
		Assert.assertEquals(menusSize, 6);
	}
	
	@Test(priority=5)
	public void fillFormTest() {
	driver.findElement(By.xpath("//div[@class='middleColumn']/input[@name='FirstName']")).sendKeys("Deepali");
	driver.findElement(By.xpath("//div[@class='middleColumn']/input[@name='LastName']")).sendKeys("Kulkarni");
	driver.findElement(By.xpath("//div[@class='middleColumn']/input[@name='Email']")).sendKeys("deepakulkarni10@gmail.com");;
	driver.findElement(By.xpath("//div[@class='middleColumn']/input[@name='JobTitle']")).sendKeys("QA Engineer");
	driver.findElement(By.xpath("//div[@class='middleColumn']/input[@name='CompanyName']")).sendKeys("ABC");
	driver.findElement(By.xpath("//div[@class='middleColumn']/input[@name='Contact']")).sendKeys("0423242314");
	
	
	WebElement industryList= driver.findElement(By.id("Form_submitForm_Industry"));
	Select selectIndust =new Select(industryList);
	selectIndust.selectByValue("Travel");
	
	WebElement empList= driver.findElement(By.id("Form_submitForm_NoOfEmployees"));
	Select selectemp =new Select(empList);
	selectemp.selectByIndex(5);
	
	WebElement countryList=driver.findElement(By.id("Form_submitForm_Country"));
	Select selectCountry= new Select(countryList);
	selectCountry.selectByValue("India");
	
	WebElement stateList=driver.findElement(By.id("Form_submitForm_State"));
	Select selectState= new Select(stateList);
	selectState.selectByIndex(5);
	
	}
	
	@Test(priority=6)
	public void privacyLinkTest() {
	   Assert.assertTrue(driver.findElement(By.xpath("//label[@class='readonly']/a[text()='Privacy Policy']")).isDisplayed());
	}
	
	@Test(dependsOnMethods= "privacyLinkTest",priority=7)
	public void privacyLinkClickTest() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement privacyPolicy = driver.findElement(By.linkText("Privacy Policy"));
		js.executeScript("arguments[0].click();",privacyPolicy);
		
		//driver.findElement(By.xpath("//label[@class='readonly']/a[text()='Privacy Policy']")).click();
		Set<String> handles= driver.getWindowHandles();
		
		Iterator<String> it=handles.iterator();
		
		String parentWinId= it.next();
		String childWinId=it.next();
		
		driver.switchTo().window(childWinId);
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.orangehrm.com/assets/Documents/OrangeHRM-Privacy-Policy1.pdf");
	}
	

	
	@AfterTest
	public void tearDown() {
	driver.quit();
	}
	
	
	

}
