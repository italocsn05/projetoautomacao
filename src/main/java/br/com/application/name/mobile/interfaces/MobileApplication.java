package br.com.application.name.mobile.interfaces;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

/**
 * 
 * @author Filipe Mapelli Siqueira
 * @since 2018-02-08
 *
 */
public interface MobileApplication {
	
	public AndroidDriver<WebElement> getDriver();

	public AndroidDriver<WebElement> getDriverByApp();
	//public AppiumDriver<MobileElement> getDriver();

}
