package com.test.assignment.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"com/test/assignment/steps"}
        )
public class TestRunner {

//    @Before
//    public void launchBrowser(){
//
//        //code goes here
//    }
//
//    @After
//    public  void closeBrowser(){
//
//        //code goes here
//    }
}
