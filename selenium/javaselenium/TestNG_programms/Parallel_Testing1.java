package TestNG_programms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel_Testing1 {
@Test
public void tc1() {
	System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
}
}
//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Suite" parallel="tests">
  //<test thread-count="5" name="Test1">
    //<classes>
      //<class name="TestNG_programms.Parallel_Testing1"/>
    //</classes>
  //</test> <!-- Test -->
   //<test thread-count="5" name="Test2">
    //<classes>
      //<class name="TestNG_programms.Parallel_testing2"/>
    //</classes>
  //</test> 
//</suite> <!-- Suite -->
//Suite
//Total tests run: 2, Passes: 2, Failures: 0, Skips: 0