package br.com.application.name.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomacaoHome {
    public AutomacaoHome(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Formulário')]")
    private WebElement btn_formulario;

    @FindBy(xpath = "//a[contains(text(),'Criar Usuários')]")
    private WebElement btn_criarconta;

    public WebElement getBtn_formulario() {
        return btn_formulario;
    }

    public WebElement getBtn_criarconta() {
        return btn_criarconta;
    }
}
