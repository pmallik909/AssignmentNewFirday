package com.test.assignment.baseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    public static Properties properties;

    public BaseClass(){
        try {
            properties = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/test/assignment/utils/config.properties");
            properties.load(fis);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initializeTest() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(properties.getProperty("url"));



    }

    public void navigatePage() {

        driver.navigate().to(properties.getProperty("navigatePage"));

    }



    public void closeBrowser(){

        driver.quit();
    }
}
