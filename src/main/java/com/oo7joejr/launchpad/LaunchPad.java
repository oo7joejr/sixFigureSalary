package com.oo7joejr.launchpad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchPad {
	
	public WebDriver EstablishConnection(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91790\\eclipse-workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com");
		return driver;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
	
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("joshyjoy7");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("errorcode123");
		//driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		
		Thread.sleep(5000);
		//driver.close();
	}
}
