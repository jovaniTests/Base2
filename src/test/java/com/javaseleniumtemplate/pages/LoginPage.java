package com.javaseleniumtemplate.pages;
import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {

    //Mapping
    By usernameField       = By.xpath    ("/html/body/div[3]/form/table/tbody/tr[2]/td[2]/input");
    By passwordField       = By.xpath    ("/html/body/div[3]/form/table/tbody/tr[3]/td[2]/input");
    By loginButton         = By.xpath    ("/html/body/div[3]/form/table/tbody/tr[6]/td/input");
    By cookieButton        = By.xpath    ("//*[@aria-label='dismiss cookie message']");
    By errorMessageLabel   = By.xpath    ("/html/body/div[2]/font");
    By correctMessageLabel = By.xpath    ("/html/body/table[1]/tbody/tr/td[1]/span[1]");

    //Actions
    public void preenhcerUsuario(String usuario){
        sendKeys(usernameField, usuario);
    }

    public void preencherSenha(String senha){
        sendKeys(passwordField, senha);
    }

    public void clicarEmLogin(){
        click(loginButton);
    }

    public void clicarEmAceitarCookies(){
        click(cookieButton);
    }

    public String retornaMensagemErroLogin(){
        return getText(errorMessageLabel);
    }

    public void retornaMensagemSucessoLogin(){
     String loginEfetuado =  getText(correctMessageLabel);
     System.out.println("Usuário logado:" + " " + loginEfetuado);
    }


}
