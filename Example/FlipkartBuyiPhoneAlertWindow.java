package com.qspider.Example;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartBuyiPhoneAlertWindow {
public static void main(String[] args) throws Exception {
	//Launch the browser
	WebDriver Driver=new FirefoxDriver();
	//implicitly wait
	Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//Navigate the Browser
	Driver.get("https://www.flipkart.com/");
	//close the pop-up box
	Driver.findElement(By.xpath("//button[text()='✕']")).click();
	//Search in box iPhone XR
	Driver.findElement(By.name("q")).sendKeys("apple iphone xr",Keys.ENTER);
	//Explicitly wait
	WebDriverWait wait=new WebDriverWait(Driver, 15);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Apple iPhone XR (Black, 64 GB)']")));
	//Click the expected iPhone
	Driver.findElement(By.xpath("//div[text()='Apple iPhone XR (Black, 64 GB)']")).click();
	//Get all the Bowser session Id
	Set<String> set=Driver.getWindowHandles();
	Iterator<String> it=set.iterator();
	String ParentId=it.next();
	String ChildId=it.next();
	Driver.switchTo().window(ChildId);
	//Custom wait
	Thread.sleep(5000);
	//click the buy button
	Driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
	Driver.switchTo().window(ParentId);
	//Custom wait
	String ParentwinID=Driver.getWindowHandle();
	//click 3 below product ,which opens 3 new Tab-Windows
	Driver.findElement(By.xpath("//div[text()='Apple iPhone XR (Blue, 256 GB)']")).click();
	Driver.findElement(By.xpath("//div[text()='Apple iPhone XR (Yellow, 256 GB)']")).click();
	Driver.findElement(By.xpath("//div[text()='Apple iPhone XR (Black, 128 GB)']")).click();
	String ExpResult="Apple iPhone XR (Black, 128 GB)";
	//get all four window Id
	Set<String> Aset=Driver.getWindowHandles();
	Iterator<String> its=Aset.iterator();
	while(its.hasNext())
	{
		Driver.switchTo().window(its.next());
		String actPage=Driver.getTitle();
		if(actPage.contains(ExpResult))
		{
			Driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
			break;
		}
	}
	//Go to main page 
	Driver.switchTo().window(ParentwinID);
	//Clear the search box in main page 
	Driver.findElement(By.name("q")).clear();
	//Again write in search box 
	Driver.findElement(By.name("q")).sendKeys("Nokia",Keys.ENTER);
    
}
}
