package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//below is how we can handle 
public class multipleWindows {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "/Users/scottyoshimura/documents/javaJars/chromedriver");
		//lets set up the chrome driver
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com");
		
		//by default handles the parent window and you have to switch control to the child window. a child window can be described as creating a new window in HTML.
		//you then have to switch back to the parent when you need to.
		driver.findElement(By.xpath("//*[@id='footer-list']/li[4]/a")).click();

		
		System.out.print(driver.getTitle());
		System.out.print("\n");
		
		//lets see how many windows we have open. driver.getWindowHandles will return a string of handle IDs we want to save in a set of strings. we then need to save it in a set data structure
		//set ids are saved on a priortiy basis. in the first set bucket, the id from the parent window. sequentially it continues first come first served.
		//in the above example there are only two window handle ids 
		//lets get the second id, the child
		
		
		
		Set<String>ids=driver.getWindowHandles();
		
		System.out.print(ids);
		System.out.print("\n");
		
		//lets use the iterator method from the Set Data type to get the id of the second window
		Iterator<String> it=ids.iterator();
		//lets get the next iterator value. we use the below until we get the next window
		String parentId=it.next();
		String childid=it.next();
		
		
		//if you want to switch to the child window lets use .switchTo
		driver.switchTo().window(childid);
		
		System.out.print(driver.getTitle());
		System.out.print("\n");
		
		driver.switchTo().window(parentId);
		
		System.out.print(driver.getTitle());
		
		
		
	
	}

}
