package module3;

public class Lesson3 {

    // Dependancy, JAR file, or libraries are all synonyms. What we're saying is we're reusing our common methods
    // and behaviors.

    // Unit Testing
    // We use unit testing to verify a small chunk of code.
    // It's performed by the developers.
    // - Both Front End and Back End devs do unit tests for their code.
    // - Devs write some test code to test their block of codes, methods, etc.
    // - Unit tests are way faster than UI testing.
    // - Unit testing is used to identify defects early in software dev cycle.
    // - It helps developer to write more readable, reliable, and reusable code.

    // Unit Testing is NOT performed by automation testers. (unless the company sucks)
    // Our codeboard uses unit testing to check our answers.

    // It is used by developers as a way to find bugs in their code early on, before it's even deployed.


    // TestNG
    // TestNG is about comparing expected vs actual result.
    // - To achieve this goal we need some sort of testing framework. (testng)

    // TestNG is one of the most popular unit testing framework to test Java applications.
    // - there are two kinds of framework, user-defined and built in frameworks (TestNG, JUnit, etc)

    // TestNG is usually used for Unit testing in Java,
    // but it can be used with Selenium WebDriver to automate testing of web applications.

    // Using TestNG you can assert expectations, which allows you to PASS or FAIL a test case based on the actual result.

    // WebDriver is one of the main classes in Selenium, where Assert is one main class of TestNG
    // We will be combining them to get our desired result.


    // TestNG
    // - NG stands for "Next Generation"
    // - Shows how many test cases are PASSED, FAILED, or SKIPPED.
    // - Note: if exceptions happen in TestNG, only that method fails, rest of the methods continue to run.
    // - You can execute failed test cases separately. (Can't achieve it with main method)

    // TestNG offers some of the important features below:
    // Order of execution -> @Test(priority=1)
    // Parallel execution -> by using XML file. You can do cross-browser testing in parallel.
    // Parameterized Tests -> by using @Data Providers
    // Using testNG you get html report by default
    // Dependency test -> allows a test method to depend on a single or a group of test methods.
    // - Uncaught exceptions are automatically handled by TestNG without terminating the test
    //   prematurely. These exceptions are reported as failed steps in the report.




    // Build lifecycle
    // validate: check if all info necessary for the build is available
    // compile: compiles the source code of the project
    // test: tests the compiled code and these tests do not require packaging or deployment.
    // package: package is used to convert your project into a jar or war, etc.
    // verify: run any checks on results of integration tests to ensure quality criteria are met.
    // install: install the package into the local repository for use of another project
    // deploy: copy the package to the remote repository.


    // Think of dependancies like an account number for that collection of a Jar file. It gives us access
    // to certain collections and lets us integrate it into our projects.


}
