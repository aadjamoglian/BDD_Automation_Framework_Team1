package stepDefinitions;

import common.WebAPI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import homepage.ProgressiveHomePage;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProgressiveHomePageTestDefinitions extends WebAPI {


    static ProgressiveHomePage homePage;

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
        homePage= PageFactory.initElements(driver,ProgressiveHomePage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }


    @Given("I am on progressive homepage")
    public void i_am_on_progressive_homepage() throws IOException {
        openBrowser("https://www.progressive.com/");
    }
    @Given("I click on Explore Products")
    public void i_click_on_explore_products() {
        homePage.checkExploreProducts();
    }
    @Given("I mouse hoover on auto")
    public void i_mouse_hoover_on_auto() {
        homePage.checkAutoLink();
    }
    @Given("I enter {string} on the zipcode search bar")
    public void i_enter_on_the_zipcode_search_bar(String zipcode) {
        homePage.checkZipcodeSearBox(zipcode);
    }
    @When("I click on Get a quote")
    public void i_click_on_get_a_quote() {
        homePage.checkGetQuoteButton();
    }

    @Given("I click on Get  quotes")
    public void i_click_on_get_quotes() {
        homePage.checkGetQuoteButton();
    }

    @Given("I enter driver information")
    public void i_enter_driver_information(DataTable dataTable) {
        List<List<String>> data= dataTable.asLists(String.class);
        String FirstName=data.get(0).get(0);
        String MI=data.get(1).get(0);
        String LastName=data.get(2).get(0);
        String StreetNumberAndName=data.get(3).get(0);
        String apt=data.get(4).get(0);

        System.out.println(FirstName);
        System.out.println(MI);
        System.out.println(LastName);
        System.out.println(StreetNumberAndName);
        System.out.println(apt);

    }

    @When("I click on start my quote")
    public void i_click_on_start_my_quote() {
        homePage.checkStartQuoteButton();
    }

    @Then("I should be able to select my car model")
    public void i_should_be_able_to_select_my_car_model() {

    }

    @Then("I should be able to see the start my quote form")
    public void i_should_be_able_to_see_the_start_my_quote_form() {
        homePage.verifystartmyQuoteForm();
    }


    @Given("I click on claims")
    public void i_click_on_claims() {
        homePage.checkClaimsLink();
    }
    @Given("I click on claims overview")
    public void i_click_on_claims_overview() {
        homePage.checkClaimsOverviewLocator();
    }
    @When("I click on report and view a claim")
    public void i_click_on_report_and_view_a_claim() {
        homePage.checkReportClaim();
    }
    @Then("I should be able to see the login page")
    public void i_should_be_able_to_see_the_login_page() {
        homePage.verifyLogInPage();
    }

    @When("I click on Auto process claims")
    public void i_click_on_auto_process_claims() {
        homePage.checkAutoProcessLink();
    }
    @Then("I should be able to see the auto claims page")
    public void i_should_be_able_to_see_the_auto_claims_page() {
        homePage.verifyAutoProcessPage();
    }

    @When("I click on roadside assistance")
    public void i_click_on_roadside_assistance() {

    }
    @When("I click on file a claim through progressive app")
    public void i_click_on_file_a_claim_through_progressive_app() {

    }
    @Then("I should take me to the download page")
    public void i_should_take_me_to_the_download_page() {

    }

    @When("I click on Catastrophe")
    public void i_click_on_catastrophe() {
        homePage.checkCatastropheLink();
    }
    @When("I click on login")
    public void i_click_on_login() {
       // homePage.checkLoginLink();
    }
    @Then("I should take me to the login page")
    public void i_should_take_me_to_the_login_page() {
        homePage.verifyLoginPage();
    }

    @Given("I click on about us")
    public void i_click_on_about_us() {
        homePage.checkAboutUs();
    }
    @When("I click on corporate responsibility")
    public void i_click_on_corporate_responsibility() {
        homePage.checkCorporateResponsibility();
    }
    @Then("I should be able to see the corporate responsibility page")
    public void i_should_be_able_to_see_the_corporate_responsibility_page() {
        homePage.verifyCorporateResponsibilityPage();
    }

    @When("I click on Investors")
    public void i_click_on_investors() {
        homePage.checkInvestorsLink();
    }
    @Then("I should be able to see all the messages from the investors")
    public void i_should_be_able_to_see_all_the_messages_from_the_investors() {
        homePage.verifyInvestorsPage();
    }

    @Given("I click on career")
    public void i_click_on_career() {
        homePage.checkCareer();
    }
    @When("I click on Find a Career")
    public void i_click_on_find_a_career() {
        homePage.checkFindACareer();
    }
    @Then("I should be able to see all the job openings")
    public void i_should_be_able_to_see_all_the_job_openings() {
        homePage.verifyJobOpeningPage();
    }


    @Given("I click on Local agent")
    public void i_click_on_local_agent() {
        homePage.checkLocalAgent();
    }
    @Given("I enter {string} on the zip code search box")
    public void i_enter_on_the_zip_code_search_box(String localAgentZipcode) {
        homePage.checkLocalAgentZipcode(localAgentZipcode);
    }
    @When("I click on find an agent")
    public void i_click_on_find_an_agent() {
        homePage.checkFindAnAgentButton();
    }
    @Then("I should be able to see all the local agents lists")
    public void i_should_be_able_to_see_all_the_local_agents_lists() {
        homePage.verifyAgentList();
    }

    @When("I click on newsroom")
    public void i_click_on_newsroom() {
        homePage.checkNewsroom();
    }
    @Then("It should navigate me to the newsroom page")
    public void it_should_navigate_me_to_the_newsroom_page() {
        homePage.verifyNewsroomPage();
    }


    @Given("I click on dental")
    public void i_click_on_dental() {
        homePage.checkDental();
    }
    @Given("I enter {string} on the dental insurance search box")
    public void i_enter_on_the_dental_insurance_search_box(String dentalZipcode) throws InterruptedException {
        homePage.checkDentalInsuranceSearchBox(dentalZipcode);
    }
    @Given("I click on get  quote")
    public void i_click_on_get_quote() {
        homePage.checkGetDentalQuote();
    }
    @Given("I enter {string} on the find plans zipcode search box")
    public void i_enter_on_the_find_plans_zipcode_search_box(String findPlansZipcode) {
        homePage.checkFindPlansSearchBox(findPlansZipcode);
    }
    @Given("I select Female for gender")
    public void i_select_female_for_gender() throws InterruptedException {
        homePage.checkFemaleRadioButton();
    }
    @Given("I enter {string} on the date of birth web edit field")
    public void i_enter_on_the_date_of_birth_web_edit_field(String applicantDOB) {
        homePage.checkApplicantDOB(applicantDOB);
    }
    @Given("I select April 20th from the coverage starting calender")
    public void i_select_from_the_coverage_starting_calender() {
        homePage.checkCoverageCalender();
    }

    @When("I click on find plans")
    public void i_click_on_find_plans() {
        homePage.checkDentalPlans();
    }

    @Then("I should be able to see all the available plans")
    public void i_should_be_able_to_see_all_the_available_plans() {
        homePage.verifyAvailablePlans();
    }


    @Given("I click on homeowners")
    public void i_click_on_homeowners() {
        homePage.checkHomeowners();
    }
    @Given("I enter {string} on the homeowners insurance zipcode search box")
    public void i_enter_on_the_homeowners_insurance_zipcode_search_box(String homeownerZipcode) {
        homePage.checkHomeownersZipcode(homeownerZipcode);
    }

    @Given("I click on get homeowners insurance quote")
    public void i_click_on_get_homeowners_insurance_quote() throws InterruptedException {
        homePage.checkHomeownersInsuranceQuote();
    }
    @Given("I enter {string} on the address search box")
    public void i_enter_on_the_address_search_box(String homeAddress) throws InterruptedException {
        homePage.checkHomeAddress(homeAddress);
    }
    @Given("I click on Let's go button")
    public void i_click_on_let_s_go_button() {
        homePage.checkLetsGoButton();
    }
    @Given("I enter the homeowners information")
    public void i_enter_the_homeowners_information(List<List<String>> dataTable) {
        Map<String, String> mapTable=tableDictionaryConverter(dataTable);
        System.out.println(mapTable.get("First name"));
        System.out.println(mapTable.get("MI"));
        System.out.println(mapTable.get("Last name"));
        System.out.println(mapTable.get("Date of birth"));

    }

    public static synchronized Map<String, String> tableDictionaryConverter(List<List<String>> data){
        Map<String, String> mapTable= new HashMap<>();

        for (List<String> rows: data){
            mapTable.put(rows.get(0), rows.get(0));
        }
        return mapTable;
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

    @Given("I click on motorcycle")
    public void i_click_on_motorcycle() {
        homePage.checkmotorcyclce();
    }
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

    @Given("I click on Boat")
    public void i_click_on_boat() {
        homePage.checkBoat();
    }

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
