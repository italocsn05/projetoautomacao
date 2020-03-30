package br.com.appName.steps.web;

import br.com.application.name.web.funcionalidade.CadastroWebFuncionalidade;
import cucumber.api.java.pt.Dado;

public class CadastroWebSteps {

    private CadastroWebFuncionalidade cadastroWebFuncionalidade;

    public CadastroWebSteps(){
        this.cadastroWebFuncionalidade = new CadastroWebFuncionalidade();
    }

    @Dado("^preencho os dados validos de cadastro$")
    public void preenchoDadosValidosCadastro() {
        this.cadastroWebFuncionalidade.preencheFormulario();
    }
}
