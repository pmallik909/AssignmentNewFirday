package com.test.assignment.pages;

import com.test.assignment.actions.UIActions;
import com.test.assignment.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SelectEnginePage extends BaseClass {

    UIActions uiActions = new UIActions();

    public SelectEnginePage() {

        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "engine")
    WebElement engineBTN;

    @FindBy(xpath = ".//label[text()=\"A1 SPORTBACK 1.6 TDI\"]")
    WebElement A1EngineType;


    @FindBy(xpath = ".//label[text()=\"A4 CABRIO 2.0\"]")
    WebElement A4EngineType;

    @FindBy(xpath = ".//label[text()=\"650I CABRIO\"]")
    WebElement A650ICABRIO;

    @FindBy(xpath = ".//div[@class='SingleClickListField__container--2_K04']/button[1]")
    WebElement AHW118D;

    @FindBy(how = How.XPATH, using = ".//div[@class='SingleClickListField__container--2_K04']/button")
    WebElement montegoEngineOfAustin;

    @FindBy(how = How.XPATH, using = ".//div[@class='SingleClickListField__container--2_K04']/button[1]")
    WebElement maestroEngineOfAustin;

    @FindBy(how = How.XPATH, using = ".//div[@class='SingleClickListField__container--2_K04']/button[1]")
    WebElement metroEngineOfAustin;

    @FindBy(xpath = ".//label[text()=\"418D GRAN COUPE\"]")
    WebElement coupe418dgran;

    public SelectEnginePage selectEngine() {

        uiActions.click(engineBTN);
        return new SelectEnginePage();

    }

    public SelectEnginePage selectEngineOfA1() {

        uiActions.click(A1EngineType);
        return new SelectEnginePage();

    }

    public SelectEnginePage selectEngineOfA4() {

        uiActions.click(A4EngineType);
        return new SelectEnginePage();

    }

    public SelectEnginePage selectEngineOf6er() {

        uiActions.click(A650ICABRIO);
        return new SelectEnginePage();

    }

    public SelectEnginePage selectEngineOf4er() {

        uiActions.click(coupe418dgran);
        return new SelectEnginePage();

    }

    public SelectEnginePage selectEngineOfBMW1er() {

        uiActions.click(AHW118D);
        return new SelectEnginePage();

    }

    public SelectEnginePage selectEngineOfAustinMontego() {

        uiActions.click(montegoEngineOfAustin);
        return new SelectEnginePage();

    }

    public SelectEnginePage selectEngineOfAustinMaestro() {

        uiActions.click(maestroEngineOfAustin);
        return new SelectEnginePage();

    }
    public SelectEnginePage selectEngineOfAustinMetro() {

        uiActions.click(metroEngineOfAustin);
        return new SelectEnginePage();

    }
}
