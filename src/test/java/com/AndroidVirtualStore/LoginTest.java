package com.AndroidVirtualStore;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.androidUtility.AndroidActions;
import com.androidUtility.VirtualDeviceBaseClass;

public class LoginTest extends VirtualDeviceBaseClass{

	
	@Test
		public void test() throws InterruptedException {
			AndroidActions act=new AndroidActions(driver);
			driver.findElement(By.id("android:id/text1")).click();
			act.scrollToText("Austria");
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Austria\"]")).click();
		    driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("rajhans");
		    driver.hideKeyboard();
		    driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
			driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
			act.scrollToText("Jordan 6 Rings");
			 List<WebElement> pname = driver.findElements(By.id("com.androidsample.generalstore:id/productName"));
	        
			 int count=pname.size();
			 System.out.println(count);
			 for(int i=0;i<count;i++) {
				String name = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
				if(name.equals("Jordan 6 Rings")) {
					driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
			 }
			 }
			
			driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
			Thread.sleep(2000);
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
			wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text","Cart" ));
			
		   String	lastpname=driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
	       Assert.assertEquals(lastpname, "Jordan 6 Rings");
	    	
		
	}
}
