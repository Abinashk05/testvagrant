package com.Intellipat.sauceLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Module11 {
	
	WebDriver driver;

	@Test
	public void test() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Saucedemo demo = new Saucedemo(driver);
		demo.username("standard_user");
		demo.password("secret_sauce");
		demo.login();
		
	}

}
