package com.qa.TestNGAssertionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsDemo {
	
	
	// Assertions : Class is Assert
	
	// Hard Assertion
	
	 // expected compare with Actual reuslt ==> true, test case is passed but will also continue execution
	//expected compare with Actual reuslt ==> false ==> test case result will be failed, execution stops
	
	
	
	// Syntax : Assert.method(actual, expected);
	//Syntax : Assert.method(actual, expected,"message");
	// if the output is true for the assert method, then testcase is pass
	// TestNg will give an exception : AssertionError ---> message upon failure
	// Hard Assertion
	//@Test
	public void titleValidate()
	{
		String expected = "SeleniumTraining";
		String actual = "SeleniumTraining1234";
		// hard assertion
		// script will stop execution of the output is False
		Assert.assertEquals(actual, expected,"the string do not match"); //false

		System.out.println(expected);
		System.out.println(actual);
	}
	
	@Test
	public void ValidateTitle()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		String expectedTitle= "Electronics, Cars, Fashion, Collectibles";
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle,expectedTitle,"Title do not match");
		
		driver.findElement(By.id("gh-ac")).sendKeys("Toy cars");
		
		driver.findElement(By.id("gh-btn")).click();
		
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
