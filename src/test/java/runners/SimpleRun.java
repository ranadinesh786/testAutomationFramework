package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"steps"}, // Correct package name for step definitions
        plugin = {"pretty"},
        publish = true,
        tags = "@smoke"
)
public class SimpleRun {
    // Additional test configurations or methods can be added here
}
