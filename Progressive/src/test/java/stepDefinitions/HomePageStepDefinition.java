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

    @Given("I select NO for do you have progressive auto insurance")
    public void i_select_no_for_do_you_have_progressive_auto_insurance() throws InterruptedException {
        homePage.checkNoRadioButton();
    }
    @Given("I select April20th from the homeowners insurance calender")
    public void i_select_april20th_from_the_homeowners_insurance_calender() {
        homePage.CheckHomeOwnersCalender();
    }
    @When("I click on next")
    public void i_click_on_next() throws InterruptedException {
        homePage.checkNextButton();
    }
    @Then("I should be able to see Home basics page for additional home information")
    public void i_should_be_able_to_see_home_basics_page_for_additional_home_information() {
        homePage.verifyHomeBasicsPage();
    }

//    @Given("I click on motorcycle")
//    public void i_click_on_motorcycle() {
//        homePage.checkmotorcyclce();
//    }
    @Then("I should be able to see my motorbike model page")
    public void i_should_be_able_to_see_my_motorbike_model_page() {
        homePage.verifyMotorbikeModelPage();
    }

    @Given("I click on mobile homes")
    public void i_click_on_mobile_homes() {
        homePage.checkMobileHome();
    }
    @Then("I should be able to see the start my quote forms")
    public void i_should_be_able_to_see_the_start_my_quote_forms() {

    }


    @Given("I click on commercial Auto")
    public void i_click_on_commercial_auto() {
        homePage.checkCommercialAuto();
    }
    @Given("I enter {string} on zipcode search bar")
    public void i_enter_on_zipcode_search_bar(String caZipcode) {
        homePage.checkCommericalAutoZipcode(caZipcode);
    }
    @Then("I should be able to see All the commercial Auto Lists")
    public void i_should_be_able_to_see_all_the_commercial_auto_lists() {

    }

    @When("I click Get  quote")
    public void i_click_get_quote() {
        homePage.checkCommericialAutoQuoteLink();;
    }


    @Given("I click on workers compensation")
    public void i_click_on_workers_compensation() {
        homePage.checkWorkersCompensation();
    }
    @When("I select workers compensation")
    public void i_select_workers_compensation() {
        homePage.checkWorkersCompensationRadioButton();
    }
    @When("I click on continue")
    public void i_click_on_continue() {
        homePage.checkContinueButton();
    }
    @Then("I should be able to see what do you do homepage")
    public void i_should_be_able_to_see_what_do_you_do_homepage() {
        homePage.verifyWhatDoYouDoPage();
    }

    @Given("I click on professional liability")
    public void i_click_on_professional_liability() {
        homePage.checkProfessionalLiability();
    }
    @When("I select professional liability")
    public void i_select_professional_liability() {
        homePage.checkProfessionalLiabilityRadioButton();
    }

    @Given("I click on general liability")
    public void i_click_on_general_liability() {
        homePage.checkGeneralLiability();
    }
    @When("I select general liability")
    public void i_select_general_liability() {
        homePage.checkGeneralLiabilityRadioButton();
    }
    @When("I enter {string} on the what do you do search box")
    public void i_enter_on_the_what_do_you_do_search_box(String profession) throws InterruptedException {
        homePage.checkWhatDoYouDoSearchBox(profession);
    }
    @When("I select Teacher")
    public void i_select_teacher() {
        homePage.checkTeacherRadioButton();
    }
    @When("click on continue")
    public void click_on_continue() {
        homePage.checkWhatDoYouDoContinueButton();
    }
    @Then("I should be able to see business info form")
    public void i_should_be_able_to_see_business_info_form() {
        homePage.verifyBusinessInfoForm();
    }

    @Given("I click on business owners policy")
    public void i_click_on_business_owners_policy() {
        homePage.checkBusinessOwnersPolicy();
    }
    @Then("I should be able to get started page")
    public void i_should_be_able_to_get_started_page() {
        homePage.verifyLetsGetStartedPage();
    }
    @Given("I click on business insurance")
    public void i_click_on_business_insurance() {
        homePage.checkBusinessInsurance();
    }
    @Then("I should be able to see get started page")
    public void i_should_be_able_to_see_get_started_page() {
        homePage.letsGetsStartedPage();
    }
    @Given("I click on snowmobile")
    public void i_click_on_snowmobile() {
        homePage.checkSnowmobile();
    }
    @Then("I should be able to see the drivers information form")
    public void i_should_be_able_to_see_the_drivers_information_form() {
        homePage.verifyDriverInfo();
    }

