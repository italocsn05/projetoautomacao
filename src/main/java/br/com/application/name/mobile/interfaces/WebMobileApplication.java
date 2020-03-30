package br.com.application.name.mobile.interfaces;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public interface WebMobileApplication {
	
	public AndroidDriver<WebElement> getDriver();

}
