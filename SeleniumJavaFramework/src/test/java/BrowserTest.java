import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException 
	{
		String dir=System.getProperty("user.dir");
		System.out.println("directory Path: "+dir);
		
		System.setProperty("webdriver.gecko.driver", "E:\\sayali\\Eclipse Projects\\SeleniumJavaFramework\\Drivers\\Gecko Driver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\sayali\\Eclipse Projects\\SeleniumJavaFramework\\Drivers\\Chrome Driver\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "dir\\Drivers\\Gecko Driver\\geckodriver.exe");
						
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http:\\www.facebook.com");
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
