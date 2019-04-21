package com.Qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class QAtoolsDrop {
	public static void main(String[] args) throws Exception {
		WebDriver Driver=new FirefoxDriver();
		Driver.get("https://demoqa.com/");
		Driver.findElement(By.xpath(".//a[text()='Droppable']")).click();
		WebElement srcDrag=Driver.findElement(By.id("draggable"));
		WebElement desDrop=Driver.findElement(By.id("droppable"));
		Actions Act=new Actions(Driver);
		Act.dragAndDrop(srcDrag, desDrop).perform();
		Driver.navigate().back();
		Thread.sleep(1000);
		Driver.findElement(By.xpath(".//a[text()='Draggable']")).click();
		WebElement Dragable=Driver.findElement(By.xpath(".//p[text()='Drag me around']"));
		Actions Act1=new Actions(Driver);
		Act1.dragAndDropBy(Dragable, 0, 1000);
		//Act1.moveByOffset(90, 120);
		
	}

}
