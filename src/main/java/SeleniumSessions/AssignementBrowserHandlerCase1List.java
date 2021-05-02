package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignementBrowserHandlerCase1List {

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
		List<String> handleList= new ArrayList<String>(handles);
			
		
		String parentId= handleList.get(0);
		String childId1=handleList.get(1);
		String childId2=handleList.get(2);
		String childId3=handleList.get(3);
		String childId4=handleList.get(4);
		
		driver.switchTo().window(childId1);
		System.out.println("The title of the page is" + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(childId2);
		System.out.println("The title of the page is" + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(childId3);
		System.out.println("The title of the page is" + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(childId4);
		System.out.println("The title of the page is" + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentId);
		System.out.println("The title of the page is" + driver.getTitle());
		driver.close();
		

			
			
		}
		
		

	}


