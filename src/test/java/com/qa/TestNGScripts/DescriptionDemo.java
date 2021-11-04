package com.qa.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DescriptionDemo {
	
	@Test(description="Testing Wiki homePage")
	public void method1() // test method
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
	driver.findElement(By.id("searchInput")).sendKeys("Selenium Automation");
	driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click();
	
	
	}

}
