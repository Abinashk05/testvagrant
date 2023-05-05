package intellipaat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launchinternetexplorer {

	public static void main(String[] args) {
       WebDriver driver = new InternetExplorerDriver();
       driver.get("https://www.facebook.com/");
	}

}
