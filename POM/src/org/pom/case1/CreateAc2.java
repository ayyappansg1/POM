package org.pom.case1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.loginPageObject.CreatePAgeObject;
import org.testng.annotations.Test;

public class CreateAc2 {
	
	@Test
	public void createAccount() {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\POM\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		CreatePAgeObject.clickCreateAccount(driver).click();
		CreatePAgeObject.firstname(driver).sendKeys("ayyappan");
		CreatePAgeObject.lastname(driver).sendKeys("Gunasekaran");
		CreatePAgeObject.gender(driver).click();
		
		
		
		
	}

}
