package com.qspider.webdriver.locater;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonTagName {

	public static void main(String[] args) {
		WebDriver Driver=new FirefoxDriver();
		Driver.get("https://www.amazon.in/");
		List<WebElement> link=Driver.findElements(By.tagName("a"));
		int Count=link.size();
		System.out.println("Total Link of tha page==>"+Count);
	}

}
