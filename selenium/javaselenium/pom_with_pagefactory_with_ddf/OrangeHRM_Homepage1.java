package pom_with_pagefactory_with_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_Homepage1 {
@FindBy(xpath="//p[@class='oxd-text oxd-text--p'][1]")private WebElement TEXT2;
public OrangeHRM_Homepage1(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void verifytext(String exptext) {
	String acttext=TEXT2.getText();
	if(acttext.equals(exptext)) {
		System.out.println("test case is pass");
	}
	else {
		System.out.println("test case is fail");
	}
}
}
