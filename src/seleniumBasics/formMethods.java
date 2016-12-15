package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class formMethods {
//
	public static void main(String[] args) {
		//below are ways to manage the firefoxDriver and marionnete
		//  below is how we started invoking the browser. it sets up a WebDriver object, and then we assign the firefox driver class to that object.
		WebDriver driver;
		//we are using the firefoxdriver class to execute and imlement present in this Webdriver interface
		//because firefox browser is using marionette in v. 48,  in selenium 3 we need to point to the gecko driver
		System.setProperty("webdriver.gecko.driver" , "/Users/scottyoshimura/documents/javaJars/geckodriver");
		driver =new FirefoxDriver();
		
		driver.get("http://www.makemytrip.com/flights");
		
	//below is how we can determing if some web element is present in the code and showing using isDisplayed()
		System.out.println("before clicking on multi city option");
		//below we use isDisplayed as a true or false to see if something is on the screen or not.
		System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());
		//driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();
		System.out.println("afer clicking on multi city option");
		System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());
		
	//below is how we can determine if some web element is enabled or not enabled using isEnabled()
		System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isEnabled());
		
	// lets figure out how to get the text of an element
		//System.out.println(driver.findElement(By.xpath("//*[@id='content']/div[2]/div/section[1]/div[3]/h3")).getText());
		
	//lets automate the calendar 
		driver.findElement(By.xpath("//*[@id='start_date_sec']/span[3]")).click();
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[5]/td[4]/a")).click();
		
	//lets use a while loop to do five times
		int i=0;
		while(i<5)
		{
			driver.findElement(By.xpath("//*[@id='adult_count']/a[2]")).click();
			i++;	
		}
		
	//if you want to validate the object which is present in the webpage or code, but not present, use isDiskpalyed. take that element and find the size. if it is 0, it is not there.
		//you can see if something is showing or not using isDisplayed.
		int count=driver.findElements(By.xpath(".//*[@id='mul_button']/span")).size();
		//is displayed only works if it is in the code but not visible. if you want to varify if it is in code only, use size
		if (count==0) {
			System.out.println("verified not there in the code");
		}
		
		
	}

}
