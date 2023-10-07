package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class parameters {
	public	static WebDriver driver;
	
	@Given ("User is on login page")
	public void user_is_on_login_page() {
		 System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
	}	
//	@When("User enters valid username and password")
	@When("User enters valid {string} and {string}")
//	public void  credantials() {
	public void user_enters_valid_and(String string, String string2) {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	@And("Clicks on Login Button")
	public void click_on_login_button() {
		driver.findElement(By.id("login-button")).click();
	}
	@Then("User in navigated to Home page")
	public void navigation() {
		Assert.assertTrue("User is navigated to Home page",driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0);
	}
	@And("Close the browser")
	public void close_the_browser() {
		driver.close();
	}
	 @After
	    public void confirmation_message() {
	        System.out.println("Test completed successfully.");
	    }
}