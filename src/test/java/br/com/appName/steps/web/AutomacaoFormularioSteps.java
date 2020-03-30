package br.com.appName.steps.web;

import br.com.application.name.web.funcionalidade.AutomacaoCriarUsuarioFuncionalidade;
import cucumber.api.java.pt.E;

public class AutomacaoFormularioSteps {
    private AutomacaoCriarUsuarioFuncionalidade automacaoCriarUsuarioFuncionalidade;
    public AutomacaoFormularioSteps() {
        this.automacaoCriarUsuarioFuncionalidade = new AutomacaoCriarUsuarioFuncionalidade();
    }

    @E("^preencho o formulário com dados válidos$")
    public void preenchoOFormulárioComDadosVálidos() {
        this.automacaoCriarUsuarioFuncionalidade.preencherformulario();
    }
}
