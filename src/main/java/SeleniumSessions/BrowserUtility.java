package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class is having different generic methods related to browser...
 * @author deepalikulkarni
 *
 */

public class BrowserUtility {
	
	WebDriver driver;
	
	/**
	 * This method is used to initialize the webdriver on the basis of given browser name...
	 * @param browserName
	 * @return This method returns webdriver reference
	 */
	
	
	public WebDriver launchBrowser(String browserName) {
		System.out.println("The launching browser is" + browserName);
		
		switch (browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "Safari":
			driver=new SafariDriver();
			break;
			
		default:
		System.err.println("The browser is not found" + browserName);
		break;
		}
		return driver;
	}
	/**
	 * This method is used to enter the url in browser...
	 * @param url
	 */
	
	public void launchUrl(String url) {
		System.out.println("The launch URL is" +url);
		
		if(url.isEmpty()) {
			System.out.println("The url is blank" +url);
		return;
		}
		driver.get(url);
	}
	/**
	 * This method is used to get the page title
	 * @return
	 */
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
		
	}
	public void quitBrowser() {
		driver.quit();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	

}
