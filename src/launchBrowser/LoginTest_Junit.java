package launchBrowser;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//J Unit has no main method
// @Test is used to call the method i.e @Before ,@Test ,@after
//@Before and @After run with every @test
//@Before class is executed oly once at the begging of run cycle before every @test
// @ Afterclass after all test are run . oly once
// @Beforeclass and @Afterclass have to be static method.
// while other init , tearDown and Test method have to be static.

public class LoginTest_Junit {
	 
	WebDriver driver;
	
	@BeforeClass
	  public static void beforeClass() { 
		System.out.println("Can also email the  run report to urself ");
	}
	
	@AfterClass
	public static void afterClass() { 
		System.out.println("Can also email the  run report to urself ");
	}
	
	@Before
	public void init() {
		System.out.println("init method");

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Test
	public void loginTest() {
		System.out.println("Login test");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();

	}
	
	@Test
	public void negLoginTest() {
		System.out.println("Neg login test");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1234543");
		driver.findElement(By.name("login")).click();
	}

	
	@After
	public void tearDown() {
		System.out.println("tear down");
		driver.close();
		driver.quit();
	}
	
	
}

