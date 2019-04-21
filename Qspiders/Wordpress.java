package com.Qspiders;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Wordpress {
	public static void main(String[] args) throws Exception {
		//String str="opensourcecms";
		WebDriver Driver=new FirefoxDriver();
		Driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		WebElement Wb1=Driver.findElement(By.id("user_login"));
		Wb1.sendKeys("str");
		Thread.sleep(1000);
		String copy = Keys.chord(Keys.CONTROL,Keys.chord("c"));
		String paste = Keys.chord(Keys.CONTROL,Keys.chord("v"));
		Actions Act=new Actions(Driver);
		Act.doubleClick(Wb1).perform();
		Act.sendKeys(copy).perform();
		Act.sendKeys(Keys.TAB).perform();
		Act.sendKeys(paste).perform();
			}

}
