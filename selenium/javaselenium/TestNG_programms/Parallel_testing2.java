package TestNG_programms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel_testing2 {
@Test
public void tc2() {
	System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
}
}
