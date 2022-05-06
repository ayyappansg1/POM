package org.pom.loginPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatePAgeObject2 {
	@FindBy(xpath="//a[text()='Create New Account']")
	public static WebElement clickCreateAccount;
	@FindBy(name="firstname")
	public static WebElement firstname;
	@FindBy(name="lastname")
	public static WebElement lastname;
	@FindBy(name="sex")
	public static WebElement gender;

}
