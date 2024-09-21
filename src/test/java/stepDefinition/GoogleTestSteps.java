package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTestSteps {

    private WebDriver driver;

    @Given("I open the Google Chrome browser")
    public void iOpenTheGoogleChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @When("I navigate to google.com")
    public void iNavigateToGoogleCom() {
        driver.get("https://parabank.parasoft.com/parabank/index.html");
    }

    @When("I maximize the browser window")
    public void iMaximizeTheBrowserWindow() {
        driver.manage().window().maximize();
    }

    @Then("I get the page title")
    public void iGetThePageTitle() {
        System.out.println("Page title is: " + driver.getTitle());
    }

    @Then("I close the browser")
    public void iCloseTheBrowser() {
        driver.quit();
    }
}
