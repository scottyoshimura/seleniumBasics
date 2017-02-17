package seleniumBasics;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class testCases {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try {
	WebDriver driver;
	System.setProperty("webdriver.gecko.driver" , "/Users/scottyoshimura/documents/javaJars/geckodriver");
	driver =new FirefoxDriver();
	driver.get("https://fantasycricket.dream11.com/IN/");
	
	//lets use an explicit wait
	//this says it will wait for an element with a max time of 5 seconds
	//you use explicit waits 
	WebDriverWait wd= new WebDriverWait(driver,5);
	

	//now we can use the WebDriverWait object.
	//lets click on the email box
	//if there is any object which may or may not be on the page eg. negative balance in a pop up
	
	driver.findElement(By.xpath("//*[@id='m_rtxtEmail1']")).sendKeys("000");
	//and wait for the drop down auto suggest values to appear
	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='m_frmRegister']/div[1]/ul")));
	

	
/*
	//lets get the count of the total link count
	System.out.println(driver.findElements(By.tagName("a")).size());
	//System.out.print("\n");
	//lets narrow the scope of the selenium control to the footer. we created a variable for the footer using hte WebElement API
	WebElement footer=driver.findElement(By.xpath("//*[@id='footerFragment']/div"));
	System.out.println(	footer.findElements(By.tagName("a")).size());
	
	WebElement column0=driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
	System.out.println(	column0.findElements(By.tagName("a")).size());
	System.out.println(driver.getTitle());
	
	//we will use the below variables for our validation
	String beforeClicking = null;
	String afterClicking = null;
	
	for (int i=0;i<column0.findElements(By.tagName("a")).size();i++)
	{
		
		//System.out.println(column0.findElements(By.tagName("a")).get(i).getText());
		if (column0.findElements(By.tagName("a")).get(i).getText().contains("Site map")){
			beforeClicking=driver.getTitle();
			column0.findElements(By.tagName("a")).get(i).click();
			//lets make sure that we break from the for loop using break. break leaves all loops.
			break;
		}
	}
	//lets use variable afterClicking
	afterClicking=driver.getTitle();
	//if the page titles are not equal we know the page has loaded differetly
	if(beforeClicking!=afterClicking){
		//we will also check that some element is being displayed
		boolean abc=driver.findElement(By.xpath("//*[@id='buy']/div[1]/h3")).isDisplayed();
		if(abc==true){
			System.out.println("Pass");
		}
	}
	else {
		System.out.println("fail");
	}
	System.out.println(driver.getTitle());
	
	*/
	

}
catch(Exception e) {
	//take a screenshot
}
	}

}
