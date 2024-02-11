package com.androidVirtalTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.androidUtility.VirtualDeviceBrowserBaseClass;

public class FlipKartTest extends VirtualDeviceBrowserBaseClass {
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//img)[6]")).click();
		
		
		
		Thread.sleep(3000);
	}

}
