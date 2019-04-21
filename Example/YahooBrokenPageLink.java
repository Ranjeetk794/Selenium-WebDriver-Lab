package com.qspider.Example;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooBrokenPageLink {

	public static void main(String[] args) throws Exception {
		WebDriver Driver=new FirefoxDriver();
		Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Driver.get("https://in.yahoo.com/");
		List<WebElement>lst=Driver.findElements(By.xpath("//div[@data-applet-type='trending']/div/div/div/div/ul/li/ul/li[*]"));
		for(WebElement Link:lst)
		{
			Link.click();
			String TitleofthePage=Driver.getTitle();
			if(TitleofthePage.contains("Server Not Found"))
			{
				System.out.println("Link is Broken===>"+Link.getText());
			}
			Thread.sleep(4000);
			Driver.navigate().back();
			Thread.sleep(4000);
		}

	}

}
