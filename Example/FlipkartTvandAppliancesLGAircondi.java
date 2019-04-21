package com.qspider.Example;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartTvandAppliancesLGAircondi {

	public static void main(String[] args) {
		//Lunch The Browser
		WebDriver Driver=new FirefoxDriver();
		//Navigate the URL
		Driver.get("https://www.flipkart.com/");
		//Close the Pop-up
		Driver.findElement(By.xpath("//button[text()='✕']")).click();
		//Perform the TVs & Appliances using Action class
        WebElement TVsandAppi=Driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
        //create the Actions object
        Actions Act=new Actions(Driver);
        Act.moveToElement(TVsandAppi).perform();
        WebDriverWait wait=new WebDriverWait(Driver, 20);
        //Explicitly wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='LG' and contains(@href,'/air-conditioners/pr?')]")));
       //click the LG TVs & Appliances
        Driver.findElement(By.xpath("//a[@title='LG' and contains(@href,'/air-conditioners/pr?')]")).click();
        WebDriverWait wait1=new WebDriverWait(Driver, 20);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Showing')]")));
        String AirConditioners=Driver.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
        System.out.println("Total number of the Product===> "+AirConditioners);
        Date date=new Date();
        System.out.println("Execution of the Date===> "+date);
        
	}

}
