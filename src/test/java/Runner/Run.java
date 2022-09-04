package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import cucumber.api.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/firstTest.feature",
        glue = {"src/test/java/StepDefinitions","src/test/java/Utility"}
)

public class Run extends AbstractTestNGCucumberTests {
}