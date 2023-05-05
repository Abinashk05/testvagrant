package intellipaat;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Module4Ass1 {


	public static void main(String[] args) {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://www.facebook.com/");
       driver.findElement(By.id("id=\"u_0_0_l2\"")).click();
       driver.findElement(By.name("firstname")).sendKeys("Abinash");
       driver.findElement(By.name("lastname")).sendKeys("kunda");
       driver.findElement(By.name("reg_email__")).sendKeys("8249123953");
       driver.findElement(By.name("reg_passwd__")).sendKeys("Abhimanyu@123");
       WebElement element = driver.findElement(By.name("birthday_day"));
     
	Select s = new Select(element);
	s.selectByVisibleText("05");
       
	}

}
