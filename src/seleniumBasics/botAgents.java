package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class botAgents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver" , "/Users/scottyoshimura/documents/javaJars/chromedriver");
		//lets set up the chrome driver
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://fantasycricket.dream11.com/IN/");
		int number=switchtoFrame(driver,By.xpath("//*[@id='m_rtxtEmail1']")) ;
		driver.switchTo().frame(number);
		driver.findElement(By.xpath("//*[@id='m_rtxtEmail1']"));
		
		
	}
	
	
	
	
	
	//lets write a method to handle the frames issue
	public static int switchtoFrame (WebDriver driver,By by)
	{
		int i;
		int framecount=driver.findElements(By.tagName("iframe")).size();
		for (i=0;i<framecount;i++) {
			driver.switchTo().frame(i);
			int count=driver.findElements(by).size();
			if(count>0){
				break;
			} else {
				System.out.println("continue looping");
			}
		}
		//we use the below to get to the main html page
		driver.switchTo().defaultContent();
		return i;
	}

}
