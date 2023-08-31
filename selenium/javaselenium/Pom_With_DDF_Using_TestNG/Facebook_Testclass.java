package Pom_With_DDF_Using_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook_Testclass {
	FileInputStream fis;
	Sheet sh; 
	WebDriver driver;
	Facebookloginpage1 login1;
	Facebookhomepage1 home1;
	@BeforeClass
	public void openbrowser() throws Throwable {
	fis =new FileInputStream("D:\\facebook login.xlsx");
	 sh = WorkbookFactory.create(fis).getSheet("sheet1");
	System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
	 driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 login1=new Facebookloginpage1(driver);
	 home1=new Facebookhomepage1 (driver);
	}
	@BeforeMethod
	public void openapplication() {
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		login1.enterUN(username);
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		login1.enterPWD(password);
		login1.clickonLOGBTN();
	}
	@Test
	public void verifytext() throws Throwable {
		Thread.sleep(3000);
		Reporter.log("running verifytext",true);
		String exptext=sh.getRow(0).getCell(2).getStringCellValue();
		String acttext=home1.verifytext(exptext);
		Assert.assertEquals(exptext, acttext);
	}
	@AfterMethod
	public void closeapplication(){
		Reporter.log("close application",true);
	}
	@AfterClass
	public void closebrowser() {
		Reporter.log("close browser",true);
	}
	

}
