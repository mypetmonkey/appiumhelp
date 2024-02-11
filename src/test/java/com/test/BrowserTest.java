package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.androidUtility.VirtualDeviceBrowserBaseClass;

import io.appium.java_client.AppiumBy;

public class BrowserTest  extends VirtualDeviceBrowserBaseClass{
	
	
	@Test
	public void browserTest() throws InterruptedException {
		driver.get("https://www.amazon.in/");
	//WebElement ele = driver.findElement(By.xpath("//span[text()='Wearable health devices']"));
	//String text = ele.getText();
//	JavascriptExecutor jse=(JavascriptExecutor)driver;
//	int y=ele.getLocation().getY();
//	jse.executeScript("window.scrollTo(0,"+y+")");
//	ele.click();
//	driver.findElement(AppiumBy.androidUIAutomator
//			("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));	
//	ele.click();
//	Thread.sleep(4000);

		
	
	for(int i=0;i<15;i++) {
        JavascriptExecutor jaa = (JavascriptExecutor) driver;
        jaa.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(500);
        System.out.println("Scrolled time: "+i);
  }
  System.out.println("****************Scrolled down end****************");

}
	}
	


