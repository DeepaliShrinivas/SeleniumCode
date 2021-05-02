package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignementBrowserHandlerCase2List {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		List<WebElement> links=driver.findElements(By.xpath("//div[@id='social-icons']/a"));
		System.out.println(links.size());
		
		for(WebElement e:links) {
			e.click();
			Set<String> handles= driver.getWindowHandles();
			List<String> handleList= new ArrayList<String>(handles);
				
			
			String parentId= handleList.get(0);
			String childId=handleList.get(1);

		
			
			driver.switchTo().window(childId);
			System.out.println("The title of the page is" + driver.getTitle());
			driver.close();
			
			
			driver.switchTo().window(parentId);
			
		}
		System.out.println("The title of the page is" + driver.getTitle());
		driver.close();
		
	}

}
