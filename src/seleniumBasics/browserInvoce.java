package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserInvoce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*  below is how we started invoking the browser. it sets up a WebDriver object, and then we asign the firefox driver class to that object.
		WebDriver driver;
		//we are using the firefoxdriver class to execute and imlement present in this Webdriver interface
		//because firefox browser is using marionette in v. 48, lets in selenium 3 we need to point to the gecko driver
		System.setProperty("webdriver.gecko.driver" , "/Users/scottyoshimura/documents/javaJars/geckodriver");
		driver =new FirefoxDriver();
		*/
		
		// below is another way to do the above, basic invokation of browser with marionette.
		System.setProperty("webdriver.gecko.driver" , "/Users/scottyoshimura/documents/javaJars/geckodriver");
		WebDriver driver=new FirefoxDriver();
		//this driver object is the object that will do all of the methods that are capable in WebDriver
		//remember, WebDriver is the interface that defines the methods that are capable. FirefoxDriver has all the classes to actually execute the methods. you need a class to implement and execute the methods in the webdriver interface.
		
		//lets hit the url
		driver.get("http://www.americanexpress.com");
		//lets get the site name from selenium
		System.out.println(driver.getTitle());
		//we can get hte page source with the below
		//System.out.println(driver.getPageSource());
		
		//lets get the current URL. you can do this to see if you are gettting redirects
		System.out.println(driver.getCurrentUrl());
		
		//lets close the browser
		driver.close();
		
	}

}
