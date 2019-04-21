package com.Qspiders;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Makemytrip {
public static void main(String[] args) throws Exception {
	WebDriver Driver=new FirefoxDriver(); //Launch the browser
	Driver.get("https://www.makemytrip.com/"); //navigate the MakemyTrip page
	Actions act=new Actions(Driver); //it will remove the pop-browser thats why we used with action ESCAPE pop-up page
	act.sendKeys(Keys.ESCAPE);
	//current title page, i printed
	System.out.println("Current title page==>"+Driver.getTitle());
	//current url page 
	String curentUrl=Driver.getCurrentUrl();
	System.out.println("Current page Url==>"+curentUrl);
	//i clicked return radio-button
	WebElement  Roundtrip=Driver.findElement(By.xpath(".//*[text()='Round Trip']"));
	Roundtrip.click();
	//verify button selected or not
	/*boolean select=Roundtrip.isSelected();
	if(select==false)
	{
		System.out.println("is selected ===pass");
	}
	else
	{
		System.out.println("is selscted ===fail");
	}
	Thread.sleep(1000);//wait 1 second
*/	WebElement From=Driver.findElement(By.xpath(".//label[@for='fromCity']")); //X-path of From
	Actions Act1=new Actions(Driver);
	Act1.click(From).sendKeys("BLR").perform();
	Driver.findElement(By.xpath(".//p[text()='Bangalore, India']")).click();
	act.sendKeys(Keys.ESCAPE);
	WebElement Tocity=Driver.findElement(By.xpath(".//label[@for='toCity']")); //X-path of From
	Actions Act2=new Actions(Driver);
	Act2.click(Tocity).sendKeys("DEL").perform();
	act.sendKeys(Keys.ESCAPE);
	Driver.findElement(By.xpath(".//p[text()='Delhi, India']")).click();	
	/*it's not working
	 * WebElement Departure=Driver.findElement(By.xpath(".//label[@for='departure']"));
	Actions Act3=new Actions(Driver);
	Act3.click(Departure);
	Driver.findElement(By.xpath(".//span[text()='6 Apr 19']")).click();*/
		
}
}
