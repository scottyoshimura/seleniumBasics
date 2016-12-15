package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alerts {

	public static void main(String[] args) {
		//below are ways to manage the firefoxDriver and marionnete
		//  below is how we started invoking the browser. it sets up a WebDriver object, and then we assign the firefox driver class to that object.
		WebDriver driver;
		//we are using the firefoxdriver class to execute and imlement present in this Webdriver interface
		//because firefox browser is using marionette in v. 48,  in selenium 3 we need to point to the gecko driver
		System.setProperty("webdriver.gecko.driver" , "/Users/scottyoshimura/documents/javaJars/geckodriver");
		driver =new FirefoxDriver();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		//we need to switch control form the page to the alert. this happens when switching from html to java. after switchting we want to click on teh button. accept method is used for any positive scenario eg "ok" "accept" 
		
		//lets grab the text to validate it
				System.out.println(driver.switchTo().alert().getText());
				
		//driver.switchTo().alert().accept();
		//to handle a negative scenario we need to use dismill
		//driver.switchTo().alert().dismiss();
		
		
	}

}
