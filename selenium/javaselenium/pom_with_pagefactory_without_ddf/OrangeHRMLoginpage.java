package pom_with_pagefactory_without_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginpage {
@FindBy(xpath="//input[@name='username']")private WebElement UN;
@FindBy(xpath="//input[@name='password']")private WebElement PWD;
@FindBy(xpath="//button[text()=' Login ']")private WebElement LOGBTN;
public OrangeHRMLoginpage (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void enterUN() {
	UN.sendKeys("Admin");
}
public void enterPWD() {
	PWD.sendKeys("admin123");
}
public void clickonLOGBTN() {
	LOGBTN.click();
}
}
