package com.Qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmailverifypage {
public static void main(String[] args) {
	WebDriver Driver=new FirefoxDriver();
	//Navigate to URL page
	Driver.get("https://www.gmail.com");
	//current title page
	String Title=Driver.getTitle();
	System.out.println(Title);
	WebElement wb=Driver.findElement(By.id("identifierId"));
	//Capture  the size of edit box
	Dimension dime=wb.getSize();
	System.out.println("Size of Dimesion==>"+dime);
	//capture the color of the box
	String color=wb.getCssValue("color");
	System.out.println("color of the box==>"+color);
	//capture the edit-Backend test case
	String actual=wb.getAttribute("aria-label");
	System.out.println(actual);
	//capture the Location of the editbox
	Point cordinate=wb.getLocation();
	System.out.println("x cordinate==>"+cordinate.getX());
	System.out.println("y cordinate==>"+cordinate.getY());
	wb.sendKeys("Selenium");
	String input=wb.getAttribute("value");
	System.out.println("input of the textbox==>"+input);
	Driver.close();
	
}
}
