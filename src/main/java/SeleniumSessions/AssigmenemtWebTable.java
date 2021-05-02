package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssigmenemtWebTable {
	static WebDriver driver;

	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/england-women-in-new-zealand-2020-21-1249221/new-zealand-xi-women-vs-england-women-tour-match-1251585/full-scorecard");
		
		WebElement table= driver.findElement(By.xpath("(//table[@class='table batsman'])[1]"));
		
		
		
//		List<WebElement> columns= table.findElements(By.xpath("(//table[@class='table batsman'])[1]//th"));
		List<WebElement> rows= table.findElements(By.xpath("(//table[@class='table batsman'])[1]//tr"));
//		System.out.println(rows.size());
		
		
		for(int i=0;i<rows.size()-4;i++) {
			System.out.print(rows.get(i).getText()+" ");
			System.out.println(" ");
	
	
		}
		
		
		
				
		
		}
		
					
	
	
	
	
	
	public static String getWicketTakerName(String playerName) {
	String xpathVal = "//a[text()='"+playerName+"']/parent::td/following-sibling::td[@class='text-left']";
	
	String wicketTakerName = driver.findElement(By.xpath(xpathVal)).getText();
		
		return wicketTakerName;
	}
		
		public static List<String> getPlayerScoreCard(String playerName) {
			List<String> scoreCardList=new ArrayList<String>();
			
			List<WebElement> scoreList=driver.findElements(By.xpath("//a[text()='"+playerName+"']/parent::td/following-sibling::td"));
			for(int i=1;i<scoreList.size();i++) {
				scoreCardList.add(scoreList.get(i).getText());
				
			}	
			return scoreCardList;
	}
		
	
		}

