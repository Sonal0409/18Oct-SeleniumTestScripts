package com.qa.selscriptsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearchpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		
		// search loacator for search box
		// using descendant:
		// //*[@class='sbx voice-search']/descendant::input[1]
		// using child & descendant together
		
		//*[@class='sbx voice-search']/child::*/descendant::input[1]
		// using child
		//*[@id='sbq-wrap']/child::input[1]
		// using following
		//*[@id='hd']/following::input[1]
		
		
 driver.findElement(By.xpath("//*[@class='sbx voice-search']/descendant::input[1]")).sendKeys("Appium");		
		
    Thread.sleep(5000);
 
	// capture the entire list of webElements from the listbox
    // store it in an object of type List<WebElement>
    
    List<WebElement> list1 =driver.findElements(By.xpath("//*[@role='listbox']/child::li"));
    
    
    System.out.println("the number of elements in the list " + list1.size());
    
  
 // start a for loop.. that scan your list of items
    
    for(int i=0;i<list1.size();i++)
    {
    	String text=list1.get(i).getText();
    	if(text.contains("download"))
    	{
    		list1.get(i).click();
    		break;
    	}
    }
    
 // give a if condition to click on you  matching text
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
