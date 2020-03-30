package br.com.application.name.web.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	@FindBy(id = "email")
	private WebElement inputUser;
	
	@FindBy(id = "senha")
	private WebElement inputPass;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement buttonLogin;

	@FindBy(xpath = "//div[@class='alert alert-danger']")
	private WebElement mensagem;
	
	
	public LoginPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	

	// **********************getter and setters**********************//


	public WebElement getMensagem() {
		return mensagem;
	}

	public WebElement getInputUser() {
		return inputUser;
	}

	public WebElement getInputPass() {
		return inputPass;
	}

	public WebElement getBtnLogin() {
		return buttonLogin;
	}


}
