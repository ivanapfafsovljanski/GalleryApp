package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BeginningClass{
	@BeforeMethod
	public void beforeMethod() {
		driver.navigate().to("https://gallery-app.vivifyideas.com");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		pageAllGaleries.clickLoginBtn();
	}

	//@Test
	public void validLogin() {
		pageLogin.loginValid();
		pageLogin.submitLoginData();
		Assert.assertTrue(pageAllGaleries.logoutBtnIsPresent());
	}
	//@Test 
	public void emptyCredentials() {
		pageLogin.submitLoginData();
		
	}
	//@Test
	public void loginWrongEmail() {
		pageLogin.loginWrongEmail();
		pageLogin.submitLoginData();
		Assert.assertEquals(pageLogin.badCredentialsMsg(), readFromExcel.taxtualValue("LogIN", 17, 4));
	}
	//@Test
	public void loginWrongPsw() {
		pageLogin.loginWrongPsw();
		pageLogin.submitLoginData();
		Assert.assertEquals(pageLogin.badCredentialsMsg(), readFromExcel.taxtualValue("LogIN", 17, 4));
	}
	//@Test
	//pada - izbrisati
	public void loginSpaceInFrontPsw() {
		pageLogin.spaceInfrontOfPsw();
		pageLogin.submitLoginData();
		Assert.assertTrue(pageAllGaleries.logoutBtnIsPresent());
	}
	
	//@AfterMethod
	public void afterMethod() {
		pageAllGaleries.logout();
	}
}
