package com.qspider.webdriver.webelementcontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendkeysGoogleSearch {
	public static void main(String[] args) {
		WebDriver Driver=new FirefoxDriver();
		//navigate the Google page
		Driver.get("https://www.google.com/");
		//name locater of the SeacrhBox
		WebElement SeacrhBox=Driver.findElement(By.name("q"));
		//enter search box 
		SeacrhBox.sendKeys("Brack Obama");
		//clear the search box
		SeacrhBox.clear();
		//overload of Send keys
		SeacrhBox.sendKeys(Keys.chord(Keys.SHIFT,"Ranjeet Kumar"));
		
	}

}
