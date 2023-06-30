package firstselenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Thread.sleep(3000);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Ashish");
		
		driver.findElement(By.name("inputPassword")).sendKeys("Ashish123");
		
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ashish Bole");
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ashishbole@mail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("ashishbole1404@gmail.com");
		//another way of xpath
		//traverse parent to child form
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9730372000");
		Thread.sleep(5000);
		//Also used .classname
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(5000);
		//parenttagname childtagname used
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		//String newpassword = driver.findElement(By.cssSelector("form p")).getText();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		Thread.sleep(4000);
		//Use Another way #IdName used. Its already used in line number 26
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("ashish");
		// use another way. * means regular expression
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(5000);
		//Automate checkbox
		driver.findElement(By.id("chkboxOne")).click();
        // use another way contains. submit its always constant
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	}

}
