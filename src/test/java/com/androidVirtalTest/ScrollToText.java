package com.androidVirtalTest;

import org.testng.annotations.Test;

import com.androidUtility.AndroidActions;
import com.androidUtility.VirtualDeviceBaseClass;

import io.appium.java_client.AppiumBy;

public class ScrollToText extends VirtualDeviceBaseClass{
	
	@Test
	public void test() {
		AndroidActions actions=new AndroidActions(driver);
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		actions.scrollToText("WebView");
		driver.findElement(AppiumBy.accessibilityId("WebView")).click();

	}

}
