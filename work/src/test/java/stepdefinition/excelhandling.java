package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class excelhandling {

    WebDriver driver;
    WebDriverWait wait;

    @Given("User is on the Yahoo login page")
    public void userIsOnYahooLoginPage() {
    	System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://login.yahoo.com");
        
    }

    @When("User enters valid username and password")
    public void userEntersValidCredentials() throws InterruptedException {
        WebElement usernameField = driver.findElement(By.id("login-username"));
        WebElement nextButton = driver.findElement(By.id("login-signin"));

        usernameField.sendKeys("nithya");
        nextButton.click();
        Thread.sleep(3000);       
        
        // Wait for the password field to be visible
       // WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-passwd")));

        // Enter the password
        WebElement passwordField = driver.findElement(By.id("login-passwd"));
        passwordField.sendKeys("nithya");
    }

    @When("User clicks on the login button")
    public void userClicksLoginButton() {
        WebElement loginButton = driver.findElement(By.id("login-signin"));
        loginButton.click();
    }

    @Then("User should be logged in successfully")
    public void userShouldBeLoggedInSuccessfully() {
        // Validate successful login
        // Add your assertions here
    }

    @When("User selects a checkbox")
    public void userSelectsCheckbox() {
        // Select a checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkboxId']"));
        checkbox.click();
    }

    @When("User selects a radio button")
    public void userSelectsRadioButton() {
        // Select a radio button
        WebElement radioButton = driver.findElement(By.xpath("//input[@id='radioButtonId']"));
        radioButton.click();
    }

    @Then("User's preferences should be updated")
    public void userPreferencesShouldBeUpdated() {
        // Validate that preferences are updated
        // Add your assertions here
    }

    @When("User triggers an alert")
    public void userTriggersAlert() {
        // Trigger an alert
        WebElement triggerAlertButton = driver.findElement(By.xpath("//button[@id='triggerAlertButton']"));
        triggerAlertButton.click();
    }

    @Then("User should handle the alert")
    public void userShouldHandleAlert() {
        // Handle the alert
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }

    @When("User performs a wait for an element")
    public void userPerformsWaitForElement() {
    }

    @Then("User should see the element")
    public void userShouldSeeElement() {
        // Validate that the element is visible
        // Add your assertions here
    }

    @When("User reads data from Excel")
    public void userReadsDataFromExcel() {
        // Read data from Excel
        // Use a suitable library like Apache POI to read Excel data
        // Example code:
        // FileInputStream fis = new FileInputStream("path/to/excelfile.xlsx");
        // Workbook workbook = new XSSFWorkbook(fis);
        // ...
    }

    @Then("User should process the data")
    public void userShouldProcessData() {
        // Process the read Excel data
        // Add your processing logic here
    }

    @After
    public void tearDown() {
        // Close the WebDriver
        if (driver != null) {
            driver.quit();
        }
    }
}

		 