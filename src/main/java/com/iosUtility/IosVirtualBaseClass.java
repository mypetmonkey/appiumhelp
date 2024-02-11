package com.iosUtility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class IosVirtualBaseClass {
	
	public IOSDriver driver;
	public AppiumDriverLocalService service;
	public XCUITestOptions options;
	
	
	@BeforeClass
	public void congigureIos() throws MalformedURLException {
	service=new AppiumServiceBuilder().withAppiumJS(new File(""))
			.withIPAddress("127.0.0.7").usingPort(4723).build();
	service.start();
	
	options=new XCUITestOptions();
	options.setDeviceName("iphone 14 pro");
	options.setApp("path of App");
	options.setPlatformVersion("15.5");
	//options.setWdaLunchTimeOuts(Duration.ofSeconds(20));
	
	driver=new IOSDriver(new URL("http://127.0.0.1:4723"), options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		
	}

	
	@AfterClass
	public void tearDown() {
		driver.quit();
		service.stop();
		
	}
}
