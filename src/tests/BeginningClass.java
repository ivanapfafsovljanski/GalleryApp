package tests;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import pages.AllGaleries;
import pages.HomePage;
import pages.LoginPage;

public class BeginningClass {
	WebDriver driver;
	ExcelReader readFromExcel;
	JavascriptExecutor js;
	HomePage pageHome;
	LoginPage pageLogin;
	AllGaleries pageAllGaleries;
	
	@BeforeClass
	public void beforeClass() throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.readFromExcel = new ExcelReader("data\\GalleryAppTC.xlsx");
		this.js = (JavascriptExecutor) driver;
		this.pageHome = new HomePage(driver);
		this.pageLogin = new LoginPage(driver, readFromExcel);
		this.pageAllGaleries = new AllGaleries(driver, js);
		
		
		driver.manage().window().maximize();	
	}
	
	//@AfterClass
	public void afterClass() {
		driver.close();
	}

}
