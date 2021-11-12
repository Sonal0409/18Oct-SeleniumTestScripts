package com.qa.TestNGAssertionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {
	
	// Name is class is again SoftAssert
	// Class SoftAssert, method assertEquals()
	
	
	
	//@Test
	public void titleValidate()  // Failed
	{
		String expected = "SeleniumTraining123";
		String actual = "SeleniumTraining";
		String expected1 = "appium123";
		String actual1 = "appium";
		
		sa.assertEquals(actual, expected,"The title dont match"); // false -- throw an error
		// script will not stop execution of the output is False
		System.out.println(expected);
		System.out.println(actual);
		
		sa.assertEquals(actual1, expected1,"2nd set of results dont match"); // true
		
		System.out.println(expected1);
		System.out.println(actual1);
		
		sa.assertAll();
		
	}
	
	SoftAssert sa = new SoftAssert();
	
	@Test
	public void ValidateEbay() throws InterruptedException
	{
		
		Reporter.log("Opening the browser");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		String expectedTitle= "Electronics, Cars, Fashion, Collectibles";
		
		String actualTitle = driver.getTitle();
		
		Reporter.log("Checking if title is correct or not",true);
		
		sa.assertEquals(actualTitle,expectedTitle,"Title do not match" );
		
		
		driver.findElement(By.id("gh-ac")).sendKeys("Toy cars");
		
		driver.findElement(By.id("gh-btn")).click();
		
		Reporter.log("Checking if search page is displayed or not",true);
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Advanced")).click();
		
		String expected2="eBay Search: Advanced";
		
		String actual2 = driver.getTitle();
		
		Reporter.log("Checking if title  of advance page is correct or not",true);
		
		sa.assertEquals(actual2, expected2,"title do not match");
		
		driver.findElement(By.id("_nkw")).clear();
		
		driver.findElement(By.id("_nkw")).sendKeys("iPhone 11");
		
		driver.findElement(By.xpath("//*[@class='adv-s mb space-top']/child::button[1]")).click();
		
		sa.assertAll();
		
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
