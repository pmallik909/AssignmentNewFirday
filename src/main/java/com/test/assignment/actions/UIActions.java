package com.test.assignment.actions;

import com.test.assignment.baseClass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UIActions{

    WebDriver driver;
    BaseClass baseClass = new BaseClass();

    public void openBrowser() throws Exception {

        baseClass.initializeTest();
    }

    public void closeBrowser() throws Exception {

        baseClass.closeBrowser();
    }

    public void click(WebElement element){
        element.click();
    }

    public void enterVechileModel(WebElement element, String modelTye){

        element.sendKeys(modelTye);
    }

    public void verifyText(WebElement element, String text, String failureMessage,int waitTime){

        String message = failureMessage + "- Expected:" + text +", Actual:" + element.getText()+".";
        Assert.assertTrue(message,element.getText().trim().toUpperCase().contentEquals(text.toUpperCase()));
    }

    public void pageNavigation() throws Exception {

        baseClass.navigatePage();
    }


}
