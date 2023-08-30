package pavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_Handling {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\pavan\\\\Downloads\\\\geckodriver-v0.33.0-win64\\\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	Select s=new Select(year);
	s.selectByVisibleText("1997");
	Thread.sleep(2000);
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Select s1=new Select(month);
	s1.selectByVisibleText("Oct");
	Thread.sleep(2000);
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	Select s2=new Select(day);
	s2.selectByVisibleText("8");
}
}
