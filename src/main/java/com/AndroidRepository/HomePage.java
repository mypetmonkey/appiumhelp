package com.AndroidRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
AndroidDriver driver;
	
	public HomePage(AndroidDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="android:id/text1")
	private WebElement countrydrop;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Austria\"]")
	private WebElement choosecountry;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement namefield;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
	private WebElement fgender;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private WebElement shopnowbtn;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/productName")
	private List<WebElement> productname;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/productName")
	private WebElement productname2;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/productAddCart")
	private List<WebElement> productaddcart;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
	private WebElement cartbtn;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/toolbar_title")
	private WebElement toolbartitle;

	public WebElement getCountrydrop() {
		return countrydrop;
	}

	public WebElement getChoosecountry() {
		return choosecountry;
	}

	public WebElement getNamefield() {
		return namefield;
	}

	public WebElement getFgender() {
		return fgender;
	}

	public WebElement getShopnowbtn() {
		return shopnowbtn;
	}

	public List<WebElement> getProductname() {
		return productname;
	}
	

	public WebElement getProductname2() {
		return productname2;
	}

	public List<WebElement> getProductaddcart() {
		return productaddcart;
	}

	public WebElement getCartbtn() {
		return cartbtn;
	}

	public WebElement getToolbartitle() {
		return toolbartitle;
	}
	
    	
	


}
