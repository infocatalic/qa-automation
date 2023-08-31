package pavan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Customized_listbox {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Actions act=new Actions(driver);
	act.click(month).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_UP).perform();
	act.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	
}
}
