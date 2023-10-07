package runnertest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/main/java/feature/data.feature"},
	publish = true,
	glue = {"stepdefinition"}	
	)
public class support {

}
