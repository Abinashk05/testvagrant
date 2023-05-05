package intellipaat;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Gettitleinternetexplorer {

	public static void main(String[] args) {
		 WebDriver driver = new InternetExplorerDriver();
	      driver.get("https://www.google.com/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      System.out.println(driver.getTitle());
	      driver.close();
	}

}
