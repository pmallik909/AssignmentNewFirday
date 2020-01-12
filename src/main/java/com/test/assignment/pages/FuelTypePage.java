package com.test.assignment.pages;

import com.test.assignment.actions.UIActions;
import com.test.assignment.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FuelTypePage extends BaseClass {

    UIActions uiActions = new UIActions();

    public FuelTypePage() {

        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = ".//label[text()=\"Benzin\"]")
    WebElement selectPetrolasFuel;

    @FindBy(xpath = ".//label[text()=\"Diesel\"]")
    WebElement selectDiselasFuel;

    @FindBy(how = How.XPATH, using = ".//div[@class='Title__title--3RW9L Title__isFirstElement--2237W']/span")
    WebElement fuelTypeText;

    public FuelTypePage selectPetrolFuel() {

        uiActions.click(selectPetrolasFuel);
        return new FuelTypePage();
    }

    public FuelTypePage selectDiselFuel() {

        uiActions.click(selectDiselasFuel);
        return new FuelTypePage();
    }

    public FuelTypePage validateTextforfuelType() {


        System.out.println("Validating Text");
        System.out.println(fuelTypeText.getText());
        uiActions.verifyText(fuelTypeText, "Was tankst du?", "Its not the correct Text", 5);

        return new FuelTypePage();
    }


}
