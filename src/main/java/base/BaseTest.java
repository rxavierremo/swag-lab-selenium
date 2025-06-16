package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	//Initialize WebDriver
	protected WebDriver driver;
	
	
	//Sets up the Chrome driver
	
	@BeforeMethod //@BeforeMethod is a TestNG annotation that will run before any method that has @Test annotation in test files.
	public void setUp() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //Maximizes the chrome window
		driver.get("https://www.saucedemo.com/"); //This URL is a demo e-commerce web application
	}
	
	//Quits the Chrome driver
	
	@AfterMethod //@AfterMethod is a TestNG annotation that will run after all methods that has @Test annotation is completed.
	public void tearDown() {
		
		if(driver != null) { //If driver is still open, it will quit.
			
			driver.quit();
			
		}
		
	}
}
