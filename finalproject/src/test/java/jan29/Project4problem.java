package jan29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Project4problem {
	
	public WebDriver driver;
	List<WebElement> prices;
	List<WebElement> phones;
	int list;
	@Test(priority=1)
	
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	@Test(priority=2)
	public void search() {
		driver.findElement(By.xpath("//button[text()='✕']"));
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile phones",Keys.ENTER);
	}
	@Test
	public void testResult() {
		driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
		
	}

}
