package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
    //Mapping
    @FindBy(xpath = "//input[@id='username']")
    private By usernameField;
    @FindBy(xpath = "//input[@id='password']")
    private By senhaField;
    @FindBy(xpath = "//input[@value='Entrar']")
    private By entrarButton;

    public void preencherUsuario(String usuario){ sendKeys(usernameField, usuario);}

    public void clicarEmEntrar(){ click(entrarButton);}

    public void preencherSenha(String senha){ sendKeys(senhaField, senha);}

    public void limparUsernameField()
    {
        clear(usernameField);
    }

    public void limparSenhaField(){ clear(senhaField);}
}
