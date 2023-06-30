package com.demo.selenium.tutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		//Thread.sleep(2000);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		//Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
