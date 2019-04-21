package com.Qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyInvalidemailid {
	public static void main(String[] args) {
		String expectedresult="Couldn't find your Google Account";
		WebDriver Driver=new FirefoxDriver();
		Driver.get("https://gmail.com/");
		Driver.findElement(By.id("identifierId")).sendKeys("hg");
		Driver.findElement(By.xpath(".//span[text()='Next']")).click();
		WebElement wb=Driver.findElement(By.xpath(".//div[@class='GQ8Pzc']"));
		String actresult=wb.getText();
		if(actresult.equals(expectedresult))
		{
			System.out.println("massge matched of expected result");
		}
		else 
		{
			System.out.println("massage haven't matched");
		}
		System.out.println("actual error msg="+actresult);
		String actcolour=wb.getCssValue("color");
		System.out.println("msg colour Display="+actcolour);
		System.out.println(wb);
		Driver.close();
		
	
}

}
