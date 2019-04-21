package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ExpectedDropDown {
public static void main(String[] args) {
	String expValue="Shell Script";
	boolean flag=false;
	WebDriver Driver=new FirefoxDriver();
	Driver.get("file:///C:/Users/Ranjeet%20Kumar/Desktop/my%20page.html");
	WebElement wb=Driver.findElement(By.xpath(".//select[@multiple='true']"));
	Select sel=new Select(wb);
	List <WebElement> lst=sel.getOptions();
	System.out.println("Size of drop down==>"+lst.size());
	for(int i=0;i<lst.size();i++)
	{
		String actual=lst.get(i).getText();
		System.out.println(actual);
	    if(expValue.equalsIgnoreCase(actual)) {
	    sel.selectByVisibleText(expValue);
	    flag=true;
	}}
	if(flag==true)
	{
		System.out.println("===> Value is avilabe  :"+expValue);
	}
	else
	{
		System.out.println("===> Value is not avilabe  :"+expValue);
	}
}
}
