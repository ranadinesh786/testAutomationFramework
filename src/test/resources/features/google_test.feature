@smoke
Feature: Google Test

  Scenario: Open Google and verify title
    Given I open the Google Chrome browser
    When I navigate to google.com
    When I maximize the browser window
    Then I get the page title
    Then I close the browser
