package com.Qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazoAction {
	public static void main(String[] args) throws Exception {
		WebDriver Driver =new FirefoxDriver();
		Driver.get("https://www.amazon.com/");
		WebElement wb=Driver.findElement(By.xpath(".//span[text()='Departments']"));
		Actions Act=new Actions(Driver);
		Act.moveToElement(wb).perform();
		Thread.sleep(1000);
		WebElement Computer=Driver.findElement(By.xpath(".//span[text()='Computers']"));
		Computer.click();
		Thread.sleep(1000);
		List <WebElement> Count=Driver.findElements(By.xpath(".//h4[text()='Computers']"));
		int i=Count.size();
		System.out.println(i);
	}

}
