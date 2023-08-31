package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base1 {
	public WebDriver driver;
public void initializebrowser() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\pavan\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
}
