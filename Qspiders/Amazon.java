package com.Qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
	public static void main(String[] args) {
WebDriver Driver=new FirefoxDriver();
Driver.get("https://www.amazon.in/");
WebElement wb=Driver.findElement(By.xpath(".//input[@name='field-keywords']"));
wb.sendKeys("Mobile",Keys.ENTER);
Dimension dime=wb.getSize();
System.out.println("Size of the textbox==>"+dime);
 String colour=wb.getCssValue("color");
 System.out.println(colour);
 System.out.println("the value of box==> "+wb.getAttribute("value"));
 Point cordinate=wb.getLocation();
 System.out.println("size of the x cordinate==>"+cordinate.getX());
 System.out.println("size of the y cordinate==>"+cordinate.getY());
 
}
}
