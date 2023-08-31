package Batch_Execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class B {
	@Test
	public void tc4(){
		Reporter.log("running tc4",true);
	}
	@Test
	public void tc5() {
		Reporter.log("running tc5",true);
	}
	@Test
	public void tc6() {
		Reporter.log("running tc6",true);
	}
}
