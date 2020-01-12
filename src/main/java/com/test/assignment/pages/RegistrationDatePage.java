package com.test.assignment.pages;

import com.test.assignment.actions.UIActions;
import com.test.assignment.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class RegistrationDatePage extends BaseClass {

    UIActions uiActions = new UIActions();
    public static Properties properties;

    public RegistrationDatePage() throws IOException {

        PageFactory.initElements(driver,this);
        properties = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/test/assignment/utils/config.properties");
        properties.load(fis);
    }


    @FindBy(xpath = "//input[@placeholder='MM.JJJJ']")
    WebElement enterTXT;





    public RegisteredOwnerPage enterDetailsforAudi(){



        enterTXT.sendKeys(properties.getProperty("audiRegistation"));
        return new RegisteredOwnerPage();
    }

    public RegisteredOwnerPage enterDetailsforBMW() {


        enterTXT.sendKeys(properties.getProperty("bmwRegistration"));
        return new RegisteredOwnerPage();
    }

    public RegisteredOwnerPage enterDetailsforAustin() {


        enterTXT.sendKeys(properties.getProperty("austinRegistration"));
        return new RegisteredOwnerPage();
    }


}
