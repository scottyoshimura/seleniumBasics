package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frames {
	
	public static void main(String[] args) {
		
		//frames are html documents embedded in other html pages
		//you can use frames to make changes within a page that doesnt need to have the whole page refreshed
		//in selenium, if you want to do things to the frame, you need to get the info for the frame before working on it
		
		//below are ways to manage the firefoxDriver and marionnete
				// below is how we started invoking the browser. it sets up a WebDriver object, and then we assign the firefox driver class to that object.
				WebDriver driver;
				//we are using the firefoxdriver class to execute and imlement present in this Webdriver interface
				//because firefox browser is using marionette in v. 48,  in selenium 3 we need to point to the gecko driver
				System.setProperty("webdriver.gecko.driver" , "/Users/scottyoshimura/documents/javaJars/geckodriver");
				driver =new FirefoxDriver();
				driver.get("https://netbanking.hdfcbank.com/netbanking/");
				System.out.println(driver.getPageSource());
				
				//we printed out hte source code and see they are using framesets
				//lets look for the unique value we can use. lets use a switch to switch from frames to the page. we look at hte source and get hte index.
				//
				driver.switchTo().frame(1);
				
				//lets find the frame by the css selector
				driver.findElement(By.cssSelector("input[class='input_password']")).sendKeys("10000");
				
				//System.out.println(driver.getPageSource());

		
	}

}
