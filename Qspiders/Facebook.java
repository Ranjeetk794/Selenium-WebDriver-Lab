package com.Qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		WebDriver Driver=new FirefoxDriver();
		Driver.get("https://www.facebook.com/");
		WebElement Wb1=Driver.findElement(By.id("day"));
		Select  s1=new Select(Wb1);
		s1.selectByValue("12");
		WebElement Wb2=Driver.findElement(By.id("month"));
		Select s2=new Select(Wb2);
		s2.selectByVisibleText("Jun");
		WebElement Wb3=Driver.findElement(By.id("year"));
	    Select s3=new Select(Wb3);
	    s3.selectByVisibleText("1946");
	}

}
