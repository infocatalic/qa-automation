package pom_with_pagefactory_with_ddf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM_Testclass1 {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("D:\\organeHRM.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("sheet1");
	System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	OrangeHRM_loginpage1 login1=new OrangeHRM_loginpage1(driver);
	String username = sh.getRow(0).getCell(0).getStringCellValue();
	login1.enterUN(username);
	String password = sh.getRow(0).getCell(1).getStringCellValue();
	login1.enterPWD(password);
	login1.clickonLOGBTN();
	OrangeHRM_Homepage1 home1=new OrangeHRM_Homepage1(driver);
	String TEXT2=sh.getRow(0).getCell(2).getStringCellValue();
	home1.verifytext(TEXT2);
}
}
