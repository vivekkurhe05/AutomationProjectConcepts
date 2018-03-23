package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowser {

	public static void main(String[] args) throws InterruptedException {
		
			 
			// Declaring and initialising the HtmlUnitWebDriver
			HtmlUnitDriver unitDriver = new HtmlUnitDriver();
	 
			// open google.com webpage
			unitDriver.get("http://google.com");
			Thread.sleep(2000);
	 
			System.out.println("Title of the page is -> " + unitDriver.getTitle());
			Thread.sleep(500);
			// find the search edit box on the google page
			WebElement searchBox = unitDriver.findElement(By.name("q"));
	 
			// type in Selenium
			searchBox.sendKeys("Selenium");
			System.out.println("selenium was searched");
	 
			// find the search button
			WebElement button = unitDriver.findElement(By.name("gbqfba"));
	 
			// Click the button
			button.click();
	 
			System.out.println("Title of the page is -> " + unitDriver.getTitle());
	 
		}

	}

