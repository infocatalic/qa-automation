package pom_with_pagefactory_with_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_loginpage1 {
@FindBy(xpath="//input[@name='username']")private WebElement UN;
@FindBy(xpath="//input[@name='password']")private WebElement PWD;
@FindBy(xpath="//button[text()=' Login ']")private WebElement LOGBTN;
public OrangeHRM_loginpage1(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void enterUN(String username) {
	UN.sendKeys(username);
}
public void enterPWD(String password) {
	PWD.sendKeys(password);
}
public void clickonLOGBTN() {
	LOGBTN.click();
}
}
