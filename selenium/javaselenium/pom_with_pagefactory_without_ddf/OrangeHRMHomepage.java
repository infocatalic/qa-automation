package pom_with_pagefactory_without_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMHomepage {
@FindBy(xpath="//p[@class='oxd-text oxd-text--p'][1]")private WebElement TEXT1;
public OrangeHRMHomepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void verifytext() {
	String exptext = "Time at Work";
	String acttext = TEXT1.getText();
	if(acttext.equals(exptext)) {
		System.out.println("test case is pass");
	}
	else {
		System.out.println("test case is fail");
	}
}
}
