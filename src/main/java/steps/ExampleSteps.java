package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class ExampleSteps extends UIInteractionSteps {

    @Given("I open the browser")
    public void iOpenTheBrowser() {
        openUrl("http://the-internet.herokuapp.com/");
    }

    @When("I navigate to the internet page")
    public void iNavigateToTheInternetPage() {
        // Navigation logic, if needed
    }

    @Then("I should see the welcome text")
    public void iShouldSeeTheWelcomeText() {
        String welcomeText = getDriver().findElement(By.tagName("h1")).getText();
        assertThat(welcomeText).isEqualTo("Welcome to the-internet");
    }
}
