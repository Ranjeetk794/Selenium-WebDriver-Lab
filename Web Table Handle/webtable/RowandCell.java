package com.qspider.handle.webtable;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowandCell {
	public static void main(String[] args) throws ParseException {
		WebDriver Driver;
		Driver = new ChromeDriver();
		Driver.get("http://demo.guru99.com/test/web-table-element.php");
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// To find third row of table
		WebElement tableRow = Driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
		String rowtext = tableRow.getText();
		System.out.println("Third row of table : " + rowtext);
	// to get 3rd row's 2nd column data
		WebElement cellIneed = Driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		String valueIneed = cellIneed.getText();
		System.out.println("Cell value is : " + valueIneed);
		Driver.close();
	}
}
