package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ViewAllBugPage extends PageBase {


    //Elementos localizados no card Filtros
    private final static By redefinirFiltrosButton = By.xpath("(//a[@class='btn btn-sm btn-primary btn-white btn-round'])[1]");

    private final static By salvarFiltrosButton = By.xpath("(//a[@class='btn btn-sm btn-primary btn-white btn-round'])[2]");

    private final static By relatorFiltrosLabel = By.xpath("//a[text()='Relator']");

    private final static By relatorFiltrosComboBox = By.xpath("//select[@name='reporter_id[]']");

    private final static By qualquerRelatorFiltrosField = By.xpath("//option[text()='[qualquer]']");

    private final static By euMesmoRelatorFiltrosField = By.xpath("//option[text()='[Eu mesmo]']");

    private final static By administratorRelatorFiltrosField = By.xpath("//option[text()='administrator']");

    private final static By atribuidoAFiltrosLabel = By.xpath("//a[text()='Atribuído a']");

    private final static By atribuidoAFiltrosComboBox = By.xpath("//select[@name='handler_id[]']");

    private final static By qualquerAtribuidoAFiltrosLabel = By.xpath("(//option[text()='[qualquer]'])[2]");

    private final static By nenhumAtribuidoAFiltrosField = By.xpath("(//option[text()='[nenhum]'])[1]");

    private final static By euMesmoAtribuidoAFiltroField = By.xpath("(//option[text()='[Eu mesmo]'])[2]");

    private final static By administratorAtribuidoAFiltrosField = By.xpath("(//option[text()='administrator'])[2]");

    private final static By monitoradoPorFiltrosLabel = By.xpath("//a[text()='Monitorado Por']");

    private final static By monitoradoPorFiltrosComboBox = By.xpath("//select[@name='monitor_user_id[]']");

    private final static By qualquerMonitoradoPorFiltrosField = By.xpath("(//option[text()='[qualquer]'])[3]");

    private final static By nenhumMonitoradoPorFiltrosField = By.xpath("(//option[text()='[nenhum]'])[2]");

    private final static By euMesmoMonitoradoFiltrosField = By.xpath("(//option[text()='[Eu mesmo]'])[3]");

    private final static By administratorMonitoradoFiltrosField = By.xpath("(//option[text()='administrator'])[3]");

    private final static By notaPorFiltrosLabel = By.xpath("//a[text()='Nota Por']");

    private final static By notaPorFiltrosComboBox = By.xpath("//select[@name='note_user_id[]']");

    private final static By qualquerNotaPorFiltrosField = By.xpath("(//option[text()='[qualquer]'])[4]");

    private final static By nenhumNotaPorFiltrosField = By.xpath("(//option[text()='[nenhum]'])[3]");

    private final static By euMesmoNotaPorFiltrosField = By.xpath("(//option[text()='[Eu mesmo]'])[4]");

    private final static By administratorNotaPorFiltrosField = By.xpath("(//option[text()='administrator'])[4]");

    private final static By prioridadeFiltrosLabel = By.xpath("//a[text()='Prioridade']");

    private final static By prioridadeFiltrosComboBox = By.xpath("//select[@name='priority[]']");

    private final static By qualquerPrioridadeFiltrosLabel = By.xpath("(//option[text()='[qualquer]'])[5]");

    private final static By nenhumaPrioridadeFiltrosLabel = By.xpath("//option[text()='nenhuma']");

    private final static By baixaPrioridadeFiltrosLabel = By.xpath("//option[text()='baixa']");

    private final static By normalPrioridadeFiltrosLabel = By.xpath("//option[text()='normal']");

    private final static By altaPrioridadeFiltrosLabel = By.xpath("//option[text()='alta']");

    private final static By urgentePrioridadeFiltrosLabel = By.xpath("//option[text()='urgente']");

    private final static By imediatoPrioridadeFiltrosLabel = By.xpath("//option[text()='imediato']");

    private final static By gravidadeFiltrosLabel = By.xpath("(//a[text()='Gravidade'])[1]");

    private final static By gravidadeFiltrosComboBox = By.xpath("//select[@name='severity[]']");

    private final static By qualquerGravidadeFiltrosLabel = By.xpath("(//option[text()='[qualquer]'])[6]");

    private final static By recursoGravidadeFiltrosLabel = By.xpath("//option[text()='recurso']");

    private final static By trivialGravidadeFiltrosLabel = By.xpath("//option[text()='trivial']");

    private final static By textoGravidadeFiltrosLabel = By.xpath("//option[text()='texto']");

    private final static By minimoGravidadeFiltrosLabel = By.xpath("//option[text()='mínimo']");

    private final static By pequenoGravidadeFiltrosLabel = By.xpath("//option[text()='pequeno']");

    private final static By grandeGravidadeFiltrosLabel = By.xpath("//option[text()='grande']");

    private final static By travamentoGravidadeFiltrosLabel = By.xpath("//option[text()='travamento']");

    private final static By obstaculoGravidadeFiltrosLabel = By.xpath("//option[text()='obstáculo']");

    private final static By visibilidadeFiltrosLabel = By.xpath("//a[text()='Visibilidade']");

    private final static By visibilidadeFiltrosComboBox = By.xpath("//select[@name='view_state']");

    private final static By qualquerVisibilidadeFiltrosLabel = By.xpath("(//option[text()='[qualquer]'])[7]");

    private final static By publicoVisibilidadeFiltrosLabel = By.xpath("//option[text()='público']");

    private final static By privadoVisibilidadeFiltrosLabel = By.xpath("//option[text()='privado']");

    private final static By mostrarTarefasPegajosasFiltrosLabel = By.xpath("//a[text()='Mostrar Tarefas \"Pegajosas\"']");

    private final static By mostrarTarefasPegajosasFiltrosCheckBox = By.xpath("(//input[@name='sticky'])[1]");

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
}
