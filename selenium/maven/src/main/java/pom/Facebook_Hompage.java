package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Hompage {
	@FindBy(xpath="//span[text()='Your shortcuts']")private WebElement user;
	public Facebook_Hompage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String verifytext(String exptext) {
		String acttext=user.getText();
	return acttext;
	}
}
