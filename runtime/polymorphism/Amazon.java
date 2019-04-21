package com.runtime.polymorphism;
public class Amazon {
	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.Amazon.com");
		Driver.findElement("id");
		Driver.close();
		Driver.quite();	
	}

}
