package com.androidVirtalTest;

import org.testng.annotations.Test;

import com.androidUtility.AndroidActions;
import com.androidUtility.VirtualDeviceBaseClass;

import io.appium.java_client.AppiumBy;

public class ScrollWithoutText extends VirtualDeviceBaseClass{
	
	AndroidActions actions=new AndroidActions(driver);
	
	@Test
	public void test() {
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	actions.scrollAction(driver);
	driver.findElement(AppiumBy.accessibilityId("WebView")).click();

}
}
