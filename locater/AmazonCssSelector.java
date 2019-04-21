package com.qspider.webdriver.locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonCssSelector {

	public static void main(String[] args) {
	  WebDriver Driver=new FirefoxDriver();
	  Driver.get("https://www.amazon.in/");
	  WebElement YourAmezon=Driver.findElement(By.cssSelector("a#nav-your-amazon.nav-a"));
	  System.out.println(YourAmezon.getAttribute("id"));
	  YourAmezon.click();

	}

}
