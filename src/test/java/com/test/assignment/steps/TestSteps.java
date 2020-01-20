package com.test.assignment.steps;

import com.test.assignment.actions.UIActions;
import com.test.assignment.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class TestSteps {

    UIActions uiActions = new UIActions();
    SelectPreconditionPage selectPreconditionPage ;
    RegisteredOwnerPage registeredOwnerPage;
    VechilePage vechilePage;
    VechileModelPage vechileModelPage;
    FuelTypePage fuelTypePage;
    EnginePowerPage enginePowerPage;
    SelectEnginePage selectEnginePage;
    RegistrationDatePage registrationDatePage;
    DOBPage dobPage;
    VechileBodyTypePage vechileBodyTypePage;


    @Given("^i open browser and navigate to test URL$")
    public void i_test_it() throws Exception {
        uiActions.openBrowser();

    }

    @Then("^i click on the car is already insured section$")
    public void clickOnCarInsuredBTN() throws Exception{

        try {
            selectPreconditionPage = new SelectPreconditionPage();
            selectPreconditionPage.verifyPageTitle();
            selectPreconditionPage.selectPreconditionAndClickOnFurther();
        }
        catch (Exception e){
            uiActions.closeBrowser();
        }
    }

    @Then("^i move to RegisteredOwnerPage and click on newWithPurchase button$")
    public void clickOnNewWithPurchaseBTN() throws Exception{

        try {
            registeredOwnerPage = new RegisteredOwnerPage();
            registeredOwnerPage.verifyPageTitlesOfRegisteredOwnerPage();
            registeredOwnerPage.clickOnBrandNewBTN();
        }catch (Exception e){
            uiActions.closeBrowser();
        }

    }

    @Then("^i click on the further button$")
    public void clickOnFurther() throws Exception{

        try {
            selectPreconditionPage = new SelectPreconditionPage();
            selectPreconditionPage.clickOnFurtherBTN();
        }catch (Exception e){
            uiActions.closeBrowser();
        }

    }


    @And("^I wait for \"([^\"]*)\" secs$")
    public void iWaitForSecs(String waitTime) throws Throwable {

        Thread.sleep((Integer.parseInt(waitTime)*1000));
        System.out.println("waited for time specified");

    }


    @Then("^i select \"([^\"]*)\" vechile$")
    public void i_select_vechile(String vechile) throws Exception {

        try {

            vechilePage = new VechilePage();

            if (vechile.equalsIgnoreCase("AUDI")) {


                vechilePage.clickOnAudi();
                System.out.println("clicked on car type");
            } else if (vechile.equalsIgnoreCase("BMW")) {


                vechilePage.clickOnBMW();
                System.out.println("clicked on car type as BMW");
            } else if (vechile.equalsIgnoreCase("AUSTIN")) {


                vechilePage.clickOnAustin();
                System.out.println("clicked on car type as AUSTIN");
            }
        }
        catch (Exception e){
            uiActions.closeBrowser();
        }

    }

    @Then("^i select vechilemodel as \"([^\"]*)\"$")
    public void i_select_vechileModel(String  vechileModel) throws Exception {

        try {

            vechileModelPage = new VechileModelPage();
            if (vechileModel.equalsIgnoreCase("Cabriolet")) {


                vechileModelPage.clickOnVechileModel();
                System.out.println("Clicked on Cabriolet");
            } else if (vechileModel.equalsIgnoreCase("A1")) {


                System.out.println("Selecting A1");

                vechileModelPage.selectVechileA1Model();
                System.out.println("Clicked on A1");
            } else if (vechileModel.equalsIgnoreCase("A4")) {

                //Thread.sleep(3000);
                System.out.println("Selecting A4");
                vechileModelPage.selectVechileA3Model();
                System.out.println("Clicked on A4");
            } else if (vechileModel.equalsIgnoreCase("6er")) {

                //Thread.sleep(3000);
                System.out.println("Selecting 6er");
                vechileModelPage.validateText();
                vechileModelPage.selectVechile6erModel();
                System.out.println("Clicked on 6er");
            } else if (vechileModel.equalsIgnoreCase("4er")) {

                //Thread.sleep(3000);
                System.out.println("Selecting 4er");
                vechileModelPage.validateText();
                vechileModelPage.selectVechile4erModel();
                System.out.println("Clicked on 4er");
            } else if (vechileModel.equalsIgnoreCase("1er")) {

                //Thread.sleep(3000);
                System.out.println("Selecting 1er");
                vechileModelPage.validateText();
                vechileModelPage.selectVechile1erModel();
                System.out.println("Clicked on 1er");
            } else if (vechileModel.equalsIgnoreCase("Estate")) {

                //Thread.sleep(3000);
                System.out.println("Selecting Estate");
                vechileModelPage.validateText();
                vechileModelPage.selectVechileEstate();
                System.out.println("Clicked on Estate");
            } else if (vechileModel.equalsIgnoreCase("maestro")) {

                //Thread.sleep(3000);
                System.out.println("Selecting maestro");
                vechileModelPage.validateText();
                vechileModelPage.selectVechilemaestro();
                System.out.println("Clicked on maestro");
            } else if (vechileModel.equalsIgnoreCase("metro")) {

                //Thread.sleep(3000);
                System.out.println("Selecting metro");
                vechileModelPage.validateText();
                vechileModelPage.selectVechilemetro();
                System.out.println("Clicked on metro");
            }
        }catch (Exception e){
            uiActions.closeBrowser();
        }
    }

    @Then("^i select \"([^\"]*)\" as fuelType$")
    public void selectFuelType(String fuelType) throws Exception {

        try {

            fuelTypePage = new FuelTypePage();
            if (fuelType.equalsIgnoreCase("PETROL")) {

                fuelTypePage.validateTextforfuelType();
                fuelTypePage.selectPetrolFuel();
                System.out.println("petrol Selected");
            } else if (fuelType.equalsIgnoreCase("DISEL")) {

                fuelTypePage.validateTextforfuelType();
                fuelTypePage.selectDiselFuel();
                System.out.println("Disel Selected");
            }
        }
        catch (Exception e){
            uiActions.closeBrowser();
        }


    }

    @Then("^i select \"([^\"]*)\" engine$")
    public void selectPowerOfEngine(String enginePower) throws Exception {

        try {

            enginePowerPage = new EnginePowerPage();
            if (enginePower.equalsIgnoreCase("85KW")) {

                enginePowerPage.validateTextforEnginePower();
                enginePowerPage.clickOn85KW();
            } else if (enginePower.equalsIgnoreCase("66KW")) {

                enginePowerPage.validateTextforEnginePower();
                enginePowerPage.clickOn66KW();
            } else if (enginePower.equalsIgnoreCase("96KW")) {

                enginePowerPage.validateTextforEnginePower();
                enginePowerPage.clickOn96KW();
            } else if (enginePower.equalsIgnoreCase("330kw")) {

                enginePowerPage.validateTextforEnginePower();
                enginePowerPage.clickOn330KW();
            } else if (enginePower.equalsIgnoreCase("105kw")) {

                enginePowerPage.validateTextforEnginePower();
                enginePowerPage.clickOn105KW();
            } else if (enginePower.equalsIgnoreCase("49kw")) {

                enginePowerPage.validateTextforEnginePower();
                enginePowerPage.clickOn49KW();
            } else if (enginePower.equalsIgnoreCase("35kw")) {

                enginePowerPage.validateTextforEnginePower();
                enginePowerPage.clickOn35KW();
            }
        }catch (Exception e){
            uiActions.closeBrowser();
        }

    }

    @Then("^i click on the \"([^\"]*)\" engineType$")
    public void clickOnEngine(String engineType) throws Exception {

        try {

            selectEnginePage = new SelectEnginePage();
            if (engineType.equalsIgnoreCase("Cabriolet")) {

                selectEnginePage.selectEngine();
            } else if (engineType.equalsIgnoreCase("A1")) {

                selectEnginePage.selectEngineOfA1();
            } else if (engineType.equalsIgnoreCase("A4")) {

                selectEnginePage.selectEngineOfA4();
            } else if (engineType.equalsIgnoreCase("650cabri0")) {

                selectEnginePage.selectEngineOf6er();
            } else if (engineType.equalsIgnoreCase("418Dgran")) {

                selectEnginePage.selectEngineOf4er();
            } else if (engineType.equalsIgnoreCase("118D")) {

                selectEnginePage.selectEngineOfBMW1er();
            } else if (engineType.equalsIgnoreCase("MONTEGO")) {

                selectEnginePage.selectEngineOfAustinMontego();
            } else if (engineType.equalsIgnoreCase("MAESTRO, MG 1.3")) {

                selectEnginePage.selectEngineOfAustinMaestro();
            } else if (engineType.equalsIgnoreCase("METRO")) {

                selectEnginePage.selectEngineOfAustinMetro();
            }
        }catch (Exception e){
            uiActions.closeBrowser();
        }

    }

    @Then("^i enter \"([^\"]*)\" registration details$")
    public void enterRegistrationDetails(String vechileType) throws Exception {

        try {

            registrationDatePage = new RegistrationDatePage();
            if (vechileType.equalsIgnoreCase("AUDI")) {

                registrationDatePage.enterDetailsforAudi();
                System.out.println("entered");
            } else if (vechileType.equalsIgnoreCase("AUSTIN")) {

                registrationDatePage.enterDetailsforAustin();
                System.out.println("entered");
            } else if (vechileType.equalsIgnoreCase("BMW")) {

                registrationDatePage.enterDetailsforBMW();
                System.out.println("entered");
            }
        }
        catch (Exception e){
            uiActions.closeBrowser();
        }
    }

    @Then("^i enter date of Birth details for \"([^\"]*)\"$")
    public void dateOfBirth(String dobDetails) throws Exception {

        try {

            dobPage = new DOBPage();
            if (dobDetails.equalsIgnoreCase("AUDI")) {


                dobPage.enterDOBForAudi();
                dobPage.validateText();
                System.out.println("DOB entered");
            } else if (dobDetails.equalsIgnoreCase("AUSTIN")) {


                dobPage.enterDOBForAustin();
                dobPage.validateText();
                System.out.println("DOB entered");
            } else if (dobDetails.equalsIgnoreCase("BMW")) {


                dobPage.enterDOBForBMW();
                dobPage.validateText();
                System.out.println("DOB entered");
            }
        }catch (Exception e){
            uiActions.closeBrowser();
        }
    }


    @Then("^i navigate back to selectVechileModel page$")
    public void navigateToVechileModelPage() throws Exception {

            uiActions.pageNavigation();
    }

    @Then("^i select \"([^\"]*)\" as vechile body type$")
    public void selectVehileBodyType(String vechileBody) throws Exception {

        try {

            vechileBodyTypePage = new VechileBodyTypePage();
            if (vechileBody.equalsIgnoreCase("cabrio")) {

                vechileBodyTypePage.selectcabrio();
            } else if (vechileBody.equalsIgnoreCase("coupe")) {

                vechileBodyTypePage.selectCoupe();
            } else if (vechileBody.equalsIgnoreCase("Limousine")) {

                vechileBodyTypePage.selectLimousine();
            }
        }catch (Exception e){
            uiActions.closeBrowser();
        }

    }

    @Then("^i close the browser$")
    public void closeBrowserAndEndTest() throws Exception{

        uiActions.closeBrowser();

    }







}
