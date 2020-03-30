package br.com.application.name.mobile.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.mobile.bean.enums.App;
import br.com.application.name.mobile.pages.HomePage;
import br.com.application.name.web.pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeFuncionalidade extends BaseTest {

    private LoginPage loginPage;

    public HomeFuncionalidade() {
        this.loginPage = new LoginPage(webDriver);
    }

    public void realizaLogin(){
        initializeWebApplication(ChromeDriver::new);
    }
}
