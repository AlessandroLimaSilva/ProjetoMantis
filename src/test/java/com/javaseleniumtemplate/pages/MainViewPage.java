package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainViewPage extends PageBase {

    private static By minhaVisaoBarraLateralButton = By.xpath("//span[text()=' Minha Visão ']");

    private static By verTarefasBarraLateralButton = By.xpath("//span[text()=' Ver Tarefas ']");

    private static By criarTarefasBarraLateralButton = By.xpath("//span[text()=' Criar Tarefa ']");

    private static By planejamentoBarraLateralButton = By.xpath("//span[text()=' Planejamento ']");

    private static By nomeUsuarioLabel = By.xpath("//span[@class='user-info']");

    private static By criarTarefaMenuSuperiorButton = By.xpath("//a[text()=' Criar Tarefa']");

    private static By buscarTarefaField = By.xpath("//input[@name='bug_id']");

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
