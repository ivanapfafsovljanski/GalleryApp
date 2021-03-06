package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateGalleryTest extends BeginningClass{
	
	@BeforeMethod
	public void beforeMethod() {
		driver.navigate().to("https://gallery-app.vivifyideas.com");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		pageAllGaleries.clickLoginBtn();
		pageLogin.loginValid();
		pageLogin.submitLoginData();
		pageAllGaleries.clickCreateGalery();
	}
	
	//@Test
	public void creatingGallery() {
		pageCreateGallery.createNewGallery();
		pageCreateGallery.clickSubmitBtn();
		Assert.assertTrue(pageAllGaleries.galleryCreatedAssert());
	}
	//@Test
	public void creatingGalleryNoDescription() {
		pageCreateGallery.newGalleryNoDescription();
		pageCreateGallery.clickSubmitBtn();
		Assert.assertTrue(pageAllGaleries.assertNewGalleryNoDescription());
	}
	@Test
	public void createGalleryMultipleImages() {
		pageCreateGallery.newGalleryMultipleImages();
		pageCreateGallery.clickSubmitBtn();
		Assert.assertTrue(pageAllGaleries.assertNewGalleryMultipleImages());
	}
	
	//@AfterMethod
		public void afterMethod() {
			pageAllGaleries.logout();
	}

}
