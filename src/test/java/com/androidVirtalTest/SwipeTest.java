package com.androidVirtalTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.androidUtility.AndroidActions;
import com.androidUtility.VirtualDeviceBaseClass;

import io.appium.java_client.AppiumBy;

public class SwipeTest extends VirtualDeviceBaseClass {
	
	@Test
	public void testName() {
		AndroidActions act=new AndroidActions(driver);
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		
		for(int i=1;i<=5;i++) {
			WebElement ele = driver.findElement(By.xpath("(//android.widget.ImageView)["+i+"]"));
           act.swipeAction(ele, "left");
			
		}
	}

}
