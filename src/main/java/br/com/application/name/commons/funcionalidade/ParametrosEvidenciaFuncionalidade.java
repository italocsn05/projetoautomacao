package br.com.application.name.commons.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.mobile.funcionalidade.LoginMobileFuncionalidade;
import cucumber.api.DataTable;

import java.util.Map;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public class ParametrosEvidenciaFuncionalidade extends BaseTest {

	private LoginMobileFuncionalidade login;

	public ParametrosEvidenciaFuncionalidade() {
		this.login = new LoginMobileFuncionalidade();
	}

	public void executandoTeste(DataTable params) {

		login.initializeEvidence();

		for (Map<String, String> map : params.asMaps(String.class, String.class)) {
			login.setCtNumber(map.get("Numero do CT"));
			login.setCtName("CT - " + map.get("Numero do CT") + " " + map.get("Nome do CT"));
			login.setTester(map.get("Nome do executor"));
			login.setCiclo(map.get("Sprint"));
		}

	}

}
