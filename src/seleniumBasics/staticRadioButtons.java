package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class staticRadioButtons {

	public static void main(String[] args) {

		//below are ways to manage the firefoxDriver and marionnete
				//  below is how we started invoking the browser. it sets up a WebDriver object, and then we assign the firefox driver class to that object.
				WebDriver driver;
				//we are using the firefoxdriver class to execute and imlement present in this Webdriver interface
				//because firefox browser is using marionette in v. 48,  in selenium 3 we need to point to the gecko driver
				System.setProperty("webdriver.gecko.driver" , "/Users/scottyoshimura/documents/javaJars/geckodriver");
				driver =new FirefoxDriver();
				
				driver.get("http://echoecho.com/htmlforms10.htm");
				
				//driver.findElement(By.xpath("//input[@value='Milk']")).click();
				
				//lets find out how many things are in the index, and click on the first one
				driver.findElements(By.xpath("//input[@name='group1']")).size();
				int count =driver.findElements(By.xpath("//input[@name='group1']")).size();
				
					for (int i=0; i<count; i++ )
					{
						//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
						//driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
						System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
					String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
					if (text.equals("Milk"));
					{
						driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
					}
					}

	}

}
