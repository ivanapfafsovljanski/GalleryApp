package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tests.ExcelReader;

public class MyGalleryPage {
	WebDriver driver;
	AllGaleries pageAllGaleries;
	ExcelReader readFromExcel;

	public MyGalleryPage(WebDriver driver, AllGaleries pageAllGaleries, ExcelReader readFromExcel) {
		this.driver = driver;
		this.pageAllGaleries = pageAllGaleries;
		this.readFromExcel = readFromExcel;
	}
	
	public void viewMyGallery() {
		pageAllGaleries.galleryCreation();
		pageAllGaleries.gallery.click();
	}
	public void clickOnCreatedGallery() {
		driver.findElement(By.partialLinkText(readFromExcel.taxtualValue("CreateGallery", 2, 3)));
	}
	public boolean assertMyGallery() {
		String text;
		text = driver.findElement(By.tagName("h1")).getText();
		return text.equalsIgnoreCase(readFromExcel.taxtualValue("CreateGallery", 2, 3));
		
	}
}
