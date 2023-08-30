package pavan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Keyboard_Using_Keysclass {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\pavan\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	String exptitle="OrangeHRM";
	String acttitle=driver.getTitle();
	if(exptitle.equals(acttitle)) {
		System.out.println("test case is passed");
	}
	else {
		System.out.println("test case is failed");
	}
}
}
