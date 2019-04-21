package com.qspider.Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WordpressOpensourcess {
	public static void main(String[] args) throws Exception {
		//Launch the Browser
		WebDriver Driver=new FirefoxDriver();
		//Implicitly wait
		Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Navigate the URL
		Driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		//UI
		Driver.findElement(By.name("log")).sendKeys("opensourcecms");
		Driver.findElement(By.name("pwd")).sendKeys("opensourcecms");
		Driver.findElement(By.xpath("//input[@value='Log In']")).submit();
		/*WebDriverWait wait=new WebDriverWait(Driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[normalize-space(text())='Comments']")));*/
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//div[normalize-space(text())='Comments']")).click();
		WebElement CommMSG=Driver.findElement(By.xpath("//tbody[@id='the-comment-list']"));
		Actions Act=new Actions(Driver);
		Act.moveToElement(CommMSG).perform();
		Driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebDriverWait wait1=new WebDriverWait(Driver, 15);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='newcomment_author']")));
		WebElement Name=Driver.findElement(By.xpath("//input[@name='newcomment_author']"));
		Name.clear();
		Name.sendKeys("A WordPress Commente",Keys.TAB);
		WebElement Email=Driver.findElement(By.xpath("//input[@id='email']"));
		Email.clear();
		Email.sendKeys("Ranjeet@wordpress.example",Keys.TAB);
		WebElement URL=Driver.findElement(By.xpath("//input[@id='newcomment_author_url']"));
		URL.clear();
		URL.sendKeys("https://wordpress.org/");
		WebDriverWait wait2=new WebDriverWait(Driver, 15);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='content']")));
		WebElement CmntTxt=Driver.findElement(By.xpath("//textarea[@name='content']"));
		CmntTxt.clear();
		CmntTxt.sendKeys("Hi,This is Ranjeet & I commented.\r\n" + 
				"To get started with moderating, editing, and deleting comments, please visit the Comments screen in the dashboard.\r\n" + 
				"Commenter Ranjeet come from <a href=\"https://Ranjeet.com\">Ranjeet</a>.");
		WebDriverWait wait3=new WebDriverWait(Driver, 15);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Pending']/input")));
	    Driver.findElement(By.xpath("//label[text()='Pending']/input")).click();
	   // Driver.findElement(By.linkText("Move to Trash")).click();
	    Driver.findElement(By.xpath("//input[@id='save']")).click();
	    WebDriverWait wait=new WebDriverWait(Driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Users']")));
	    WebElement USER=Driver.findElement(By.xpath("//div[text()='Users']"));
	    Act.moveToElement(USER).perform();
	    WebDriverWait wait4=new WebDriverWait(Driver, 15);
		wait4.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[text()='Add New'])[1]"))); 
	    Driver.findElement(By.xpath("(//a[text()='Add New'])[1]")).click();
		
		
		
		
	}

}
