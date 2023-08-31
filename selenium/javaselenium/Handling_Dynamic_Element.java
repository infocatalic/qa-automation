package pavan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Dynamic_Element {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(3000);
	driver.get("https://www.flipkart.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobile under 20000",Keys.ENTER);
	Thread.sleep(2000);
	 String ratings = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[2]")).getText();
	 System.out.println(ratings);
	 Thread.sleep(2000);
	String reviews = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[4]")).getText();
	System.out.println(reviews);
	Thread.sleep(2000);
	String price = driver.findElement(By.xpath("(//div[@class='col col-5-12 nlI3QM']//div)[9]")).getText();
	System.out.println(price);
	
	
	
	
	
}
}
