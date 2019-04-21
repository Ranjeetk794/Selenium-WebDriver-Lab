package com.qspider.webdriver.locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WordpressloginId {

	public static void main(String[] args) {
		WebDriver Driver=new FirefoxDriver();
		Driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-admin/profile.php");
		WebElement userid=Driver.findElement(By.id("user_login"));
		userid.sendKeys("opensourcecms");
		WebElement userpswd=Driver.findElement(By.id("user_pass"));
		userpswd.sendKeys("opensourcecms");
		WebElement loginbtn=Driver.findElement(By.id("wp-submit"));
		loginbtn.click();

	}

}
