package com.test.assignment.pages;

import com.test.assignment.actions.UIActions;
import com.test.assignment.baseClass.BaseClass;
import cucumber.api.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class SelectPreconditionPage extends BaseClass {

    public static Logger LOGGER = LoggerFactory.getLogger("StaticLogger");
    UIActions uiActions = new UIActions();


    public SelectPreconditionPage() {

        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "precondition")
    WebElement preConditionBTN;

    @FindBy(how = How.CLASS_NAME, using = "SelectPreconditionStep__title--3hY48")
    WebElement titleOfPage;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    WebElement furtherBTN;


    public SelectPreconditionPage verifyPageTitle() {


        System.out.println("Validating Text");
        System.out.println(titleOfPage.getText());
        uiActions.verifyText(titleOfPage, "In 90 Sekunden zum Beitrag", "Its not the correct Text", 5);
        return new SelectPreconditionPage();
    }

    public SelectPreconditionPage selectPreconditionAndClickOnFurther(){

        System.out.println("trying to click the car is insured section");
        uiActions.click(preConditionBTN);
        System.out.println("clicked on the car is insured section");
        return new SelectPreconditionPage();
    }

    public SelectPreconditionPage clickOnFurtherBTN(){

        System.out.println("trying to click on Furher BTN");
        uiActions.click(furtherBTN);
        return new SelectPreconditionPage();
    }


}
