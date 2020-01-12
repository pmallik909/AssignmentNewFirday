package com.test.assignment.pages;

import com.test.assignment.actions.UIActions;
import com.test.assignment.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VechileBodyTypePage extends BaseClass {

    UIActions uiActions = new UIActions();

    public VechileBodyTypePage() {

        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = ".//label[text()=\"Cabrio\"]")
    WebElement selectBodyTypeAsCabrio;

    @FindBy(xpath = ".//label[text()=\"Kombi\"]")
    WebElement selectBodyTypeAsKombi;

    @FindBy(xpath = ".//label[text()=\"Limousine\"]")
    WebElement selectBodyTypeAsLimousine;

    @FindBy(xpath = ".//label[text()=\"Coupe\"]")
    WebElement selectBodyTypeAsCoupe;

    public VechileBodyTypePage selectcabrio() {

        uiActions.click(selectBodyTypeAsCabrio);
        return new VechileBodyTypePage();
    }

    public VechileBodyTypePage selectCoupe() {

        uiActions.click(selectBodyTypeAsCoupe);
        return new VechileBodyTypePage();
    }

    public VechileBodyTypePage selectKombi() {

        uiActions.click(selectBodyTypeAsKombi);
        return new VechileBodyTypePage();
    }

    public VechileBodyTypePage selectLimousine() {

        uiActions.click(selectBodyTypeAsLimousine);
        return new VechileBodyTypePage();
    }


}
