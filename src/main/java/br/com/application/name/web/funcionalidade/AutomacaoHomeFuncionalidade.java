package br.com.application.name.web.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.web.pages.AutomacaoHome;
import br.com.application.name.web.pages.CadastroWebPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AutomacaoHomeFuncionalidade extends BaseTest {
    private AutomacaoHome automacaoHome;

    public AutomacaoHomeFuncionalidade() {
        this.automacaoHome = new AutomacaoHome(webDriver);
    }

    public void acessarpaginacriarusuario(){
        wait.until(ExpectedConditions.elementToBeClickable(this.automacaoHome.getBtn_formulario()));
        this.automacaoHome.getBtn_formulario().click();
        wait.until(ExpectedConditions.elementToBeClickable(this.automacaoHome.getBtn_criarconta()));
        this.automacaoHome.getBtn_criarconta().click();
    }
}
