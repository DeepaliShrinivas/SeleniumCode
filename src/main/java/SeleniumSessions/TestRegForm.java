package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestRegForm {

	public static void main(String[] args) {
		
		BrowserUtility br = new BrowserUtility();
		WebDriver driver=br.launchBrowser("Chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		String pgTitle= br.getPageTitle();
		System.out.println(pgTitle);
		
		
		By regLink= By.linkText("Register");
		By regAccForm= By.xpath("//*[@id=\"content\"]/h1");
		By fName=By.name("firstname");
		By lName= By.name("lastname");
		By email= By.name("email");
		By telNumber= By.name("telephone");
		By passwd= By.id("input-password");
		By psswdConfm= By.id("input-confirm");
		By checkBox= By.name("agree");
		By button= By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By accSuccess= By.xpath("//*[@id=\"content\"]/h1");
		By failMsg= By.cssSelector(".alert");
		
		
		
		
		
		ElementUtil eleUtil= new ElementUtil(driver);
		eleUtil.doClick(regLink);
		String pageTitle=br.getPageTitle();
		System.out.println("The page title is " + pageTitle);
		
		if(eleUtil.doIsDisplayed(regAccForm)) {
			String regFormTitle= eleUtil.doGetElementText(regAccForm);
			System.out.println(regFormTitle);
	
		}
		eleUtil.doSendKeys(fName, "Deepali");
		eleUtil.doSendKeys(lName, "Kulkarni");
		eleUtil.doSendKeys(email, "QAtest105@rediffmail.com");
		eleUtil.doSendKeys(telNumber, "+919881719220");
		eleUtil.doSendKeys(passwd, "Deepali12345");
		eleUtil.doSendKeys(psswdConfm, "Deepali12345");
		eleUtil.doClick(checkBox);
		eleUtil.doClick(button);
		
		if (eleUtil.doIsDisplayed(accSuccess)) {
			String msg= eleUtil.doGetElementText(accSuccess);
			System.out.println("Success" + msg);
		}
		else
		{
			String errMsg= eleUtil.doGetElementText(failMsg);
			System.err.println(errMsg);
		}
		
		
		
				
		
		
	}

}
