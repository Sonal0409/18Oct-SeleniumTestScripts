package actionsClassDemo;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTabsDemo {

	
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.wikipedia.org/");
	
		Robot r = new Robot();
		
	
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		
ArrayList<String> tabs=	new ArrayList<String> (driver.getWindowHandles());
		
		//String tabs= driver.getWindowHandle();
	
	System.out.println(tabs);
		
    driver.switchTo().window(tabs.get(1));
	  
	  driver.get(
	  "https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/interactions/Actions.html"
	  );
	  
	  driver.switchTo().window(tabs.get(0));
	  
	  driver.get("https://www.amazon.com/");
	  
	 // driver.quit();
	
	 
	 

    	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
