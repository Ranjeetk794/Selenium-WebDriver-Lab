package com.Qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifygmailcapture {
	public static void main(String[] args) {
		WebDriver Driver =new ChromeDriver();
		Driver.get("https://gmail.com/");
		//find Email Editbox in Gui
		WebElement wb=Driver.findElement(By.id("identifierId"));
		//capture size of the edit box
		Dimension dem=wb.getSize();
		System.out.println("height of the email edit box="+dem.getHeight());
		System.out.println("weidth of the email edit box="+dem.getWidth());
		Point p=wb.getLocation();
		System.out.println("x-cordinate of the email edit="+p.getX());
		System.out.println("y-cordinate of the email edit="+p.getY());
		
		
	}

}
