package PageObjectDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMGoogleSearch {

	private	static WebElement element=null;

	public static WebElement textbox_googlesearch(WebDriver driver) 
	{
		element= driver.findElement(By.xpath("//input[@name='q']"));
		return element;
	}
		
	public static WebElement button_googlesearch(WebDriver driver)
	{
		element= driver.findElement(By.name("btnK"));
		return element;
	}


}
