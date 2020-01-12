package com.test.assignment.pages;

import com.test.assignment.actions.UIActions;
import com.test.assignment.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DOBPage extends BaseClass {

    UIActions uiActions = new UIActions();
    public static Properties properties;

    public DOBPage() throws IOException {

        PageFactory.initElements(driver,this);
        properties = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/test/assignment/utils/config.properties");
        properties.load(fis);
    }

    @FindBy(xpath = "//input[@placeholder='TT.MM.JJJJ']")
    WebElement DOB;

    @FindBy(how = How.XPATH, using = ".//div[@class='Title__title--3RW9L Title__isFirstElement--2237W']")
    WebElement DOBTextValidation;

    public DOBPage enterDOBForAudi() throws IOException {


        DOB.sendKeys(properties.getProperty("dobForAudi"));
        return new DOBPage();
    }

    public DOBPage enterDOBForAustin() throws Exception{


        DOB.sendKeys(properties.getProperty("dobForAustin"));
        return new DOBPage();
    }

    public DOBPage enterDOBForBMW()  throws Exception{


        DOB.sendKeys(properties.getProperty("dobForBMW"));
        return new DOBPage();
    }

    public DOBPage validateText() throws Exception{

        System.out.println("Validating Text");
        System.out.println(DOBTextValidation.getText());
        uiActions.verifyText(DOBTextValidation, "Wann wurdest du geboren?", "Its not the correct Text", 5);

        return new DOBPage();
    }

}
