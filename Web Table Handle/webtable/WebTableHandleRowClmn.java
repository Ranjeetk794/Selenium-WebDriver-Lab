package com.qspider.handle.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableHandleRowClmn {
public static void main(String[] args) {
	WebDriver Driver=new FirefoxDriver();
	Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Driver.get("http://demo.guru99.com/test/web-table-element.php");
	Driver.manage().window().maximize();
	List<WebElement> Column=Driver.findElements(By.xpath("//div[@class='leftcontainer']/table/thead/tr[1]/th"));
	System.out.println("Total number of Columan on the page====>"+Column.size());
	System.out.println("Total====> Column name====>");
	for(int i=0;i<Column.size();i++)
	{
		String ClmnName=Column.get(i).getText();
		System.out.println("	  "+ClmnName);
	}
	List<WebElement> Row=Driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[*]"));
	System.out.println("Total number of Row on the page=====>"+Row.size());
	System.out.println("Total====> Row name====>");
	for(int i=0;i<Row.size();i++)
	{
		String RowName=Row.get(i).getText();
		System.out.println("          "+RowName);
	}
    Driver.close();
}
}

