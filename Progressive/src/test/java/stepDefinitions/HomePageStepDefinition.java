package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageStepDefinition extends WebAPI {
    static HomePage homePage;

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }


    @Given("I am at progressive home page")
    public void i_am_at_progressive_home_page() throws IOException {
        openBrowser("https://www.progressive.com/");
    }

    @Given("I click on claims")
    public void i_click_on_claims() {
        homePage.checkClaims();
    }

    @Given("i click on claims over view")
    public void i_click_on_claims_over_view() {
        homePage.checkClaimsOverView();
    }

    @When("I click on Auto")
    public void i_click_on_auto() {
        homePage.checkAuto();
    }


    @Then("I should see repair")
    public void i_should_see_repair() {
        homePage.verifyRepair();
    }

    @Given("I click on Explore Products")
    public void i_click_on_explore_products() {
        homePage.checkExploreProducts();
    }

    @Given("I click on ATV")
    public void i_click_on_atv() {
        homePage.checkATV();
    }

    @When("I enter zip code {string}")
    public void i_enter_zip_code(String zipCode) {
        homePage.checkZipCodeLocation(zipCode);
    }

    @Then("I should see get a quote")
    public void i_should_see_get_a_quote() {
        homePage.verifyGetAQuote();
    }
//
//    @Given("I click on get a quote")
//    public void i_click_on_get_a_quote() {
//        homePage.checkGetAQuote();
//    }

    @Given("I enter first name {string}")
    public void i_enter_first_name(String firstNameBox) {
        homePage.checkFirstName(firstNameBox);
    }

    @Given("I enter last name {string}")
    public void i_enter_last_name(String lastNameBox) {
        homePage.checkLastName(lastNameBox);
    }

    @When("I enter date of birth {string}")
    public void i_enter_date_of_birth(String dateOfBirthBox) {
        homePage.checkDateOfBirth(dateOfBirthBox);
    }

    @Then("I should see mailing address option")
    public void i_should_see_mailing_address_option() {
        homePage.verifyMailingAddressOption();
    }

    @Given("I enter zip code1 {string}")
    public void i_enter_zip_code1(String autoZipcode) {
        homePage.checkZipCode1(autoZipcode);
    }

    @Given("I click on Auto1")
    public void i_click_on_auto1() {
        homePage.checkAuto1();
    }

    @Given("I click on Boat")
    public void i_click_on_boat() {
        homePage.checkBoat();
    }

    @Given("I click on fishing boat")
    public void i_click_on_fishing_boat() {
        homePage.checkFishingBoat();
    }

    @Given("I click on boat Insurance requirement")
    public void i_click_on_boat_insurance_requirement() {
        homePage.checkBoatInsuranceRequirement();
    }

    @When("I click on quote boat Insurance")
    public void i_click_on_quote_boat_insurance() {

    }

    @Then("I should see progressive boat Insurance")
    public void i_should_see_progressive_boat_insurance() {

    }

    @When("I click see more types")
    public void i_click_see_more_types() {
        homePage.checkMoreTypes();
    }

    @Then("I should see sail boats")
    public void i_should_see_sail_boats() {

    }

    @Given("I click on motorcycle")
    public void i_click_on_motorcycle() {
        homePage.checkMotorCycle();
    }

    @When("I click find agent")
    public void i_click_find_agent() {
        homePage.checkFindAgent();
    }

    @Then("I should see local insurance agent")
    public void i_should_see_local_insurance_agent() {
        homePage.verifyLocalInsuranceAgent();
    }

    @Given("I click on homeOwners")
    public void i_click_on_home_owners() {
        homePage.checkHomeOwners();
    }

    @Given("I click Compare home insurance quotes")
    public void i_click_compare_home_insurance_quotes() {
        homePage.checkHomeInsurance();
    }

    @When("I enter zip code \"{int}")
    public void i_enter_zip_code(Integer int1) {

    }

    @Then("I should see get started")
    public void i_should_see_get_started() {

    }

}