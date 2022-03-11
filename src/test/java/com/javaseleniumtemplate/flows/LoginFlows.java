package com.javaseleniumtemplate.flows;

import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.SearchPage;

public class LoginFlows {
    //Objects and constructor
    LoginPage loginPage;
    SearchPage searchPage;

    public LoginFlows(){
        //Page and Steps Objects
        loginPage = new LoginPage();
        searchPage = new SearchPage();
    }

    //Flows
    public void efetuarLogin(String usuario, String senha){
        loginPage.clicarEmAceitarCookies();
        loginPage.preenhcerUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();
    }
}
