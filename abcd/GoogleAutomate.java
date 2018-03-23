package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GoogleAutomate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver","C://Users//sai//workspace//geckodriver-v0.16.1-win32//geckodriver.exe");
		System.setProperty("webdriver.firefox.driver", "C://Program Files//Mozilla Firefox//firefox.exe");
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();

	    capabilities.setCapability("marionette", true);
	    WebDriver driver = new FirefoxDriver(capabilities);
	    driver.get("https://www.google.co.in/?gfe_rd=cr&ei=q21eWeq_DMa3vATzop6AAQ&gws_rd=ssl");
	    driver.findElement(By.id("lst-ib")).sendKeys("selenium");
	    System.out.println("Autoscript run successfully...");
	    
	    
	    
		//WebDriver driver=new FirefoxDriver();
		
		//Thread.sleep(2000);
		//driver.get("http://www.google.co.in");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		

	}

}
