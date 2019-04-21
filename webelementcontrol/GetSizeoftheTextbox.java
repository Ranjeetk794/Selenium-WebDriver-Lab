package com.qspider.webdriver.webelementcontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetSizeoftheTextbox {
public static void main(String[] args) {
	WebDriver Driver=new FirefoxDriver();
Driver.get("https://www.google.com/");
//Locater of the google Search box 
WebElement SizeogSearchBox=Driver.findElement(By.name("q"));
//dimension of the box
Dimension dim=SizeogSearchBox.getSize();
System.out.println("height ofthe search box==>"+dim.getHeight());
System.out.println("width of the search box==>"+dim.getWidth());
}
}
