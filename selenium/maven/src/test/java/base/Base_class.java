package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_class {
	public WebDriver driver;
public void initializebrowser() {
	System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
}
