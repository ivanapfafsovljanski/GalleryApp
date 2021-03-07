package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import tests.ExcelReader;

public class CreateGalleryPage {
	WebDriver driver;
	ExcelReader readFromExcel;
	WebElement titleField;
	WebElement descriptionField;
	List<WebElement> imageURLInput;
	List<WebElement> inputBtns;
	WebElement addImageBtn;
	
	public CreateGalleryPage(WebDriver driver, ExcelReader readFromExcel) {
		this.driver = driver;
		this.readFromExcel = readFromExcel;
	}
	public void createListImageUrlInputs() {
		imageURLInput = driver.findElements(By.className("form-control"));
	}
	public void createListImputBtns() {
		inputBtns = driver.findElements(By.className("input-buttons"));
	}
	public void createNewGallery()  {
		createListImageUrlInputs();
		titleField = driver.findElement(By.id("title"));
		titleField.clear();
		titleField.sendKeys(readFromExcel.taxtualValue("CreateGallery", 2, 3));
		descriptionField = driver.findElement(By.id("description"));
		descriptionField.clear();
		descriptionField.sendKeys(readFromExcel.taxtualValue("CreateGallery", 4, 3));
		
		imageURLInput.get(2).sendKeys(readFromExcel.taxtualValue("CreateGallery", 6, 3));
		addImageBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/div[3]/button"));
		addImageBtn.click();
		
		createListImputBtns();
		inputBtns.get(3).click();
	}
	public void newGalleryNoDescription() {
		createListImageUrlInputs();
		titleField = driver.findElement(By.id("title"));
		titleField.clear();
		titleField.sendKeys(readFromExcel.taxtualValue("CreateGallery", 14, 3));
		imageURLInput.get(2).sendKeys(readFromExcel.taxtualValue("CreateGallery", 18, 3));
		addImageBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/div[3]/button"));
		addImageBtn.click();
	
		createListImputBtns();
		inputBtns.get(3).click();
	}
	public void newGalleryMultipleImages() {
		createListImageUrlInputs();
		titleField = driver.findElement(By.id("title"));
		titleField.clear();
		titleField.sendKeys(readFromExcel.taxtualValue("CreateGallery", 25, 3));
		descriptionField = driver.findElement(By.id("description"));
		descriptionField.clear();
		descriptionField.sendKeys(readFromExcel.taxtualValue("CreateGallery", 27, 3));
		
		imageURLInput.get(2).sendKeys(readFromExcel.taxtualValue("CreateGallery", 29, 3));
		addImageBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/div[3]/button"));
		addImageBtn.click();
		createListImputBtns();
		createListImageUrlInputs();
		imageURLInput.get(3).sendKeys(readFromExcel.taxtualValue("CreateGallery", 32, 3));
		addImageBtn.click();
		
		createListImputBtns();
		inputBtns.get(6).click();
	}
	public void clickSubmitBtn() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/button[1]")).click();
	}

}
