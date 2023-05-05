package facebook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetDetails {
	public String getPropDetails(String key) {
		String eleDetails = null;
		try {
			FileInputStream fis = new FileInputStream("src\\facebook\\locator.properties");
			Properties p = new Properties();
			p.load(fis);
		   String eleDetail = p.getProperty(key);
			} catch (IOException e) {
			e.printStackTrace();
		}
		return eleDetails;
	}
	
	public WebElement getElementDetails(String key1, ) {
		WebElement ele = null;
		GetDetails obj = new GetDetails();
		String value = obj.getPropDetails(key1);
		String[] info = value.split(":");
		
		switch(info[0])
		{
		case "id":
			driver.findElement(By.id(info[1]));
			break;
		case "name":
			driver.findElement(By.name(info[1]));
			break;
		case "xpath":
			driver.findElement(By.xpath(info[1]));
			break;
		case "linkText":
			driver.findElement(By.LinkText(info[1]));
			break;
			
			default:
				System.out.println("unknown locator found");
		}
		return ele;
	}

}
