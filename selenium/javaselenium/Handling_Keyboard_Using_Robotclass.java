package pavan;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Keyboard_Using_Robotclass {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\pavan\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com");
	Thread.sleep(8000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
}
}
