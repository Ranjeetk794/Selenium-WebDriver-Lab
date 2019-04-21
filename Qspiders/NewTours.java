package com.Qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours {
public static void main(String[] args) {
	String baseUrl="http://newtours.demoaut.com/";
	WebDriver Driver=new FirefoxDriver();
	Driver.get(baseUrl);
	WebElement Wb=Driver.findElement(By.name("userName"));
	Wb.sendKeys("Test");
	System.out.println(Driver.getCurrentUrl());
	
	
	
}
}
