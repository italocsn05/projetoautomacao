package br.com.application.name.mobile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginMobilePage {

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Mais opções']")
	WebElement maisOpcoes;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Change Server']")
	WebElement changeServer;

	@AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Sandbox\nhttps://test.salesforce.com']")
	WebElement sandBox;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'sf__apply_button')]")
	WebElement buttonAply;

	@AndroidFindBy(xpath = "//android.view.View[@text='Senha']/following::android.widget.EditText")
	WebElement boxSenhaCD;

	@AndroidFindBy(xpath = "//android.view.View[@text='Senha']/following::android.widget.EditText")
	WebElement boxSenha;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Faça login no Sandbox\"]")
	WebElement buttonLogarCD;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'Login')]")
	WebElement buttonLogar;

	@AndroidFindBy(xpath = "//android.view.View[@text='Nome do usuário']/following::android.widget.EditText")
	WebElement boxLoginCD;

	@AndroidFindBy(xpath = "//android.view.View[@text='Nome do usuário']/following::android.widget.EditText")
	WebElement boxLogin;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Permitir\"]")
	WebElement buttonPermitirCD;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'oaapprove')]")
	WebElement buttonPermitir;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'ALLOW')]")
	WebElement buttonAllow;

	@AndroidFindBy(id = "br.com.userede.cockpit:id/tv_nick_name")
	WebElement buttonMenu;
	
	@AndroidFindBy(id = "android:id/action_bar_title")
	WebElement xpathTitleCredenciamento;

	String xpathbuttonMenu = "//*[@content-desc=\"Open navigation drawer\"]";

	String xpathLoginCD = "//android.widget.Button[@content-desc=\"Faça login no Sandbox\"]";

	String xpathLogin = "//android.view.View[@text='Nome do usuário']/following::android.widget.EditText";

	public LoginMobilePage(WebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public String getXpathButtonMenu() {
		return xpathbuttonMenu;
	}

	public WebElement getMaisOpcoes() {
		return maisOpcoes;
	}

	public WebElement getChangeServer() {
		return changeServer;
	}

	public WebElement getSandBox() {
		return sandBox;
	}

	public WebElement getButtonAply() {
		return buttonAply;
	}

	public WebElement getBoxLogin() {
		return boxLogin;
	}

	public WebElement getBoxSenha() {
		return boxSenha;
	}

	public WebElement getButtonLogar() {
		return buttonLogar;
	}

	public WebElement getButtonPermitir() {
		return buttonPermitir;
	}

	public WebElement getButtonAllow() {
		return buttonAllow;
	}

	public WebElement getButtonMenu() {
		return buttonMenu;
	}

	public WebElement getBoxLoginCD() {
		return boxLoginCD;
	}

	public WebElement getBoxSenhaCD() {
		return boxSenhaCD;
	}

	public WebElement getButtonLogarCD() {
		return buttonLogarCD;
	}

	public WebElement getButtonPermitirCD() {
		return buttonPermitirCD;
	}
	
	public WebElement getXpathTitleCredenciamento() {
		return xpathTitleCredenciamento;
	}

	public String getXpathLoginCD() {
		return xpathLoginCD;
	}

	public String getXpathLogin() {
		return xpathLogin;
	}
}
