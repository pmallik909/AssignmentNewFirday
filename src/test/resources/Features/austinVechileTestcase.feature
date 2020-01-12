Feature: Austin test case

  @austin-001
  Scenario: Test for Vechile Type AUSTIN
    Given i open browser and navigate to test URL
    Then i click on the car is already insured section
    And I wait for "3" secs
    Then i click on the further button
    And I wait for "5" secs
    Then i move to RegisteredOwnerPage and click on newWithPurchase button
    Then i click on the further button
    And I wait for "5" secs
    Then i select "AUSTIN" vechile
    And I wait for "5" secs
    Then i select vechilemodel as "Estate"
    And I wait for "5" secs
    Then i select "PETROL" as fuelType
    And I wait for "5" secs
    Then i click on the "MONTEGO" engineType
    And I wait for "5" secs
    Then i enter "AUSTIN" registration details
    And I wait for "5" secs
    Then i click on the further button
    And I wait for "5" secs
    Then i enter date of Birth details for "AUSTIN"
    And I wait for "5" secs
    Then i navigate back to selectVechileModel page
    And I wait for "2" secs
    Then i select vechilemodel as "maestro"
    And I wait for "5" secs
    Then i select "49KW" engine
    And I wait for "3" secs
    Then i click on the "MAESTRO, MG 1.3" engineType
    And I wait for "5" secs
    Then i enter "AUSTIN" registration details
    And I wait for "5" secs
    Then i click on the further button
    And I wait for "5" secs
    Then i enter date of Birth details for "AUSTIN"
    And I wait for "5" secs
    Then i navigate back to selectVechileModel page
    And I wait for "3" secs
    Then i select vechilemodel as "metro"
    And I wait for "5" secs
    Then i select "35KW" engine
    And I wait for "3" secs
    Then i click on the "METRO" engineType
    And I wait for "3" secs
    Then i enter "AUSTIN" registration details
    And I wait for "5" secs
    Then i click on the further button
    And I wait for "5" secs
    Then i enter date of Birth details for "AUSTIN"
    And I wait for "5" secs
    Then i close the browser