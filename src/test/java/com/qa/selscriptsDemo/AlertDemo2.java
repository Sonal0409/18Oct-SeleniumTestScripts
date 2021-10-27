package com.qa.selscriptsDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		
		driver.findElement(By.id("confirmBox")).click();
	
			Thread.sleep(3000);
		
		Alert a = driver.switchTo().alert();
		
		// dismiss() : click on cancel button on alert and close the alert box
		
		a.accept();
		
		

	}

}