//    @Given("I click on Boat")
//    public void i_click_on_boat() {
//        homePage.checkBoat();
//    }

    @Then("I should be able to see the driver information form")
    public void i_should_be_able_to_see_the_driver_information_form() {
        homePage.verifyBoatDriverInfo();
    }


    @Given("I click on Classic car")
    public void i_click_on_classic_car() {
        homePage.checkClassicCar();
    }
    @Then("I should be able to see the driver info form")
    public void i_should_be_able_to_see_the_driver_info_form() {
        homePage.verifyClassicCarDriverInfo();
    }

    @Given("I click on Golf car")
    public void i_click_on_golf_car() {
        homePage.checkGolfCar();
    }
    @Then("I should be able to see  driver info form")
    public void i_should_be_able_to_see_driver_info_form() {
        homePage.verifyGolfCarDriverInfo();
    }
    @Given("I click on Trailer")
    public void i_click_on_trailer() {
        homePage.checkTrailerLink();
    }
    @Then("I should be able to see all the Trailer lists")
    public void i_should_be_able_to_see_all_the_trailer_lists() {
        homePage.verifyTrailerLists();
    }

    @Given("I click on Segway")
    public void i_click_on_segway() {
        homePage.checkSegwayLink();
    }
    @Then("I should be able to see drivers info form")
    public void i_should_be_able_to_see_drivers_info_form() {
        homePage.verifySegwayDriverInfo();
    }
    @Given("I click on Auto and property")
    public void i_click_on_auto_and_property() {
        homePage.checkBundleLink();
    }
    @Given("I enter {string} on the  bundle zipcode search bar")
    public void i_enter_on_the_bundle_zipcode_search_bar(String bundleZip) {
        homePage.checkBundleZipcode(bundleZip);
    }
    @Then("I should be able to see drivers inf. form")
    public void i_should_be_able_to_see_drivers_inf_form() {
        homePage.verifyDriverInf();
    }


    @Given("I click on home security")
    public void i_click_on_home_security() {
        homePage.checkHomeSecurity();
    }
    @When("I click on buy online")
    public void i_click_on_buy_online() {
        homePage.checkBuyOnline();
    }
    @When("I click on house")
    public void i_click_on_house() {
        homePage.checkHouseLink();
    }
    @When("I click on small")
    public void i_click_on_small() {
        homePage.checkHouseSize();
    }
    @When("I click on two doors")
    public void i_click_on_two_doors() {
        homePage.checkNumberofDoors();
    }
    @Then("I should be able to see submit email page")
    public void i_should_be_able_to_see_submit_email_page() {
        homePage.verifySubmitEmailPage();
    }

    @Given("I click on PWC")
    public void i_click_on_pwc() {
        homePage.checkPWCLink();
    }
    @Then("I should be able to see drivers info forms")
    public void i_should_be_able_to_see_drivers_info_forms() {
        homePage.verifyPWCinfo();
    }

    @Given("I enter {string} on the PWC insurance zipcode search bar")
    public void i_enter_on_the_pwc_insurance_zipcode_search_bar(String pwcZip) {
        homePage.checkPwcSearchBox(pwcZip);
    }
    @When("I click on Get a quotes")
    public void i_click_on_get_a_quotes() {
        homePage.pwcGetQuotes();
    }

}