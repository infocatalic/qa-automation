package TestNG_programms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disable_Testcase {
	@Test
	public void tc1(){
		Reporter.log("running tc1",true);
	}
	@Test
	public void tc2() {
		Reporter.log("running tc2",true);
	}
	@Test (enabled=false)
	public void tc3() {
		Reporter.log("running tc3",true);
	}
}
//[RemoteTestNG] detected TestNG version 7.4.0
//running tc1
//running tc2
//PASSED: tc1
//PASSED: tc2

//===============================================
  //  Default test
    //Tests run: 2, Failures: 0, Skips: 0
//===============================================


//===============================================
//Default suite
//Total tests run: 2, Passes: 2, Failures: 0, Skips: 0
//===============================================

