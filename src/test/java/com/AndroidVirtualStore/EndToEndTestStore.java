package com.AndroidVirtualStore;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.androidUtility.AndroidActions;
import com.androidUtility.VirtualDeviceBaseClass;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class EndToEndTestStore extends VirtualDeviceBaseClass{
	
	@Test
	public void test() throws InterruptedException {
		AndroidActions action =new AndroidActions(driver);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Rajhans");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		action.scrollToText("Bangladesh");
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Bangladesh\"]")).click();
	    driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
	    driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	    Thread.sleep(3000);
	    action.scrollToText("Air Jordan 9 Retro");
	    
	   driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
	   driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();

	   driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	   driver.findElement(By.className("android.widget.CheckBox")).click();
	   driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	    Thread.sleep(5000);

	   Set<String> contexts = driver.getContextHandles();
		for(String cname:contexts) {
			System.out.println(cname);
		}
		driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.findElement(By.name("q")).sendKeys("java");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.context("NATIVE_APP");
	}

}
