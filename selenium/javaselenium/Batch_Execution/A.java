package Batch_Execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {
	@Test
	public void tc1(){
		Reporter.log("running tc1",true);
	}
	@Test
	public void tc2() {
		Reporter.log("running tc2",true);
	}
	@Test
	public void tc3() {
		Reporter.log("running tc3",true);
	}
}
//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Suite">
 // <test thread-count="5" name="Test">
   // <classes>
     // <class name="Batch_Execution.C"/>
      //<class name="Batch_Execution.A"/>
      //<class name="Batch_Execution.B"/>
    //</classes>
  //</test> <!-- Test -->
//</suite> <!-- Suite -->
//[RemoteTestNG] detected TestNG version 7.4.0
//running tc7
//running tc8
//running tc9
//running tc1
//running tc2
//running tc3
//running tc4
//running tc5
//running tc6

//===============================================
//Suite
//Total tests run: 9, Passes: 9, Failures: 0, Skips: 0
//===============================================


