package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tests.ExcelReader;

public class LoginPage {
	WebDriver driver;
	ExcelReader readFromExcel;
	WebElement emailField;
	WebElement pswField;
	
	
	
	public LoginPage(WebDriver driver, ExcelReader readFromExcel) {
		this.driver = driver;
		this.readFromExcel = readFromExcel;
		
	}
	public void submitLoginData() {
		driver.findElement(By.tagName("button")).click();
	}
	public void loginValid() {
		emailField  = driver.findElement(By.id("email"));
		emailField.clear();
		emailField.sendKeys(readFromExcel.taxtualValue("LogIN", 3, 3));
		pswField = driver.findElement(By.id("password"));
		pswField.clear();
		pswField.sendKeys(readFromExcel.taxtualValue("LogIN", 5, 3));
	}
	//public void loginEmptyAssert() {
		
	//}
	public void loginWrongEmail() {
		emailField  = driver.findElement(By.id("email"));
		emailField.clear();
		emailField.sendKeys(readFromExcel.taxtualValue("LogIN", 12, 3));
		pswField = driver.findElement(By.id("password"));
		pswField.clear();
		pswField.sendKeys(readFromExcel.taxtualValue("LogIN", 14, 3));
	}
	public String badCredentialsMsg() {
		return driver.findElement(By.className("alert-danger")).getText();
	}
	public void loginWrongPsw() {
		emailField  = driver.findElement(By.id("email"));
		emailField.clear();
		emailField.sendKeys(readFromExcel.taxtualValue("LogIN", 22, 3));
		pswField = driver.findElement(By.id("password"));
		pswField.clear();
		pswField.sendKeys(readFromExcel.taxtualValue("LogIN", 24, 3));
	}
	public void spaceInfrontOfPsw() {
		emailField  = driver.findElement(By.id("email"));
		emailField.clear();
		emailField.sendKeys(readFromExcel.taxtualValue("LogIN", 32, 3));
		pswField = driver.findElement(By.id("password"));
		pswField.clear();
		pswField.sendKeys(readFromExcel.taxtualValue("LogIN", 34, 3));
	}
	
}
