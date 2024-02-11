package com.androidUtility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class VirtualDeviceBaseClass {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	public UiAutomator2Options options;
	
	
	@BeforeClass
	public void configureAppium() throws MalformedURLException {
		service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\LENOVO\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		
		service.start();
		
		options=new UiAutomator2Options();
		options.setDeviceName("RajuPhone");
		options.setApp("C:\\Users\\LENOVO\\eclipse-workspace\\AppiumRealAndVirtual\\androidresource\\ApiDemos-debug.apk");
	    //options.setApp("C:\\Users\\LENOVO\\eclipse-workspace\\AppiumRealAndVirtual\\androidresource\\General-Store.apk");
		options.setChromedriverExecutable("C:\\Users\\LENOVO\\eclipse-workspace\\AppiumRealAndVirtual\\androidresource\\chromedriver.exe");
	    driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    		
	    
	
	}
	
    @AfterClass
    public void tearDown() {
    	driver.quit();
    	service.stop();
    }


}
