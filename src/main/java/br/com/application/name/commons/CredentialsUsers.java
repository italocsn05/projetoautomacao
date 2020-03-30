package br.com.application.name.commons;

import br.com.application.name.mobile.interfaces.AccountCredentialsUsers;

/**
 * @author Tassio Lima
 * @since 2018-06-13
 */
public enum CredentialsUsers implements AccountCredentialsUsers {


    USER_MOBILE_QA {
        @Override
        public String user(String usuario) {

            return usuario + "@userede.com.br.qa";
        }

        @Override
        public String password() {

            return "_123Rede";
        }

    },

    USER_MOBILE_PREPROD {
        @Override
        public String user(String usuario) {

            return usuario + "@userede.com.br.qa";
        }

        @Override
        public String password() {
            return "_123Rede";
        }

    },

    USUARIO_315381 {
        @Override
        public String user(String usuario) {

            return "315381@userede.com.br.qa";
        }

        @Override
        public String password() {
            return "_123Rede";
        }

    },

    USUARIO_SAMI_GESTOR {
        @Override
        public String user(String usuario) {

            return "samigestor@userede.com.br.qa";
        }

        @Override
        public String password() {
            return "_1234rede";
        }

    },

    USUARIO_726097 {
        @Override
        public String user(String usuario) {

            return "726097@userede.com.br.preprod";
        }

        @Override
        public String password() {
            return "_123rede";
        }

    },

    USUARIO_314579 {
        @Override
        public String user(String usuario) {

            return "314579@userede.com.br.qa";
        }

        @Override
        public String password() {
            return "_123Rede";

        }

    },

    USER_WEB_QA {
        @Override
        public String user(String usuario) {

            return usuario + "@userede.com.br.qa";
        }

        @Override
        public String password() {
            return "_123rede";
        }

    },
    USER_WEB_PREPROD {
        @Override
        public String user(String usuario) {

            return usuario + "@userede.com.br.preprod";
        }

        @Override
        public String password() {
            return "_123rede";
        }

    },

    USUARIO_SAMIGESTOR {
        @Override
        public String user(String usuario) {

            return "samigestor@userede.com.br.qa";
        }

        @Override
        public String password() {
            return "_1234rede";
        }

    },

    USUARIO_GUILHERME_EXECUTIVO {
        @Override
        public String user(String usuario) {

            return "guilherme.executivo@userede.com.br.qa";
        }

        @Override
        public String password() {
            return "_123rede";
        }

    },

    USUARIO_312983 {
        @Override
        public String user(String usuario) {

            return "312983@userede.com.br.qa";
        }

        @Override
        public String password() {
            return "_12345Rede";
        }

    },
    //Executivo Digital
    USUARIO_315357 {
        @Override
        public String user(String usuario) {

            return "315357@userede.com.br.qa";
        }

        @Override
        public String password() {
            return "_123rede";
        }

    },
    //Executivo Gestor
    USUARIO_315270 {
        @Override
        public String user(String usuario) {

            return "315270@userede.com.br.preprod";
        }

        @Override
        public String password() {
            return "_123rede";
        }

    },
    //Executivo Presencial
    USUARIO_314579PREPROD {
        @Override
        public String user(String usuario) {

            return "314579@userede.com.br.preprod";
        }

        @Override
        public String password() {
            return "_123rede";
        }

    },


    ;


}
