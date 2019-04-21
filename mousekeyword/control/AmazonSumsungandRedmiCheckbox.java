package com.qspider.mousekeyword.control;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSumsungandRedmiCheckbox {
	public static void main(String args[]) throws Exception {
		//Launch the browser
		WebDriver Driver = new FirefoxDriver();
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Navigate the amazon paget 
		Driver.get("https://www.amazon.in/");
		//Mouse cursor the Shop by Category
		WebElement Shopby = Driver.findElement(By.xpath("//span[text()='Shop by']"));
		Actions Act = new Actions(Driver);
		Act.moveToElement(Shopby).perform();
		//Explicitly wait
		WebDriverWait Wait = new WebDriverWait(Driver, 20);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Mobiles, Computers']")));
		//click the Mobile and Computers
		WebElement MobilesComputer = Driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		MobilesComputer.click();
		//Explicitly wait
		WebDriverWait Wait1 = new WebDriverWait(Driver, 20);
		Wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='All Mobile Phones']")));
		//click All Mobile and Phones
		Driver.findElement(By.xpath("//span[text()='All Mobile Phones']")).click();
		//Explicitly wait
		WebDriverWait wait2 = new WebDriverWait(Driver, 20);
		wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='checkbox' and @name='s-ref-checkbox-Samsung']")));
		//click Sumsung Brand click Box
		Driver.findElement(By.xpath("//input[@type='checkbox' and @name='s-ref-checkbox-Samsung']")).click();
		WebElement Samsung=Driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		//Print total mobile & Accessories
		System.out.println(Samsung.getText());
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//input[@name='s-ref-checkbox-Redmi']")).click();
		Date date=new Date();
		System.out.println("Execution Date===>"+date);
		
		
	}
}