package br.com.application.name.mobile.bean.enums;

import java.io.IOException;
import java.util.Scanner;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.application.name.mobile.interfaces.MobileApplication;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobilePlatform;

/**
 * 
 * @author Filipe Mapelli Siqueira
 * @since 2018-02-08
 *
 */
public enum App implements MobileApplication {

	COCKPIT {

		@Override
		public AndroidDriver<WebElement> getDriver() {
			return getDriver("br.com.mobile.app", "MainActivity_");
		}

	},

	EMULATOR {

		@Override
		public AndroidDriver<WebElement> getDriver() {
			return getDriver("", "MainActivity_");
		}

	},

	APP {

		@Override
		public AndroidDriver<WebElement> getDriver() {
			return getDriverByApp();
		}

	}
	;

	private AndroidDriver<WebElement> driver;

	/**
	 * Retorna {@code AndroidDriver} para o aplicativo.
	 * 
	 * @param appPackage
	 * @return {@link AndroidDriver}
	 */
	public AndroidDriver<WebElement> getDriver(String appPackage, String appActivity) {

		try {
			// if (driver == null) {
			driver = new AndroidDriver<WebElement>(getCapabilities(appPackage, appActivity));
			// }
		} catch (IOException e) {
			e.printStackTrace();
		}
		return driver;
	}

	public AndroidDriver<WebElement> getDriverByApp() {

		try {
			// if (driver == null) {
			driver = new AndroidDriver<WebElement>(getCapabilitiesByApp());
			// }
		} catch (IOException e) {
			e.printStackTrace();
		}
		return driver;
	}

	/**
	 * Retorna {@code DesiredCapabilities}
	 * 
	 * @param appPackagee
	 * @return {@link DesiredCapabilities}
	 * @throws IOException
	 */
	private DesiredCapabilities getCapabilities(String appPackage, String appActivity) throws IOException {

		Scanner scanner = new Scanner(Runtime.getRuntime()
				.exec(new String[] { "/bin/bash", "-l", "-c", "adb get-serialno" }).getInputStream());
		String deviceSerialNumver = (scanner != null && scanner.hasNext()) ? scanner.next() : "";
		scanner.close();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Galaxy");
		capabilities.setCapability("platformName", MobilePlatform.ANDROID);
		capabilities.setCapability("device", "Android");
		capabilities.setCapability("udid", deviceSerialNumver);
		capabilities.setCapability("appPackage", appPackage);
		capabilities.setCapability("appActivity", appActivity);
		capabilities.setCapability("autoGrantPermissions", true);
		capabilities.setCapability("newCommandTimeout", 120);
//		capabilities.setCapability("automationName", "uiautomator2");
		return capabilities;

	}


	private DesiredCapabilities getCapabilitiesByApp() throws IOException {

		Scanner scanner = new Scanner(Runtime.getRuntime()
				.exec(new String[] { "/bin/bash", "-l", "-c", "adb get-serialno" }).getInputStream());
		String deviceSerialNumver = (scanner != null && scanner.hasNext()) ? scanner.next() : "";
		scanner.close();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Galaxy");
		capabilities.setCapability("platformName", MobilePlatform.ANDROID);
		capabilities.setCapability("device", "Android");
		capabilities.setCapability("udid", deviceSerialNumver);
		capabilities.setCapability("app","/Users/marcosBarbosa/Documents/TrianguloApp.apk");
		capabilities.setCapability("autoGrantPermissions", true);
		capabilities.setCapability("newCommandTimeout", 120);
		capabilities.setCapability("automationName", "uiautomator2");
		return capabilities;

	}

}
