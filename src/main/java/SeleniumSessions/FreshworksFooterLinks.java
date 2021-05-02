package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreshworksFooterLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		By footerLink= By.xpath("//div[@class='col-sm-6']//a");
		
		doLinksClick(footerLink,"Freshping");
		
		
		
		
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
		
	}
	
	
	public static void doLinksClick(By locator,String value) {
		List<WebElement> linkList= getElements(locator);
		System.out.println("The total footer links:" + linkList.size());
		
		for(WebElement e:linkList) {
			String text= e.getText();
			System.out.println(text);
			
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
		
	}
	

}
