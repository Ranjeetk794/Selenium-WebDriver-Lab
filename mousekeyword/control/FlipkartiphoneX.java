package com.qspider.mousekeyword.control;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartiphoneX {
	public static void main(String[] args) throws Exception {
		//Launch the browser
		WebDriver Driver=new FirefoxDriver();
		//navigate the URL page
		Driver.get("https://www.flipkart.com/");
		//Action class object create
		Actions Act=new Actions(Driver);
		//wait one second
		Thread.sleep(1000);
		//Escape through to pop box
		Act.sendKeys(Keys.ESCAPE).perform();
		//SearchBox Locater
		WebElement Searchbox=Driver.findElement(By.name("q"));
		//Using Action keyword 
		Act.click(Searchbox).sendKeys(Keys.chord("iphone x",Keys.ENTER)).build().perform();
		Thread.sleep(1000);
		//Locater X-path of i-phone x
		WebElement iphoneX=Driver.findElement(By.xpath(".//span[contains(text(),'Showing ')]"));
		//Visible text of i-phone x using capture getText
		String result=iphoneX.getText();
		//printed of capture result
		System.out.println(result);
		//Total Mobile Links
		List<WebElement>AllLinks=iphoneX.findElements(By.tagName("a"));
		int AvblLnk=AllLinks.size();
		System.out.println("All mobile links==>"+AvblLnk);
		Date date=new Date();
		System.out.println("Current date and Time===>"+date);
	}
}
