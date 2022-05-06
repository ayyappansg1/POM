package org.pom.case1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.pom.loginPageObject.LoginPageObject;
import org.pom.loginPageObject.LoginPageObject2;

public class LoginTestCase2 {
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\POM\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		PageFactory.initElements(driver, LoginPageObject2.class);
		
		LoginPageObject2.userName.sendKeys("sangar");;
		LoginPageObject2.passWord.sendKeys("sangardada");;
		LoginPageObject2.clicked.click();;
		
		driver.quit();
	}
	
}
