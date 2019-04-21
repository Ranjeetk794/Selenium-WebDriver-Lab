package com.qspider.webdriver.webelementcontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClearWordPress {
public static void main(String[] args) throws Exception {
	WebDriver Driver=new FirefoxDriver();
	Driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-admin/profile.php");
	//Locater of the user Id
	WebElement userId=Driver.findElement(By.id("user_login"));
	//Locater of the user Password
	WebElement userPswd=Driver.findElement(By.id("user_pass"));
	//Enter the User Id
	userId.sendKeys("opensourcecms");
	//Enter the User Password
	userPswd.sendKeys("opensourcecms");
	//Wait one Second
	Thread.sleep(1000);
	//clear the user id 
	userId.clear();
	//clear the user password 
	userPswd.clear();
	Thread.sleep(1000);
	userId.sendKeys("opensourcecms");
	userPswd.sendKeys("opensourcecms");
	//Click the Login Button
	Driver.findElement(By.name("wp-submit")).click();
	
}
}
