Feature: AUDI test case

  @audi-001
Scenario: Test for Vechile Type AUDI
    Given i open browser and navigate to test URL
    Then i click on the car is already insured section
    And I wait for "3" secs
    Then i click on the further button
    And I wait for "5" secs
    Then i move to RegisteredOwnerPage and click on newWithPurchase button
    Then i click on the further button
    And I wait for "5" secs
    Then i select "AUDI" vechile
    And I wait for "5" secs
    Then i select vechilemodel as "Cabriolet"
    And I wait for "3" secs
    Then i select "PETROL" as fuelType
    And I wait for "5" secs
    Then i select "85KW" engine
    And I wait for "3" secs
    Then i click on the "Cabriolet" engineType
    And I wait for "5" secs
    Then i enter "AUDI" registration details
    And I wait for "5" secs
    Then i click on the further button
    And I wait for "5" secs
    Then i enter date of Birth details for "AUDI"
    And I wait for "5" secs
    Then i navigate back to selectVechileModel page
    And I wait for "3" secs
    Then i select vechilemodel as "A1"
    And I wait for "3" secs
    Then i select "DISEL" as fuelType
    And I wait for "3" secs
    Then i select "66KW" engine
    And I wait for "3" secs
    Then i click on the "A1" engineType
    And I wait for "3" secs
    Then i enter "AUDI" registration details
    And I wait for "3" secs
    Then i click on the further button
    And I wait for "3" secs
    Then i enter date of Birth details for "AUDI"
    And I wait for "3" secs
    Then i navigate back to selectVechileModel page
    And I wait for "3" secs
    Then i select vechilemodel as "A4"
    And I wait for "3" secs
    Then i select "cabrio" as vechile body type
    And I wait for "3" secs
    Then i select "PETROL" as fuelType
    And I wait for "5" secs
    Then i select "96KW" engine
    And I wait for "3" secs
    Then i click on the "A4" engineType
    And I wait for "3" secs
    Then i enter "AUDI" registration details
    And I wait for "3" secs
    Then i click on the further button
    And I wait for "3" secs
    Then i enter date of Birth details for "AUDI"
    And I wait for "3" secs
    Then i close the browser
  #Then  u test it


