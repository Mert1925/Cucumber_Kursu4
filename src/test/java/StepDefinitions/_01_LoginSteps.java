package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://demo.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click Login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        System.out.println("Merhaba TestNG");
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        System.out.println("Merhaba Cucumber");
    }
}
