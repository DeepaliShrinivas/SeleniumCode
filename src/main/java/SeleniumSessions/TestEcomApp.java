package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestEcomApp {

	public static void main(String[] args) {
		
		BrowserUtility br=new BrowserUtility();
		WebDriver driver=br.launchBrowser("Chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		String title=br.getPageTitle();
		System.out.println("The page title is " +title);
		
		
		By emailId =By.id("input-email");
		By password = By.id("input-password");
		By loginButton=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		By yourStoreLink= By.linkText("Your Store");
		
		ElementUtil eleUtil= new ElementUtil(driver);
		eleUtil.doSendKeys(emailId, "deepakulkarni10@gmail.com");
		eleUtil.doSendKeys(password, "deepali12345");
		eleUtil.doClick(loginButton);
		
		String accTitle=br.getPageTitle();
		System.out.println("The account page title is " +accTitle);
		
		if(eleUtil.doIsDisplayed(yourStoreLink)) {
			String header= eleUtil.doGetElementText(yourStoreLink);
			System.out.println(header);
		}
		
		br.closeBrowser();
		
		
		

	}

}
