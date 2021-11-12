package com.qa.WaitTimes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitDemo {
	
	// ExplicitWait : time to wait & condition
	
	// wait for 10 sec OR wait until the element is visible
	
	// 10 sec completed , condition not statisfied-- exception element not visible
	
	// element : checkbox is visible
	//start execution of the next step
	
	@Test
	public void waitTiemDemo() throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		String text2 =driver.findElement(By.linkText("Electronics")).getText();
		System.out.println(text2);

		WebElement e1 = driver.findElement(By.linkText("Motors1234"));
		
		// explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		wait.until(ExpectedConditions.visibilityOf(e1));
		
		/* Fluentwait
		Wait wait1 = new FluentWait(e1)
				.withTimeout(15, SECONDS).
		pollingEvery(5,SECONDS).
		ignoring(Exception.class); */
		
		String text1= e1.getText();
		
	System.out.println(text1);
		
		
				
	}

}
