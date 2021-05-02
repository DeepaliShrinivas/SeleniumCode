package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//id Locator
		//1st Approach
		
		//driver.findElement(By.id("input-email")).sendKeys("deepali@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("deepali1234");
		
		//2nd Approach
		
		//WebElement email= driver.findElement(By.id("input-email"));
		//email.sendKeys("deepali@gmail.com");
		
		//WebElement passwd=driver.findElement(By.id("input-password"));
		//passwd.sendKeys("deepali1234");
		
		//3rd Approach
		//By emailId =By.id("input-email");
		//By password = By.id("input-password");
		
		//WebElement email=driver.findElement(emailId);
		//WebElement passwd=driver.findElement(password);
		
		//email.sendKeys("deepali@gmail.com");
		//passwd.sendKeys("deepali1234");
		
		//4th Approach
		//getElements(emailId).sendKeys("deepali@gmail.com");
		//getElements(password).sendKeys("Deepali1234");
		
		//5th Approach
		//doSendKeys(emailId,"deepali@gmail.com");
		//doSendKeys(password,"Deepali1234");
		
		//By Locators
		
		By emailId =By.id("input-email");
		By password = By.id("input-password");
		By loginButton=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		doSendKeys(emailId,"deepali@gmail.com");
		doSendKeys(password,"deepali1234");
		doClick(loginButton);
		
		
			
		}
	
	
	
	
		
		public static WebElement getElements(By locator) {
		return driver.findElement(locator);
		
		}
		
		
		public static void doSendKeys(By locator,String values) {
			getElements(locator).sendKeys(values);
			
		}
		
		public static void doClick(By locator) {
			getElements(locator).click();
			
		}
		
			
		
	}


