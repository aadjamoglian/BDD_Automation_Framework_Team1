package stepDefinitions;

import common.WebAPI;
import homepage.HotelsHomePage;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelsHomePageStepDefinition extends WebAPI {

    static HotelsHomePage homePage;

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
        homePage= PageFactory.initElements(driver,HotelsHomePage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }

    @Given("I am on hotel.com homepage")
    public void i_am_on_hotel_com_homepage() throws IOException, IOException {
        openBrowser("https://www.hotels.com/");
    }
    @Given("I click on deals")
    public void i_click_on_deals() {
        homePage.checkDeals();
    }
    @Given("I enter {string} on the search Bar")
    public void i_enter_on_the_search_bar(String cityName) throws InterruptedException {
        homePage.checkSearchBox(cityName);
    }
//    @Given("I select {string} for check in date")
//    public void i_select_for_check_in_date(String string) {
//        homePage.checkInCalender();
//        homePage.checkChoseDate();
//    }


    @Given("I select April 20th for check in date")
    public void i_select_april_20th_for_check_in_date() {
        homePage.checkInCalender();
    }
    @Given("I select April 25th for checkout date")
    public void i_select_april_25th_for_checkout_date() {
        homePage.checkCheckoutCalender();
        homePage.checkCheckoutDate();
    }
//    @Given("I select {int} rooms from the Rooms drop down")
//    public void i_select_rooms_from_the_rooms_drop_down(Integer int1) {
//        homePage.checkGuestAndRooms();
//    }
//    @Given("I select {int} people from the Adult drop down")
//    public void i_select_people_from_the_adult_drop_down(Integer int1) {
//        homePage.selectAdults();
//
//    }


    //    @Given("I select {string} for checkout date")
//    public void i_select_for_checkout_date(String string) {
//        homePage.checkCheckoutCalender();
//        //homePage.checkCheckoutDate();
//    }
    @Given("I select {string} from the Rooms drop down")
    public void i_select_from_the_rooms_drop_down(String string) {

    }
    @Given("I select {string} from the Adult drop down")
    public void i_select_from_the_adult_drop_down(String string) {

    }
    @When("I click on check availability")
    public void i_click_on_show_deals() {

    }
    @Then("I should be able see all the deals.")
    public void i_should_be_able_see_all_the_deals() {

    }



    @Given("I click Packages & Flights")
    public void i_click_packages_flights() {
        homePage.checkPackeagesAndFlights();
    }
    @Given("I click on flight only")
    public void i_click_on_flight_only() {
        homePage.checkFlightsOnly();
    }
    @Given("I click on one way")
    public void i_click_on_one_way() {
        //homePage.checkOneWay();

    }
    @Given("I enter {string} on the flying from search box")
    public void i_enter_on_the_flying_from_search_box(String flyingLocation) {
        homePage.checkFlyingFrom(flyingLocation);

    }
    @Given("I enter {string} on destination search box")
    public void i_enter_on_destination_search_box(String destination) {
        homePage.checkDestination(destination);
    }
    @Given("I select april 20th from the destination calender")
    public void i_select_april_20th_from_the_destination_calender() {
        homePage.checkDepartingCalender();
    }
    @When("I click on search button")
    public void i_click_on_search_button() throws InterruptedException {
        homePage.checkFlightSearchButton();

    }
    @Then("I should be able to see all the available flights")
    public void i_should_be_able_to_see_all_the_available_flights() {
        homePage.verifyAvailableFlightPackage();
    }

    @Given("I click on flight & Hotel")
    public void i_click_on_flight_hotel() {
        //homePage.checkFlightsOnly();
    }
    @Given("I select april 23rd from the returning Calender")
    public void i_select_april_23rd_from_the_returning_calender() {

    }


    @Given("I click on car rentals")
    public void i_click_on_car_rentals() {
        homePage.checkCarRentals();
    }
    @Given("I enter {string} on the rental car search bar")
    public void i_enter_on_the_rental_car_search_bar(String pickupLocation) throws InterruptedException {
        homePage.checkRentalCarSearchBar(pickupLocation);
    }
    @Given("I click on pickup calender")
    public void i_click_on_pickup_calender() {
        homePage.pickupCalender();
    }
    @Given("I select April 20th from the pickup calender")
    public void i_select_april_20th_from_the_pickup_calender() {
        homePage.pickupDate();
    }
    @Given("I click on drop-off calender")
    public void i_click_on_drop_off_calender() {
        homePage.checkDropOfCalender();
    }
    @Given("I select April 21st from the drop-off calender")
    public void i_select_april_21st_from_the_drop_off_calender() {
        homePage.checkDropOfDate();
    }
    @When("I click on search")
    public void i_click_on_search() {

    }
    @Then("I should be able to see all the available cars for pickup")
    public void i_should_be_able_to_see_all_the_available_cars_for_pickup() {

    }




    @Given("I click on things to do")
    public void i_click_on_things_to_do() {
        homePage.checkThingsToDo();
    }
    @Given("I enter {string} on things to do search box")
    public void i_enter_on_things_to_do_search_box(String placeName) throws InterruptedException {
        homePage.checkThingsToDoSearchBox(placeName);
    }
    @Given("I click on From Calender")
    public void i_click_on_from_calender() throws InterruptedException {
        homePage.checkFromCalender();
    }
    @Given("I select april 23rd from the  Calender")
    public void i_select_april_23rd_from_the_calender() {
        homePage.checkFromDate();
    }
    @Given("I click on To calender")
    public void i_click_on_to_calender() {

        //homePage.checkToCalender();
    }
    @Given("I select April 24th from the calender")
    public void i_select_april_24th_from_the_calender() {

        homePage.checkToDate();
    }
    @When("I click on Search")
    public void i_click_on_Search() {
        homePage.checkThingsToDoSearchButton();
    }
    @Then("I should be able to see all the things to do in Miami")
    public void i_should_be_able_to_see_all_the_things_to_do_in_miami() {
        homePage.verifyThingsToDoItems();
    }



    @Given("I click on gift cards")
    public void i_click_on_gift_cards() {
        homePage.checkGiftCard();
    }
    @Given("I click on buy now")
    public void i_click_on_buy_now() throws InterruptedException {
        homePage.checkBuyNow();
    }
    @Given("I click on for me")
    public void i_click_on_for_me() {
        homePage.checkForMe();
    }
    @When("I click on pick a gift card")
    public void i_click_on_pick_a_gift_card() {
        homePage.checkPickGiftCard();
    }
    @When("I click on send a digital card")
    public void i_click_on_send_a_digital_card() {
        homePage.checkDigitalCard();
    }
    @When("I click on how much")
    public void i_click_on_how_much() {
        homePage.checkHowMuch();
    }
    @When("I click on Fifty for amount")
    public void i_click_on_fifty_for_amount() {
        homePage.checkGiftCardAmount();
    }
    @When("I click on add to cart")
    public void i_click_on_add_to_cart() {
        homePage.checkAddToCart();
    }
    @Then("I should see review your card page")
    public void i_should_see_review_your_card_page() {
        homePage.verifyReviewYourCard();
    }


    @When("I click on upload your own photo")
    public void i_click_on_upload_your_own_photo() {
        homePage.checkUploadYourOwnPhoto();
    }

    @When("I check the box for terms and conditions")
    public void i_check_the_box_for_terms_and_conditions() {
        homePage.checkCheckBox();
    }

    @When("I click on choose photo")
    public void i_click_on_choose_photo() {
        homePage.checkChoosePhoto();
    }

    @When("I click on choose a local file")
    public void i_click_on_choose_a_local_file() throws InterruptedException {
        homePage.checkLocalFile();

    }

    @When("I click on done")
    public void i_click_on_done() throws InterruptedException {
        homePage.checkUploadDone();
    }

    @When("I click on I like it")
    public void i_click_on_i_like_it() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on Hundred for amount")
    public void i_click_on_hundred_for_amount() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




    @Given("I click on a friend")
    public void i_click_on_a_friend() {
        homePage.checkFriendLink();
    }
    @Given("I enter {string} on the friends name search box")
    public void i_enter_on_the_friends_name_search_box(String friendName) {
        homePage.enterFriendsName(friendName);
    }
    @Given("I enter {string} on my name search box")
    public void i_enter_on_my_name_search_box(String myName) {
        homePage.enterSenderName(myName);
    }
    @Given("I click on add a message")
    public void i_click_on_add_a_message() {
        homePage.checkAddAMessage();
    }
    @Given("I click on where it is going")
    public void i_click_on_where_it_is_going() {
        homePage.checkWhereItsGoing();
    }
    @Given("I enter {string} on the email web edit field")
    public void i_enter_on_the_email_web_edit_field(String friendsEmail) {
        homePage.checkEmailWebEdit(friendsEmail);
    }


    @Given("I click on send a  physical gift card")
    public void i_click_on_send_a_physical_gift_card() {
        homePage.checkPhysicalGiftCard();
    }

    @Given("I enter the receiver's mailing information")
    public void i_enter_the_receiver_s_mailing_information(List<List<String>> dataTable) {
        Map<String, String> mapTable=tableDictionaryConverter(dataTable);
        System.out.println(mapTable.get("Full name"));
        System.out.println(mapTable.get("Street Address"));
        System.out.println(mapTable.get("City"));
        System.out.println(mapTable.get("Postal code"));

    }

    public static synchronized Map<String, String> tableDictionaryConverter(List<List<String>> data){
        Map<String, String> mapTable= new HashMap<>();

        for (List<String> rows: data){
            mapTable.put(rows.get(0), rows.get(0));
        }
        return mapTable;

    }

    @When("I click on shipping")
    public void i_click_on_shipping() {
        homePage.checkShipping();
    }

    @When("I click on Free USPS shipping")
    public void i_click_on_free_usps_shipping() {
        homePage.checkUSPSLocator();
    }

    @Then("I should see checkout page")
    public void i_should_see_checkout_page() {

    }

    @Given("I click on Hotels.com Rewards")
    public void i_click_on_hotels_com_rewards() {
        homePage.checkRewards();
    }
    @When("I click on join now")
    public void i_click_on_join_now() {
        homePage.checkJoinNow();
    }
    @Then("I should see create account page")
    public void i_should_see_create_account_page() {
        homePage.verifyCreateAccount();
    }



}
