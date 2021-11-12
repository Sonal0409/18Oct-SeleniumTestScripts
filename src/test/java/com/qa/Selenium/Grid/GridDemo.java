package com.qa.Selenium.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemo {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		// where to run the script
		//windows machine and chrome browser
		
	
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("chrome");
		
		ChromeOptions Options = new ChromeOptions();
		
		Options.merge(cap);
		
		String url = "http://192.168.1.14:4545/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(url),Options);
		
		
		driver.get("https://www.wikipedia.org/");
		
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
