package com.qa.selscriptsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Locators & findElement() method
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
		
		// find Username and enter data
		
		// clear the text
		
	//WebElement

driver.findElement(By.cssSelector("#wpName2")).clear();
// #id
// tagname#idvalue
// tagname.class
// tagname[attribute=value]
// tagname.class[attribute=value]
// tag:contains("textvalue")
driver.findElement(By.cssSelector("input#wpName2")).sendKeys("admin");
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
