package stepDefinitions;

import common.WebAPI;
import deltahomepage.DeltaHomePage;
//import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static deltahomepage.DeltaHomePageWebElement.dealsDestinationLocator;

public class DetaHomePageStepDefinitions extends WebAPI {

    static DeltaHomePage homePage;

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            //take scrrenshot
            final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Demo1");
        }
    }

    @BeforeStep
    public static void getInit(){
        homePage= PageFactory.initElements(driver,DeltaHomePage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }




    @Given("I am on Delta HomePage")
    public void i_am_on_delta_home_page() throws IOException {
        openBrowser("https://www.delta.com/");
    }
    @Given("I click on book")
    public void i_click_on_book() {
        homePage.checkBook();
    }
    @Given("I click on From")
    public void i_click_on_from() throws InterruptedException {
        homePage.checkFromLink();
    }
//    @Given("I enter {string} on the from box")
//    public void i_enter_on_the_from_box(String fromLocation) {
//        homePage.checkFromLinkn);
//    }
    @Given("I hit the enter button")
    public void i_hit_the_enter_button() {

    }
    @Given("I enter {string} on the To box")
    public void i_enter_on_the_to_box(String destination) throws InterruptedException {
        homePage.checkToSearchBox(destination);
    }
    @Given("I select one way from the drop down")
    public void i_select_one_way_from_the_drop_down() {
        homePage.checkOneWay();
    }
    @Given("I select April 30th from  the depart-return calender")
    public void i_select_April_30th_from_the_depart_return_calender() {

    }
    @Given("I select\"{int} passenger from the drop down")
    public void i_select_passenger_from_the_drop_down(Integer int1) {

    }

    @Then("I should be able to see all the available flights")
    public void i_should_be_able_to_see_all_the_available_flights() {

    }

    @Given("I select {string} from the drop down")
    public void i_select_from_the_drop_down(String passenger) {
        homePage.checkNumberOfPassenger(passenger);
    }
    @When("I click on the proceed arrow")
    public void i_click_on_the_proceed_arrow() {
        homePage.checkProceed();
    }
    @Then("I should be able to see all the available flights and times")
    public void i_should_be_able_to_see_all_the_available_flights_and_times() {
        homePage.verifyAvailableZFLights();
    }


    @Given("I enter {string} on the from box")
    public void i_enter_on_the_from_box(String departure) {
        homePage.checkFromSearchBox(departure);
    }

    @Given("I click on depart calender")
    public void i_click_on_depart_calender() throws InterruptedException {
        homePage.checkCalender();
    }

    @Given("I select April 20th from  the depart calender")
    public void i_select_april_20th_from_the_depart_calender() {
        homePage.checkDepartDate();
    }
    @Given("I select April 23rd from  the return calender")
    public void i_select_april_23rd_from_the_return_calender() {
        homePage.checkReturnDate();
    }

    @Given("I click on done")
    public void i_click_on_done() {
        homePage.checkDoneButton();
    }

    @Given("I click on TO")
    public void i_click_on_to() {
        homePage.checkToLink();
    }

    @Given("I click on careers")
    public void i_click_on_careers() {
        homePage.checkCareers();
    }
    @When("I click on search careers at delta")
    public void i_click_on_search_careers_at_delta() {
        homePage.checksearchCareer();
    }
    @Then("I should be able to see all the open positions at delta")
    public void i_should_be_able_to_see_all_the_open_positions_at_delta() {
        homePage.verifyOpenPosition();
    }

    @Given("I click travel info")
    public void i_click_travel_info() {
        homePage.checkTravelInfo();
    }
    @Given("I click on baggage")
    public void i_click_on_baggage() {
        homePage.checkBaggage();
    }
    @When("I click on checked baggage fees")
    public void i_click_on_checked_baggage_fees() {
        homePage.checkBaggageFees();
    }
    @Then("I should be able to see the baggage prices")
    public void i_should_be_able_to_see_the_baggage_prices() {
        homePage.verifyBaggagePrice();
    }

    @When("I click on carry on baggage")
    public void i_click_on_carry_on_baggage() {
        homePage.checkCarryOnBaggage();
    }
    @Then("I should be able to see the carry on baggage info page")
    public void i_should_be_able_to_see_the_carry_on_baggage_info_page() {
        homePage.verifyCarryOnBaggageInfoPage();
    }

    @When("I click on track checked baggage")
    public void i_click_on_track_checked_baggage() {
            homePage.checkTrackedBaggage();
    }
    @When("I click on Twenty minute bag guarantee")
    public void i_click_on_Twenty_minute_bag_guarantee() {
        homePage.checkBagGuarantee();
    }
    @Then("I should see bags on time form")
    public void i_should_see_bags_on_time_form() {
        homePage.verifyBagsOnTimeForm();
    }


    @When("I click on special item")
    public void i_click_on_special_item() {
        homePage.checkSpecialItem();
    }
    @Then("I should be able to see special item info page")
    public void i_should_be_able_to_see_special_item_info_page() {
        homePage.verifySpecialItemPage();
    }


    @When("I click on excess and overweight baggage")
    public void i_click_on_excess_and_overweight_baggage() {
        homePage.checkExcessAndOverweightBaggage();
    }
    @When("I click on excess baggage guidelines")
    public void i_click_on_excess_baggage_guidelines() {
        homePage.checkExcessBaggageGuidelines();
    }
    @Then("I should be able to see excess baggage guideline info page")
    public void i_should_be_able_to_see_excess_baggage_guideline_info_page() {
        homePage.verifyExcessBaggageInfoPage();
    }

    @When("I click on prohibited and restricted items")
    public void i_click_on_prohibited_and_restricted_items() {
        homePage.checkProhibitedANdRestrictedItems();
    }
    @When("I click on Tobacco, E-Cigarettes or Marijuana")
    public void i_click_on_tobacco_e_cigarettes_or_marijuana() {
        homePage.checkTobbacoOrMarijuanaLink();
    }
    @Then("I should see travel guidelines for Tobacco, E-Cigarettes or Marijuana")
    public void i_should_see_travel_guidelines_for_tobacco_e_cigarettes_or_marijuana() {
        homePage.verifyGuidelinesForTobaccoOrmarijuana();
    }

    @When("I click on Delayed, Lost or Damaged bags")
    public void i_click_on_delayed_lost_or_damaged_bags() {
        homePage.checkLostOrDamagedBags();
    }
    @When("I click on submit a claim link")
    public void i_click_on_submit_a_claim_link() {
        homePage.checkSubmitClaimLink();
    }
    @Then("I should be able to see baggage claim form")
    public void i_should_be_able_to_see_baggage_claim_form() {
        homePage.verifyClaimForm();
    }

    @When("I click on Embargoes & Limitations")
    public void i_click_on_embargoes_limitations() {
        homePage.checkEmbargoesAndLimitations();
    }
    @Then("I should be able to see Embargoes & Limitations info page")
    public void i_should_be_able_to_see_embargoes_limitations_info_page() {
        homePage.verifyEmbargoesAndLimitationsPage();
    }

    @When("I click on travel changes")
    public void i_click_on_travel_changes() {
        homePage.checkTravelChanges();
    }
    @Then("I should be able to see travel changes fee page")
    public void i_should_be_able_to_see_travel_changes_fee_page() {
        homePage.verifyTravelChangesFeePage();
    }

    @When("I click on travel services")
    public void i_click_on_travel_services() {
        homePage.checkTravelServices();
    }
    @Then("I should be able to see travel services info page")
    public void i_should_be_able_to_see_travel_services_info_page() {
        homePage.verifyTravelServicesPage();
    }

    @When("I click on First checked bag free link")
    public void i_click_on_first_checked_bag_free_link() {
        homePage.checkFirstCheckedBags();
    }
    @Then("I should be able to see First checked bag frees info page")
    public void i_should_be_able_to_see_first_checked_bag_frees_info_page() {
        homePage.verifyFirstCheckedBagsInfoPage();
    }


    @Given("I click on vacation deals")
    public void i_click_on_vacation_deals() throws InterruptedException {
        homePage.checkVacationDeals();
    }
    @Given("I click on origin")
    public void i_click_on_origin() {
        homePage.checkOriginLink();
    }

    @Given("I enter {string} on the origin search box")
    public void i_enter_on_the_origin_search_box(String origin) {
        homePage.checkOriginSearchBox(origin);
    }
    @Given("I click on destination")
    public void i_click_on_destination() {
        clickByXpath(dealsDestinationLocator);
    }

    @Given("I enter {string} on the destination search box")
    public void i_enter_on_the_destination_search_box(String destination) {
            homePage.checkDestinationSearchBox(destination);
    }
    @Given("I click on Depart calender")
    public void i_click_on_Depart_calender() {
        homePage.checkDepartCalender();
    }
    @Given("I select April 25th from the depart calender")
    public void i_select_April_25th_from_the_depart_calender() throws InterruptedException {
        homePage.checkDealsDepartDate();
    }
    @Given("I click on return calender")
    public void i_click_on_return_calender() throws InterruptedException {
        homePage.checkReturnCalender();
    }
    @Given("I select April 28th from the return calender")
    public void i_select_from_the_return_calender() throws InterruptedException {
        homePage.checkreturnDate();
    }
    @When("I click on search button")
    public void i_click_on_search_button() {
        homePage.checkDealsSearchButton();
    }


    @When("I drag the price range button from ${int} to ${int}")
    public void i_drag_the_price_range_button_from_$_to_$(Integer num1, Integer num2) {
        homePage.checkDragableItems(num1, num2);
    }
    @Then("i should be able to see all the deals from ${int} to ${int}")
    public void i_should_be_able_to_see_all_the_deals_from_$_to_$(Integer int1, Integer int2) {

    }

    @Given("I click on first class flight")
    public void i_click_on_first_class_flight() {
        homePage.checkFirstClassFlight();
    }
    @When("I click on book now")
    public void i_click_on_book_now() {
        homePage.checkFirstClassBookNow();
    }
    @Then("I should see all the available first class flight")
    public void i_should_see_all_the_available_first_class_flight() {
        homePage.verifyAvailableFirstClassFlights();
    }


    @Given("I click on Delta one")
    public void i_click_on_delta_one() {
        homePage.checkDeltaOne();
    }
    @When("I click on Delta one book now")
    public void i_click_on_delta_one_book_now() {
        homePage.checkDeltaOneBookNow();
    }
    @Then("I should see the flight booking page")
    public void i_should_see_the_flight_booking_page() {
        homePage.verifyBookingPage();
    }












}
