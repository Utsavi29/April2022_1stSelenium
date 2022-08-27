package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
	//Setup System Property
	System.setProperty("webdriver.chrome.driver","C:\\Users\\utsav\\Selenium\\1st_Selenium\\driver\\chromedriver.exe");
	//Object of Chrome drive . ChromeDriver() can be any brower IEDriver();or FirefooxDriver();
	WebDriver driver = new ChromeDriver();
	
	//to go to website . i did amazon. copy the UrL
	driver.get("https://www.amazon.com/?tag=hpbk-ubpl-pczz-pzz-us-20");
	
	//to maximize the website window
	driver.manage().window().maximize();
	
	//To pause execution for a milli sec before the window close. 1 second is 1000 milisecond.
	 Thread.sleep(5000);
	
	//to close the window
	driver.close();
	}

}
