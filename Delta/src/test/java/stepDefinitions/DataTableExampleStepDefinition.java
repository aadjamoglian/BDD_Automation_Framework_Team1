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
import org.testng.Assert;

import java.io.IOException;

public class DataTableExampleStepDefinition extends WebAPI {
    static HomePage homePage;

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


    @Given("I am at delta homepage")
    public void i_am_at_delta_homepage() throws IOException {
        openBrowser("https://www.delta.com/");

    }

    @Given("I click on travel info")
    public void i_click_on_travel_info() {
        homePage.checkTravelInfo();

    }

//    @Given("I click on travel planning center")
//    public void i_click_on_travel_planning_center() {
//        homePage.checkTravelPlanningCenter();
//    }

//    @When("I click on reconnect with travel")
//    public void i_click_on_reconnect_with_travel() {
//        homePage.checkReconnectWithTravel();
//    }
//
//    @Then("I should see Reconnect With the Joy of Travel")
//    public void i_should_see_reconnect_with_the_joy_of_travel() {
//
//    }

    @When("I click on travel planning center")
    public void i_click_on_travel_planning_center() {
        homePage.checkTravelPlanningCenter();
    }

    @Then("I should see Travel Planning Center")
    public void i_should_see_travel_planning_center() {
        homePage.verifyTravelPlanningCenter();
    }

    @Given("I click on safer travel")
    public void i_click_on_safer_travel() {
        homePage.checkSaferTravel();
    }

//    @Given("I click on mask requirement")
//    public void i_click_on_mask_requirement() {
//        homePage.checkMaskRequirement();
//    }
//
//    @When("I click on safety commitment")
//    public void i_click_on_safety_commitment() {
//        homePage.checkSafetyCommitment();
//    }

    @When("I click on mask requirement")
    public void i_click_on_mask_requirement() {
        homePage.checkMaskRequirement();
    }

    @Then("I should see face masks")
    public void i_should_see_face_masks() {
        homePage.verifyFaceMasks();
    }

    @Given("I click on airline partners")
    public void i_click_on_airline_partners() {
        homePage.checkAirlinePartners();
    }

    @When("I click on air france")
    public void i_click_on_air_france() {
        homePage.checkAirFrance();
    }

    @Then("I should see Air France")
    public void i_should_see_air_france() {
        homePage.verifyAirFrance();
    }

    @When("I click on KLM")
    public void i_click_on_klm() {
        homePage.checkKLM();
    }

    @Then("I should see KLM")
    public void i_should_see_klm() {
        homePage.checkKLM();
    }

    @When("I click on virgin atlantic")
    public void i_click_on_virgin_atlantic() {
        homePage.checkVirginAtlantic();
    }

    @Then("I should see Virgin Atlantic")
    public void i_should_see_virgin_atlantic() {
        homePage.verifyVirginAtlantic();
    }

    @When("I click on China Eastern")
    public void i_click_on_china_eastern() {
        homePage.checkChinaEastern();
    }

    @Then("I should see China Eastern")
    public void i_should_see_china_eastern() {
        homePage.verifyChinaEastern();
    }

    @When("I click on Korean Air")
    public void i_click_on_korean_air() {
        homePage.checkKoreanAir();
    }

    @Then("I should see Korean Air")
    public void i_should_see_korean_air() {
        homePage.verifyKoreanAir();
    }

    @When("I click on Virgin Australia")
    public void i_click_on_virgin_australia() {
        homePage.checkVirginAustralia();
    }

    @Then("I should see Virgin Australia")
    public void i_should_see_virgin_australia() {
        homePage.verifyVirginAustralia();
    }

    @When("I click on Aero Mexico")
    public void i_click_on_aero_mexico() {
        homePage.checkAeroMexico();
    }

    @Then("I should see Aero Mexico")
    public void i_should_see_aero_mexico() {
        homePage.verifyAeroMexico();
    }

    @When("I click on latam")
    public void i_click_on_latam() {
        homePage.checkLatam();
    }

    @Then("I should see Latam")
    public void i_should_see_latam() {
        homePage.verifyLatam();
    }

    @When("I click on West jet")
    public void i_click_on_west_jet() {
        homePage.checkWestJet();
    }

    @Then("I should se West jet")
    public void i_should_se_west_jet() {
        homePage.verifyWestJet();
    }

    @Given("I click on Baggage")
    public void i_click_on_baggage() {
        homePage.checkBaggage();
    }

    @Then("I should see baggage and travel fees")
    public void i_should_see_baggage_and_travel_fees() {
        homePage.verifyBaggageAndTravelFees();
    }

//    @Given("I click on reconnect with travel")
//    public void i_click_on_reconnect_with_travel() {
//        homePage.checkReconnectWithTravel();
//    }

    @When("I click explore our top destination")
    public void i_click_explore_our_top_destination() {

    }

    @Then("I should see delta discover map")
    public void i_should_see_delta_discover_map() {

    }

    @Given("I click on Book")
    public void i_click_on_book() {
        homePage.checkBook();
    }

    @Given("I click on From")
    public void i_click_on_from() {
        homePage.checkFrom();
    }

    @Given("I enter {string} for departing")
    public void i_enter_for_departing(String string) {
        homePage.checkDTWForDeparting();
    }

    @Given("I hit enter")
    public void i_hit_enter() {

    }

    @Given("I click on To")
    public void i_click_on_to() {
        homePage.checkTo();
    }

    @Given("I enter {string} for destination")
    public void i_enter_for_destination(String string) {

    }

    @Given("I click round trip")
    public void i_click_round_trip() {

    }

    @Given("I click on aero button")
    public void i_click_on_aero_button() {
        homePage.checkAeroButton();
    }

    @When("I click on basic")
    public void i_click_on_basic() {

    }

    @Then("I should see basic economy")
    public void i_should_see_basic_economy() {

    }

    @Given("I enter {string} on from search box")
    public void i_enter_on_from_search_box(String departingAirport) throws InterruptedException {
        homePage.checkFromSearchBox(departingAirport);
    }

    @Given("I enter {string} on the To search box")
    public void i_enter_on_the_to_search_box(String returningAirport) throws InterruptedException {
        homePage.checkToSearchBox(returningAirport);
    }

    @Given("I click on calender")
    public void i_click_on_calender() {
        homePage.checkCalender();
    }

    @Given("I select April 20th for departure")
    public void i_select_april_20th_for_departure() {
        homePage.checkDepartureDate();
    }

    @Given("I select  April 23rd for returning")
    public void i_select_april_23rd_for_returning() {
        homePage.checkReturningDate();
    }

    @Then("I click on done button")
    public void I_click_on_done_button() {
        homePage.checkDoneButton();
    }

    @Then("I should see all the available flight")
    public void i_should_see_all_the_available_flight() {
        homePage.verifyAvailableFlights();
    }

    @Given("I select one way")
    public void i_select_one_way() {
        homePage.checkOneWay();
    }

    @Given("I select two passengers")
    public void i_select_two_passengers() {
        homePage.checkTwoPassengersOption();
    }

    @When("I click on carry on baggage")
    public void i_click_on_carry_on_baggage() {
        homePage.checkCarryOnBaggage();
    }

    @Then("I should see one carry on baggage")
    public void i_should_see_one_carry_on_baggage() {

    }

    @When("I click on Track checked baggage")
    public void i_click_on_track_checked_baggage() {
        homePage.trackCheckedBaggage();
    }

    @Then("I should see Bag Information")
    public void i_should_see_bag_information() {

    }

}
