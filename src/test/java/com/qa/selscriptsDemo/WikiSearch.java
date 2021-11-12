package com.qa.selscriptsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WikiSearch {
	
	@Test
	public void wikisearch() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.id("searchInput")).sendKeys("Selenium automation");
		driver.findElement(By.xpath("//*[@id='search-form']/descendant::button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ooui-php-1")).clear();
		driver.findElement(By.id("ooui-php-1")).sendKeys("appium");
		
		
	}

}
