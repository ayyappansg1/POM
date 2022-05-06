package org.pom.loginPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatePAgeObject {
	
	public static WebElement clickCreateAccount(WebDriver driver) {
		return driver.findElement(By.xpath("//a[text()='Create New Account']"));
	}
	
	public static WebElement firstname(WebDriver driver) {
		return driver.findElement(By.name("firstname"));
	}
	public static WebElement lastname(WebDriver driver) {
		return driver.findElement(By.name("lastname"));
	}
	public static WebElement gender(WebDriver driver) {
		return driver.findElement(By.name("sex"));
	}

}
