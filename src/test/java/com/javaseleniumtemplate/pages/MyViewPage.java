package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Falta pegar o menu todos os projetos


public class MyViewPage extends PageBase {

    private static final By minhaVisaoBarraLateralButton = By.xpath("//span[text()=' Minha Visão ']");

    private static final By verTarefasBarraLateralButton = By.xpath("//span[text()=' Ver Tarefas ']");

    private static final By criarTarefasBarraLateralButton = By.xpath("//span[text()=' Criar Tarefa ']");

    private static final By planejamentoBarraLateralButton = By.xpath("//span[text()=' Planejamento ']");

    private static final By nomeUsuarioLabel = By.xpath("(//a[@href='/account_page.php'])[2]");

    private static final By criarTarefaMenuSuperiorButton = By.xpath("//a[text()=' Criar Tarefa']");

    private static final By buscarTarefaField = By.xpath("//input[@name='bug_id']");

    private static final By atribuidosAMinNaoResolvidosLabel = By.xpath("//a[text()='Atribuídos a Mim (não resolvidos)']");

    private static final By naoAtribuidosLabel = By.xpath("//a[text()='Não Atribuídos']");

    private static final By relatadoPorMinLabel = By.xpath("//a[text()='Relatados por Mim']");

    private static final By resolvidosLabel= By.xpath("//a[text()='Resolvidos']");

    private static final By modificadosRecentementeTrintaDiasLabel = By.xpath("//a[text()='Modificados Recentemente (30 Dias)']");

    private static final By monitoradosPorMinLabel = By.xpath("//a[text()='Monitorados por Mim']");

    private static final By verTarefasAtribuidosAMinNaoResolvidosButton = By.xpath("(//a[@class='btn btn-primary btn-white btn-round btn-sm'])[1]");

    private static final By verTarefasNaoAtribuidosButton = By.xpath("(//a[@class='btn btn-primary btn-white btn-round btn-sm'])[2]");

    private static final By verTarefasRelatadoPorMinButton = By.xpath("(//a[@class='btn btn-primary btn-white btn-round btn-sm'])[3]");

    private static final By verTarefasResolvidosButton= By.xpath("(//a[@class='btn btn-primary btn-white btn-round btn-sm'])[4]");

    private static final By verTarefasModificadosRecentementeTrintaDiasButton = By.xpath("(//a[@class='btn btn-primary btn-white btn-round btn-sm'])[5]");

    private static final By verTarefasMonitoradosPorMinButton = By.xpath("(//a[@class='btn btn-primary btn-white btn-round btn-sm'])[6]");

    private static final By setaAtribuidosAMinNaoResolvidosLabel = By.xpath("//a[text()='Atribuídos a Mim (não resolvidos)']");

    private static final By setaNaoAtribuidosLabel = By.xpath("//a[text()='Não Atribuídos']");

    private static final By setaRelatadoPorMinLabel = By.xpath("//a[text()='Relatados por Mim']");

    private static final By setaResolvidosLabel= By.xpath("//a[text()='Resolvidos']");

    private static final By setaModificadosRecentementeTrintaDiasLabel = By.xpath("//a[text()='Modificados Recentemente (30 Dias)']");

    private static final By setaMonitoradosPorMinButton = By.xpath("//a[text()='Monitorados por Mim']");

    private static final By setaLinhaDoTempoButton = By.xpath("(//a[@data-action='collapse'])[7]");

    private static final By anteriorButton = By.xpath("//a[text()='Anterior']");

    private static final By nomeUsuarioMenuLabel = By.xpath("(//a[@href='/account_page.php'])[1]");

    private static final By convidarUsuarioButton = By.xpath("//a[text()=' Convidar Usuários']");

    private static final By rssMenuLabel = By.xpath("//a[text()=' RSS']");

    private static final By sairMenuButton = By.xpath("//a[text()=' Sair']");

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

    public void clicarNomeUsuarioLabel(){ click(nomeUsuarioLabel); }

    public void clicarNomeUsuarioMenuLabel(){ click(nomeUsuarioMenuLabel); }

    public void clicarAtribuidosAMinNaoResolvidosLabel (){ click(atribuidosAMinNaoResolvidosLabel); }

    public void clicarNaoAtribuidosLabel (){ click(naoAtribuidosLabel); }

    public void clicarRelatadoPorMinLabel (){ click(relatadoPorMinLabel); }

    public void clicarResolvidosLabel (){ click(resolvidosLabel); }

    public void clicarModificadosRecentementeTrintaDiasLabel (){ click(modificadosRecentementeTrintaDiasLabel); }

    public void clicarMonitoradosPorMinLabel (){ click(monitoradosPorMinLabel); }

    public void clicarVerTarefasAtribuidosAMinNaoResolvidosButton (){ click(verTarefasAtribuidosAMinNaoResolvidosButton); }

    public void clicarVerTarefasNaoAtribuidosButton (){ click(verTarefasNaoAtribuidosButton); }

    public void clicarVerTarefasRelatadoPorMinButton (){ click(verTarefasRelatadoPorMinButton); }

    public void clicarVerTarefasResolvidosButton (){ click(verTarefasResolvidosButton); }

    public void clicarVerTarefasModificadosRecentementeTrintaDiasButton (){ click(verTarefasModificadosRecentementeTrintaDiasButton); }

    public void clicarVerTarefasMonitoradosPorMinButton (){ click(verTarefasMonitoradosPorMinButton); }

    public void clicarSetaAtribuidosAMinNaoResolvidosLabel (){ click(setaAtribuidosAMinNaoResolvidosLabel); }

    public void clicarSetaNaoAtribuidosLabel (){ click(setaNaoAtribuidosLabel); }

    public void clicarSetaRelatadoPorMinLabel (){ click(setaRelatadoPorMinLabel); }

    public void clicarSetaResolvidosLabel (){ click(setaResolvidosLabel); }

    public void clicarSetaModificadosRecentementeTrintaDiasLabel(){ click(setaModificadosRecentementeTrintaDiasLabel); }

    public void clicarSetaMonitoradosPorMinButton(){ click(setaMonitoradosPorMinButton); }

    public void clicarSetaLinhaDoTempoButton(){ click(setaLinhaDoTempoButton); }

    public void clicarAnteriorButton() { click(anteriorButton); }

    public void clicarConvidarUsuarioButton(){ click(convidarUsuarioButton); }

    public void preencherBuscarTarefaField(String busca)
    {
        //Enviar um enter para realizar a busca
        sendKeys(buscarTarefaField,busca);
    }

    public void limparBuscaTarefaField(){ clear(buscarTarefaField); }

    public String retornaNomeUsuarioLabel()
    {
        return getText(nomeUsuarioLabel);
    }

    public void clickRSSMenuLabel(){ click(rssMenuLabel); }

    public void clickSairMenuButton(){ click(sairMenuButton);}

}
