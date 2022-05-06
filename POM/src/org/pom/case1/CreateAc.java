package org.pom.case1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.pom.loginPageObject.CreatePAgeObject;
import org.pom.loginPageObject.CreatePAgeObject2;
import org.testng.annotations.Test;

public class CreateAc {
	
	@Test
	public void createAccount() {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\POM\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		PageFactory.initElements(driver, CreatePAgeObject2.class);
		
		CreatePAgeObject2.clickCreateAccount.click();
		CreatePAgeObject2.firstname.sendKeys("ayyappan");
		CreatePAgeObject2.lastname.sendKeys("Gunasekaran");
		CreatePAgeObject2.gender.click();
		
		
		
		
	}

}
