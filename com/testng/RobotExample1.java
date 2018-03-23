package com.testng;

import java.awt.AWTException;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotExample1 {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.gecko.driver","C://Users//sai//workspace//geckodriver-v0.16.1-win32//geckodriver.exe");
		System.setProperty("webdriver.firefox.driver", "C://Program Files//Mozilla Firefox//firefox.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/advanced_search");
		
		
		WebElement element=driver.findElement(By.id("_dKg"));
		Point point=element.getLocation();
		System.out.println("X cordinate: "+point.x+" Y cordinate: "+point.y);
		
		
		
		
		

		

	}

}
