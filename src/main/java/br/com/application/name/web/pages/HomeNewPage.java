package br.com.application.name.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeNewPage {

    public HomeNewPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }


    @FindBy(xpath = "//a[@class='collapsible-header ']")
    private WebElement linkFormularios;

    @FindBy(xpath = "//a[@href='/users/new']")
    private WebElement linkCriarUsuarios;


    public WebElement getLinkFormularios() {
        return linkFormularios;
    }

    public WebElement getLinkCriarUsuarios() {
        return linkCriarUsuarios;
    }
}
