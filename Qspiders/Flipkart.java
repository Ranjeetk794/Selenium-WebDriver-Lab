package com.Qspiders;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) {
		WebDriver Driver=new FirefoxDriver();
		Driver.get("https://www.flipkart.com/");
		Actions Act=new Actions(Driver);
		Act.sendKeys(Keys.ESCAPE).perform();
	}

}
