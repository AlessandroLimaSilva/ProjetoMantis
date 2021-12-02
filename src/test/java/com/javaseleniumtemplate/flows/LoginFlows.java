package com.javaseleniumtemplate.flows;

import com.javaseleniumtemplate.pages.LoginPage;

public class LoginFlows {
    //Objects and constructor
    LoginPage loginPage;

    public LoginFlows(){
        loginPage = new LoginPage();
    }

    //Flows
    public void realizarLogin(String usuario, String senha){
        loginPage.preencherUsuario(usuario);
        loginPage.clicarEmEntrar();
        loginPage.preencherSenha(senha);
        loginPage.clicarEmEntrar();
    }
}
