
import java.awt.List;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjectDemo.POMGoogleSearch;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
	    //driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Sayali");
		//POMGoogleSearch.textbox_googlesearch(driver);
		goSearch();
	    
	
	}	
		public static void goSearch() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "E:\\sayali\\Eclipse Projects\\SeleniumJavaFramework\\Drivers\\Chrome Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http:\\www.google.com");
			driver.findElement(By.name("q")).sendKeys("Sayali");
			Thread.sleep(2000);
		    
		    driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		    Thread.sleep(3000);
			
			driver.close();
		}
	

}
