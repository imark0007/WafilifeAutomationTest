# WafilifeAutomationTest
## Web Automation Testing Framework
![Allure-Report](https://github.com/imark0007/WafilifeAutomationTest/assets/53122092/86362949-ad74-43c8-a605-3ffd6c8ce9af)

This repository contains a lightweight automation testing framework for web applications using Selenium WebDriver and TestNG.

## Features

- **Page Object Model (POM)**: Utilizes the Page Object Model design pattern for better code organization and maintainability.
- **TestNG**: Uses TestNG for test case management, parallel execution, and reporting.
- **Cross-browser Testing**: Supports testing across multiple browsers such as Chrome, Firefox, and Safari.
- **Reporting**: Generates comprehensive test reports for easy analysis of test results.
- **Reusable Components**: Provides reusable components and utilities for common tasks such as browser setup, logging, and assertions.
- **Configuration Management**: Allows easy configuration of test parameters using properties files.
- **Continuous Integration**: Integrates seamlessly with CI/CD pipelines for automated testing.

### Getting Started
Follow these steps to set up your development environment and start using Selenium with Java

### Prerequisites

1. [Java JDK](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html)
2. Choose one of the following IDE:
    - [Eclipse](https://www.eclipse.org/downloads/packages/release/2024-03/r/eclipse-ide-java-developers)
    - [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) : I personally used this IDEA
    - [Spring Tools](https://spring.io/tools)
3. [Apache Maven](https://maven.apache.org/download.cgi) 

### Installation

1. Java JDK
    - Download the installer from the [Oracle Java SE Downloads](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html) page.
    - Run the installer and set up the JDK.
2. IDE
    - Download and install your preferred IDE.
3. Apache Maven
    - Download Apache Maven from the [official website](https://maven.apache.org/download.cgi).
    - Follow installation instructions.
  
### Setting Up Java JDK

1. Download the JDK installer from Oracle.
2. Run the installer and select your installation folder.
3. Set up JAVA_HOME and PATH environment variables:
         - Open System Properties.
         - Navigate to Environment Variables.
         - Add JAVA_HOME with the JDK installation path.
         - Update the PATH variable to include %JAVA_HOME%\bin.
4. Verify Java installation by running java --version in a terminal.

### Setting Up Spring Tools

1. Download Spring Tools from the [official website](https://spring.io/tools).
2. Run the installer and select the package to install.
3. Choose your installation folder and complete the setup.
4. Launch Spring Tools to start using it.

### Installing Apache Maven

1. Check if you have Java installed by running java --version.
2. Download Apache Maven from the [official website](https://maven.apache.org/download.cgi).
3. Extract the archive to your desired location.
4. Set up M2_HOME and MAVEN_HOME environment variables:
    - Create M2_HOME and point it to the Maven installation directory.
    - Update the PATH variable to include %M2_HOME%\bin.
5. Verify Maven installation by running mvn --version in a terminal.

### Built With

1. [Java JDK](https://www.oracle.com/java/) - Java Development Kit
2. [Spring Tools](https://spring.io/tools/) - IDE for Spring applications
3. [Apache Maven](https://maven.apache.org/) - Dependency Management
4. [Allure Report](https://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline/2.29.0/) - Download the ZiP file

### Installation Steps
To start using the framework:

1. [Fork](https://github.com/imark0007/WafilifeAutomationTest.git) the repository.
2. Clone, i.e, download your copy of the repository to your local machine using
```
git clone https://github.com/imark0007/WafilifeAutomationTest.git
```
3. Import the project into your preferred IDE (Eclipse, IntelliJ IDEA, or Spring Tools).
4. Make any desired changes or additions to the project.\
5. To see Allure Report with results type:
```
allure generate .\allure-results\ --clean
allure open .\allure-report\
```
6. Run this test with mvn
```
mvn clean
mvn test
mvn test -D"browser=chrome"

```
7. Using Suite XML Files
```
mvn test -D"browser=chrome" -D"xmlFileName=testng.xml"
```
##### Maven Dependencies

###### Selenium TestNG Webdriver Manager

```xml
<dependencies>
    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.19.1</version>
    </dependency>

    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>RELEASE</version>
        <scope>test</scope>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.testng/testng -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.10.2</version>
        <scope>test</scope>
    </dependency>
    <!-- https://mvnrepository.com/artifact/io.qameta.allure/allure-testng -->
    <dependency>
        <groupId>io.qameta.allure</groupId>
        <artifactId>allure-testng</artifactId>
        <version>2.27.0</version>
    </dependency>
</dependencies>
<build>
<plugins>
    <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.1.2</version>
        <configuration>
            <suiteXmlFiles>
                <suiteXmlFile>testng.xml</suiteXmlFile>  <!--   for specific xml file :  <suiteXmlFile>${xmlFileName}</suiteXmlFile>-->
            </suiteXmlFiles>
        </configuration>
    </plugin>
</plugins>
</build>
```
