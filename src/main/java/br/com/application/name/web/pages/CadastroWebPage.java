package br.com.application.name.web.pages;

import br.com.application.name.configuration.Web;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroWebPage {


    public CadastroWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "user_name")
    private WebElement inputNome;

    @FindBy(id = "user_lastname")
    private WebElement inputSobrenome;

    @FindBy(id = "user_email")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@name='commit']")
    private WebElement btnCriar;


    public WebElement getInputNome() {
        return inputNome;
    }

    public WebElement getInputSobrenome() {
        return inputSobrenome;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getBtnCriar() {
        return btnCriar;
    }
}
