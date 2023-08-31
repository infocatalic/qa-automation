package pavan;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Screenshot_Handling {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\pavan\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("D:\\google.png");
	Files.copy(src, dest);
}
}
