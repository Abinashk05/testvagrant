package com.Intellipat.sauceLab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Saucedemo {		
		public WebDriver driver;
		
		Saucedemo(WebDriver driver){
			this.driver = driver;
		}
			By userName = By.id("user-name");
		    By password = By.id("password");
		    By login = By.id("login-button");
		    
		    public void username(String user_name ) {
		    	driver.findElement(userName).sendKeys(user_name);
		    }
		    public void password(String passwrd ) {
		    	driver.findElement(password).sendKeys(passwrd);
		    }
		    public void login() {
		    	driver.findElement(login).click();
		    }
		}
		





