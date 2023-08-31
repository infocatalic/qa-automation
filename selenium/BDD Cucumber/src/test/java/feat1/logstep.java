package feat1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logstep {
	@Given("browser is open")
	public void browser_is_open() {
	   System.out.println("hi");
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
	  System.out.println("hello");
	}

	@When("usre enters UN and PWD")
	public void usre_enters_un_and_pwd() {
	  System.out.println("i am pavan");
	}

	@And("click on login button")
	public void click_on_login_button() {
	 System.out.println("i am from latur");   
	}

	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page() {
	 System.out.println("i want to go");
	}

}
