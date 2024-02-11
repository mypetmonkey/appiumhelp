package com.androidVirtalTest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.androidUtility.VirtualDeviceBaseClass;
import com.google.common.collect.ImmutableMap;


public class ActivityTest extends VirtualDeviceBaseClass{
	
	@Test
	public void test() throws InterruptedException {
//		options.setAppPackage("io.appium.android.apis");
//        options.setAppActivity("io.appium.android.apis.accessibility.ClockBackActivity");	
//		driver.findElement(By.id("io.appium.android.apis:id/button")).click();
	
	//Activity act=new Activity("io.appium.android.apis","io.appium.android.apis.accessibility.ClockBackActivity");
        // driver.startActivity(act);
		//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
	//adb shell dumpsys window | find "mCurrentFocus"
	((JavascriptExecutor)driver).executeScript("mobile: startActivity", ImmutableMap.of("intent","io.appium.android.apis/io.appium.android.apis.ApiDemos}"));
         
         Thread.sleep(4000);
	}
}
