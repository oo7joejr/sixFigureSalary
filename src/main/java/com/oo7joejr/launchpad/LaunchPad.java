package com.oo7joejr.launchpad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchPad {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91790\\eclipse-workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("joshyjoy7");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("anjualice");
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		
		Thread.sleep(5000);
		driver.close();
	}
}
