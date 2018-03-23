package com.testng;

import static java.util.concurrent.TimeUnit.SECONDS;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static java.lang.Thread.sleep;

public class HandleAlerts {
	
	public static WebElement element;
	public static Alert alert;

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.gecko.driver","C://Users//sai//workspace//geckodriver-v0.16.1-win32//geckodriver.exe");
		System.setProperty("webdriver.firefox.driver", "C://Program Files//Mozilla Firefox//firefox.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().timeouts().pageLoadTimeout(30, SECONDS);
		element=driver.findElement(By.xpath(".//*[@id='content']/p[4]/button"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		driver.manage().timeouts().pageLoadTimeout(30, SECONDS);
		driver.findElement(By.xpath(".//*[@id='content']/p[4]/button")).click();
		Alert alert=driver.switchTo().alert();
		sleep(1000);
		alert.accept();
		sleep(1000);
		driver.findElement(By.xpath(".//*[@id='content']/p[8]/button")).click();
		alert=driver.switchTo().alert();
		sleep(1000);
		alert.dismiss();
		sleep(1000);
		driver.findElement(By.xpath(".//*[@id='content']/p[11]/button")).click();
		sleep(1000);
		alert=driver.switchTo().alert();
		alert.sendKeys("yes");
		sleep(1000);
		alert.accept();
						
	
	}

}
