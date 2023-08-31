package pavan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class With_DDF_Framework {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("D:\\facebook login.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("sheet1");
	System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	String UN = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(UN);
	String PWD = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(PWD);
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	String exptext=sh.getRow(0).getCell(2).getStringCellValue();
	String acttext=driver.findElement(By.xpath("//span[text()='Your shortcuts']")).getText();
	if(exptext.equals(acttext)) {
		System.out.println("test case is pass");
	}
	else {
		System.out.println("test case is fail");
	}
}
}
