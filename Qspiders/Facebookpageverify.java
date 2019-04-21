package com.Qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebookpageverify {
	public static void main(String[] args) {
		WebDriver Driver=new FirefoxDriver();
		Driver.get("https://www.facebook.com/");
        String path=".//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yi/r/OBaVg52wtTZ.png']";
        WebElement wb= Driver.findElement(By.xpath(path));
        boolean status=wb.isDisplayed();
        System.out.println(status);
        if(status)
        {
        	System.out.println("image dispaly matched==> pass");
        }else {
         System.out.println("image dispaly not matched==> fail");
	}
        int count=Driver.findElements(By.tagName("img")).size();
        System.out.println("Total no of image at the webpage ==>"+count);
        //Radio button of the male
        WebElement male=Driver.findElement(By.id("u_0_9"));
        boolean malesex=male.isSelected();
        //Radio button of the female
        WebElement female=Driver.findElement(By.id("u_0_9"));
        boolean fmale=female.isSelected();
        //verify the Radio button is selected or not
        if(malesex==false && fmale==false)
        {
        	System.out.println(" radio button is unselected==> pass");
        }else
        {
        	System.out.println(" radio button is selected===> fail");
        }
        WebElement wb1=Driver.findElement(By.id("u_0_o"));
        System.out.println("mobile no and address==> "+wb1.getAttribute("aria-label"));
        //close the browser
        Driver.close();
        }

}
