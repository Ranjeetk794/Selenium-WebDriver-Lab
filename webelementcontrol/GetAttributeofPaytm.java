package com.qspider.webdriver.webelementcontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributeofPaytm {
	public static void main(String[] args) {
		WebDriver Driver=new FirefoxDriver();
		//navigation of the paytm
		Driver.get("https://paytm.com/");
		//X-path of the Paytm search box
		WebElement SearchPaytm=Driver.findElement(By.xpath(".//input[@type='search']"));
		//Backend of Attribute 
		String SearchBox=SearchPaytm.getAttribute("placeholder");
		//print the Search box of the Backend Attribute text
		System.out.println(SearchBox);
	}

}
