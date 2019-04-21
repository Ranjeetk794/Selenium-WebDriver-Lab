package com.qspider.webdriver.locater;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchButtonByName {
	public static void main(String[] args) {
		//Bowser will open
		WebDriver Driver=new FirefoxDriver();
		//google page navigation 
		Driver.get("https://www.google.com/");
		System.out.println("page title name==>"+Driver.getTitle());
		//locater of search box 
		WebElement searchBox=Driver.findElement(By.name("q"));
		//enter some data in search box
		searchBox.sendKeys("Donald trump",Keys.ENTER);
		
	}

}
