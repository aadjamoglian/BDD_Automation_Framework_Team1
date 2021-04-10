package stepDefinitions;

import common.WebAPI;
import homepageProgressive.ProHomePage;
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


public class proHomePageStepDefinition extends WebAPI {
   static ProHomePage prohomepage;
    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo2");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){
        prohomepage = PageFactory.initElements(driver, ProHomePage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }


    @Given("I am on the Progressive Homepage")
    public void i_am_on_the_progressive_homepage() throws IOException {

        //call action method
        openBrowser("https://www.progressive.com/");

    }
    @When("I click on Explore product")
    public void i_click_on_explore_product() {
        prohomepage.ExploreProduct();
    }



    @Then("I should see {string} product")
    public void i_should_see_vehical_product(String expectedText) throws InterruptedException {
        prohomepage.verifyVehical(expectedText );
    }
    @Then("I verify {string} title is present on that page.")
    public void i_verify_explore_product_title_is_present_on_that_page(String expectedText) throws InterruptedException {
        prohomepage.verifyExploreProduct(expectedText );

    }

    // 2 nd Auto insurance Quote
    @When("I click on Auto Link")
    public void i_click_on_auto_link() {
        prohomepage.AutoClickCase();

    }
    @Then("I should see {string} Text")
    public void i_should_see_auto_text(String expectedText) throws InterruptedException {
        prohomepage.verifyAutoTextCase(expectedText);

    }
    @Then("I enter ZipCode")
    public void i_enter_zip_code() throws InterruptedException {
        prohomepage.SendKeyInZipCode();

    }
    @Then("I click on Get a quote link")
    public void i_click_on_get_a_quote_link() {
        prohomepage.GetACodeClickLocatorCase();

    }
    @Then("I verify {string} on that page")
    public void i_verify_name_birthdate_on_that_page(String expectedText) throws InterruptedException {
        prohomepage.verifyNameAndBirthText(expectedText);
    }





    // 3rd scenario

    @Then("I enter First Name")
    public void i_enter_first_name() throws InterruptedException{
        prohomepage.FirstNameSendKey();

    }

    @Then("I enter Last Name")
    public void i_enter_last_name() throws InterruptedException {
        prohomepage.LastNameSendKey();

    }



    @Then("I click suffix and select Sr")
    public void i_click_suffix_and_select_sr() throws InterruptedException {
        prohomepage.Suffix();

    }

    //login in progressive account

    @When("I click on login Button")
    public void i_click_on_login_button() {
        prohomepage.progressiveLoginButton();

    }

    @Then("I should see {string} on that page")
    public void i_should_see_on_that_page(String expectedText) throws InterruptedException {
        prohomepage.getWelcomeText( expectedText);

    }

    @Then("I enter user ID")
    public void i_enter_user_id() throws InterruptedException {
        prohomepage.SetuserId();
    }

    @Then("I enter Password")
    public void i_enter_password() throws InterruptedException {
        prohomepage.SetPassword();
    }

    @Then("I click on login link")
    public void i_click_on_login_link() throws InterruptedException {
        prohomepage.clickloginLink();
    }

    // claim overview

    @When("I click on Claim button")
    public void i_click_on_claim_button() throws InterruptedException {
        prohomepage.verifyclaimLocator();

    }
    @Then("I should see  {string} Text")
    public void i_should_see_text(String expectedText) throws InterruptedException {
        prohomepage.verifyclaimTextLocator(expectedText);

    }
    @Then("I click on Claim overview")
    public void i_click_on_claim_overview() throws InterruptedException {
        prohomepage.verifyclaimoverviewLocator();

    }
    @Then("I verify {string} appears on the page")
    public void i_verify_progressive_claims_appears_on_the_page(String expectedText) throws InterruptedException {
        prohomepage.verifyprogressiveclaim(expectedText);

    }


    //Answer
    @When("I am click on the Answer button")
    public void i_am_click_on_the_answer_button() throws InterruptedException {
    prohomepage.AnswerLocatorButtonclickInProgressivePage();
    }
    @Then("I will see {string}")
    public void i_will_see(String  expectedText) throws InterruptedException {
    prohomepage.verifyprogressiveAnswerLocatorText(expectedText);
    }
    @Then("I click on see all topic button")
    public void i_click_on_see_all_topic_button() throws InterruptedException {
        prohomepage.seeAlltopicboxLocatorButtonClickOn();

    }
    @Then("I click Am i covered")
    public void i_click_am_i_covered() throws InterruptedException {
    prohomepage.amIcoveredLocatorclickOn();
    }
    @Then("I click how renters insurance cover theft image")
    public void i_click_how_renters_insurance_cover_theft_image() throws InterruptedException {
        prohomepage.RenterInsuranceCoverTheftLocatorclickOn();

    }
    @Then("i verify {string} appears on the page")
    public void i_verify_appears_on_the_page(String expectedText) throws InterruptedException {
    prohomepage.getRenterInsuranceCoverTheftLocatorTextOn(expectedText);
    }





}
