package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tests.ExcelReader;

public class LogOutPage {
	WebDriver driver;
	ExcelReader readFromExcel;
	
	public LogOutPage(WebDriver driver, ExcelReader readFromExcel) {
		this.driver = driver;
		this.readFromExcel = readFromExcel;
	}
	
	public boolean assertLogingOut() {
		return driver.findElement(By.partialLinkText("Login")).isDisplayed();
	}
}
