package br.com.application.name.web.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.web.funcionalidade.interfaces.MenuHome;
import br.com.application.name.web.funcionalidade.enums.OpcaoMenuImpl;
import br.com.application.name.web.pages.MapeamentoETrabalhandoComMenus;

/***
 * @author marcos.barbosa
 */

public class HomeFuncionalidade extends BaseTest {

    private MapeamentoETrabalhandoComMenus home;

    public HomeFuncionalidade(){
        this.home = new MapeamentoETrabalhandoComMenus(webDriver);
    }



    public void selecionaMenuTelaInicial(String aba){
        MenuHome opcaoCard = OpcaoMenuImpl.valueOf(aba.replace(" ", "_").toUpperCase());
        addEvidenciaWeb("Menu " + '"' + aba + '"' + " selecionado com sucesso");
        opcaoCard.getElement(home).click();

    }


}
