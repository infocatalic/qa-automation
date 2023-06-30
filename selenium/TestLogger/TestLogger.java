package LoggerDemo.LoggerDemo;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestLogger {

	public static WebDriver driver;
	public static Logger log;
	public static void main(String[] args) throws SecurityException, IOException {

		log = LogManager.getLogger(TestLogger.class);

		WebDriverManager.firefoxdriver().setup();
		log.info("Firefox driver setup is complete");
		System.out.println("Ashish Bole");
		driver = new FirefoxDriver();
		

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		log.info("Implicit wait of 5 sec");
		driver.get("https://www.myntra.com/");
		log.info("Logged into Myntra");
		try {
			boolean text= driver.findElement(By.xpath("//a[contains(text(),'Women11')]")).isDisplayed();
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
			log.error("Exception occured", new Exception("Element Not Found"));
		}
		finally {
			driver.quit();
			log.info("Quitting the driver");
		}
	}	
}