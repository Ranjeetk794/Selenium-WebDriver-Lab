package com.qspider.handle.webtable;

import java.text.NumberFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class MaxmmTableFormat {
	public static void main(String[] args) throws Exception {
		String Max;
		double m,r=0;
		WebDriver Driver=new FirefoxDriver();
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.get("http://demo.guru99.com/test/web-table-element.php");
		Driver.manage().window().maximize();
		List<WebElement> Column=Driver.findElements(By.xpath("//div[@class='leftcontainer']/table/thead/tr[1]/th"));
		System.out.println("Total number of Columan on the page====>"+Column.size());
		List<WebElement> Row=Driver.findElements(By.xpath("//div[@class='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("Total Row in One Column====>"+Row.size());
		for(int i=1;i<Row.size();i++)
		{
//Using for loop, we iterate through total number of rows and fetch values one by one. To get next row we use (i+1) in XPath
			Max=Driver.findElement(By.xpath("//*[@class='leftcontainer']/table/tbody/tr["+(i+1)+"]/td[3]")).getText();
			NumberFormat f=NumberFormat.getNumberInstance();
			Number num=f.parse(Max);
			Max=num.toString();
			m=Double.parseDouble(Max);
			if(m>r)
			{
//We compare old value with new value and maximum value is printed at the end of for loop
				r=m;
			}
		}
		System.out.println("Maximum current price is===>"+r);
		

	}

}
