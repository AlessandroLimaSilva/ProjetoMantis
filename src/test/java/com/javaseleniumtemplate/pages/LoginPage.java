package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {
    //Mapping
    By usernameField = By.xpath("//input[@id='username']");
    By senhaField = By.xpath("//input[@id='password']");
    By entrarButton = By.xpath("//input[@value='Entrar']");
    By mensagemErroTextArea = By.xpath("/html/body/div[2]/font");


    public void preencherUsuario(String usuario){ sendKeys(usernameField, usuario);}

    public void clicarEmEntrar(){ click(entrarButton);}

    public void preencherSenha(String senha){ sendKeys(senhaField, senha);}


    public String retornaNomeUsuarioLabel(){
        return getText(mensagemErroTextArea);
    }
}
