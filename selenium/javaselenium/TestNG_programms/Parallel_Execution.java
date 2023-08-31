package TestNG_programms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel_Execution{
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
//[RemoteTestNG] detected TestNG version 7.4.0
//running tc1
//running tc2
//running tc3
//PASSED: tc2
//PASSED: tc3
//PASSED: tc1

//===============================================
  //  Default test
    //Tests run: 3, Failures: 0, Skips: 0
//===============================================


//===============================================
//Default suite
//Total tests run: 3, Passes: 3, Failures: 0, Skips: 0
///===============================================

