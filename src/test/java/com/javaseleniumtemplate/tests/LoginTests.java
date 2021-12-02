package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.MainViewPage;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.text.Element;

public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;
    MainViewPage mainViewPage;

    //Tests
    @Test
    public void realizarLoginInformandoNomeeSenhaValidosComSucesso(){
        //Objects instances
        loginPage = new LoginPage();
        mainViewPage = new MainViewPage();
        String nome = "";
        String senha = "";
        loginPage.wait();
        loginPage.preencherUsuario(nome);
        loginPage.clicarEmEntrar();
        loginPage.preencherSenha(senha);
        loginPage.clicarEmEntrar();


    }


}
