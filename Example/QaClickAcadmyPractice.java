package com.qspider.Example;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QaClickAcadmyPractice {

	public static void main(String[] args) throws Exception {
		WebDriver Driver = new FirefoxDriver();
		Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Driver.get("http://www.qaclickacademy.com/practice.php");
		List<WebElement> Radiobtn=Driver.findElements(By.xpath("//input[@name='radioButton']"));
		int Count=Radiobtn.size();
		System.out.println("Size of the Radio button===>"+Count);
		WebElement Radio2=Driver.findElement(By.xpath("//input[@value='radio3']"));
        while(true)
        {
        Radio2.click();
        System.out.println("Radiobutton selected or not if selected===>"+Radio2.isSelected());
        break;
        }
        Thread.sleep(1000);
        Driver.findElement(By.xpath("//input[@placeholder='Select Countries']")).sendKeys("India",Keys.ENTER);
        WebElement Dropbox=Driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select sel=new Select(Dropbox);
        sel.selectByIndex(3);
        Driver.findElement(By.xpath("//input[@value='option2']")).click();
        WebDriverWait wait=new WebDriverWait(Driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Open Tab")));
        Driver.findElement(By.linkText("Open Tab")).click();
        System.out.println(Driver.getTitle());
        Set<String> ids=Driver.getWindowHandles();
        Iterator<String> it=ids.iterator();
        String ParentId=it.next();
        String ChildId=it.next();
        Driver.switchTo().window(ChildId);
        Thread.sleep(1000);
        System.out.println("After Switching the new Tab");
        System.out.println("Child of the title page===>"+Driver.getTitle());
        Driver.switchTo().window(ParentId);
        System.out.println("Switching back to the Parent ");
        System.out.println("Parent title page===>"+Driver.getTitle());
        Driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys("Ranjeet794k@gmail.com");
        Driver.findElement(By.xpath("//input[@value='Confirm']")).click();
        Alert altmsg=Driver.switchTo().alert();
        System.out.println("Alert massage===>"+altmsg.getText());
        altmsg.accept();
        WebDriverWait wait1=new WebDriverWait(Driver, 15);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='table-display']/tbody/tr[*]/td[2]")));
        List<WebElement> Webtblexm=Driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[*]/td[2]"));
        System.out.println("Total Course cuntent table===>"+Webtblexm.size());
        for(int i=0;i<Webtblexm.size();i++)
        {
        	String TableoftheCourse=Webtblexm.get(i).getText();
        	System.out.println(TableoftheCourse);
        }
        Driver.findElement(By.xpath("//input[@value='Show']")).click();
        Driver.findElement(By.xpath("//input[@placeholder='Hide/Show Example']")).sendKeys("Hello",Keys.ENTER);
        WebDriverWait wait2=new WebDriverWait(Driver, 15);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='mousehover']")));
        WebElement MsOver=Driver.findElement(By.xpath("//div[@class='mouse-hover']"));
        Actions act=new Actions(Driver);
        //i'm getting Exception MoveTargetOutOfBoundsException exception is thrown..
        act.moveToElement(MsOver).build().perform();
        Driver.findElement(By.xpath("//a[text()='Top']")).click();
        WebDriverWait wait3=new WebDriverWait(Driver, 15);
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='gf-BIG']")));
        WebElement FooterDriver=Driver.findElement(By.xpath("//div[@id='gf-BIG']"));
        System.out.println("Size of the FooterLink===>"+FooterDriver.findElements(By.xpath("//a")).size());  
	}
}
