package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class SearchPage extends PageBase {


    //Mapping
    By usuarioAcesso = By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]");
    By emitirRelatorio = By.xpath("/html/body/table[2]/tbody/tr/td[1]/a[3]");



    //Actions
    public String validarAcesso() {
        return getText(usuarioAcesso);
    }

    public void acessarRelatorio() {
        click(emitirRelatorio);
    }


}

