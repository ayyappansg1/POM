package org.pom.case1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.pom.loginPageObject.LoginPageObject;

public class LoginwithoutFindBy {
	
	public static WebElement email;
	public static WebElement pass;
	public static WebElement login;
	
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\POM\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		PageFactory.initElements(driver, LoginwithoutFindBy.class);
		
		email.sendKeys("sangar");
		pass.sendKeys("sangardada");
		login.click();
		
		//driver.quit();
	}
	
}
