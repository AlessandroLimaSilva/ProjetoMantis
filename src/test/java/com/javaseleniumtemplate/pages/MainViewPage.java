package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainViewPage extends PageBase {

    @FindBy(xpath = "//span[text()=' Minha Visão ']")
    private static By minhaVisaoBarraLateralButton;

    @FindBy(xpath = "//span[text()=' Ver Tarefas ']")
    private static By verTarefasBarraLateralButton;

    @FindBy(xpath = "//span[text()=' Criar Tarefa ']")
    private static By criarTarefasBarraLateralButton;

    @FindBy(xpath = "//span[text()=' Planejamento ']")
    private static By planejamentoBarraLateralButton;

    @FindBy(xpath = "//span[@class='user-info']")
    private static By nomeUsuarioLabel;

    @FindBy(xpath = "//a[text()=' Criar Tarefa']")
    private static By criarTarefaMenuSuperiorButton;

    @FindBy(xpath = "//input[@name='bug_id']")
    private static By buscarTarefaField;

    public void clicarMinhaVisaoBarraLateralButton()
    {
        click(minhaVisaoBarraLateralButton);
    }

    public void clicarVerTarefasBarraLateralButton()
    {
        click(verTarefasBarraLateralButton);
    }

    public void clicarCriarTarefasBarraLateralButton()
    {
        click(criarTarefasBarraLateralButton);
    }

    public void clicarPlanejamentoBarraLateralButton()
    {
        click(planejamentoBarraLateralButton);
    }

    public void clicarCriarTarefaMenuSuperiorButton()
    {
        click(criarTarefaMenuSuperiorButton);
    }

    public void preencherBuscarTarefaField(String busca)
    {
        //Enviar um enter para realizar a busca
        sendKeys(buscarTarefaField,busca);
    }

    public void limparBuscaTarefaField(){ clear(buscarTarefaField);}

    public String retornaNomeUsuarioLabel()
    {
        return getText(nomeUsuarioLabel);
    }

}
