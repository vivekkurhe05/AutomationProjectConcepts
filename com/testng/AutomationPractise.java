package com.testng;

import static java.lang.Thread.sleep;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractise {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:/Users/sai/workspace/geckodriver-v0.16.1-win32/geckodriver.exe");
//		System.setProperty("webdriver.firefox.driver", "C://Program Files//Mozilla Firefox//firefox.exe");
	
		System.setProperty("webdriver.chrome.driver", "C:/Users/sai/Downloads/Compressed/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		String url=driver.getCurrentUrl();
		if(url.equals("http://toolsqa.com/automation-practice-form/")){
			System.out.println("Practise Automation Page opened successfully");

		}else{
			System.out.println("Practise Automation Page failed");
		}

//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		driver.findElement(By.linkText("Link Test")).click();
//		System.out.println("Link Test clicked");
//		sleep(2000);
//		driver.navigate().back();
//		System.out.println("Navigate back");
		sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Viraj");
		System.out.println("Name enetered");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.name("lastname")).sendKeys("Deshmukh");
		System.out.println("Lastname entered");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


		WebElement element=driver.findElement(By.name("sex"));
		String male=element.getAttribute("value");
		if(male.equals("Male"))
			element.click();
		if(element.isEnabled()==true)
			System.out.println("Male checked");
		else
			System.out.println("Male unchecked");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		List<WebElement> element2=driver.findElements(By.name("exp"));
		for(int i=0;i<element2.size();i++){

			String exp=element2.get(i).getAttribute("value");
			if(exp.equals("5")){
				element2.get(i).click();
				System.out.println("5 Experience clicked");
				break;
			}


		}



		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id("datepicker")).sendKeys("21/07/2017");
		System.out.println("Date entered");


		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		List<WebElement> element3=driver.findElements(By.name("profession"));
		int size=element3.size();

		for(int i=0;i<size;i++){
			String prof=element3.get(i).getAttribute("value");
			if(prof.equalsIgnoreCase("manual tester")){
				element3.get(i).click();
				System.out.println("Manual tester clicked");
			}
			if(prof.equalsIgnoreCase("automation tester")){
				element3.get(i).click();
				System.out.println("Automation tester clicked");

			}
		}


//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		WebElement scroll = driver.findElement(By.id("photo"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", scroll);
//		System.out.println("Element scroll into view");


		WebElement scroll=driver.findElement(By.name("tool"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scroll);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		List<WebElement> tool=driver.findElements(By.name("tool"));
		int tool_size=tool.size();
		for(int i=0;i<tool_size;i++){
			String tool_e=tool.get(i).getAttribute("value");
			if(tool_e.equalsIgnoreCase("selenium ide")){
				tool.get(i).click();
				System.out.println("selenium ide selected");
			}
			if(tool_e.contains("Webdriver")){
				tool.get(i).click();
				System.out.println("webdriver selected");
			}

		}




		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement opt=driver.findElement(By.id("continents"));
		Select option=new Select(opt);
		List<WebElement> lst=option.getOptions();
		for(int i=0;i<lst.size();i++){
			String str=lst.get(i).getText();
			if(str.equals("Australia")){
				option.selectByIndex(i);
				System.out.println("Option selected is "+lst.get(i).getText());
				break;
			}

		}



		WebElement multi=driver.findElement(By.id("selenium_commands"));
		Select oselect=new Select(multi);
		List<WebElement> multi_select=oselect.getOptions();
		int getsize=multi_select.size();
		for(int i=0;i<getsize;i++){
			oselect.selectByIndex(i);
			if(i==3)
				break;

		}



//		for scrolling down the page at the bottom
//
//		Actions actions = new Actions(driver);
//		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();



	}

}
