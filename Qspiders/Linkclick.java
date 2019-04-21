package com.Qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Linkclick {
	public static void main(String[] args) throws Exception {
		WebDriver Driver=new FirefoxDriver();
		Driver.get("https://www.google.com/");
		WebElement Wb=Driver.findElement(By.name("q"));
		Wb.sendKeys("Sachin Tendulkar",Keys.ENTER);
		Thread.sleep(1000);
		WebElement Wb1=Driver.findElement(By.xpath(".//cite[text()='https://en.wikipedia.org/wiki/Sachin_Tendulkar']"));
		Thread.sleep(1000);
		Actions Act=new Actions(Driver);
		Act.contextClick(Wb1).perform();

		
		
	}

}
