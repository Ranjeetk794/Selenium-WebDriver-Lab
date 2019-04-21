package com.Qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) throws Exception {
		String baseUrl="https://s1.demo.opensourcecms.com/wordpress/wp-login.php";
		String ExpResult="Log in ‹ opensourcecms — WordPress";
		String Actual="";
		boolean bvalue;
		ChromeDriver Driver=new ChromeDriver();
		Driver.get(baseUrl);
		String Count=Driver.getCurrentUrl();
		System.out.println("curent link="+Count);
		System.out.println("Current url length="+Count.length());
		Driver.manage().window().fullscreen();
		Actual=Driver.getTitle();
		bvalue=Actual.equalsIgnoreCase(ExpResult);
		if(bvalue==true)
		{
			System.out.println("Actual Result matched="+Actual);
		}
		else
		{
			System.out.println("Actual Result not matched="+Actual);
		}
		WebElement Username=Driver.findElement(By.id("user_login"));
		Username.sendKeys("opensourcecms");
		WebElement Password=Driver.findElement(By.id("user_pass"));
		Password.sendKeys("opensourcecms");
		Thread.sleep(1000);
		Username.clear();
		Password.clear();
		Thread.sleep(1000);
		Username.sendKeys("opensourcecms");
		Password.sendKeys("opensourcecms");
		WebElement Sign=Driver.findElement(By.xpath(".//input[@type='checkbox']"));
		Sign.click();
		WebElement Login=Driver.findElement(By.id("wp-submit"));
		Login.submit();
		Thread.sleep(1000);
		WebElement Profile=Driver.findElement(By.xpath(".//li[@id='wp-admin-bar-my-account']/a"));
		Profile.click();
		WebElement Check1=Driver.findElement(By.id("rich_editing"));
		Check1.click();
		WebElement Check2=Driver.findElement(By.id("syntax_highlighting"));
		Check2.click();
	    /*int	Count=Driver.findElements(By.name("admin_color")).size();
	    System.out.println("Total colourbuttn="+Count);*/
	    List<WebElement> button=Driver.findElements(By.name("admin_color"));
	    int B_Size=button.size();
	    System.out.println("Total button size="+B_Size);
	    for(int i=0;i<B_Size;i++)
	    {
	    	String sValue=button.get(i).getAttribute("value");
	    	if(sValue.equalsIgnoreCase("ocean"))
	    	{
	    		button.get(i).click();
	    		break;
	    	}
	    }
	    WebElement Shortkey=Driver.findElement(By.id("comment_shortcuts"));
	    Shortkey.click();
	    WebElement Toolbar=Driver.findElement(By.id("admin_bar_front"));
	    Toolbar.click();
		Driver.quit();
		

	}

}
