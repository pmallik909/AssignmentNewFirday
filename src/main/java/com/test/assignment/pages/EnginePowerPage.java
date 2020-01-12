package com.test.assignment.pages;

import com.test.assignment.actions.UIActions;
import com.test.assignment.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EnginePowerPage extends BaseClass {

    UIActions uiActions = new UIActions();

    public EnginePowerPage() {

        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = ".//label[text()=\"66 kW / 90 PS\"]")
    WebElement epower66KW;

    @FindBy(xpath = ".//label[text()=\"77 kW / 105 PS\"]")
    WebElement epower77KW;

    @FindBy(xpath = ".//label[text()=\"105 kW / 143 PS\"]")
    WebElement epower105KW;

    @FindBy(xpath = ".//label[text()=\"85 kW / 116 PS\"]")
    WebElement epower85KW;

    @FindBy(xpath = ".//label[text()=\"92 kW / 125 PS\"]")
    WebElement epower92KW;

    @FindBy(xpath = ".//label[text()=\"96 kW / 131 PS\"]")
    WebElement epower96KW;

    @FindBy(xpath = ".//label[text()=\"98 kW / 133 PS\"]")
    WebElement epower98KW;

    @FindBy(xpath = ".//label[text()=\"110 kW / 150 PS\"]")
    WebElement epower110KW;

    @FindBy(xpath = ".//label[text()=\"128 kW / 174 PS\"]")
    WebElement epower174KW;

    @FindBy(xpath = ".//label[text()=\"330 kW / 449 PS\"]")
    WebElement epower330KW;

    @FindBy(how = How.XPATH, using = ".//div[@class='SingleClickListField__container--2_K04']/button[1]")
    WebElement epower49KW;

    @FindBy(how = How.XPATH, using = ".//div[@class='SingleClickListField__container--2_K04']/button[1]")
    WebElement epower35KW;

    @FindBy(how = How.XPATH, using = ".//div[@class='Title__title--3RW9L Title__isFirstElement--2237W']/span")
    WebElement validateEnginePowerText;


    public EnginePowerPage clickOn85KW() {

        uiActions.click(epower85KW);
        return new EnginePowerPage();
    }

    public EnginePowerPage clickOn92KW() {

        uiActions.click(epower92KW);
        return new EnginePowerPage();
    }

    public EnginePowerPage clickOn96KW() {

        uiActions.click(epower96KW);
        return new EnginePowerPage();
    }

    public EnginePowerPage clickOn98KW() {

        uiActions.click(epower98KW);
        return new EnginePowerPage();
    }

    public EnginePowerPage clickOn110KW() {

        uiActions.click(epower110KW);
        return new EnginePowerPage();
    }

    public EnginePowerPage clickOn66KW() {

        uiActions.click(epower66KW);
        return new EnginePowerPage();
    }

    public EnginePowerPage clickOn77KW() {

        uiActions.click(epower77KW);
        return new EnginePowerPage();
    }
    public EnginePowerPage clickOn105KW() {

        uiActions.click(epower105KW);
        return new EnginePowerPage();
    }

    public EnginePowerPage clickOn330KW() {

        uiActions.click(epower330KW);
        return new EnginePowerPage();
    }

    public EnginePowerPage clickOn49KW() {

        uiActions.click(epower49KW);
        return new EnginePowerPage();
    }

    public EnginePowerPage clickOn35KW() {

        uiActions.click(epower35KW);
        return new EnginePowerPage();
    }

    public EnginePowerPage validateTextforEnginePower() {


        System.out.println("Validating Text");
        System.out.println(validateEnginePowerText.getText());
        uiActions.verifyText(validateEnginePowerText, "Wie viele PS hat dein Auto?", "Its not the correct Text", 5);
        return new EnginePowerPage();
    }

}
