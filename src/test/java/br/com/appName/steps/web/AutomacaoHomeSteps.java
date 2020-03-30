package br.com.appName.steps.web;

import br.com.application.name.web.funcionalidade.AutomacaoHomeFuncionalidade;
import br.com.application.name.web.funcionalidade.CadastroWebFuncionalidade;
import br.com.application.name.web.pages.AutomacaoHome;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import org.openqa.selenium.WebDriver;

public class AutomacaoHomeSteps {
    private AutomacaoHomeFuncionalidade automacaoHomeFuncionalidade;

    public AutomacaoHomeSteps() {
        this.automacaoHomeFuncionalidade = new AutomacaoHomeFuncionalidade();
    }

    @Dado("^que entro na pagina de criação de usuário$")
    public void queEntroNaPaginaDeCriaçãoDeUsuário() {
        this.automacaoHomeFuncionalidade.acessarpaginacriarusuario();
    }
}
