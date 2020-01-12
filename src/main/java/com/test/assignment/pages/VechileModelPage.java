package com.test.assignment.pages;

import com.test.assignment.actions.UIActions;
import com.test.assignment.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class VechileModelPage extends BaseClass {

    UIActions uiActions = new UIActions();

    public VechileModelPage() {

        PageFactory.initElements(driver,this);
    }


    @FindBy(name = "//div[@class='SingleClickListField__infoBlock--uUm3R'][contains(.,'Audi 200')]")
    WebElement selectModelAudi_200;

    @FindBy(xpath = ".//label[text()=\"Cabriolet\"]")
    WebElement enterVechileModelName;

    @FindBy(xpath = ".//label[text()=\"6er\"]")
    WebElement selectVechileModel6er;

    @FindBy(xpath = ".//label[text()=\"4er\"]")
    WebElement selectVechileModel4er;

    @FindBy(xpath = ".//div[@class='SingleClickListField__container--2_K04']/div[1]/button[1]")
    WebElement selectVechileModelBMW1er;

    @FindBy(xpath = "(//button[@class='SingleClickListField__button--3UZuT'])[1]")
    WebElement selectVechileA1;

    @FindBy(xpath = "(//button[@class='SingleClickListField__button--3UZuT'])[2]")
    WebElement selectVechileA3;

    @FindBy(xpath = ".//div[@class='SingleClickListField__container--2_K04']/button[1]")
    WebElement selectEstateVechileModel;

    @FindBy(how =How.XPATH, using = ".//div[@class='SingleClickListField__container--2_K04']/button[2]")
    WebElement selectmaestroVechileModel;

    @FindBy(how =How.XPATH, using = ".//div[@class='SingleClickListField__container--2_K04']/button[3]")
    WebElement selectmetroVechileModel;

    @FindBy(how =How.XPATH, using = ".//div[@class='Title__title--3RW9L Title__isFirstElement--2237W']/span")
    WebElement chooseVechileModel;



    public VechileModelPage clickOnVechileModel() throws Exception {


        uiActions.click(enterVechileModelName);
        return new VechileModelPage();
    }

    public VechileModelPage selectVechileA1Model() throws Exception {


        uiActions.click(selectVechileA1);
        return new VechileModelPage();
    }

    public VechileModelPage selectVechileA3Model() throws Exception {


        uiActions.click(selectVechileA3);
        return new VechileModelPage();
    }

    public VechileModelPage selectVechile6erModel() throws Exception {


        uiActions.click(selectVechileModel6er);
        return new VechileModelPage();
    }

    public VechileModelPage selectVechile4erModel() throws Exception {


        uiActions.click(selectVechileModel4er);
        return new VechileModelPage();
    }

    public VechileModelPage selectVechile1erModel() throws Exception {


        uiActions.click(selectVechileModelBMW1er);
        return new VechileModelPage();
    }

    public VechileModelPage selectVechileEstate() throws Exception {


        uiActions.click(selectEstateVechileModel);
        return new VechileModelPage();
    }

    public VechileModelPage selectVechilemaestro() throws Exception {


        uiActions.click(selectmaestroVechileModel);
        return new VechileModelPage();
    }

    public VechileModelPage selectVechilemetro() throws Exception {


        uiActions.click(selectmetroVechileModel);
        return new VechileModelPage();
    }


    public VechileModelPage validateText() {


        System.out.println("Validating Text");
        System.out.println(chooseVechileModel.getText());
        uiActions.verifyText(chooseVechileModel, "Wähle dein Automodell", "Its not the correct Text", 5);

        return new VechileModelPage();
    }

}
