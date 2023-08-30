package pavan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_Handling {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\pavan\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();	
	driver.get("https://www.flipkart.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	Thread.sleep(3000);
	jse.executeScript("window.scrollBy(0,2000);");
	Thread.sleep(3000);
	jse.executeScript("window.scrollBy(0,-2000);");
	
}
}
