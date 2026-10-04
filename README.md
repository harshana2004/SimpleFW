Simple Java - Selenium Automation Framework

A simple Java-based Selenium automation framework built for UI automation practice and interview preparation.

Tech Stack
Java 17
Selenium WebDriver 4
TestNG
Maven
Page Object Model (POM)
WebDriverManager
Allure Reports
Project Structure
SimpleFW/
│
├── src/
│   ├── main/java/framework/
│   │   ├── base/
│   │   ├── drivers/
│   │   ├── pages/
│   │   └── utils/
│   │
│   └── test/
│       ├── java/tests/
│       └── resources/
│           └── config.properties
│
├── allure-results/
├── allure-report/
├── pom.xml
├── testng.xml
├── .gitignore
└── README.md
Framework Features
Page Object Model
Reusable BasePage
Centralised WebDriver management
Configurable browser and test data
Explicit waits
TestNG test execution
Screenshot capture on test failure
Allure test reporting
Maven build and test execution
Running Tests

Run the tests using Maven:

mvn clean test
Generate Allure Report

After the tests finish, generate the Allure HTML report:

allure generate allure-results -o allure-report --clean

Open the report:

allure open allure-report
Browsers

The framework currently supports:

Chrome
Firefox
Edge

The browser can be configured in:

src/test/resources/config.properties

Example:

browser=chrome
Test Application

The framework uses SauceDemo as the practice application:

https://www.saucedemo.com/
Example Tests

The current test suite includes:

Valid login
Invalid login
Add product to cart
Author

Harshana Premarathna