Zeno Test Project (OpenWeather)

Project Structure:

test_initiator: MainTest.java - The main test class that initiates and executes the test suite.
pages:
HomePage.java - Contains methods for interacting with the OpenWeather homepage elements.
MapPage.java - Contains methods for interacting with the OpenWeather map page elements.
test_data: CSVtest.csv - A CSV file containing test data for the tests (weather data, locations, etc.).
report: Index.html - The generated HTML report containing test results and details.
Dependencies:

Selenium Java
TestNG
ExtentReports
OpenCSV
Running the Project:

Set up project environment:

Ensure you have Java (JDK) and an IDE (e.g., IntelliJ IDEA) installed.
Download the required JAR files for the listed dependencies (Selenium Java, TestNG, ExtentReports, OpenCSV) and add them to your project's classpath.
Execute the tests:

Open your IDE and import the project.
Navigate to the MainTest.java file.
Right-click on the class and select "Run as TestNG Test" (or follow your IDE's specific instructions for running TestNG tests).
