# Automation Exercise Project
This project was created to implement a variety of UI and API Scenarios for
the Automation Exercise page including positive and negative login scenarios;
and API responses

# Design Approach:
-The framework is created by using Selenium-Java-Cucumber BDD features.
-This design approach is implemented to make sure the behavior of the scripts
is straightforward for everybody in the development team including non-
technical team members
-It is open source and one of the most commonly used test framework used by
SDETs with plenty of resources and community support
-It can be executed on cloud VM Servers, BrowserStack, Sauce Labs, AWS and
Docker Container
-With cucumber feature files test steps are easy to re-create and implement
changes
-I have implemented a Page Object Design Pattern to organize, store, and
maintain related test elements
In this design pattern:
*Hooks package to implement before and after each scenario
*Pages package to store same-page web elements and methods
*Runner package to configure different sets of test runs as well as some
useful plugins
*Utilities to store drivers and common reusable methods
*resources and features to sort and store related test steps and features
*Configuration.properties file to store and update test data

# Reports: Extent Report
Extent report is convenient and easy to integrate with TestNG and if required
screenshots can be captured
It will allow testers to track multiple test case runs in a single test
suite.
It will show the time needed for test execution.
Easy to read and understand with graphics and tables
It will allow to send email reports to team members
(PDF Reports will create a PDF report under test-output folder,
Spark report folder will create an HTML report to open with a browser under
the test-output folder.

# Installation and Running First Test
# Prerequisites:
1. Java
2. Intellij IDEA
3. Maven
# Plugins for IntelliJ:
1. Cucumber for Java (By JetBrains)
2. Gherkin (By JetBrains)

# After cloning the project build the project with maven with the below
command for the first time:
mvn test

# Use any test runner to run configured cucumber tests
Ex1: Right click on UiRunner class and click on Run 'UiRunner';
Ex2: Click on the run icon in a specific feature file