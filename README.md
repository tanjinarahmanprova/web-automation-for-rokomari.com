
# Web Automation Project for Rokomari.com Using Selenium and Java


## Table of content
- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Installation and Setup](#installation-and-setup)
    - [Java JDK](#java-jdk)
    - [IDE](#ide)
    - [Apache Maven](#apache-maven)
    - [Allure](#allure)
    - [Chrome for Testing](#chrome-for-testing)
- [Project Installation Steps](#project-installation-steps)
- [Video Recording of Project](#video-recording-of-project)
- [Work Description](#work-description)
- [Contact](#contact)

## Overview
This repository contains a web automation project for Rokomari.com. The project leverages Selenium WebDriver for browser automation and Java as the programming language, with Maven for dependency management and Allure TestNG is used for generating detailed test reports.

## Prerequisites
- [Java JDK](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
- Choose one of the following IDE:
    - [Eclipse](https://www.eclipse.org/downloads/packages/release/2024-03/r/eclipse-ide-java-developers)
    - [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
    - [Spring Tools](https://spring.io/tools)
- [Apache Maven](https://maven.apache.org/download.cgi)
- [Allure](https://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline/2.29.0/)
- [Chrome for Testing](https://googlechromelabs.github.io/chrome-for-testing/)

## Installation and Setup
### java JDK
- Download the installer from the [Oracle Java SE Downloads](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html) page.
- Run the installer and set up the JDK.
- Set up JAVA_HOME and PATH environment variables:
    - Open System Properties.
    - Navigate to Environment Variables.
    - Add JAVA_HOME with the JDK installation path.
    - Update the PATH variable to include %JAVA_HOME%\bin.
- Verify Java installation by running java --version in a terminal.
### IDE
- Download IntelliJ IDEA community edition from the [official website](https://www.jetbrains.com/idea/download/).
- Run the installer.
- Choose your installation folder and complete the setup.
- Launch IntelliJ IDEA to start using it.
### Apache Maven
- Download Apache Maven from the [official website](https://maven.apache.org/download.cgi).
- Extract the zip file to a directory of your choice.
- Set up MAVEN_HOME and PATH environment variables:
    - Open System Properties.
    - Navigate to Environment Variables.
    - Add MAVEN_HOME with the path of Maven directory.
    - Update the PATH variable to include %MAVEN_HOME%\bin.
- Verify Apache Maven installation by running mvn -v in a terminal.
### Allure
- Download allure-commandline-2.29.0.zip from [Allure Repository](https://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline/2.29.0/).
- Extract the zip file to a directory of your choice.
- Set up PATH environment variables:
    - Open System Properties.
    - Navigate to Environment Variables.
    - Update the PATH variable with the location of bin folder.
- Verify Allure installation by running allure --version in a terminal.
### Chrome for Testing
- Download a stable version of [Chrome for Testing](https://googlechromelabs.github.io/chrome-for-testing/).
- Extract the zip file to a directory of your choice.

## Project Installation Steps
Follow these steps to set up and start using the framework

- [Fork](https://github.com/tanjinarahmanprova/web-automation-for-rokomari.com.git) the repository.
- Clone
```
git clone https://github.com/tanjinarahmanprova/web-automation-for-rokomari.com.git
```
- Import the project into your preferred IDE (Eclipse, IntelliJ IDEA or Spring Tools).
- Make any desired changes or additions to the project.
- To run 
```
mvn test
```

## Video Recording of Project
https://github.com/tanjinarahmanprova/web-automation-for-rokomari.com/assets/129376867/78861f17-c5c6-480e-b49a-62183f504bb3


### Work Description

- Access user data of local session to bypass otp
-  Select লেখক from the menu
- Select হুমায়ুন আহমেদ
- Filter  Categories like সমকালীন উপন্যাস, রচনা সংকলন ও সমগ্র
- Scroll Down and go to Next Page
- Add to the cart any book
- Click Cart Icon
- Go to the Shipping page
- Provide your Shipping Information
- Sign out



## Contact
For questions or feedback, please feel free to reach out:
- **GitHub**: [Tanjina Rahman](https://github.com/tanjinarahmanprova)
- **Email**: [rahmantanjina983@gmail.com](mailto:rahmantanjina983@gmail.com)
- **LinkedIn**: [Tanjina Rahman](https://www.linkedin.com/in/tanjina-rahman-a53662191/)


