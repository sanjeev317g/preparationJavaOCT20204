package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features=".//Features/Login.feature",
		glue="StepDefinations",
		dryRun=false,
		plugin= {"pretty", "html:test-output"},
		monochrome=true
		
		)

public class TestRun {

}
