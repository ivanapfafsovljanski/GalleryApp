package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tests.ExcelReader;

public class AllGaleries {
	WebDriver driver;
	JavascriptExecutor js;
	ExcelReader readFromExcel;
	WebElement gallery;
	
	public AllGaleries(WebDriver driver, JavascriptExecutor js, ExcelReader readFromExcel) {
		this.driver = driver;
		this.js = js;
		this.readFromExcel = readFromExcel;
	}
	public void clickLoginBtn() {
		driver.findElement(By.partialLinkText("Login")).click();
	}
	public void clickCreateGalery() {
		driver.findElement(By.partialLinkText("Create Gallery")).click();
	}
	public boolean logoutBtnIsPresent() {
		return driver.findElement(By.partialLinkText("Logout")).isDisplayed();
	}
	public void logout() {
		driver.findElement(By.partialLinkText("Logout")).click();
	}
	public void galleryCreation() {
		 gallery = driver.findElement(By.partialLinkText(readFromExcel.taxtualValue("CreateGallery", 2, 3)));
	}
	public boolean galleryCreatedAssert() {
		galleryCreation();
		return gallery.isDisplayed();
	}
	public boolean assertNewGalleryNoDescription() {
		return driver.findElement(By.partialLinkText(readFromExcel.taxtualValue("CreateGallery", 14, 3))).isDisplayed();
	}
	public boolean assertNewGalleryMultipleImages() {
		return driver.findElement(By.partialLinkText(readFromExcel.taxtualValue("CreateGallery", 25, 3))).isDisplayed();
	}
	public void clickMyGallery() {
		driver.findElement(By.partialLinkText("My Galleries")).click();
	}
}
