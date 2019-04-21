package com.runtime.polymorphism;

public interface WebDriver {
	public void get(String Url);
	public void findElement(String locater);
	public void close();
	public void quite();

}
