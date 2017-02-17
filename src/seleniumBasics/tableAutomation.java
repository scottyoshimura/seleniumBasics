package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tableAutomation {

	public static void main(String[] args) {
		//below are ways to manage the chrome driver. when working with chrome or IE, selenium works with Firefox. selenium is built in firefox. not the case with crhome and IE. there is one more layer. you need to execute that layer.
		//much like gecko driver, we have to set the system properties to set up the middle layer
		System.setProperty("webdriver.chrome.driver" , "/Users/scottyoshimura/documents/javaJars/chromedriver");
		//lets set up the chrome driver
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://www.espncricinfo.com/ci/engine/match/415281.html");
		//lets create a webElement object for the table
		WebElement table=driver.findElement(By.className("batting-table innings"));
		//lets find how many rows in the table. lets great a list of the elements
		List<WebElement>numberofRows=((By) table).findElements((SearchContext) By.tagName("tr"));
		System.out.println("number of rows are "+numberofRows);
		
	}

}
