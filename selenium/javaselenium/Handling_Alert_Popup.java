package pavan;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Alert_Popup {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	Alert al = driver.switchTo().alert();
	al.accept();
	
}
}
