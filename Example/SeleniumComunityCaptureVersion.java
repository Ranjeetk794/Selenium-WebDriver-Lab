package com.qspider.Example;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumComunityCaptureVersion {
	public static void main(String[] args) {
		//Launch the Browser
		WebDriver Driver = new FirefoxDriver();
		//Implicitly wait
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Driver Navigation
		Driver.get("https://www.seleniumhq.org/download/");
		//X-path of Java Language
		String stJava = "//td[text()='Java']";
		String Language = Driver.findElement(By.xpath(stJava)).getText();
		System.out.println("Programing Language===>" + Language);
		//X-path of the WebDriver Version
		String version = Driver.findElement(By.xpath("//td[text()='Java']/following-sibling::td[1]")).getText();
		System.out.println("WebDriver of Latest Version===>" + version);
		//X-path of the Latest Date of the WebDriver
		String LDate = Driver.findElement(By.xpath("//td[text()='Java']/following-sibling::td[2]")).getText();
		System.out.println("Latest Date of WebDriver===>" + LDate);
		Date date = new Date();
		System.out.println("Execution date of program===>" + date);
	}

}
