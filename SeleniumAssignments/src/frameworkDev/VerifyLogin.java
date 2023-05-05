package frameworkDev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
		
		GetDetails obj = new GetDetails();
		obj.getElementDetails(driver, "email").sendKeys("user1");
		
		obj.getElementDetails(driver, "password").sendKeys("test");
		obj.getElementDetails(driver, "log").click();
		

	}

}
