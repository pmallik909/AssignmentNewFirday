-----------------------------------------  FRAMEWORK DETAILS -------------------------

This is a sample Cucumber and JAVA, Selenium based framework for the Test Application to  Automate.

Build Tool - Gradle
Coding Language - Core java,
Tools - Selenium, Cucumber, Gherkin


I have used Cucumber and Gherkin which helped in easy understanding and maintaining of the test cases.
The framework consist of Page Object Model.

How to Run
Execute the TestRunner file, which will execute all the feature files present in the framework

EnhanceMents

For the enhancements to run the test from command line i have a task which can be used to trigger the test
Further more enhancements we can add cucumber-JVM which will help in getting and html report.

The framework can be split to multliple steps file( as per vechiles ), which will help us avoiding ambiguity.


Negative Scenario

- enter dates while age is not more than 18 year leads to error
- entering dummy data in the input fields leads to error

HOW TO RUN

- Execute the TestRunner file to run all the features together
- select individual feature and click run for indivisual run
- a gradle task is also present in build.gradle which can also execute the test cases. (This can be enhanced with multiple parameters).
