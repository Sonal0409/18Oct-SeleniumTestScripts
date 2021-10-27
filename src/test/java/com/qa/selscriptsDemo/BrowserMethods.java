package com.qa.selscriptsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Start chrome browser
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Delete cookies
		
		driver.manage().deleteAllCookies();
		
		// Load a Webpage on the current browserwindow
		
		driver.get("https://www.wikipedia.org/");
		
		// fetch the title of the Page
		
		String actualTitle = driver.getTitle();  
		
		System.out.println("The actual title is : " + actualTitle); // selenium from webpage
	
		// Compare actual title with expected title
		
		String expectedTitle = "Wikipedia";
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("The title is correct");
		}
		else 
			System.out.println("The title is not correct");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
