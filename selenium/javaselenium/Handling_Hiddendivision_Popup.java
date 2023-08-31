package pavan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Hiddendivision_Popup {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://www.Flipkart.com");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
}
}
