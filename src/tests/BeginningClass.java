package tests;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import pages.AllGaleries;
import pages.CreateGalleryPage;
import pages.LoginPage;

public class BeginningClass {
	WebDriver driver;
	ExcelReader readFromExcel;
	JavascriptExecutor js;
	AllGaleries pageAllGaleries;
	LoginPage pageLogin;
	CreateGalleryPage pageCreateGallery;
	
	
	@BeforeClass
	public void beforeClass() throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.readFromExcel = new ExcelReader("data\\GalleryAppTC.xlsx");
		this.js = (JavascriptExecutor) driver;
		this.pageAllGaleries = new AllGaleries(driver, js, readFromExcel);
		this.pageLogin = new LoginPage(driver, readFromExcel);
		this.pageCreateGallery = new CreateGalleryPage(driver, readFromExcel);
		
		driver.manage().window().maximize();	
	}
	
	//@AfterClass
	public void afterClass() {
		driver.close();
	}

}
