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
        loginPage  = new LoginPage();
        searchPage = new SearchPage();

        //Parameteres
        String usuario       = "jovani.custodio";
        String senha         = "TestesBase2";
        String loginEfetuado =  "jovani";


        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();
        loginPage.retornaMensagemSucessoLogin();
        searchPage.validarAcesso();

        Assert.assertTrue(searchPage.validarAcesso().contains(loginEfetuado));

    }

    @Test
    public void efetuarLoginUsuarioInvalido() {

        //Objects instances
        loginPage = new LoginPage();

        //Parameteres
        String usuario              = "jovani.custodio";
        String senha                = "senhaInvalida";
        String mensagemErroEsperada = "password you entered is incorrec";

        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        Assert.assertTrue(loginPage.retornaMensagemErroLogin().contains(mensagemErroEsperada));

    }

    @Test
    public void efetuarLoginSenhaInvalida() {

        //Objects instances
        loginPage = new LoginPage();

        //Parameteres
        String usuario              = "usuarioInvalido";
        String senha                = "TestesBase2";
        String mensagemErroEsperada = "password you entered is incorrec";

        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        Assert.assertTrue(loginPage.retornaMensagemErroLogin().contains(mensagemErroEsperada));

    }
}
