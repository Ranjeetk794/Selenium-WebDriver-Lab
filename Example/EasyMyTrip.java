package com.qspider.Example;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EasyMyTrip {

	public static void main(String[] args) {
		//Launch the Browser
		WebDriver Driver=new FirefoxDriver();
		//Implicitly wait
		Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Navigate the URL
		Driver.get("https://www.easemytrip.com/");
		//Enter the From Place Name
		WebElement FromWB=Driver.findElement(By.id("FromSector_show"));
		FromWB.clear();
		FromWB.sendKeys("Bangalore(BLR)",Keys.ENTER);
		//Enter the To Place Name
		WebElement ToWB=Driver.findElement(By.xpath("//input[@placeholder='To' and contains(@class, 'auto')]"));
		ToWB.clear();
		ToWB.sendKeys("Goa(GOI)",Keys.ENTER);
		//Click the Departure 
	    Driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();
	    //Click the Active Date
	    Driver.findElement(By.xpath("//li[@class='active-date']")).click();
	    Date date=new Date();
	    System.out.println("Execution Date of the Easy My Trip  ===> "+date);
	}

}
