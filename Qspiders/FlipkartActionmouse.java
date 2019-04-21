package com.Qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FlipkartActionmouse {
public static void main(String[] args) throws Exception {
	WebDriver Driver=new FirefoxDriver();
	Driver.get("https://www.flipkart.com/");
	Thread.sleep(1000);
	Actions act=new Actions(Driver);
	act.sendKeys(Keys.ESCAPE).build().perform();
	WebElement Tvsappli=Driver.findElement(By.xpath(".//span[text()='Men']"));
	Actions Act=new Actions(Driver);
	Act.moveToElement(Tvsappli).perform();
	Thread.sleep(1000);
	WebElement Kurtas=Driver.findElement(By.xpath(".//a[text()='Kurtas']"));
    Kurtas.click();
    Thread.sleep(1000);
    WebElement Kurtass=Driver.findElement(By.xpath("//a[@class='_1KHd47'][contains(text(),'Kurtas')]"));
    Select sel=new Select(Kurtass);
    List<WebElement> count=sel.getOptions();
    System.out.println(count.size());
    for(int i=0;i<count.size();i++)
    {
     String allkurtas=count.get(i).getText();
     System.out.println(allkurtas);
    }
       
}
}
