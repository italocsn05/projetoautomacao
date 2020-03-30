package br.com.application.name.web.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.web.pages.AutomacaoCriarUsuario;
import br.com.application.name.web.pages.AutomacaoPerfil;
import org.openqa.selenium.WebDriver;

public class AutomacaoCriarUsuarioFuncionalidade extends BaseTest {
    private AutomacaoCriarUsuario automacaoCriarUsuario;

    public AutomacaoCriarUsuarioFuncionalidade() {
        this.automacaoCriarUsuario = new AutomacaoCriarUsuario(webDriver);
    }

    public void preencherformulario(){
        this.automacaoCriarUsuario.getInput_username().sendKeys("Italo");
        this.automacaoCriarUsuario.getInput_userlastname().sendKeys("Cabral");
        this.automacaoCriarUsuario.getInput_user_email().sendKeys("italocsn05@gmail.com");
        this.automacaoCriarUsuario.getInput_user_adress().sendKeys("Franco da Rocha - São Paulo");
        this.automacaoCriarUsuario.getInput_user_university().sendKeys("Fatec Franco da Rocha - CPS");
        this.automacaoCriarUsuario.getInput_user_profile().sendKeys("Estágiario automação de testes");
        this.automacaoCriarUsuario.getInput_user_gender().sendKeys("Masculino");
        this.automacaoCriarUsuario.getInput_user_age().sendKeys("21");
        this.automacaoCriarUsuario.getBnt_commit().click();
    }
}
