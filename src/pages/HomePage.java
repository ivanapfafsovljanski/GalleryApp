package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	WebElement logInBtn;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickLoginBtn() {
		driver.findElement(By.partialLinkText("Login")).click();
	}

}
