package com.qa.selscriptsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownDemo {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		
		// Locate the select box
		
	WebElement e1=	driver.findElement(By.xpath("//select[@name='coffee']"));
		
	// Select is the class in selenium that has methods that can select items in the dropdown
	
		Select dd = new Select(e1);
		
		dd.selectByValue("regular");
		
		Thread.sleep(2000);
		
		dd.selectByValue("crisp");
		
		// select the option based on index
		
		Thread.sleep(2000);
		
		dd.selectByIndex(1);
		
	// select by visible text
		
		dd.selectByVisibleText("With sugar");
		
	
	// List class : create an object that can store multiple value	
		// each option/value in the list will always be stored at a index in a sequence(0,1,2,3...)
		

		
  // fetch all the list of WebElements in the select box
		// how many options/webelements??
		// size() : number of WebElements in the selectbox
		
	List<WebElement> li=dd.getOptions(); 
	
	
	
	System.out.println(li.size());
	
	// print all the items in the drop down on my console
	
	// for each loop
	
	// go to every index of the list and fetch the text and print it
	
	// li = {Black, withcream, withsugar, with cream & sugar, crisp}
		
	for(WebElement e:li)
	{
		System.out.println(e.getText());
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
