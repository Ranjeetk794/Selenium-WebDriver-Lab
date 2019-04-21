package com.qspider.Example;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartiPhonexrYellowPrice {
	public static void main(String[] args) {
		//Launch the Browser
		WebDriver Driver=new FirefoxDriver();
		//Implicitly wait
		Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Navigate the URL
		Driver.get("https://www.flipkart.com/");
		//Close the Pop-Up
		Driver.findElement(By.xpath("//button[text()='✕']")).click();
		//enter the search box in iPhone XR
		Driver.findElement(By.name("q")).sendKeys("iPhone Xr",Keys.ENTER);
		//Store the x-Path in String reference Variable
        String Xpath="//div[text()='Apple iPhone XR (Yellow, 256 GB)']/../../div[2]/div[1]/div/div";
        //Explicitly wait
        WebDriverWait wait=new WebDriverWait(Driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
        //Get the text of iPhone Mobile Price
        String Price=Driver.findElement(By.xpath(Xpath)).getText();
        //Print the Price
        System.out.println("Apple iPhone XR (Yellow, 256 GB)Price===>"+Price);
        Date date=new Date();
        System.out.println("Execution Date of the Program===> "+date);
	}

}
