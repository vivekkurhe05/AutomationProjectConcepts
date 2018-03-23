package com.testng;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleMultipleWindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C://Users//sai//workspace//geckodriver-v0.16.1-win32//geckodriver.exe");
		System.setProperty("webdriver.firefox.driver", "C://Program Files//Mozilla Firefox//firefox.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.hdfcbank.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		By locator=By.id("cee_closeBtn");
		
		
	}

}
