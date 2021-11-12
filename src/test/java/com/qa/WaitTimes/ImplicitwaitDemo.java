package com.qa.WaitTimes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitwaitDemo {
	
	
	
	@Test
	public void waitTiemDemo() throws InterruptedException
	{
		Thread.sleep(2000); // static wait time
		System.out.println("print after wait");
		// Implicit wait - 5 sec
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		// wait for 5 sec , when an element is not visible, even after that it is not visible then 
		// throw element not found exception
		
		String text1= driver.findElement(By.linkText("Motors34567")).getText();
		System.out.println(text1);
		
		String text2 =driver.findElement(By.linkText("Electronics")).getText();
		System.out.println(text2);
				
	}

}
