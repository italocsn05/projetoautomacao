package br.com.application.name.web.funcionalidade.enums;

import br.com.application.name.web.funcionalidade.interfaces.MenuHome;
import br.com.application.name.web.pages.MapeamentoETrabalhandoComMenus;
import org.openqa.selenium.WebElement;

public enum OpcaoMenuImpl implements MenuHome {

    INICIO("inicio") {

        @Override
        public WebElement getElement(MapeamentoETrabalhandoComMenus menuLateralCard) {
            return menuLateralCard.getMenuInicio();
        }

    },

    CONTAS("contas") {

        @Override
        public WebElement getElement(MapeamentoETrabalhandoComMenus menuLateralCard) {
            return menuLateralCard.getMenuContas();
        }

    },

    MAPA_DE_VISITAS("mapa de visitas") {
        @Override
        public WebElement getElement(MapeamentoETrabalhandoComMenus menuLateralCard) {
            return menuLateralCard.getMenuMapaVisitas();
        }

    },

    PAINEIS("paineis") {

        @Override
        public WebElement getElement(MapeamentoETrabalhandoComMenus menuLateralCard) {
            return menuLateralCard.getMenuPaineis();
        }

    },

    RELATORIOS("relatorios") {

        @Override
        public WebElement getElement(MapeamentoETrabalhandoComMenus menuLateralCard) {
            return menuLateralCard.getMenuRelatorios();
        }

    },
    ;

    private String value;

    private OpcaoMenuImpl(String value) {
        this.value = value;
    }

    @Override
    public WebElement getElement(MapeamentoETrabalhandoComMenus menuHomeLightining) {
        return null;
    }

    @Override
    public String getValue() {
        return null;
    }
}
