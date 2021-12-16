package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.MyViewPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;
    MyViewPage myViewPage;

    //Tests
    @Test
    public void realizarLoginInformandoNomeESenhaValidosComSucesso() throws InterruptedException {
        //Objects instances
        loginPage = new LoginPage();
        myViewPage = new MyViewPage();
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
        Assert.assertEquals(myViewPage.retornaNomeUsuarioLabel(),nome);
    }

}
