package com.qspider.Example;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartGotoProductCount {

	public static void main(String[] args) {
		//Launch the Browser
		WebDriver Driver=new FirefoxDriver();
		//Implicitly Wait
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Navigate the Flipkart
		Driver.get("https://www.flipkart.com/");
		//Window Alert pop-up
		Driver.findElement(By.xpath("//button[text()='✕']")).click();
		//search box in apple and enter
        Driver.findElement(By.name("q")).sendKeys("apple",Keys.ENTER);
        //X-path of Total Result
        String str="//span[contains(text(),'Showing ')]";
        String result=Driver.findElement(By.xpath(str)).getText();
        System.out.println("Showing Result==>"+result); //Showing 1 – 24 of 29,82,585 results for "apple"
        String [] arr=result.split(" ");//Using split wait and print only price
        String strInvCount=arr[5]; //store the value in stInvCount
        System.out.println("Total result==>"+strInvCount);// o/p:-29,82,585
        Integer intCount=Integer.parseInt(strInvCount.replaceAll(",", ""));
        System.out.println("output of total result without coma==>"+intCount); // o/p:-2984489
        System.out.println("Subtract total value in 5==>"+(intCount-5)); //Subtract total value in 5
        Date date=new Date();
        System.out.println(date);
	}

}
