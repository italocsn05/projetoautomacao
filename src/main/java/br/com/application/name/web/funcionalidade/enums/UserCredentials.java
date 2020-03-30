package br.com.application.name.web.funcionalidade.enums;

import br.com.application.name.web.funcionalidade.interfaces.Credentials;

public enum UserCredentials implements Credentials {

    USUARIO_TESTE("teste"){
        @Override
        public String user() {
            return "teste@inicial.com.br";
        }

        @Override
        public String password() {
            return "teste123";
        }
    }
    ;

    UserCredentials(String value) {
    }

    @Override
    public String user() {
        return null;
    }

    @Override
    public String password() {
        return null;
    }
}
