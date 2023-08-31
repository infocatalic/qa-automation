package pavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Useof_ActionClass {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	 WebElement target = driver.findElement(By.xpath("//a[text()='Gmail']"));
	 Actions act=new Actions(driver);
	 act.moveToElement(target).click().perform();
	 
}
}
