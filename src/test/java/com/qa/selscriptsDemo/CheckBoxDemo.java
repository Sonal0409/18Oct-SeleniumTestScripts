package com.qa.selscriptsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		driver.findElements(By.xpath("//input[@type='checkbox']")) // fetch list of elements
		
		
		.get(0) // get the item from the list that is at the index 0
		.click(); // now click on it
		
		Thread.sleep(2000);
		
		boolean beforeclick= driver.findElements(By.xpath("//*[@type='checkbox']")).get(1).isSelected(); //false
		
		System.out.println(beforeclick);
		
		driver.findElements(By.xpath("//*[@type='checkbox']")).get(1).click();
		Thread.sleep(2000);
		
		driver.findElements(By.xpath("//*[@type='checkbox']")).get(4).click();
		
		
	// to check if the checkbox is selected or not --> isSelected()	
		
	boolean sel=	driver.findElements(By.xpath("//*[@type='checkbox']")).get(4).isSelected();
		
		System.out.println(sel);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
