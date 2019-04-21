package com.qspider.mousekeyword.control;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class MovetoElementusingAction {
public static void main(String[] args) throws Exception {
	WebDriver Driver=new FirefoxDriver();
	Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Driver.get("https://www.amazon.in/");
	WebElement ShopCatg=Driver.findElement(By.xpath(".//a[@id='nav-link-shopall']"));
    Actions Act=new Actions(Driver);
    Act.moveToElement(ShopCatg).perform();
    Thread.sleep(1000);
    WebElement MobileComputer=Driver.findElement(By.xpath(".//span[text()='Mobiles, Computers']"));
    MobileComputer.click();
    Thread.sleep(1000);
    WebElement Allmobile= Driver.findElement(By.xpath(".//span[text()='All Mobile Phones']"));
    Allmobile.click();   
}
}
