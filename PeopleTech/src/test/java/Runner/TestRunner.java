	package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\SanjeevaKumarGeejula\\Documents\\preparation\\ExitPreparation\\PeopleTech\\src\\test\\java\\FeatureFiles", // Path to the feature files
    glue = "src/test/java/StepDefinations", // Package where the step definitions are located
    plugin = {"pretty", "html:target/cucumber-reports.html"}, // Output reports
    monochrome = true, // Readable output
    dryRun = false, // Set to true to check if all steps have definitions without executing tests
    tags="@tag3"
)

public class TestRunner {
	
	

}
