package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssSelector {

	public static void main(String[] args) {
		//below is a demonstration of using Css cllasses to find elements.
		
		//css selectors are tagname[attribute='value']
		//after creating your custom css selector, you can validate by pasting it in firebug and validating
		
	//  below is how we started invoking the browser. it sets up a WebDriver object, and then we assign the firefox driver class to that object.
			WebDriver driver;
			//we are using the firefoxdriver class to execute and imlement present in this Webdriver interface
			//because firefox browser is using marionette in v. 48,  in selenium 3 we need to point to the gecko driver
			System.setProperty("webdriver.gecko.driver" , "/Users/scottyoshimura/documents/javaJars/geckodriver");
			driver =new FirefoxDriver();
			//

			driver.get("http://login.salesforce.com");	
			
	//  below is how we are using the cssSelector to grab teh input tagname, with hte class attribute and value
			//driver.findElement(By.cssSelector("input[class='input r4 wide mb16 mt8 username']")).sendKeys("test");
	//below is grabbing the css class name
			driver.findElement(By.cssSelector("input.r4.wide.mb16.mt8.username")).sendKeys("test");
			
			
			//below is just taking the css id tag found in firebug
			driver.findElement(By.cssSelector("#password")).sendKeys("tester");
			
		driver.close();
			
			

	}

}
