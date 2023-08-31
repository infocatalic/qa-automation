package pavan;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Notification_Popup {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\pavan\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	ChromeOptions c=new ChromeOptions();
	c.addArguments("--disable-notifications");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.hdfc.com");
}
}
