package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void testValidLogin() {
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.inputUsername("standard_user");
		loginPage.inputPassword("secret_sauce");
		loginPage.clickLogin();
		
		System.out.println("The title of this page is: " + driver.getTitle());
	}
 	
}
