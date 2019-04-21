package com.qspider.Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooPageofTheTotalLink {

	public static void main(String[] args) {
	WebDriver Driver=new FirefoxDriver();
	Driver.get("https://in.yahoo.com/");
	List<WebElement> Lst=Driver.findElements(By.xpath("//a"));
	System.out.println("Total Link of the Yahoo Page===> "+Lst.size());
	/*for(int i=0;i<Lst.size();i++)
	{
		String LinkName=lst.get(i).getText();
		System.out.println(LinkName);
	}*/
	for(WebElement LinkName:Lst)
	{
		System.out.println(LinkName.getText());
	}

	}

}
