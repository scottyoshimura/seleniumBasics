package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class formSubmissions {

	public static void main(String[] args) {
		
		
		//below are ways to manage the chrome driver. when working with chrome or IE, selenium works with Firefox. selenium is built in firefox. not the case with crhome and IE. there is one more layer. you need to execute that layer.
		//much like gecko driver, we have to set the system properties to set up the middle layer
		System.setProperty("webdriver.chrome.driver" , "/Users/scottyoshimura/documents/javaJars/chromedriver");
		//lets set up the chrome driver
		WebDriver driver=new ChromeDriver();
		

			driver.get("http://www.spicejet.com");	
			
			//lets go through the destiation select process to navigate a dynamic drop down box
			//driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
			//we can open the drop down, let's use custom xpath to create custom xpath
			//remember, custom xpath syntax is: //tagname[@attribute='value']
			//driver.findElement(By.xpath(".//a[@value='GOI']")).click();
			
			
			//lets select the amount of people flying to navigate a static dropdown
			// selenium has a unique class to handle Selects. a select is a dropbown that has a Select as a tag name.
			
			// if you want to access any methods in a class you have to create an object of the class. Selenium has 
			// created it in way that you pass in the xpath value of the dropdown to the Select Object
			//Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
			//and then you can do Select methods to the dropdown object
			//dropdown.selectByVisibleText("5 Adults");
			//dropdown.selectByIndex(2);
			//dropdown.selectByValue("8");
			
			
			//lets handle checkboxes. we first see if it is selected, click it, then check
			System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
			driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
			System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
	}

}
