package br.com.appName.steps.web;

import br.com.application.name.web.funcionalidade.DadosWebFuncionalidade;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;

public class DadosWebSteps {

    private DadosWebFuncionalidade dadosWebFuncionalidade;

    public DadosWebSteps(){
        this.dadosWebFuncionalidade = new DadosWebFuncionalidade();
    }

    @Entao("^visualizo a mensagem \"([^\"]*)\"$")
    public void visualizoAMensagem(String mensagem) {
        Assert.assertEquals("Usuário Criado com sucesso", this.dadosWebFuncionalidade.retornaMensagem());
    }
}
