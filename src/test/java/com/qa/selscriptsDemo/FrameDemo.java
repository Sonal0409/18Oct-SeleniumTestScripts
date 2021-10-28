package com.qa.selscriptsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {
	
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	
	// links - linktext locator
	
	// frames on the webpage
	
	// packageListFrame, packageFrame, classFrame
	
	driver.switchTo().frame("packageListFrame");
	
	driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
	
	driver.switchTo().parentFrame();
	
	driver.switchTo().frame("classFrame");
	
	driver.findElement(By.linkText("org.openqa.selenium.chromium")).click();
	
	
	}

}
