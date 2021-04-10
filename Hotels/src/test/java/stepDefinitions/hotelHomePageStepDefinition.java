package stepDefinitions;

import common.WebAPI;
import homepage.hotelHomePage;
import homepage.hotelHomePage;
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

public class hotelHomePageStepDefinition extends WebAPI {
    static hotelHomePage homePage;

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
        homePage= PageFactory.initElements(driver, hotelHomePage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }


    @Given("I am on the Hotels.com Home Page")
    public void i_am_on_the_hotels_com_home_page() throws IOException {
        openBrowser("https://www.hotels.com/");

    }
    @When("I click on the Deals")
    public void i_click_on_the_deals()  {
        homePage.DealsLocatorSelection();

    }


    @Then("I should see {string}")
    public void i_should_see(String expectedText) throws InterruptedException {
        homePage.getHotelDealFinderText( expectedText);
    }


    @Then("I Enter LasVegas")
    public void i_enter_las_vegas() throws InterruptedException {
        homePage.LasVegaslocatorBoxClickAndSendKey();

    }


    @Then("I select LasVegas from the dropdown")
    public void i_select_las_vegas_from_the_dropdown() throws InterruptedException {
        homePage.selectLasVegasfromDropDown();

    }


    @Then("I click on check in calendar button and select a date")
    public void i_click_on_check_in_calendar_button_and_select_a_date() {

    }


    @Then("I click on check out calendarbutton and select a date")
    public void i_click_on_check_out_calendarbutton_and_select_a_date() {

    }


    @Then("I select a  rooms number")
    public void i_select_a_rooms_number() {

    }


    @Then("I select number of adult")
    public void i_select_number_of_adult() {

    }


    @Then("I select number of children")
    public void i_select_number_of_children() {

    }


    @Then("click on show deals")
    public void click_on_show_deals() {

    }



    @Then("I should see {string} appears on the page")
    public void i_should_see_appears_on_the_page(String string) {

    }

    //Thinks to do

    @When("I click on the Thinks to do button")
    public void i_click_on_the_thinks_to_do_button() {
        homePage.ThinksToDoLocatorClickOnHotelPage();

    }
    @When("I should see {string} text")
    public void i_should_see_text(String expectedText) throws InterruptedException {
        homePage.GettingSearchThinksToDoLocatorText(expectedText);

    }
    @Then("I search destination and enter")
    public void i_search_destination_and_enter() throws InterruptedException {
        homePage.DestinationLocatorkey();

    }
    @Then("I click From Button to select the date")
    public void i_click_from_button_to_select_the_date() throws InterruptedException {
        homePage.FromDateLocatorCurrentDateSelect();

    }
    @Then("I click  to button to select the date")
    public void i_click_to_button_to_select_the_date() {

    }
    @Then("I select search button")
    public void i_select_search_button() {

    }
    @Then("I verify {string} text will appear on the page")
    public void i_verify_text_will_appear_on_the_page(String string) {

    }




}
