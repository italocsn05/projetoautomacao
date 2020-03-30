package br.com.application.name.web.funcionalidade.interfaces;

import br.com.application.name.web.pages.MapeamentoETrabalhandoComMenus;
import org.openqa.selenium.WebElement;

public interface MenuHome {

    public WebElement getElement(MapeamentoETrabalhandoComMenus menuHome);

    public String getValue();
}
