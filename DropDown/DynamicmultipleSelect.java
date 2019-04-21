package com.DropDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicmultipleSelect {
public static void main(String[] args) {
	//***##***Write a program to select all the option from the dynamic multiple select drop down
	WebDriver Driver=new FirefoxDriver();
    //MultipleSelct Drop down URL(Uniform resource Locator)
	Driver.get("file:///C:/Users/Ranjeet%20Kumar/Desktop/my%20page.html");
	//Identify the multiple select dropDown x-path
	WebElement wb=Driver.findElement(By.xpath(".//select[@multiple='true']"));
	//Object of Select
	Select sel=new Select(wb);
	//condition of multiple DropDown
    if(sel.isMultiple())
    {
    	//count the list of multiple DropDown
    	  int Count=sel.getOptions().size();
    	  //print how many Drop down list is Available
    	  System.out.println("total no of DropDown list===>"+Count);
    	  for(int i=0;i<Count;i++)
    	  {
    		  sel.selectByIndex(i);
    		
    	  }
    }else
    	  {
    		  System.out.println("it's not multiple select Drop Drown");
    	  }
    }
}

