package org.pom.case1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.pom.loginPageObject.LoginPageObject;

public class LoginTestCase {
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\POM\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		LoginPageObject.userName(driver).sendKeys("sangar");;
		LoginPageObject.passWord(driver).sendKeys("sangardada");;
		LoginPageObject.clicked(driver).click();;
		
		driver.quit();
	}
	
}
