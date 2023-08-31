package TestNG_programms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowser_Testing {
@Parameters("browsername")
@Test 
public void tc(String browsername) {
	WebDriver driver=null;
	if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome.exe");
		driver=new ChromeDriver();
	}
	else if(browsername.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.get("https://www.google.com");
}
}
