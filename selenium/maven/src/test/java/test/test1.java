package test;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base1;
import pom.Facebook_Hompage;
import pom.Facebook_loginpage;
import utility.Utility1;

public class test1 extends Base1{
	Facebook_loginpage login;
	 Facebook_Hompage home;
@BeforeClass
public void openbrowser() {
	initializebrowser();
	 login=new Facebook_loginpage(driver);
	  home=new Facebook_Hompage(driver);
}
@BeforeMethod
public void logintoapplication() throws Throwable {
	login.enterUN(Utility1.getTD(0, 0));
	login.enterPWD(Utility1.getTD(0, 1));
	login.clickLOGBTN();
}
@Test
public void verifytext() throws Throwable {
	Reporter.log("verifytext",true);
	String acttext=home.verifytext(null);
	String exptext=Utility1.getTD(0, 3);
}
@AfterMethod
public void logoutapplication() {
	Reporter.log("log out application",true);
}
@AfterClass
public void closebrowser() {
	Reporter.log("close browser",true);
}
}
