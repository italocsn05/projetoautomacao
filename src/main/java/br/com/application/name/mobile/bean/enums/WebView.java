package br.com.application.name.mobile.bean.enums;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.application.name.mobile.interfaces.WebMobileApplication;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public enum WebView implements WebMobileApplication {

	
	WEBVIEW {

		@Override
		public AndroidDriver<WebElement> getDriver() {
			// TODO Auto-generated method stub
			return getDriver("chrome");
		}

	};
	
	private AndroidDriver<WebElement> webViewDriver;

	/**
	 * Retorna {@code AndroidDriver} para o aplicativo.
	 * 
	 * @param appPackage
	 * @return {@link AndroidDriver}
	 */
	public AndroidDriver<WebElement> getDriver(String browser) {
		
		try {
			Thread.sleep(100);
			webViewDriver = new AndroidDriver<WebElement>(getCapabilities(browser));
			webViewDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		return webViewDriver;
	}

	/**
	 * Retorna {@code DesiredCapabilities}
	 * 
	 * @param appPackage
	 * @return {@link DesiredCapabilities}
	 * @throws IOException
	 */
	private DesiredCapabilities getCapabilities(String browser) throws IOException {

		Scanner scanner = null;
		scanner = new Scanner(Runtime.getRuntime().exec(new String[] { "/bin/bash", "-l", "-c", "adb get-serialno" })
				.getInputStream());
		String deviceSerialNumver = (scanner != null && scanner.hasNext()) ? scanner.next() : "";
		scanner.close();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Galaxy");
		capabilities.setCapability("platformName", MobilePlatform.ANDROID);
		capabilities.setCapability("device", "Android");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, browser);
		capabilities.setCapability("udid", deviceSerialNumver);
		capabilities.setCapability("appActivity",  "MainActivity_");
		capabilities.setCapability("appPackage", "com.android.settings");

		return capabilities;

	}

}
