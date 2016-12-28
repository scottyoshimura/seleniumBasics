package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		//this script was not working with marrionette, lets try chrome
		System.setProperty("webdriver.chrome.driver" , "/Users/scottyoshimura/documents/javaJars/chromedriver");
		//lets set up the chrome driver
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
		
		//we are going to create a class Actions and we will pass the driver object arguement. abc has the driver capabilities and the actions capabilties.
		//abc will have the driver capapbilites and the Actions capabilities
		//the actions move the mouse
		
		Actions abc=new Actions(driver);
		//we need to pass in the element ID. lets use the WebElement class to create a class object "element"
		WebElement element=driver.findElement(By.xpath(".//*[@id='nav-flyout-accountList']"));
		//if we use the WebElement class we then need to complie it with the Build Method and perform it. build complies the abc.movetoelement;. perform is to eexecute it
		abc.moveToElement(element).build().perform();
		
		//lets add in search criteria in the search bar in caps. we use the key down method.
		//driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")); 
		//lets set up a WebElement Variable so that we can use to pass to the abc method
		WebElement location0=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		abc.keyDown(Keys.SHIFT).moveToElement(location0).sendKeys("small letters").build().perform(); 
		
		//lets send a right click
		abc.contextClick(location0).build().perform();
		

	}

}
