package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.MainViewPage;
import org.testng.annotations.Test;

public class MainViewTests extends TestBase {

    //Objects
    LoginFlows loginFlows;
    MainViewPage mainViewPage;

    @Test
    public void acessarFuncionalidadeMinhaVisaoAtravesDoBotaoMinhaVisaoLateralComSucesso()
    {
        String usuario = "";
        String senha = "";
        loginFlows.realizarLogin(usuario,senha);
        mainViewPage.clicarMinhaVisaoBarraLateralButton();
    }
}
