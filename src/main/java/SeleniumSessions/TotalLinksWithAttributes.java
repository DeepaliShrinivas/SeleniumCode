package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinksWithAttributes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com.au/");
		List<WebElement> linklist= driver.findElements(By.tagName("a"));
		
		System.out.println("Total lengh" + linklist.size());
		
		for(WebElement e: linklist) {
	
			if(!e.getText().isEmpty()) {
				String url= e.getAttribute("href");
				
				if (url!=null) {
					System.out.println(url);
					
				}
				
			}
			
			
			
			
		}
	}

}
