package br.com.application.name.web.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.commons.CredentialsUsers;
import br.com.application.name.commons.PropertiesManager;
import br.com.application.name.web.funcionalidade.enums.UserCredentials;
import br.com.application.name.web.pages.LoginPage;
import br.com.application.name.configuration.Web;

public class LoginFuncionalidade extends BaseTest {

	private LoginPage login;

	public LoginFuncionalidade(){
		PropertiesManager propertiesManager = new PropertiesManager();
		this.login = new LoginPage(webDriver);
	}

	public void loginAplicacao(String user) {
		if (webDriver != null)
			webDriver.quit();
		initializeWebApplication(Web.CHROME);
		webDriver.get(PropertiesManager.getPropertiesValue("URL_QA"));
		this.login = new LoginPage(webDriver);
		user = "USUARIO_"+user;
		login.getInputUser().sendKeys(UserCredentials.valueOf(user.replace(" ", "_").toUpperCase()).user());
		login.getInputPass().sendKeys(UserCredentials.valueOf(user.replace(" ", "_").toUpperCase()).password());
		addEvidenciaWeb("Usuario e senha inseridos.");
		login.getBtnLogin().click();

	}

	public String retornaMensagem(){
		addEvidenciaWeb("Mensagem de erro");
		return this.login.getMensagem().getText();

	}



}
