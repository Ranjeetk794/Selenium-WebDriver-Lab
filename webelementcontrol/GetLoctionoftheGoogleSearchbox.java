package com.qspider.webdriver.webelementcontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetLoctionoftheGoogleSearchbox {

	public static void main(String[] args) {
		WebDriver Driver=new FirefoxDriver();
		Driver.get("https://www.google.com/");
		//Locater of the google Search box 
		WebElement SizeogSearchBox=Driver.findElement(By.name("q"));
		Point p=SizeogSearchBox.getLocation();
		System.out.println("x-cirdinate of the search box==>"+p.getX());
		System.out.println("y-cordinate of the search box==>"+p.getY());
		

	}

}
