package intellipaat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lauchfirefoxdriver {

	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");

	}

}
