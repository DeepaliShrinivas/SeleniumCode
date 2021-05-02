package SeleniumSessions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignementBrowserHandlerCase2 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		List<WebElement> links=driver.findElements(By.xpath("//div[@id='social-icons']/a"));
		System.out.println(links.size());
		
		for(WebElement e:links) {
			e.click();
			Set<String> handles= driver.getWindowHandles();
			Iterator<String> it=handles.iterator();
			String parentId= it.next();
			String childId=it.next();
			driver.switchTo().window(childId);
			System.out.println("The title of the page is" + driver.getTitle());
			driver.close();
			driver.switchTo().window(parentId);
			
		}
		System.out.println("The title of the page is" + driver.getTitle());
		
		
//		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
//		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
//		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
//		Set<String> handles= driver.getWindowHandles();
//		Iterator<String> it=handles.iterator();
//		
//		
//		String parentId= it.next();
//		String childId1=it.next();
//		String childId2=it.next();
//		String childId3=it.next();
//		String childId4=it.next();
//		
		
//		System.out.println("The parent window ID is" +parentId);
//		System.out.println("The child1 window ID is" +childId1);
//		System.out.println("The child2 window ID is" +childId1);
//		System.out.println("The child3 window ID is" +childId1);
//		System.out.println("The child4 window ID is" +childId1);
//		System.out.println("The child5 window ID is" +childId1);
		
//		//driver is switching to youtube
//		
//		driver.switchTo().window(childId1);
//		System.out.println("The title of the page is" + driver.getTitle());
//		driver.close();
//		
//		//driver is switching to instagram
//		driver.switchTo().window(childId2);
//		System.out.println("The title of the page is" + driver.getTitle());
//		driver.close();
//		
//		//driver is switching to facebook
//		driver.switchTo().window(childId3);
//		System.out.println("The title of the page is" + driver.getTitle());
//		driver.close();
//		
//		//driver is switching to LinkedIn
//		driver.switchTo().window(childId4);
//		System.out.println("The title of the page is" + driver.getTitle());				
//		driver.close();
//		
//		//driver is switchong back to main window
//		driver.switchTo().window(parentId);
//		System.out.println("The title of the page is" + driver.getTitle());
//		driver.quit();
//		
		
		
		
	}

}
