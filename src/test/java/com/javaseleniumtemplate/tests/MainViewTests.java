package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.MyViewPage;
import org.testng.annotations.Test;

public class MainViewTests extends TestBase {

    //Objects
    LoginFlows loginFlows;
    MyViewPage myViewPage;

    @Test
    public void acessarFuncionalidadeMinhaVisaoAtravesDoBotaoMinhaVisaoLateralComSucesso()
    {
        String usuario = "";
        String senha = "";
        loginFlows.realizarLogin(usuario,senha);
        myViewPage.clicarMinhaVisaoBarraLateralButton();
    }
}
