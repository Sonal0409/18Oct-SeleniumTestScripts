package com.qa.selscriptsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUpCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// call a in built method
		// create an object and call it
		// Objectname.methodname()
		// if we have interface and its implementing class, how can you call method
		// WebDriver is an iNterface
		// driver is an Object
		// ChromeDriver is class in selenium
		
	//Location of chromeDriver	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sonal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");	
		
	//Open browser
	WebDriver driver = new ChromeDriver();
		
		// maximaze your browser window
		
	driver.manage().window().maximize();
	
	// Static wait: add wait time in your script
	Thread.sleep(2000);
	
	// that will close the browser
	
	driver.close();
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
