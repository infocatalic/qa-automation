package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_loginpage {
	@FindBy(xpath="//input[@id='email']")private WebElement UN;
	@FindBy(xpath="//input[@id='pass']")private WebElement PWD;
	@FindBy(xpath="//button[text()='Log in']")private WebElement LOGBTN;

	public Facebook_loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterUN(String username) {
		UN.sendKeys(username);
	}
	public void enterPWD(String password) {
		PWD.sendKeys(password);
	}
	public void clickLOGBTN() {
		LOGBTN.click();
	}
}
 