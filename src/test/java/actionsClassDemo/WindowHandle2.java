package actionsClassDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		
		
		WebElement e1 = driver.findElement(By.id("win2"));
	
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", e1);
		
		e1.click();
		
		
		Set<String> s1=driver.getWindowHandles(); //unique identifier for all the open windows : 2
		
		
		Iterator<String> itr = s1.iterator();
		
		String parent_window = itr.next();
		
		System.out.println(parent_window);
		
		
		String child_window= itr.next();
		
		System.out.println(child_window);
		
		
		driver.switchTo().window(child_window);
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("appium");
		
		
		Thread.sleep(3000);
		
	
		
		driver.switchTo().window(parent_window);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
