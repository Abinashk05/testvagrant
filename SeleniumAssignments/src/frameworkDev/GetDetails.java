package frameworkDev;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetDetails {
	public String getPropDetails(String key) {
		String eleDetails = null;
		try {
			FileInputStream fis = new FileInputStream("src\\frameworkDev\\locator.properties");
			Properties p = new Properties();
			p.load(fis);
		    eleDetails = p.getProperty(key);
			} catch (IOException e) {
			e.printStackTrace();
		}
		return eleDetails;
	}
	
	public WebElement getElementDetails(WebDriver driver, String key1) {
		WebElement ele = null;
		GetDetails obj = new GetDetails();
		String value = obj.getPropDetails(key1);
		String[] info = value.split(":");
		
		switch(info[0])
		{
		case "id":
			ele = driver.findElement(By.id(info[1]));
			break;
		case "name":
			ele = driver.findElement(By.name(info[1]));
			break;
		case "xpath":
			ele = driver.findElement(By.xpath(info[1]));
			break;
		case "linkText":
			ele = driver.findElement(By.linkText(info[1]));
			break;
			
			default:
				System.out.println("unknown locator found");
		}
		return ele;
	}
}


