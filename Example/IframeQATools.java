package com.qspider.Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeQATools {
public static void main(String[] args) {
	//Launch the Browser
	WebDriver Driver=new FirefoxDriver();
	//Implicitly wait
	Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//Navigate the URL
	Driver.get("https://www.toolsqa.com/iframe-practice-page/");
	//Total Frame on the Page
	int Count=Driver.findElements(By.xpath("//iframe")).size();
	System.out.println("Total frame on the page===>"+Count);
}
}
