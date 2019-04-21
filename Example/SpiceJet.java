package com.qspider.Example;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SpiceJet {

	public static void main(String[] args) {
	WebDriver Driver=new FirefoxDriver();
	Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Driver.get("https://www.spicejet.com/");
	WebElement Oneway=Driver.findElement(By.xpath("(//input[@value='RoundTrip'])[1]"));
	while(true)
	{
		Oneway.click();	
		System.out.println("Selection status of 'Radiobutton' CheckBox===>"+Oneway.isSelected());
		break;
		}
	Driver.findElement(By.xpath("(//input[@class='select_CTXT'])[1]")).click();
	Driver.findElement(By.xpath("//a[text()=' Shirdi (SAG)']")).click();
	Driver.findElement(By.xpath("(//a[text()=' Kolkata (CCU)'])[2]")).click();
	Driver.findElement(By.xpath("(//input[@readonly='readonly'])[1]")).click();
	while(true) {
	try {
		Driver.findElement(By.xpath("//td[@data-month='12' and @data-year='2019']/a[text()='30']")).click();
		break;
	} catch (Exception e) {
		Driver.findElement(By.xpath("//a[@title='Next']")).click();	
	}
	}
	}}
