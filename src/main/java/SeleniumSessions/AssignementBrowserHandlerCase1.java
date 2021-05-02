package SeleniumSessions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignementBrowserHandlerCase1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		List<WebElement> links=driver.findElements(By.xpath("//div[@id='social-icons']/a"));
		System.out.println(links.size());
		
		for(WebElement e:links) {
			e.click();
		}
		Set<String> handles= driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentId= it.next();
		String childId1=it.next();
		driver.switchTo().window(childId1);
		System.out.println("The title of the page is" + driver.getTitle());
		driver.close();
		
		String childId2=it.next();
		driver.switchTo().window(childId2);
		System.out.println("The title of the page is" + driver.getTitle());
		driver.close();
		
		String childId3=it.next();
		driver.switchTo().window(childId3);
		System.out.println("The title of the page is" + driver.getTitle());
		driver.close();
		
		String childId4=it.next();
		driver.switchTo().window(childId4);
		System.out.println("The title of the page is" + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentId);
		System.out.println("The title of the page is" + driver.getTitle());
		
	}

}
