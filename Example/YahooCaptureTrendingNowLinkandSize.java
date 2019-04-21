package com.qspider.Example;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooCaptureTrendingNowLinkandSize {

	public static void main(String[] args) {
		//Launch the Browser
		WebDriver Driver=new FirefoxDriver();
		//Implicitly wait
		Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Navigate the URL
		Driver.get("https://in.yahoo.com/");
		//List of the Link
        List<WebElement> LinkName=Driver.findElements(By.xpath("//div[@data-applet-type='trending']"));
        System.out.println("Total Link of the Trending Now===>"+LinkName.size());
        //Loop of the Link
        for(WebElement linkname:LinkName)
        {
        	System.out.println(linkname.getText());
        }
        Date date=new Date();
        System.out.println("Execution of the Program===> "+date);
	}
}
