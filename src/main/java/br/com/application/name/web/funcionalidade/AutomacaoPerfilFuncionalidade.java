package br.com.application.name.web.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.web.pages.AutomacaoPerfil;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AutomacaoPerfilFuncionalidade extends BaseTest {
    private AutomacaoPerfil automacaoPerfil;
    private String sucesso;
    public AutomacaoPerfilFuncionalidade() {
        this.automacaoPerfil = new AutomacaoPerfil(webDriver);
    }

    public String validasucesso(){
        wait.until(ExpectedConditions.visibilityOf(this.automacaoPerfil.getNotice()));
        return this.automacaoPerfil.getNotice().getText();
    }
}
