Feature: BMW test case

  @bmw-001
  Scenario: Test for Vechile Type BMW
    Given i open browser and navigate to test URL
    Then i click on the car is already insured section
    And I wait for "3" secs
    Then i click on the further button
    And I wait for "5" secs
    Then i move to RegisteredOwnerPage and click on newWithPurchase button
    Then i click on the further button
    And I wait for "5" secs
    Then i select "BMW" vechile
    And I wait for "3" secs
    Then i select vechilemodel as "6er"
    And I wait for "3" secs
    Then i select "cabrio" as vechile body type
    And I wait for "3" secs
    Then i select "PETROL" as fuelType
    And I wait for "5" secs
    Then i select "330KW" engine
    And I wait for "3" secs
    Then i click on the "650cabri0" engineType
    And I wait for "5" secs
    Then i enter "BMW" registration details
    And I wait for "5" secs
    Then i click on the further button
    And I wait for "5" secs
    Then i enter date of Birth details for "BMW"
    And I wait for "5" secs
    Then i navigate back to selectVechileModel page
    And I wait for "5" secs
    Then i select vechilemodel as "4er"
    And I wait for "3" secs
    Then i select "coupe" as vechile body type
    And I wait for "3" secs
    Then i select "DISEL" as fuelType
    And I wait for "5" secs
    Then i select "105KW" engine
    And I wait for "3" secs
    Then i click on the "418Dgran" engineType
    And I wait for "5" secs
    Then i enter "BMW" registration details
    And I wait for "5" secs
    Then i click on the further button
    And I wait for "5" secs
    Then i enter date of Birth details for "BMW"
    And I wait for "5" secs
    Then i navigate back to selectVechileModel page
    And I wait for "5" secs
    Then i select vechilemodel as "1er"
    And I wait for "3" secs
    Then i select "Limousine" as vechile body type
    And I wait for "3" secs
    Then i select "DISEL" as fuelType
    And I wait for "5" secs
    Then i select "105KW" engine
    And I wait for "5" secs
    Then i click on the "118D" engineType
    And I wait for "5" secs
    Then i enter "BMW" registration details
    And I wait for "5" secs
    Then i click on the further button
    And I wait for "5" secs
    Then i enter date of Birth details for "BMW"
    And I wait for "5" secs
    Then i close the browser