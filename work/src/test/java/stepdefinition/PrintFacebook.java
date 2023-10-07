package stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PrintFacebook {
	
public static WebDriver driver=null;

@Given("User launch chrome browser")
public void chromeLaunch() {
	   System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	  driver =new ChromeDriver();
//driver.manage().window().maximize();

}
@When("User click to search youtube")
public void searchButton() {
	driver.get("https://www.youtube.com/");
	}
@Then("User enter news in search box")
public void searchButtons() {
	if(driver.findElement(By.id("search")).isEnabled()) {
		System.out.println("test pass");
	}
	else {
		System.out.println("test fail");
	}

	  //driver.findElement(By.id("search")).sendKeys("News");
	  //driver.findElement(By.id("search-icon-legacy")).click();
	 
}
}