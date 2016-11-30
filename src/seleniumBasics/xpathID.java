package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class xpathID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//  below is how we started invoking the browser. it sets up a WebDriver object, and then we assign the firefox driver class to that object.
		WebDriver driver;
		//we are using the firefoxdriver class to execute and imlement present in this Webdriver interface
		//because firefox browser is using marionette in v. 48,  in selenium 3 we need to point to the gecko driver
		System.setProperty("webdriver.gecko.driver" , "/Users/username/documents/javaJars/geckodriver");
		driver =new FirefoxDriver();
		//

/*below is a way to automate the american express website 
		//lets hit the url
		driver.get("http://www.americanexpress.com");
		//lets get the site name from selenium
		System.out.println(driver.getTitle());
		//we can get hte page source with the below
		//System.out.println(driver.getPageSource());
		
		//lets get the current URL. you can do this to see if you are gettting redirects
		System.out.println(driver.getCurrentUrl());
		
		//lets find the cards button using xpath
		//we are telling the driver to find an elemnet by xpath and then click
		driver.findElement(By.xpath(".//*[@id='faqAnchor']")).click();
		//lets print confirmation to the log
		System.out.println("clicked the faq cards button");
*/
		
/*let's automate a facebook login page
		//in this scenario we will automate our facebook login	using attributes of elements on the page
			//remember, html defines things by tagNames, then attributes
			  
		driver.get("http://www.facebook.com");	 
	//we need to enter a user name. lets find it by id
		driver.findElement(By.id("email")).sendKeys("enteryourFBusername");
		
	//we need to enter a user name. lets find it by class name
		driver.findElement(By.id("pass")).sendKeys("enteryourFBPass");
	//we need to click the login button. lets find it by xpath
		driver.findElement(By.xpath(".//*[@id='u_0_n']")).click();  
		*/
		
		
//below is a way to find the forgot account link with xpath from firebug	 
		driver.get("http://www.facebook.com");	 
		//driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
	//lets create a custom xpath expression using attributes for the Forgot Login box.
		//the syntax for custom XPATH using TagNames is //tagname[@attribute='value']
			//	<a data-testid="forgot_account_link" href="https://www.facebook.com/recover/initiate?lwv=110">Forgot account?</a>
			//xpath for above is //a[@data-testid='forgot_account_link']
			//make sure that the attribute is unique or it won't work
		driver.findElement(By.xpath("//[@data-testid='forgot_account_link']")).click();

//below is the way to use xpath by traversing through the tag names 
		//tagname[@attribute='value'] + traversing through the tag names
		//div[@id='reg_form_box']/div[1]/div[1]/div[1]/div[1]/div/input
		
		//lets close the browser
		driver.close();
		
		

	}

}
