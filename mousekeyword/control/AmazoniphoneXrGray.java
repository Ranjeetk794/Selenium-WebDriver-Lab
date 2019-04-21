package com.qspider.mousekeyword.control;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazoniphoneXrGray{
	
public static void main(String args[]) throws Exception
{
	WebDriver Driver=new FirefoxDriver();
	Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Driver.get("https://www.amazon.in/");
	Driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iPhone Xs",Keys.ENTER);
	String X="//span[text()='Apple iPhone X (256GB) - Space Grey']/../../../../../../../../../../../../../div/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div/a/span[1]/span[2]/span[2]";
	String Price=Driver.findElement(By.xpath(X)).getText();
	System.out.println("Apple iPhone X (256GB) - Space Grey==>"+Price);
	Date date=new Date();
	System.out.println(date);
	}
}
