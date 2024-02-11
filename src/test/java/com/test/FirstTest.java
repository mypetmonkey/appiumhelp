package com.test;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.androidUtility.RealDeviceBaseclass;

import io.appium.java_client.AppiumBy;

public class FirstTest extends RealDeviceBaseclass{
	
	@Test
	public void test() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("//android.widget.ListView[@resource-id=\"android:id/list\"]/android.widget.LinearLayout[2]")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"android:id/edit\"]")).sendKeys("raju");
        driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
		driver.navigate().back();
		Thread.sleep(2000);
	}

}
