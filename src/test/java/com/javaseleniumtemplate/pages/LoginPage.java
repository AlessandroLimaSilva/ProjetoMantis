package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
    //Mapping

    private By usernameField = By.xpath("//*[@id='username']");

    private By senhaField = By.xpath("//input[@id='password']");

    private By entrarButton = By.xpath("//input[@value='Entrar']");

    public void preencherUsuario(String usuario){ sendKeys(usernameField, usuario);}

    public void clicarEmEntrar(){ click(entrarButton);}

    public void preencherSenha(String senha){ sendKeys(senhaField, senha);}

    public void limparUsernameField()
    {
        clear(usernameField);
    }

    public void limparSenhaField(){ clear(senhaField);}
}
