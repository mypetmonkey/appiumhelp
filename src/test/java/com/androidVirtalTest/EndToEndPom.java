package com.androidVirtalTest;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.AndroidRepository.HomePage;
import com.androidUtility.AndroidActions;
import com.androidUtility.VirtualDeviceBaseClass;

import io.appium.java_client.AppiumBy;

public class EndToEndPom extends VirtualDeviceBaseClass {
	
	@Test
	public void test() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		AndroidActions act=new AndroidActions(driver);
		
		hp.getCountrydrop().click();
		act.scrollToText("Austria");
		hp.getChoosecountry().click();
		hp.getNamefield().sendKeys("raju");
		 driver.hideKeyboard();
		hp.getFgender().click();
		hp.getShopnowbtn().click();
		act.scrollToText("Jordan 6 Rings");
		List<WebElement> pname = hp.getProductname();
		int count=pname.size();
		 System.out.println(count);
		 for(int i=0;i<count;i++) {
			String name = hp.getProductname().get(i).getText();
			if(name.equals("Jordan 6 Rings")) {
				hp.getProductaddcart().get(i).click();
		    }
		 }
		 hp.getCartbtn().click();
		 Thread.sleep(2000);
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.attributeContains(hp.getToolbartitle(), "text","Cart" ));
			
		 String	lastpname= hp.getProductname2().getText();
	    Assert.assertEquals(lastpname, "Jordan 6 Rings");
		 
	     driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
			driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
			Thread.sleep(1000);
			
			Set<String> contexts = driver.getContextHandles();
			for(String cname:contexts) {
				System.out.println(cname);
			}
			Thread.sleep(2000);

			driver.context("WEBVIEW_com.androidsample.generalstore");
			driver.findElement(By.name("q")).sendKeys("java");
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			driver.navigate().back();
			//driver.pressKey(new KeyEvent(AndroidKey.BACK));
			driver.context("NATIVE_APP");
		 
		 
		 
	}


}
