package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base_class;
import pom.Facebook_Hompage;
import pom.Facebook_loginpage;
import utility.Utility_class;

public class Test_class extends Base_class{
	Facebook_loginpage login;
	Facebook_Hompage home;
@BeforeClass
public void openbrowser() {
	initializebrowser();
	 login=new Facebook_loginpage(driver);
	home=new Facebook_Hompage(driver);
	
}

@BeforeMethod
public void openapplication() throws Throwable {
	login.enterUN(Utility_class.getTD(0, 0));
	login.enterPWD(Utility_class.getTD(0, 1));
	login.clickLOGBTN();
}
@Test
public void verifytext() throws Throwable {
	Reporter.log("verifytest",true);
	String exptext=Utility_class.getTD(0, 2);
	String acttext=home.verifytext(null);
	Assert.assertEquals(acttext, exptext);
}
@AfterMethod
public void logoutapplication() {
	Reporter.log("logout application",true);
}
@AfterClass
public void closebrowser() {
	Reporter.log("close browser",true);
}
}
