package br.com.application.name.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MapeamentoETrabalhandoComMenus {

    @FindBy(xpath = "//*[@class='slds-context-bar__label-action dndItem']//*[text()='Início']")
    private WebElement menuInicio;

    @FindBy(xpath = "//*[@class='slds-context-bar__label-action dndItem']//*[text()='Contas']")
    private WebElement menuContas;

    @FindBy(xpath = "//*[@class='slds-context-bar__label-action dndItem']//*[text()='Mapa de Visitas']")
    private WebElement menuMapaVisitas;

    @FindBy(xpath = "//*[@class='slds-context-bar__label-action dndItem']//*[text()='Painéis']")
    private WebElement menuPaineis;

    @FindBy(xpath = "//*[@class='slds-context-bar__label-action dndItem']//*[text()='Relatórios']")
    private WebElement menuRelatorios;

    @FindBy(xpath = "//button[@class='slds-button slds-button_brand slds-m-top_small']")
    private WebElement botaoBuscar;

    public MapeamentoETrabalhandoComMenus(WebDriver driver) { PageFactory.initElements(driver, this); }

    public WebElement getMenuInicio() {
        return menuInicio;
    }

    public WebElement getMenuContas() {
        return menuContas;
    }

    public WebElement getMenuMapaVisitas() {
        return menuMapaVisitas;
    }

    public WebElement getMenuPaineis() {
        return menuPaineis;
    }

    public WebElement getMenuRelatorios() {
        return menuRelatorios;
    }

    public WebElement getBotaoBuscar() {
        return botaoBuscar;
    }

}
