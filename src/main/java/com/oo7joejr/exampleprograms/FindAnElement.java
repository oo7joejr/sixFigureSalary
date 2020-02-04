package com.oo7joejr.exampleprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.oo7joejr.launchpad.*;

public class FindAnElement {

	public static void main(String[] args) {
		
		LaunchPad lp = new LaunchPad();
		String url = "http://demo.guru99.com/test/ajax.html";
		WebDriver driver=lp.EstablishConnection(url);
		driver.get(url);
		System.out.println(driver.getTitle());

		// Find the radio button for “No” using its ID and click on it
		driver.findElement(By.id("no")).click();

		// Click on Check Button
		driver.findElement(By.id("buttoncheck")).click();

		//FindElements Method
		List<WebElement> elements = driver.findElements(By.name("name"));
	    System.out.println("Number of elements:" +elements.size());

	    for (int i=0; i<elements.size();i++){
	      System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
	}
}
}
