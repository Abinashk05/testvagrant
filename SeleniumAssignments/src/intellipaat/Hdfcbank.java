package intellipaat;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfcbank {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//*[@id=\"nortonimg1\"]/div[2]/span[2]/a")).click();
        Set<String> windowhandles = driver.getWindowHandles();
        System.out.println(windowhandles.size());
        ArrayList<String> al= new ArrayList<>(windowhandles);
        System.out.println(al.size());
        driver.switchTo().window(al.get(1));
        System.out.println(driver.getTitle());
        driver.switchTo().window(al.get(0));
        System.out.println(driver.getTitle());
        driver.close();
        
	}

}
