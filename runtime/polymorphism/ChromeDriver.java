package com.runtime.polymorphism;

public class ChromeDriver implements WebDriver{
	public ChromeDriver() {
		System.out.println("Launch the Browser");
	}

	public void get(String Url) {
		System.out.println("print the url page==>"+Url);	
	}
public void findElement(String locater) {
		System.out.println("find the locater==>"+locater);	
	}
	public void close() {
System.out.println("close the browser");		
	}

	public void quite() {
System.out.println("quite the all browser");		
	}

	
	
}
