package com.androidVirtalTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.androidUtility.AndroidActions;
import com.androidUtility.VirtualDeviceBaseClass;

import io.appium.java_client.AppiumBy;

public class LongPressEx extends VirtualDeviceBaseClass{
	

	@Test
	public void test() throws InterruptedException {
		AndroidActions act=new AndroidActions(driver);
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text=\"People Names\"]"));
		act.longPress(ele,2000);
		Thread.sleep(2000);
	}

}
