package Pom_With_DDF_Using_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Facebookhomepage1 {
@FindBy(xpath="//span[text()='Your shortcuts']")private WebElement TEXT3;

public Facebookhomepage1(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public String verifytext(String exptext) {
	String acttext=TEXT3.getText();
	Assert.assertEquals(exptext, acttext);
	return acttext;
}

}
