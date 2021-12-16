package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ViewAllBugPage extends PageBase {

    private final static By redefinirFiltrosButton = By.xpath("(//a[@class='btn btn-sm btn-primary btn-white btn-round'])[1]");

    private final static By salvarFiltrosButton = By.xpath("(//a[@class='btn btn-sm btn-primary btn-white btn-round'])[2]");

    private final static By relatorFiltrosLabel = By.xpath("//a[text()='Relator']");

    private final static By qualquerRelatorFiltrosField = By.xpath("//option[text()='[qualquer]']");

    private final static By euMesmoRelatorFiltrosField = By.xpath("//option[text()='[Eu mesmo]']");

    private final static By administradorRelatorFiltrosField = By.xpath("//option[text()='administrator']");
}
