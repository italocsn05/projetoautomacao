package br.com.appName.steps.web;

import br.com.application.name.commons.funcionalidade.ParametrosEvidenciaFuncionalidade;
import br.com.application.name.mobile.funcionalidade.HomeFuncionalidade;
import br.com.application.name.web.funcionalidade.HomeNewFuncionalidade;
import br.com.application.name.web.funcionalidade.LoginFuncionalidade;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;

public class InitTestStepWeb {

    private ParametrosEvidenciaFuncionalidade realizandoTesteFuncionalidade;
    private HomeNewFuncionalidade homeNewFuncionalidade;

    public InitTestStepWeb() {
        this.realizandoTesteFuncionalidade = new ParametrosEvidenciaFuncionalidade();
        this.homeNewFuncionalidade =new HomeNewFuncionalidade();

    }

    @E("^estou realizando o teste$")
    public void estouRealizandoOTeste(DataTable params) {

        System.out.println("Definindo os parametros da evidencia . . .");
        this.realizandoTesteFuncionalidade.executandoTeste(params);
        System.out.println("Parâmetros de evidência ok");
    }

    @Dado("^que acesso a pagina de criação do usuário$")
    public void queAcessoAPaginaDoSite() {
        this.homeNewFuncionalidade.acessaCriarUsuarios();
    }
}
