package com.qspider.handle.webtable;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EspecriccricketScore {
	public static void main(String[] args) throws ParseException {
		String Max;
		double m, r = 0;
		WebDriver Driver = new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.get("http://www.espncricinfo.com/table/series/8048/season/2019/ipl");
		List<WebElement> ColumnSize = Driver.findElements(By.xpath("//thead[@class='standings-categories']/tr[1]/th"));
		System.out.println("Total column Size====>" + ColumnSize.size());
		System.out.println("Total Column Name===========>");
		for (WebElement ClmName : ColumnSize) {
			String AllClmName = ClmName.getText();
			System.out.println(AllClmName);
		}
		WebElement TrdRow = Driver.findElement(By.xpath("//table[@class='standings has-team-logos']/tbody/tr[3]"));
		System.out.println(TrdRow.getText());

		WebElement FrthColm = Driver
				.findElement(By.xpath("//table[@class='standings has-team-logos']/tbody/tr[3]/td[9]"));
		System.out.println(FrthColm.getText());

		List<WebElement> ListRow = Driver
				.findElements(By.xpath("//table[@class='standings has-team-logos']/tbody/tr/td[1]"));
		for (int i = 0; i < ListRow.size(); i++) {
			Max = Driver.findElement(By.xpath("//table[@class='standings has-team-logos']/tbody/tr[\"+(i+1)+\"]/td[9]"))
					.getText();
			NumberFormat f = NumberFormat.getNumberInstance();
			Number num = f.parse(Max);
			Max = num.toString();
			m = Double.parseDouble(Max);
			if (m > r) {
				r = m;
			}
		}
		System.out.println("Maximum current FOR is===>" + r);
	}
}
