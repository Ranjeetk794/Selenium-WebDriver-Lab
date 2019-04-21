package com.qspider.webdriver.webelementcontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SubmiOrClickNewtour {
public static void main(String[] args) {
	WebDriver Driver=new FirefoxDriver();
	//Navigate the new tours page
	Driver.get("http://newtours.demoaut.com/");
	//Locater of the login page name and Password
	WebElement UserName=Driver.findElement(By.name("userName"));
	WebElement UserPswd=Driver.findElement(By.name("password"));
	//id and Password
	UserName.sendKeys("test");
	UserPswd.sendKeys("test");
	//Locater of sign Button
	WebElement Sign=Driver.findElement(By.name("login"));
	//click the Sign button
	//Sign.click();
	Sign.submit();
}
}
