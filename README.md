# Simple Selenium Automation Framework

A simple Java-based Selenium automation framework built for UI automation practice, interview preparation, and CI execution.

## Tech Stack

* Java 24
* Selenium WebDriver 4
* TestNG
* Maven
* Page Object Model (POM)
* WebDriverManager
* Allure Reports
* GitHub Actions

## Project Structure

```text
SimpleFW/
│
├── .github/
│   └── workflows/
│       └── selenium-tests.yml
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── framework/
│   │           ├── base/
│   │           ├── drivers/
│   │           ├── pages/
│   │           └── utils/
│   │
│   └── test/
│       ├── java/
│       │   └── tests/
│       └── resources/
│           └── config.properties
│
├── allure-results/
├── allure-report/
├── pom.xml
├── testng.xml
├── .gitignore
└── README.md
```

## Framework Features

* Page Object Model
* Reusable BasePage
* Centralised WebDriver management
* Configurable browser and test data
* Explicit waits
* TestNG test execution
* Screenshot capture on test failure
* Allure reporting
* Maven build and test execution
* GitHub Actions CI pipeline
* Headless browser support for CI execution

## Supported Browsers

The framework supports:

* Chrome
* Firefox
* Edge

The browser can be configured in:

```text
src/test/resources/config.properties
```

Example:

```properties
browser=chrome
headless=true
```

## Test Application

The framework currently uses SauceDemo as the practice application.

```text
https://www.saucedemo.com/
```

## Test Scenarios

The current test suite covers:

* Valid login
* Invalid login
* Add product to cart

## Running Tests Locally

Run the test suite using Maven:

```bash
mvn clean test
```

## Allure Reporting

Test execution generates Allure result files in:

```text
allure-results/
```

Generate the HTML report:

```bash
allure generate allure-results -o allure-report --clean
```

Open the report:

```bash
allure open allure-report
```

## Continuous Integration

The project uses GitHub Actions to automatically execute the Selenium test suite.

The workflow is located at:

```text
.github/workflows/selenium-tests.yml
```

The CI pipeline:

1. Checks out the source code
2. Sets up Java 24
3. Configures Maven dependency caching
4. Runs the Maven test suite
5. Executes Selenium tests in the CI environment

The workflow runs automatically when code is pushed to the `main` branch or when a pull request is created against `main`.

It can also be triggered manually using GitHub Actions.

## Configuration

Test configuration is maintained in:

```text
src/test/resources/config.properties
```

Example:

```properties
baseUrl=https://www.saucedemo.com/
browser=chrome
headless=true
username=standard_user
password=secret_sauce
```

## Author

Harshana Premarathna
