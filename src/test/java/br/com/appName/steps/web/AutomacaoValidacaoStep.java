package br.com.appName.steps.web;

import br.com.application.name.web.funcionalidade.AutomacaoPerfilFuncionalidade;
import br.com.application.name.web.pages.AutomacaoPerfil;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;

public class AutomacaoValidacaoStep {
    private AutomacaoPerfilFuncionalidade automacaoPerfilFuncionalidade;

    public AutomacaoValidacaoStep() {
        this.automacaoPerfilFuncionalidade = new AutomacaoPerfilFuncionalidade();
    }

    @Entao("^valido o teste com a mensagem \"([^\"]*)\"$")
    public void validoOTesteComAMensagem(String msg) throws Throwable {
        Assert.assertEquals("Usuário Criado com sucesso", this.automacaoPerfilFuncionalidade.validasucesso());
        throw new PendingException();
    }
}
