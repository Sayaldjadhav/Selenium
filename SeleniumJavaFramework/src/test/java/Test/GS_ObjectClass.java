package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GS_ObjectClass {
	
	public static WebDriver driver=null;
	
	public static void main(String[] args) {
		GoogleSearchObjectClass();
	} 
	
	public static void GoogleSearchObjectClass()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\sayali\\Eclipse Projects\\SeleniumJavaFramework\\Drivers\\Chrome Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		PageObjectDemo.GoogleSearchObjectClass Search =new PageObjectDemo.GoogleSearchObjectClass(driver);
		driver.get("http:\\www.google.com");
		Search.SetTextInTextBox("Sayali");
		Search.ClickSearchButton();

		driver.close();

	}

}
