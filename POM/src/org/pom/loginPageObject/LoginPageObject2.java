package org.pom.loginPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject2 {
	@FindBy(id="email")
	public static WebElement userName;
	@FindBy(id="pass")
	public static WebElement passWord;
	@FindBy(name="login")
	public static WebElement clicked;
	}
