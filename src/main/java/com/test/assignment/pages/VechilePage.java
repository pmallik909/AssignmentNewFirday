package com.test.assignment.pages;


import com.test.assignment.actions.UIActions;
import com.test.assignment.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class VechilePage extends BaseClass {

    UIActions uiActions = new UIActions();

    public VechilePage() {

        PageFactory.initElements(driver,this);
    }


    @FindBy(how = How.XPATH, using = "(.//label[text()=\"AUDI\"])[1]")
    WebElement vechileIsAUDI;

    @FindBy(how = How.XPATH, using = "(.//label[text()=\"BMW\"])[1]")
    WebElement vechileIsBMW;

    @FindBy(how = How.XPATH, using = "(.//div[@class='SingleClickListField__optionGroup--MNnWx'])[2]/button[4]")
    WebElement vechileIsAustin;

    @FindBy(how = How.XPATH, using = ".//div[@class='Title__title--3RW9L Title__isFirstElement--2237W']/span")
    WebElement chooseYourVechile;


    public VechilePage clickOnAudi() {

        uiActions.click(vechileIsAUDI);
        return new VechilePage();
    }

    public VechilePage clickOnBMW() {

        uiActions.click(vechileIsBMW);
        return new VechilePage();
    }

    public VechilePage clickOnAustin() {

        uiActions.click(vechileIsAustin);
        return new VechilePage();
    }

    public VechilePage chooseYouVechileTextValidation() {


        System.out.println("Validating Text");
        System.out.println(chooseYourVechile.getText());
        uiActions.verifyText(chooseYourVechile, "Wähle dein Auto aus", "Its not the correct Text", 5);

        return new VechilePage();
    }
}
