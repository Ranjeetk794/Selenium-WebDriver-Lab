package com.qspider.webdriver.locater;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPartiallinktext {
		public static void main(String[] args) throws Exception {
			ChromeDriver Driver = new ChromeDriver();
			//navigate amazon page
			Driver.get("https://www.amazon.in");
			//x-path of the sign button
			Driver.findElement(By.xpath(".//span[text()='Hello, Sign in']")).click();
			//wait one second
			Thread.sleep(1000);
			//this is the partial link text of the create id
			Driver.findElement(By.partialLinkText("Create your")).click();

		}

	}
