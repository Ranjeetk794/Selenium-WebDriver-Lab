package com.qspider.webdriver.locater;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazinLinktext {
	public static void main(String[] args) throws Exception {
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://www.amazon.in");
		Driver.findElement(By.xpath(".//span[text()='Hello, Sign in']")).click();
		Thread.sleep(1000);
		Driver.findElement(By.linkText("Create your Amazon account")).click();
		//Driver.findElement(By.partialLinkText("Create your")).click();

	}

}
