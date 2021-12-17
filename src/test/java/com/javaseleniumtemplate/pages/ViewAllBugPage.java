package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ViewAllBugPage extends PageBase {


    //Elementos localizados no card Filtros
    private final static By redefinirFiltrosButton = By.xpath("(//a[@class='btn btn-sm btn-primary btn-white btn-round'])[1]");

    private final static By salvarFiltrosButton = By.xpath("(//a[@class='btn btn-sm btn-primary btn-white btn-round'])[2]");

    //Relator Card filtros

    private final static By relatorFiltrosLabel = By.xpath("//a[text()='Relator']");

    private final static By relatorFiltrosComboBox = By.xpath("//select[@name='reporter_id[]']");

    private final static By qualquerRelatorFiltrosField = By.xpath("//select[@name='reporter_id[]']//option[text()='[qualquer]']");

    private final static By euMesmoRelatorFiltrosField = By.xpath("//select[@name='reporter_id[]']//option[text()='[Eu mesmo]']");

    private final static By administratorRelatorFiltrosField = By.xpath("//select[@name='reporter_id[]']//option[text()='administrator']");

    //Atribuido a Card filtros

    private final static By atribuidoAFiltrosLabel = By.xpath("//a[text()='Atribuído a']");

    private final static By atribuidoAFiltrosComboBox = By.xpath("//select[@name='handler_id[]']");

    private final static By qualquerAtribuidoAFiltrosLabel = By.xpath("//select[@name='handler_id[]']//option[text()='[qualquer]']");

    private final static By nenhumAtribuidoAFiltrosField = By.xpath("//select[@name='handler_id[]']//option[text()='[nenhum]']");

    private final static By euMesmoAtribuidoAFiltroField = By.xpath("//select[@name='handler_id[]']//option[text()='[Eu mesmo]']");

    private final static By administratorAtribuidoAFiltrosField = By.xpath("//select[@name='handler_id[]']//option[text()='administrator']");

    //Monitorado card filtros

    private final static By monitoradoPorFiltrosLabel = By.xpath("//a[text()='Monitorado Por']");

    private final static By monitoradoPorFiltrosComboBox = By.xpath("//select[@name='monitor_user_id[]']");

    private final static By qualquerMonitoradoPorFiltrosField = By.xpath("//select[@name='monitor_user_id[]']//option[text()='[qualquer]']");

    private final static By nenhumMonitoradoPorFiltrosField = By.xpath("//select[@name='monitor_user_id[]']//option[text()='[nenhum]']");

    private final static By euMesmoMonitoradoFiltrosField = By.xpath("//select[@name='monitor_user_id[]']//option[text()='[Eu mesmo]']");

    private final static By administratorMonitoradoFiltrosField = By.xpath("//select[@name='monitor_user_id[]']//option[text()='administrator']");

    //Nota por card filtros

    private final static By notaPorFiltrosLabel = By.xpath("//a[text()='Nota Por']");

    private final static By notaPorFiltrosComboBox = By.xpath("//select[@name='note_user_id[]']");

    private final static By qualquerNotaPorFiltrosField = By.xpath("//select[@name='note_user_id[]']//option[text()='[qualquer]']");

    private final static By nenhumNotaPorFiltrosField = By.xpath("//select[@name='note_user_id[]']//option[text()='[nenhum]']");

    private final static By euMesmoNotaPorFiltrosField = By.xpath("//select[@name='note_user_id[]']//option[text()='[Eu mesmo]']");

    private final static By administratorNotaPorFiltrosField = By.xpath("//select[@name='note_user_id[]']//option[text()='administrator']");

    //Prioridade card filtros

    private final static By prioridadeFiltrosLabel = By.xpath("//a[text()='Prioridade']");

    private final static By prioridadeFiltrosComboBox = By.xpath("//select[@name='priority[]']");

    private final static By qualquerPrioridadeFiltrosLabel = By.xpath("//select[@name='priority[]']//option[text()='[qualquer]']");

    private final static By nenhumaPrioridadeFiltrosLabel = By.xpath("//select[@name='priority[]']//option[text()='nenhuma']");

    private final static By baixaPrioridadeFiltrosLabel = By.xpath("//select[@name='priority[]']//option[text()='baixa']");

    private final static By normalPrioridadeFiltrosLabel = By.xpath("//select[@name='priority[]']//option[text()='normal']");

    private final static By altaPrioridadeFiltrosLabel = By.xpath("//select[@name='priority[]']//option[text()='alta']");

    private final static By urgentePrioridadeFiltrosLabel = By.xpath("//select[@name='priority[]']//option[text()='urgente']");

    private final static By imediatoPrioridadeFiltrosLabel = By.xpath("//select[@name='priority[]']//option[text()='imediato']");

    //Gravidade card filtros

    private final static By gravidadeFiltrosLabel = By.xpath("(//a[text()='Gravidade'])[1]");

    private final static By gravidadeFiltrosComboBox = By.xpath("//select[@name='severity[]']");

    private final static By qualquerGravidadeFiltrosLabel = By.xpath("//select[@name='severity[]']//option[text()='[qualquer]']");

    private final static By recursoGravidadeFiltrosLabel = By.xpath("//select[@name='severity[]']//option[text()='recurso']");

    private final static By trivialGravidadeFiltrosLabel = By.xpath("//select[@name='severity[]']//option[text()='trivial']");

    private final static By textoGravidadeFiltrosLabel = By.xpath("//select[@name='severity[]']//option[text()='texto']");

    private final static By minimoGravidadeFiltrosLabel = By.xpath("//select[@name='severity[]']//option[text()='mínimo']");

    private final static By pequenoGravidadeFiltrosLabel = By.xpath("//select[@name='severity[]']//option[text()='pequeno']");

    private final static By grandeGravidadeFiltrosLabel = By.xpath("//select[@name='severity[]']//option[text()='grande']");

    private final static By travamentoGravidadeFiltrosLabel = By.xpath("//select[@name='severity[]']//option[text()='travamento']");

    private final static By obstaculoGravidadeFiltrosLabel = By.xpath("//select[@name='severity[]']//option[text()='obstáculo']");

    //Visibilidade card filtros

    private final static By visibilidadeFiltrosLabel = By.xpath("//a[text()='Visibilidade']");

    private final static By visibilidadeFiltrosComboBox = By.xpath("//select[@name='view_state']");

    private final static By qualquerVisibilidadeFiltrosLabel = By.xpath("//select[@name='view_state']//option[text()='[qualquer]']");

    private final static By publicoVisibilidadeFiltrosLabel = By.xpath("//select[@name='view_state']//option[text()='público']");

    private final static By privadoVisibilidadeFiltrosLabel = By.xpath("//select[@name='view_state']//option[text()='privado']");

    //Mostrar Tarefas Pegajosas card filtros

    private final static By mostrarTarefasPegajosasFiltrosLabel = By.xpath("//a[text()='Mostrar Tarefas \"Pegajosas\"']");

    private final static By mostrarTarefasPegajosasFiltrosCheckBox = By.xpath("(//input[@name='sticky'])[1]");

    //Categoria card filtros

    private final static By categoriaFiltrosLabel = By.xpath("(//a[text()='Categoria'])[1]");

    private final static By categoriaFiltrosComboBox = By.xpath("//select[@name='category_id[]']");

    private final static By qualquerCategoriaFiltrosLabel = By.xpath("//select[@name='category_id[]']//option[text()='[qualquer]']");

    private final static By nenhumCategoriaFiltrosLabel = By.xpath("//select[@name='category_id[]']//option[text()='[nenhum]']");

    private final static By generalCategoriaFiltrosLabel = By.xpath("//select[@name='category_id[]']//option[text()='General']");

    //Ocultar card filtros

    private final static By ocultarStatusFiltrosLabel = By.xpath("//a[text()='Ocultar Status']");

    private final static By ocultarStatusFiltrosComboBox = By.xpath("//select[@name='hide_status[]']");

    private final static By nenhumOcultarStatusFiltrosLabel = By.xpath("//select[@name='hide_status[]']//option[text()='[nenhum]']");

    private final static By novoOcultarStatusFiltrosLabel = By.xpath("//select[@name='hide_status[]']//option[text()='novo']");

    private final static By retornoOcultarStatusFiltrosLabel = By.xpath("//select[@name='hide_status[]']//option[text()='retorno']");

    private final static By admitidoOcultarStatusFiltrosLabel = By.xpath("//select[@name='hide_status[]']//option[text()='admitido']");

    private final static By confirmadoOcultarStatusFiltrosLabel = By.xpath("//select[@name='hide_status[]']//option[text()='confirmado']");

    private final static By atribuidoOcultarStatusFiltrosLabel = By.xpath("//select[@name='hide_status[]']//option[text()='atribuído']");

    private final static By resolvidoOcultarStatusFiltrosLabel = By.xpath("//select[@name='hide_status[]']//option[text()='resolvido']");

    private final static By fechadoOcultarStatusFiltrosLabel = By.xpath("//select[@name='hide_status[]']//option[text()='fechado']");

    //Estado card filtros

    private final static By estadoFiltrosLabel = By.xpath("(//a[text()='Estado'])[1]");

    private final static By estadoFiltrosComboBox = By.xpath("//select[@name='status[]']");

    private final static By qualquerEstadoFiltrosLabel = By.xpath("//select[@name='status[]']//option[text()='[qualquer]']");

    private final static By novoEstadoFiltrosLabel = By.xpath("//select[@name='status[]']//option[text()='novo']");

    private final static By retornoEstadoFiltrosLabel = By.xpath("//select[@name='status[]']//option[text()='retorno']");

    private final static By admitidoEstadoFiltrosLabel = By.xpath("//select[@name='status[]']//option[text()='admitido']");

    private final static By confirmadoEstadoFiltrosLabel = By.xpath("//select[@name='status[]']//option[text()='confirmado']");

    private final static By atribuidoEstadoFiltrosLabel = By.xpath("//select[@name='status[]']//option[text()='atribuído']");

    private final static By resolvidoEstadoFiltrosLabel = By.xpath("//select[@name='status[]']//option[text()='resolvido']");

    private final static By fechadoEstadoFiltrosLabel = By.xpath("//select[@name='status[]']//option[text()='fechado']");

    //Resolução card filtros

    private final static By resolucaoFiltrosLabel = By.xpath("//a[text()='Resolução']");

    private final static By resolucaoFiltrosComboBox = By.xpath("//select[@name='resolution[]']");

    private final static By qualquerResolucaoFiltrosLabel = By.xpath("//select[@name='resolution[]']//option[text()='[qualquer]']");

    private final static By abertoResolucaoFiltrosLabel = By.xpath("//select[@name='resolution[]']//option[text()='aberto']");

    private final static By corrigidoResolucaoFiltrosLabel = By.xpath("//select[@name='resolution[]']//option[text()='corrigido']");

    private final static By reabertoResolucaoFiltrosLabel = By.xpath("//select[@name='resolution[]']//option[text()='reaberto']");

    private final static By incapazDeReproduzirResolucaoFiltrosLabel = By.xpath("//select[@name='resolution[]']//option[text()='incapaz de reproduzir']");

    private final static By naoCorrigivelResolucaoFiltrosLabel = By.xpath("//select[@name='resolution[]']//option[text()='não corrigível']");

    private final static By duplicadoResolucaoFiltrosLabel = By.xpath("//select[@name='resolution[]']//option[text()='duplicado']");

    private final static By naoEUmaTarefaResolucaoFiltrosLabel = By.xpath("//select[@name='resolution[]']//option[text()='não é uma tarefa']");

    private final static By suspensoResolucaoFiltrosLabel = By.xpath("//select[@name='resolution[]']//option[text()='suspenso']");

    private final static By naoSeraCorrigidoResolucaoFiltrosLabel = By.xpath("//select[@name='resolution[]']//option[text()='não será corrigido']");

    //Metodos do card Filtros

    public void clicarRedefinirFiltrosButton(){ click(redefinirFiltrosButton);}

    public void clicarSalvarFiltrosButton(){ click(salvarFiltrosButton);}

    public void clicarRelatorFiltrosLabel(){ click(relatorFiltrosLabel);}

    public void clicarRelatorFiltrosComboBox(){ click(relatorFiltrosComboBox);}

    public void clicarQualquerRelatorFiltrosField(){ click(qualquerRelatorFiltrosField);}

    public void clicarEuMesmoRelatorFiltrosField(){ click(euMesmoRelatorFiltrosField);}

    public void clicarAdministradorRelatorioFiltrosField(){ click(administratorRelatorFiltrosField);}

    public void clicarAtribuidoAFiltrosLabel(){ click(atribuidoAFiltrosLabel);}

    public void clicarAtribuidoAFiltrosComboBox(){ click(atribuidoAFiltrosComboBox);}

    public void clicarQualquerAtribuidoAFiltrosLabel(){ click(qualquerAtribuidoAFiltrosLabel);}

    public void clicarNenhumAtribuidoAFiltrosField(){ click(nenhumAtribuidoAFiltrosField);}

    public void clicarEuMesmoAtribuidoAFiltroField(){ click(euMesmoAtribuidoAFiltroField);}

    public void clicarAdministratorAtribuidoAFiltrosField(){ click(administratorAtribuidoAFiltrosField);}

    public void clicarMonitoradoPorFiltrosLabel(){ click(monitoradoPorFiltrosLabel);}

    public void clicarMonitoradoPorFiltrosComboBox(){ click(monitoradoPorFiltrosComboBox);}

    public void clicarQualquerMonitoradoPorFiltrosField(){ click(qualquerMonitoradoPorFiltrosField);}

    public void clicarNenhumMonitoradoPorFiltrosField(){ click(nenhumMonitoradoPorFiltrosField);}

    public void clicarEuMesmoMonitoradoFiltrosField(){ click(euMesmoMonitoradoFiltrosField);}

    public void clicarAdministratorMonitoradoFiltrosField(){ click(administratorMonitoradoFiltrosField);}

    public void clicarNotaPorFiltrosLabel(){ click(notaPorFiltrosLabel);}

    public void clicarNotaPorFiltrosComboBox(){ click(notaPorFiltrosComboBox);}

    public void clicarQualquerNotaPorFiltrosField(){ click(qualquerNotaPorFiltrosField);}

    public void clicarNenhumNotaPorFiltrosField(){ click(nenhumNotaPorFiltrosField);}

    public void clicarEuMesmoNotaPorFiltrosField(){ click(euMesmoNotaPorFiltrosField);}

    public void clicarAdministratorNotaPorFiltrosField(){ click(administratorNotaPorFiltrosField);}

    public void clicarPrioridadeFiltrosLabel(){ click(prioridadeFiltrosLabel);}

    public void clicarPrioridadeFiltrosComboBox(){ click(prioridadeFiltrosComboBox);}

    public void clicarQualquerPrioridadeFiltrosLabel(){ click(qualquerPrioridadeFiltrosLabel);}

    public void clicarNenhumaPrioridadeFiltrosLabel(){ click(nenhumaPrioridadeFiltrosLabel);}

    public void clicarBaixaPrioridadeFiltrosLabel(){ click(baixaPrioridadeFiltrosLabel);}

    public void clicarNormalPrioridadeFiltrosLabel(){ click(normalPrioridadeFiltrosLabel);}

    public void clicarAltaPrioridadeFiltrosLabel(){ click(altaPrioridadeFiltrosLabel);}

    public void clicarUrgentePrioridadeFiltrosLabel(){ click(urgentePrioridadeFiltrosLabel);}

    public void clicarImediatoPrioridadeFiltrosLabel(){ click(imediatoPrioridadeFiltrosLabel);}

    public void clicarGravidadeFiltrosLabel(){ click(gravidadeFiltrosLabel);}

    public void clicarGravidadeFiltrosComboBox(){ click(gravidadeFiltrosComboBox);}

    public void clicarQualquerGravidadeFiltrosLabel(){ click(qualquerGravidadeFiltrosLabel);}

    public void clicarRecursoGravidadeFiltrosLabel(){ click(recursoGravidadeFiltrosLabel);}

    public void clicarTrivialGravidadeFiltrosLabel(){ click(trivialGravidadeFiltrosLabel);}

    public void clicarTextoGravidadeFiltrosLabel(){ click(textoGravidadeFiltrosLabel);}

    public void clicarMinimoGravidadeFiltrosLabel(){ click(minimoGravidadeFiltrosLabel);}

    public void clicarPequenoGravidadeFiltrosLabel(){ click(pequenoGravidadeFiltrosLabel);}

    public void clicarGrandeGravidadeFiltrosLabel(){ click(grandeGravidadeFiltrosLabel);}

    public void clicarTravamentoGravidadeFiltrosLabel(){ click(travamentoGravidadeFiltrosLabel);}

    public void clicarObstaculoGravidadeFiltrosLabel(){ click(obstaculoGravidadeFiltrosLabel);}

    public void clicarVisibilidadeFiltrosLabel(){ click(visibilidadeFiltrosLabel);}

    public void clicarVisibilidadeFiltrosComboBox(){ click(visibilidadeFiltrosComboBox);}

    public void clicarQualquerVisibilidadeFiltrosLabel(){ click(qualquerVisibilidadeFiltrosLabel);}

    public void clicarPublicoVisibilidadeFiltrosLabel(){ click(publicoVisibilidadeFiltrosLabel);}

    public void clicarPrivadoVisibilidadeFiltrosLabel(){ click(privadoVisibilidadeFiltrosLabel);}

    public void clicarMostrarTarefasPegajosasFiltrosLabel(){ click(mostrarTarefasPegajosasFiltrosLabel);}

    public void clicarMostrarTarefasPegajosasFiltrosCheckBox(){ click(mostrarTarefasPegajosasFiltrosCheckBox);}

    public void clicarCategoriaFiltrosLabel(){ click(categoriaFiltrosLabel);}

    public void clicarCategoriaFiltrosComboBox(){ click(categoriaFiltrosComboBox);}

    public void clicarQualquerCategoriaFiltrosLabel(){ click(qualquerCategoriaFiltrosLabel);}

    public void clicarNenhumCategoriaFiltrosLabel(){ click(nenhumCategoriaFiltrosLabel);}

    public void clicarGeneralCategoriaFiltrosLabel(){ click(generalCategoriaFiltrosLabel);}

    public void clicarOcultarStatusFiltrosLabel(){ click(ocultarStatusFiltrosLabel);}

    public void clicarOcultarStatusFiltrosComboBox(){ click(ocultarStatusFiltrosComboBox);}

    public void clicarNenhumOcultarStatusFiltrosLabel(){ click(nenhumOcultarStatusFiltrosLabel);}

    public void clicarNovoOcultarStatusFiltrosLabel(){ click(novoOcultarStatusFiltrosLabel);}

    public void clicarRetornoOcultarStatusFiltrosLabel(){ click(retornoOcultarStatusFiltrosLabel);}

    public void clicarAdmitidoOcultarStatusFiltrosLabel(){ click(admitidoOcultarStatusFiltrosLabel);}

    public void clicarConfirmadoOcultarStatusFiltrosLabel(){ click(confirmadoOcultarStatusFiltrosLabel);}

    public void clicarAtribuidoOcultarStatusFiltrosLabel(){ click(atribuidoOcultarStatusFiltrosLabel);}

    public void clicarResolvidoOcultarStatusFiltrosLabel(){ click(resolvidoOcultarStatusFiltrosLabel);}

    public void clicarFechadoOcultarStatusFiltrosLabel(){ click(fechadoOcultarStatusFiltrosLabel);}

    public void clicarEstadoFiltrosLabel(){ click(estadoFiltrosLabel);}

    public void clicarEstadoFiltrosComboBox(){ click(estadoFiltrosComboBox);}

    public void clicarQualquerEstadoFiltrosLabel(){ click(qualquerEstadoFiltrosLabel);}

    public void clicarNovoEstadoFiltrosLabel(){ click(novoEstadoFiltrosLabel);}

    public void clicarRetornoEstadoFiltrosLabel(){ click(retornoEstadoFiltrosLabel);}

    public void clicarAdmitidoEstadoFiltrosLabel(){ click(admitidoEstadoFiltrosLabel);}

    public void clicarConfirmadoEstadoFiltrosLabel(){ click(confirmadoEstadoFiltrosLabel);}

    public void clicarAtribuidoEstadoFiltrosLabel(){ click(atribuidoEstadoFiltrosLabel);}

    public void clicarResolvidoEstadoFiltrosLabel(){ click(resolvidoEstadoFiltrosLabel);}

    public void clicarFechadoEstadoFiltrosLabel(){ click(fechadoEstadoFiltrosLabel);}

    public void clicarResolucaoFiltrosLabel(){ click(resolucaoFiltrosLabel);}

    public void clicarResolucaoFiltrosComboBox(){ click(resolucaoFiltrosComboBox);}

    public void clicarQualquerResolucaoFiltrosLabel(){ click(qualquerResolucaoFiltrosLabel);}

    public void clicarAbertoResolucaoFiltrosLabel(){ click(abertoResolucaoFiltrosLabel);}

    public void clicarCorrigidoResolucaoFiltrosLabel(){ click(corrigidoResolucaoFiltrosLabel);}

    public void clicarReabertoResolucaoFiltrosLabel(){ click(reabertoResolucaoFiltrosLabel);}

    public void clicarIncapazDeReproduzirResolucaoFiltrosLabel(){ click(incapazDeReproduzirResolucaoFiltrosLabel);}

    public void clicarNaoCorrigivelResolucaoFiltrosLabel(){ click(naoCorrigivelResolucaoFiltrosLabel);}

    public void clicarDuplicadoResolucaoFiltrosLabel(){ click(duplicadoResolucaoFiltrosLabel);}

    public void clicarNaoEUmaTarefaResolucaoFiltrosLabel(){ click(naoEUmaTarefaResolucaoFiltrosLabel);}

    public void clicarSuspensoResolucaoFiltrosLabel(){ click(suspensoResolucaoFiltrosLabel);}

    public void clicarNaoSeraCorrigidoResolucaoFiltrosLabel(){ click(naoSeraCorrigidoResolucaoFiltrosLabel);}

}
