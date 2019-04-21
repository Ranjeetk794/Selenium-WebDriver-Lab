package com.qspider.handle.webtable;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CricBuzzIPL2019 {

	public static void main(String[] args) throws ParseException {
		String Max;
		double m,r=0;
     WebDriver Driver=new FirefoxDriver();
     Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     Driver.get("https://www.cricbuzz.com/cricket-series/2810/indian-premier-league-2019");
     WebDriverWait wait=new WebDriverWait(Driver, 15);
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Stats']")));
     Driver.findElement(By.xpath("//a[text()='Stats']")).click();
     WebDriverWait wait1=new WebDriverWait(Driver, 15);
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='table table-responsive cb-series-stats']/thead/tr[1]/th")));
     List<WebElement> IPLClm=Driver.findElements(By.xpath("//table[@class='table table-responsive cb-series-stats']/thead/tr[1]/th"));
     System.out.println("Total size of the Column===>"+IPLClm.size());
     for(int i=0;i<IPLClm.size();i++)
     {
    	String  IPLColmName=IPLClm.get(i).getText();
    	System.out.println(IPLColmName);
     }
     List<WebElement> ListRow=Driver.findElements(By.xpath("//table[@class='table table-responsive cb-series-stats']/tbody/tr/td[2]"));
     System.out.println("Total Row Size====>"+ListRow.size());
     for(int i=0;i<ListRow.size();i++)
     {
    	 String PalyeNAme=ListRow.get(i).getText();
    	 System.out.println(PalyeNAme);
     }
    List<WebElement> RowList=Driver.findElements(By.xpath("//table[@class='table table-responsive cb-series-stats']/tbody/tr/td[1]"));
    for (int i = 0; i < RowList.size(); i++) {
		Max = Driver.findElement(By.xpath("//table[@class='table table-responsive cb-series-stats']/tbody/tr[\"+(i+1)+\"]/td[5]"))
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
