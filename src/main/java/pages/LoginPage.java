package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	
	//Declaration of three locators that will be used for login
	
	private By usernameTextbox = By.id("user-name");
	private By passwordTextbox = By.id("password");
	private By loginButton = By.id("login-button");
	
	
	//Constructor that will force WebDriver to be initialized
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//Function that takes username as parameter to be entered in the username field
	public void inputUsername(String username) {
		
		driver.findElement(usernameTextbox).sendKeys(username);
		
	}
	
	
	//Function that takes password as parameter to be entered in the password field
	
	public void inputPassword(String password) {
		
		driver.findElement(passwordTextbox).sendKeys(password);
		
	}
	
	
	//Clicks the login button
	
	public void clickLogin() {
		
		driver.findElement(loginButton).click();
		
	}
}