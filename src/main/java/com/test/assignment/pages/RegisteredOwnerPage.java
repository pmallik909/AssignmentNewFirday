package com.test.assignment.pages;

import com.test.assignment.actions.UIActions;
import com.test.assignment.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisteredOwnerPage extends BaseClass {

    UIActions uiActions = new UIActions();

    public RegisteredOwnerPage() {

        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//button[@value='brandNew']")
    WebElement brandNewRadioBtn;

    @FindBy(how = How.XPATH, using = ".//div[@class='Title__title--3RW9L Title__isFirstElement--2237W']/span")
    WebElement areUtheOwner;

    @FindBy(how = How.XPATH, using = ".//div[@class='Title__title--3RW9L']/span")
    WebElement theCarIs;



    public RegisteredOwnerPage clickOnBrandNewBTN() {

        uiActions.click(brandNewRadioBtn);
        return new RegisteredOwnerPage();
    }

    public RegisteredOwnerPage verifyPageTitlesOfRegisteredOwnerPage() {


        System.out.println("Validating Text");
        System.out.println(areUtheOwner.getText());
        uiActions.verifyText(areUtheOwner, "Bist du der Halter des Autos (zugelassen auf dich)?", "Its not the correct Text", 5);
        System.out.println(theCarIs.getText());
        uiActions.verifyText(theCarIs, "Das Auto war...", "Its not the correct Text", 5);
        return new RegisteredOwnerPage();
    }
}
