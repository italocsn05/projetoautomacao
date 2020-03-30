package br.com.application.name.mobile.funcionalidade;

import org.openqa.selenium.support.ui.ExpectedConditions;

import br.com.application.name.commons.AppiumRobot;
import br.com.application.name.commons.BaseTest;
import br.com.application.name.mobile.bean.enums.App;
import br.com.application.name.mobile.pages.LoginMobilePage;

public class LoginMobileFuncionalidade extends BaseTest {

	private LoginMobilePage login;

	public LoginMobileFuncionalidade() {
		this.login = new LoginMobilePage(driver);
	}


	public void loginCockpitSemHooks(String usuario) throws InterruptedException {

		if (this.inicializarDriver(usuario)) {
			wait.until(ExpectedConditions.visibilityOf(this.login.getBoxLogin()));
			this.inserirCredenciais(usuario);
			login.getButtonLogar().click();
			AppiumRobot.explicitWait(login.getButtonMenu());
			addEvidenciaMobile("App Acessado");
		}

	}

	public void inserirCredenciais(String usuario) {

		wait.until(ExpectedConditions.elementToBeClickable(this.login.getBoxLogin()));

		this.login = new LoginMobilePage(driver);
		do {
			wait.until(ExpectedConditions.elementToBeClickable(this.login.getBoxLogin()));
			login.getBoxLogin().clear();
			login.getBoxLogin().click();
			login.getBoxLogin().sendKeys(credentialsUsers.user(usuario));
			if (driver.isKeyboardShown())
				driver.hideKeyboard();
		} while (!login.getBoxLogin().getText().equals(credentialsUsers.user(usuario)));
		do {
			login.getBoxSenha().clear();
			login.getBoxSenha().click();
			login.getBoxSenha().sendKeys(credentialsUsers.password());
			if (driver.isKeyboardShown())
				driver.hideKeyboard();
		} while (login.getBoxSenha().getText().length() != credentialsUsers.password().length());
	}

	public boolean inicializarDriver(String usuario) throws InterruptedException {
		boolean loginNecessario = false;
		if (VariaveisStaticas.getNumeroResponsavel() == null
				|| !VariaveisStaticas.getNumeroResponsavel().equals(usuario)) {
			VariaveisStaticas.setNumeroResponsavel(usuario);
			initializeMobileApplication(App.COCKPIT, true);
			this.login = new LoginMobilePage(driver);
			loginNecessario = true;
		} else {
			AppiumRobot.backToTheElement(login.getXpathButtonMenu());
		}
		return loginNecessario;
	}

}