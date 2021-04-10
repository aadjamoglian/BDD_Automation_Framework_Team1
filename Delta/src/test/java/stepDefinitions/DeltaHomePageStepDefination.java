package stepDefinitions;

import common.WebAPI;
import homepage.DeltaHomePage;
import homepage.DeltaHomePage;
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

public class DeltaHomePageStepDefination extends WebAPI {
    static DeltaHomePage homePage;

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){
        homePage= PageFactory.initElements(driver, DeltaHomePage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }


    @Given("I am On Delta Home Page")
    public void i_am_on_delta_home_page() throws IOException {
        openBrowser("https://www.delta.com/");
    }
    @Then("I click on Login Button")
    public void i_click_on_login_button() {
        homePage.ExploreProduct();

    }
    @When("I Click on  Login Button  I should see {string}")
    public void i_click_on_login_button_i_should_see(String expectedText) throws InterruptedException {
        homePage.LogInToDelataTextVerify(expectedText);

    }
    @Then("I click on user name and send Key")
    public void i_click_on_user_name_and_send_key() throws InterruptedException {
        homePage.UserNameKeySend();

    }
    @Then("I  click on Password and send the key")
    public void i_click_on_password_and_send_the_key() throws InterruptedException {
        homePage.PasswordKeySend();

    }
    @Then("I Verify {string} Text")
    public void i_verify_text(String expectedText) throws InterruptedException {
        homePage.AllFieldAreRequireTextVerify(expectedText);

    }

// Delta Travel Information
    @Then("Mouse hover in Travel info")
    public void mouse_hover_in_travel_info() {
         homePage.TravelInfoLocatorhoverPerform();

    }
    @When("Mouse hover I select the Baggage and click")
    public void mouse_hover_i_select_the_baggage_and_click() throws InterruptedException {
        homePage.BaggageLocatorclickOn();

    }
    @Then("I should See {string}")
    public void i_should_see(String expectedText) throws InterruptedException {
        homePage.GettingBaggageTravelFeesLocatorText(expectedText);

    }
    @Then("I click on Track check on baggage")
    public void i_click_on_track_check_on_baggage() throws InterruptedException {
    homePage.TrackCheckedBaggageLocatorclickOn();
    }
    @Then("I verify {string}")
    public void i_verify(String expectedText) throws InterruptedException {
        homePage.gettingCheckBagStatusLocatortext(expectedText);

    }
    @Then("I click The Arrow Button To Know the bag Confarmation num num")
    public void i_click_the_arrow_button_to_know_the_bag_confarmation_num_num() throws InterruptedException {
        homePage.SearchByLocatorConfirmationselet();

    }
    @Then("I click The confirmation number")
    public void i_click_the_confirmation_number() throws InterruptedException {
        homePage.ConfarmationLocatorSendKey();

    }
    @Then("The Last Name I click")
    public void the_last_name_i_click() throws InterruptedException {
    homePage.LastNameLocatorsendKey();

    }

    //Flight Status

    @Then("I click on from your origin")
    public void i_click_on_from_your_origin() throws InterruptedException {
    homePage.YourOriginFromLocatorClick();
    }

    @Then("I Type Jfk on the box")
    public void i_type_jfk_on_the_box() throws InterruptedException {
        homePage.FromBoxLocatorClickOn();

    }


    @Then("From Drop down  I select JFK New York Kennedy, Ny")
    public void from_drop_down_i_select_jfk_new_york_kennedy_ny() throws InterruptedException {
        homePage.KennedyJFKLocatorSendKeyJFK();

    }
    @Then("I click on from your destination")
    public void i_click_on_from_your_destination() throws InterruptedException {
        homePage.ToBoxLocatorClickOn();
    }

    @Then("I type BHM on the From box")
    public void i_type_bhm_on_the_from_box() throws InterruptedException {
        homePage.ToBoxLocatorSendKeyBHMOn();
    }

    @Then("I select BHM Birmingham Alabama")
    public void i_select_bhm_birmingham_alabama() throws InterruptedException {
        homePage.BirMingHamAlabamaLocatorclick();

    }

    @Then("I verify\"SEARCH OPTIONS\" Text")
    public void i_verify_search_options_text() {


    }
    //Checking Round Trip
    @Then("I am Click on round trip drop down button")
    public void i_am_click_on_round_trip_drop_down_button() throws InterruptedException {
    homePage.RoundTripDropDownSingLocatorClickOn();
    }
    @Then("I select One way")
    public void i_select_one_way() throws InterruptedException {
        homePage.SelectOneWayLocatorlickOn();

    }
    @Then("I verify {string} on that page")
    public void i_verify_on_that_page(String expectedText) throws InterruptedException {
        homePage.GettingTheDeltaCustomerLocatorText(expectedText);

    }

    //Flight Departure and return
    @Then("Select Departure Locator")
    public void select_departure_locator() throws InterruptedException {
       homePage.DepartTimeLocatorClickOn();
    }

    @Then("Select the Departure  Date")
    public void select_the_departure_date() throws InterruptedException {
        homePage.SelectApril16LocatorDateOn();
    }

    @When("select the Date click on departure done button")
    public void select_the_date_click_on_departure_done_button() throws InterruptedException {
       homePage.ClickDepartureDoneLocatorToCloseOn();
    }

    @Then("select the Return Locator")
    public void select_the_return_locator() throws InterruptedException {
        homePage.ReturnLocatorClickon();
    }

    @Then("Select the Return Date")
    public void select_the_return_date() throws InterruptedException {
        homePage.ClickMay3LocatorSelect();
    }

    @Then("Select the Return Done Button")
    public void select_the_return_done_button() throws InterruptedException {
        homePage.ReturnDateDoneLocatorLocateon();
    }


    //passenger

    @Then("I click Passenger DropDown Arrow")
    public void i_click_passenger_drop_down_arrow() throws InterruptedException {
        homePage.PassengerDropDownBoxSelect();
    }

    @Then("Select The Passenger {int}")
    public void select_the_passenger(Integer int1) throws InterruptedException {
       homePage.SelectPassenger4LocatorFromDropDownBox();
    }

    @Then("I click The Arrow to go to the next page")
    public void i_click_the_arrow_to_go_to_the_next_page() throws InterruptedException {
       homePage.ClickArrowToGoNextPage();

    }
    @Then("I was verify {string} Text")
    public void i_was_verify_text(String expectedText) throws InterruptedException {
        homePage.FlyingMadeSimpleLocatorVerify(expectedText);
    }



}








