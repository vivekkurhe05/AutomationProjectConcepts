package com.testng;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static java.lang.Thread.sleep;

public class HandlingWebTable {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","C://Users//sai//workspace//geckodriver-v0.16.1-win32//geckodriver.exe");
		System.setProperty("webdriver.firefox.driver", "C://Program Files//Mozilla Firefox//firefox.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		
//		Fetch no.args of rows and columns from Dynamic web table
//		sleep(2000);
//		List<WebElement> elements=driver.findElements(By.xpath(".//*[@id='content']/table/thead/tr/th"));
//		System.out.println("No. of columns are: "+elements.size());
//		List<WebElement> e=driver.findElements(By.xpath(".//*[@id='content']/table/tbody/tr/td[1]"));
//		System.out.println("No. of rows are: "+e.size());
		
		
//		Fetch cell value of a particular row and column of a Dynamic table
		
		sleep(2000);
		WebElement baseTable=driver.findElement(By.xpath(".//*[@id='content']/table/tbody"));
//		JavascriptExecutor j=(JavascriptExecutor)driver;
//		j.executeScript("arguments[0].scrollIntoView(true);", baseTable);
		if(baseTable.isDisplayed()){
			System.out.println("Table is detected");
		}
		else{
			System.out.println("Table is not detected");
		}
			
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		To find third row of table
//		WebElement tableRow=baseTable.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[3]"));
		WebElement tableRowText=baseTable.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[3]/td[1]"));
		String rowText=tableRowText.getText();
		System.out.println("Row text: "+rowText);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		To get 3rd row's 2nd column data
		WebElement cellIneed=baseTable.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[3]/td[2]"));
		String valueIneed=cellIneed.getText();
		System.out.println("Cell value is "+valueIneed);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
//		String sRow="1";
//		String sCol="2";
//		
//		
//		WebElement e=driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+sRow+"]/td["+sCol+"]"));
//		System.out.println(e.getText());
		
		

		

	}

}
