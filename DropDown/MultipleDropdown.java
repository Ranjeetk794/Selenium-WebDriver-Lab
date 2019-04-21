package com.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
	public static void main(String[] args) {
		//Write a program all the value from multiple select drop down
		WebDriver Driver=new FirefoxDriver();
		//multiple select drop down URL(uniform resource locator)
		Driver.get("file:///C:/Users/Ranjeet%20Kumar/Desktop/my%20page.html");
		//multiple select drop down x-path
		WebElement wb=Driver.findElement(By.xpath(".//select[@multiple='true']"));
		//select drop down
	    Select sel=new Select(wb);
	    //condition of multiple select
	    if(sel.isMultiple())
	    {
	    	System.out.println("it is multiple select dropdown");
	    	for(int i=0;i<14;i++)
	    	{
	    		sel.selectByIndex(i);
	    	}	    }else
	    	{
	    		System.out.println("it's not a multiple selcct DropDown");
	    	}
	    //maximize the window
	    Driver.manage().window().maximize();
	    //D-select the all values 
	    //sel.deselectAll();
	}

}
