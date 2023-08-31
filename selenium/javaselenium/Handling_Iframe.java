package pavan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Iframe {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.switchTo().frame("packageListFrame");
	String frame1 = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
	System.out.println(frame1);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("packageFrame");
	String frame2 = driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
	System.out.println(frame2);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("classFrame");
	String frame3 = driver.findElement(By.xpath("//a[text()='org.openqa.selenium.bidi.browsingcontext']")).getText();
	System.out.println(frame3);

}
}
