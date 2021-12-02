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
    public void realizarLoginInformandoNomeESenhaValidosComSucesso() throws InterruptedException {
        //Objects instances
        loginPage = new LoginPage();
        mainViewPage = new MainViewPage();
        String nome = "administrator";
        String senha = "root";
        Thread.sleep(3000);
        Thread.sleep(3000);
        loginPage.limparUsernameField();
        loginPage.preencherUsuario(nome);
        loginPage.clicarEmEntrar();
        loginPage.limparSenhaField();
        loginPage.preencherSenha(senha);
        loginPage.clicarEmEntrar();
        Assert.assertEquals(mainViewPage.retornaNomeUsuarioLabel(),nome);
    }

}
