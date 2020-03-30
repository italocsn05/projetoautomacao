package br.com.application.name.web.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.web.pages.CadastroWebPage;
import br.com.application.name.web.pages.DadosWebPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DadosWebFuncionalidade extends BaseTest {

    private DadosWebPage dadosWebPage;

    public DadosWebFuncionalidade(){
        this.dadosWebPage = new DadosWebPage(webDriver);
    }

    public String retornaMensagem(){
        wait.until(ExpectedConditions.visibilityOf(this.dadosWebPage.getLblMensagem()));
        return this.dadosWebPage.getLblMensagem().getText();
    }
}
