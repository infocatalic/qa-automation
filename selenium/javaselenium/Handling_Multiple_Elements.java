package pavan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Multiple_Elements {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\pavan\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.com");
	List<WebElement> elements = driver.findElements(By.xpath("//div"));
	for(WebElement i:elements) {
		String str = i.getText();
		System.out.println(str);
	}
}
}
