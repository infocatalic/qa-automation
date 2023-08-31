package pom_with_pagefactory_without_ddf;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM_Testclass {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	OrangeHRMLoginpage login=new OrangeHRMLoginpage(driver);
			login.enterUN();
			login.enterPWD();
			login.clickonLOGBTN();
	OrangeHRMHomepage home=new OrangeHRMHomepage(driver);
			home.verifytext();
			
}
}
