package com.androidVirtalTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.androidUtility.AndroidActions;
import com.androidUtility.VirtualDeviceBaseClass;

import io.appium.java_client.AppiumBy;

public class DragAndDrop extends VirtualDeviceBaseClass{
	

	@Test
	public void testName(){
		
		AndroidActions act=new AndroidActions(driver);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		WebElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		
		act.dragAction(source, 601, 532);
		String text = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
		
		Assert.assertEquals(text, "Dropped!");
	}

}
