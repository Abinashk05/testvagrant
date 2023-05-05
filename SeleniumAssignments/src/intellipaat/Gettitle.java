package intellipaat;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle {

	public static void main(String[] args) {
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.google.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      System.out.println(driver.getTitle());
      driver.close();
	}

}
