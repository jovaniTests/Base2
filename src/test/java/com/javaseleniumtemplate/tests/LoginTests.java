package com.javaseleniumtemplate.tests;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.SearchPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;
    SearchPage searchPage;
    //Tests
    @Test
    public void efetuarLoginValido() {

        //Objects instances
        loginPage = new LoginPage();
        searchPage = new SearchPage();

        //Parameteres
        String usuario                 = "jovani.custodio";
        String senha                   = "TestesBase2";
        String loginEfetuado           =  "jovani";


        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();
        loginPage.retornaMensagemSucessoLogin();
        searchPage.validarAcesso();

        Assert.assertTrue(searchPage.validarAcesso().contains(loginEfetuado));

    }

    @Test
    public void efetuarLoginEmailInvalido() {

        //Objects instances
        loginPage = new LoginPage();

        //Parameteres
        String usuario = "jovani";
        String senha = "TestesBase2";
        String mensagemErroEsperada = "E-mail ou senha inv";

        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        //Assert.assertTrue(loginPage.retornaMensagemErroLogin().contains(mensagemErroEsperada));
        //Assert.assertEquals("Jovani.custodio",loginEfetuado);
        //Assert.assertTrue(loginPage.retornaMensagemErroLogin().contains(mensagemErroEsperada));
        //Assert.assertTrue(loginPage.retornaMensagemSucessoLogin().contains("jovani"));

    }
}
