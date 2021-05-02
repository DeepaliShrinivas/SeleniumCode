package SeleniumSessions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentHashMap {
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=product/product&product_id=43&search=macbook");


		Map<String, String> prodDetailsMap = getProdDetails();

		for (Map.Entry<String, String> e : prodDetailsMap.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}

	}	

	
		public static Map<String, String> getProdDetails() {
			Map<String, String> prodDetailsMap = new HashMap<String, String>();
		
			By prodData = By.xpath("//div[@class='col-sm-4']/ul[@class='list-unstyled'][1]/li");
			List<WebElement> productInfoList = driver.findElements(prodData);
			
			for (int i = 0; i < productInfoList.size(); i++) {
				String product[] = productInfoList.get(i).getText().split(":");
				String productName = product[0].trim();
				String productValue = product[1].trim();
	
				prodDetailsMap.put(productName, productValue);
			 
			 
		 }
		 return prodDetailsMap;
		 
	}
	
	
	
}

