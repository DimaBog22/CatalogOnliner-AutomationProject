CatalogOnliner-AutomationProject
=====================
Requirements
-----------------------------------
* Java version > 8
* Maven
* Selenium + TestNG
* Realization - PageObject pattern
* Using RestAssured
* Using Allure
* Building the project through mvn + testng.xml(there are 4 xml files for execution tests)

Running tests
-----------------------------------
* Clone the project 
```
git clone https://github.com/DimaBog22/CatalogOnliner-AutomationProject.git
```
* Checkout to the main branch
* Run tests with maven:
  ```
  mvn clean test -Dsuite="src/test/resources/addOrRemoveTests.xml
  mvn clean test -Dsuite="src/test/resources/addOrRemoveTests2.xml
  mvn clean test -Dsuite="src/test/resources/apiTests.xml
  mvn clean test -Dsuite="src/test/resources/basicTests.xml
  ```
Driver implementation
-----------------------------------
### Driver is implemented in src/main/java/driver, Listener - src/main/java/testNG/
* BaseTest contains methods setupDriver() and closeDriver(), also BaseTest is connected with Listener
* Listener contains a method for taking screenshots on failed results and a method for allure results
* DriverCreation contains methods getDriver() and quitDriver(), also there is ThreadLocal<WebDriver> driver what help use parallel execution of tests

Allure reports
-----------------------------------
* use this command to generate a report
  ```
  allure generate --clean
  ```
* use this command to open a report
  ```
  allure open
  ```