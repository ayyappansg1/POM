package org.pom.loginPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.id("email"));
	}
	public static WebElement passWord(WebDriver driver) {
		return driver.findElement(By.id("pass"));
	}
	public static WebElement clicked(WebDriver driver) {
		return driver.findElement(By.name("login"));
	}
}
