package br.com.application.name.web.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.web.pages.HomeNewPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeNewFuncionalidade extends BaseTest {

    private HomeNewPage homeNewPage;

    public HomeNewFuncionalidade() {
        this.homeNewPage = new HomeNewPage(webDriver);
    }

    public void acessaCriarUsuarios(){
        this.homeNewPage.getLinkFormularios().click();
        wait.until(ExpectedConditions.elementToBeClickable(this.homeNewPage.getLinkCriarUsuarios()));
        this.homeNewPage.getLinkCriarUsuarios().click();
    }

}
