package com.javaseleniumtemplate.tests;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.SearchPage;
import org.junit.Assert;
import org.junit.Test;

public class SearchTestes extends TestBase {

    //Objects
    LoginPage loginPage;
    SearchPage searchPage;

    //Tests
    @Test
    public void preencherRelatorio() {

        //Objects instances
        loginPage  = new LoginPage();
        searchPage = new SearchPage();

        //Parameteres
        String usuario = "jovani.custodio";
        String senha   = "TestesBase2";

        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();
        searchPage.acessarRelatorio();


    }
}
