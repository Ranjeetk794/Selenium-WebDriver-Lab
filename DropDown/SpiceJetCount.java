package com.DropDown;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJetCount {
	public static void main(String[] args) {
		WebDriver Driver=new FirefoxDriver();
		Driver.get("https://www.spicejet.com/");
		WebElement wb=Driver.findElement(By.xpath(".//select[@id='ctl00_mainContent_ddl_originStation1']"));
		Select sel=new Select(wb);
		sel.isMultiple();
		List<WebElement> lst =sel.getOptions();
		int Count=lst.size();
		System.out.println("count the total from list of the spicejet===>"+Count);
		
		/*for(int i=0;i<lst.size();i++)
		{
			String allvalue=lst.get(i).getText();
			System.out.println(allvalue);
		}*/
	}

}
