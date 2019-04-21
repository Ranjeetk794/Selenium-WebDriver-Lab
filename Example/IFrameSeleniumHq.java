package com.qspider.Example;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class IFrameSeleniumHq {
	public static void main(String[] args) {
		//Lunch the Browser
		WebDriver Driver=new FirefoxDriver();
		//implicitly wait
		Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Navigate the URL
		Driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		//total Frame on the Page
		int Count=Driver.findElements(By.xpath("//frame")).size();
		System.out.println("Total Frame on the Page====>"+Count);
		//Frame name
		Driver.switchTo().frame("classFrame");
		//click the expected value
		Driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
        //back to main page
		Driver.switchTo().defaultContent();
		//Frame name
		Driver.switchTo().frame("packageListFrame");
		//click the expected value
		Driver.findElement(By.linkText("org.openqa.selenium.firefox")).click();
	}

}
