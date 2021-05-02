package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","/Users/deepalikulkarni/Downloads/chromedriver");
		
		//WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","/Users/deepalikulkarni/Downloads/geckodriver");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Google")) {
			System.out.println("Correct Title");
		}else {
			System.out.println("Wrong Title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
		
		
		
	}

}
