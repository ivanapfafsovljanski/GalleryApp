package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOutTest extends BeginningClass{

	@BeforeMethod
	public void beforeMethod() {
		driver.navigate().to("https://gallery-app.vivifyideas.com");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		pageAllGaleries.clickLoginBtn();
		pageLogin.loginValid();
		pageLogin.submitLoginData();
	}
	@Test
	public void logingOut() {
		pageAllGaleries.logout();
		Assert.assertTrue(pageLogOut.assertLogingOut());
	}
}
