package com.qspider.webdriver.webelementcontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCSSvalueofTheMsg {

	public static void main(String[] args) {
		WebDriver Driver=new FirefoxDriver();
		//Navigate the gmail page
		Driver.get("https://gmail.com/");
		//x-path of the email id
		WebElement userId=Driver.findElement(By.id("identifierId"));
		//Enter the id
		userId.sendKeys("Hp");
		//x-path of the next button
		WebElement Nextbtn=Driver.findElement(By.xpath(".//span[text()='Next']"));
		//click the next button
		Nextbtn.click();
		//msg of the error
		WebElement MsgError=Driver.findElement(By.xpath(".//div[@class='GQ8Pzc']"));
		//get text the error msg
		String Colour= MsgError.getCssValue("color");
		System.out.println("Colour of the MsgError==> "+Colour);
		
	}

}
