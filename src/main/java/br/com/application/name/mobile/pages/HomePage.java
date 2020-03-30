package br.com.application.name.mobile.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@AndroidFindBy(id = "android:id/statusBarBackground")
	WebElement lado1;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


	public WebElement getLado1() {
		return lado1;
	}


}
