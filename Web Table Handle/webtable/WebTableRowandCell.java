package com.qspider.handle.webtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableRowandCell {
public static void main(String[] args) {
	//Launch the Browser
	WebDriver Driver=new FirefoxDriver();
	//Implicitly wait
	Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//Navigate the URL
	Driver.get("http://demo.guru99.com/test/web-table-element.php");
	//Maximize the Window
	Driver.manage().window().maximize();
	//Seventh row 
	WebElement TableRow=Driver.findElement(By.xpath("//div[@class='leftcontainer']/table/tbody/tr[7]"));
	//Store in string variable
    String RowText=TableRow.getText();
    //Print the String variable
    System.out.println("Seventh Row of the Table====>"+RowText);
    //Seventh row Third Column
    WebElement TableCell=Driver.findElement(By.xpath("//div[@class='leftcontainer']/table/tbody/tr[7]/td[3]"));
    //Store in string variable
    String CellValue=TableCell.getText();
    //Print the String variable
    System.out.println("Table Cell value====>"+CellValue);  
    //Close the Window
    Driver.close();
}
}
