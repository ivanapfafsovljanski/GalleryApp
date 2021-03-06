package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AllGaleries {
	WebDriver driver;
	JavascriptExecutor js;
	
	public AllGaleries(WebDriver driver, JavascriptExecutor js) {
		this.driver = driver;
		this.js = js;
	}
	
	public boolean logoutBtnIsPresent() {
		return driver.findElement(By.partialLinkText("Logout")).isDisplayed();
	}
	public void logout() {
		driver.findElement(By.partialLinkText("Logout")).click();
	}
}
