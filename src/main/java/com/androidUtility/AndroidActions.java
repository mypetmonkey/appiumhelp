package com.androidUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AndroidActions {
	
	public AndroidDriver driver;
	public AndroidActions(AndroidDriver driver) {
		this.driver=driver;
	}
	
	
	
	/**
	 * this method will help to scroll up to the given text
	 * @param text
	 */
	public void scrollToText(String text) {
		driver.findElement(AppiumBy.androidUIAutomator
		("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));	
		
	}
	
	
	public void longPress(WebElement ele, int timeinms) {
		
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",timeinms));
		
	}
	
	public void scrollAction(AndroidDriver driver) {
		boolean canScrollMore;
		do {
			canScrollMore = (Boolean) ((JavascriptExecutor) driver)
					 .executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 100, "width", 200, "height", 200,
				    "direction", "down",
				    "percent", 3.0
				    
				));			
		}while(canScrollMore);
		
		
	}
	
	public void swipeAction(WebElement ele,String direction) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)ele).getId(),
			    "direction", direction,
			    "percent", 0.75
			));
	}
	
public void dragAction(WebElement source,int x,int y) {
		
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) source).getId(),
			    "endX", x,
			    "endY", y
			));
	}
	
	
	

}
