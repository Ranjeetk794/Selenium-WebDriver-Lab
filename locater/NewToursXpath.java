package com.qspider.webdriver.locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewToursXpath {
public static void main(String[] args) {
	WebDriver Driver=new FirefoxDriver();
	//new tours page navigation
	Driver.get("http://www.newtours.demoaut.com/");
	//user name id of x-path
	WebElement username=Driver.findElement(By.xpath(".//input[@name='userName']"));
	username.sendKeys("test");
	//user password of x-path
	WebElement password=Driver.findElement(By.xpath(".//input[@name='password']"));
	password.sendKeys("test");
	//click sign button
	Driver.findElement(By.xpath(".//input[@value='Login']")).submit();
}
}
