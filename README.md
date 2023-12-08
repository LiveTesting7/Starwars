Starwars Appium Automation Project

The Starwars Appium Automation Project is designed to interact with communities by creating a group and fostering collaboration.

## Prerequisites

Before setting up the project, ensure you have the following prerequisites:

**Java JDK:** 11
**Eclipse:** Version 2023-06
**Maven:** Version 3.8.8
**NodeJS:** Version 18.12.10
**Android Studio:** Version 2021.3.1
**Appium Client Inspector**

### Dependencies

Add the following dependencies to your `pom.xml`:

```xml
<dependency>
    <groupId>io.appium</groupId>
    <artifactId>java-client</artifactId>
    <version>8.3.0</version>
</dependency>

<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-remote-driver</artifactId>
    <version>4.13.0</version>
</dependency>

### Setting Up the Project

Clone the repository:
git clone https://github.com/yourusername/starwars-appium.git
cd starwars-appium
Open the project in Eclipse.

### Verify the following tools are installed and configured:

**Java JDK:** 11
**Eclipse:** Version 2023-06
**Maven:** Version 3.8.8
**NodeJS:** Version 18.12.10
**Android Studio:** Version 2021.3.1
**Appium Client Inspector**
Ensure the Appium server is up and running and the emulator is in ready mode.

## Importing and Running the Project in Eclipse IDE

1. **Open Eclipse IDE:**
Launch the Eclipse IDE.

2. **Import the Project:**
In Eclipse, go to `File` > `Import`.
Select `Maven` > `Existing Maven Projects`.
Click `Next`.

3. Select the project directory:
Browse and select the root directory of your cloned project (`starwars-appium`).
Click `Finish`.

4. **Verify Maven Dependencies:**
Eclipse will automatically download and configure the Maven dependencies specified in the `pom.xml` file. Wait for this process to complete.

5. Configure the Java Build Path:
Right-click on the project in the `Project Explorer`.
Select `Properties` > `Java Build Path`.
Ensure the correct Java JDK is selected on the `Libraries` tab.

6. **Run Configurations:**
Right-click on the `TestNG` file (e.g., `testng.xml`) in the `src/test/resources` folder.
Choose `Run As` > `TestNG Suite`.

7. **Run the Tests:**
After running the TestNG suite, you should see the test execution in the TestNG Results window.
Alternatively, you can right-click on the test class (`LoginTest.java`) and select `Run As` > `TestNG Test`.

8. View Test Reports:
Test reports can be found in the `target/surefire-reports` directory.

Congratulations! You have successfully imported and run the Appium automation project in the Eclipse IDE.


### Running Tests in maven 

Before running tests, make sure the Appium server is running and the emulator is ready. Follow these steps:

Open a command prompt.
Navigate to the project folder.
Verify that pom.xml is available.

### Run the following command:
mvn clean test

Congratulations! You have successfully imported and run the Appium automation project in the Command prompt.
