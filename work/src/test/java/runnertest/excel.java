package runnertest;

import org.junit.runner.RunWith;
	/*import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;*/
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
		features = {"src/main/java/feature/sheet.feature"},
		publish = true,
		glue = {"stepdefinition"}	
		)
	public class excel {

	}