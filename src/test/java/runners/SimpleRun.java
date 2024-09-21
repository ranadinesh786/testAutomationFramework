package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"steps","stepDefinition"},
        plugin = {"pretty"},
        publish = true,
        tags = "@smoke" // This will be overridden by the Gradle command
)
public class SimpleRun {
    // No additional configurations are necessary for basic setup
}
