package br.com.application.name.web.pages;

import br.com.application.name.configuration.Web;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DadosWebPage {

    public DadosWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver,this);
    }

    @FindBy(id = "notice")
    private WebElement lblMensagem;

    public WebElement getLblMensagem() {
        return lblMensagem;
    }


}
