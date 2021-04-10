package stepDefinitions;

import common.WebAPI;
//import homepage.HomePage;
import homepage.healthCareHomePage;
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

public class HomePageStepDefinition  extends WebAPI {
    static healthCareHomePage homePage;

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
        homePage= PageFactory.initElements(driver, healthCareHomePage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }

    @Given("I am on HealthCare.Com Website")
    public void i_am_on_health_care_com_website() throws IOException {
        openBrowser("https://www.healthcare.com/");

    }
    @Then("I hover on my Mouse On Health Insurance")
    public void i_hover_on_my_mouse_on_health_insurance() {
        homePage.HealthInsurancePerform();

    }
    @When("The Mouse Hover Then Click on Get Short Time Insurance")
    public void the_mouse_hover_then_click_on_get_short_time_insurance() {
    homePage.HealthInsurance();
    }
//    @Then("Verify {string} Message")
//    public void verify_message(String expectedText) throws InterruptedException {
//        homePage.GettingHowLongDoYourCoverageLocatorText(expectedText);
//
//    }
    @Then("I Click The radio Button less than One year coverage")
    public void i_click_the_radio_button_less_than_one_year_coverage() throws InterruptedException {
        homePage.LessThanAYearLocatorButtonPerform();

    }
    @Then("I click Next")
    public void i_click_next() throws InterruptedException {
        homePage.NextLocatorClick();

    }
    @Then("I select Female Button")
    public void i_select_female_button() throws InterruptedException {
        homePage.FemaleLocatorCheck();

    }
    @Then("I click Next again")
    public void i_click_next_again() throws InterruptedException {
        homePage.NextLocator1Perform();

    }
    @Then("I select for no I do not Radio Button In Tabacco Page")
    public void i_select_for_no_i_do_not_radio_button_in_tabacco_page() throws InterruptedException {
    homePage.TabaccoLacatorButton();
    }
    @Then("I click Next Button")
    public void i_click_next_button() throws InterruptedException {
        homePage.NextLocator2Perform();

    }
    @Then("I select The date Of Birth")
    public void i_select_the_date_of_birth() throws InterruptedException {
    homePage.SelectDateOfBirthSendKey();
    }
    @Then("I click Next Button again")
    public void i_click_next_button_again() throws InterruptedException {
        homePage.NextLocator3Perform();

    }
    @Then("I Enter My Income")
    public void i_enter_my_income() throws InterruptedException {
        homePage.EnterIncomeLocatorKeySend();

    }
    @Then("I enter again Next Button")
    public void i_enter_again_next_button() throws InterruptedException {
        homePage.NextLocator4Perform();

    }
    @Then("Click The Radio Button yes Additional Family")
    public void click_the_radio_button_yes_additional_family() throws InterruptedException {
        homePage.AdditionFamilyMemberLocatorOn();

    }
    @Then("Click next Button")
    public void click_next_button() throws InterruptedException {
        homePage.NextLocator5Perform();

    }
    @Then("verify {string} Text")
    public void verify_text(String string) throws InterruptedException {

    }
    @Then("I send the Email Address")
    public void i_send_the_email_address() throws InterruptedException {
        homePage.SendEmailKey();
    }
    @Then("Click the next Box To go the Next Page")
    public void click_the_next_box_to_go_the_next_page() throws InterruptedException {
       homePage.NextLocator6Perform();
    }
    @Then("Verify A text {string} In the page")
    public void verify_a_text_in_the_page(String expectedText) throws InterruptedException {
        homePage.GettingTextYourProgress(expectedText);

    }
    @Then("I add my First Name")
    public void i_add_my_first_name() throws Exception {
    homePage.provideHealthCareFirstName();
    }
    @Then("Last name")
    public void last_name() throws Exception {
    homePage.provideHealthCareLastName();
    }
    @Then("I give my Email")
    public void i_give_my_email() throws Exception {
        homePage.provideHealthCareEmailName();
    }
    @Then("My street Address")
    public void my_street_address() throws Exception {
    homePage.provideHealthCareAddress();
    }
    @Then("I add Also my Phone Number")
    public void i_add_also_my_phone_number() throws Exception {
        homePage.provideHealthCarePhoneNumber();

    }






}
