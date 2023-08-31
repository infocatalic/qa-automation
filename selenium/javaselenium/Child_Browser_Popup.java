package pavan;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Child_Browser_Popup {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.linkedin.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement google = driver.findElement(By.xpath("//div[@class='L5Fo6c-bF1uUb']"));
	google.click();
	Set<String> ids = driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<String>(ids);
	String childid=al.get(1);
	System.out.println(childid);
	driver.switchTo().window(childid);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Create account']")).click();
	 Thread.sleep(3000);
	driver.switchTo().window(al.get(0));
	driver.findElement(By.xpath("//input[@id='session_key']")).sendKeys("pavan");
	
}
}
