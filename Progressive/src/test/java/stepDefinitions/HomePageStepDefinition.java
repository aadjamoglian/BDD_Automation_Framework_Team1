package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageStepDefinition  extends WebAPI {
    static HomePage homePage;

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
        homePage= PageFactory.initElements(driver,HomePage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }

    @Given("I am on amazon homePage")
    public void i_am_on_amazon_home_page() throws IOException {

            openBrowser("https://www.amazon.com/");

    }
    @Given("I am on progressive homePage")
    public void iAmOnProgressiveHomePage() throws IOException {
        openBrowser("https://www.progressive.com");
    }

    @And("I enter {string} in searchBox")
    public void i_enter_in_search_box(String productName) {
       homePage.enterProductName(productName);}
    @When("I click on search Button")
    public void i_click_on_search_button() {
        homePage.clickOnSearchButton();
    }
    @Then("I should see {string} is properly appear")
    public void i_should_see_is_properly_appear(String string) {

    }
    @But("I should not see {string} is appear")
    public void i_should_not_see_is_appear(String string) {
    }
    @And("I verify {string} in product title")
    public void i_verify_in_product_title(String string) {
    }

    @And("I click on Explore Products")
    public void iClickOnExploreProducts() throws InterruptedException {
        homePage.exploreProducts();
    }

    @When("I click on Claims")
    public void iClickOnClaims() throws InterruptedException {
        homePage.claims();
    }

    @Then("I should see {string} in page title")
    public void iShouldSeeInPageTitle(String expectedText) {
        homePage.verifyPageTitle(expectedText);
    }

    @When("I click on About Us")
    public void iClickOnAboutUs() throws InterruptedException {
        homePage.aboutUs();
    }

    @And("I click on Claims Menu")
    public void iClickOnClaimsMenu() throws InterruptedException {
        homePage.claimsMenu();
    }

    @And("I click on About Us Menu")
    public void iClickOnAboutUsMenu() throws InterruptedException {
        homePage.aboutUsMenu();
    }

    @When("I click on Answers")
    public void iClickOnAnswers() throws InterruptedException {
        homePage.answer();
    }

    @And("I click on Answers Menu")
    public void iClickOnAnswersMenu() throws InterruptedException {
        homePage.answerMenu();
    }

    @When("I click on See all topics")
    public void iClickOnSeeAllTopics() throws InterruptedException, IOException {
        homePage.seeAllTopics();
    }

//    @And("I click on Auto Box")
//    public void iClickOnAutoBox() throws IOException, InterruptedException {
//        homePage.autoBox();
//    }

    @When("I enter zip code in auto")
    public void iEnterZipCodeInAuto() throws IOException, InterruptedException {
        homePage.enterZipCode();
    }

    @And("I click on get a quote")
    public void iClickOnGetAQuote() throws IOException, InterruptedException {
        homePage.getAQuote();
    }

    @And("I click on see{int}PlusProducts")
    public void iClickOnSeePlusProducts() throws IOException, InterruptedException {
        homePage.see30PlusProducts();
    }

    @And("I click autoHome")
    public void iClickAutoHome() throws IOException, InterruptedException {
        homePage.autoHome();
    }

    @And("I click on Find an agent")
    public void iClickOnFindAnAgent() throws IOException, InterruptedException {
        homePage.findAnAgent();
    }

    @And("I click on Investors")
    public void iClickOnInvestors() throws IOException, InterruptedException {
        homePage.investors();
    }

    @And("I click on Contact Us")
    public void iClickOnContactUs() throws IOException, InterruptedException {
        homePage.contactUs();
    }

    @And("I click on Become a Partner")
    public void iClickOnBecomeAPartner() throws IOException, InterruptedException {
        homePage.becomeAPartner();
    }

    @And("I click on News Room")
    public void iClickOnNewsRoom() throws IOException, InterruptedException {
        homePage.newsRoom();
    }

    @And("I click ATV UTV")
    public void iClickATVUTV() throws IOException, InterruptedException {
        homePage.ATVUTVLink();
    }

    @And("I click Claims Overview")
    public void iClickClaimsOverview() throws IOException, InterruptedException {
        homePage.claimsOverview();
    }

    @When("I click on Report Button")
    public void iClickOnReportButton() throws IOException, InterruptedException {
        homePage.claimsLink();
    }

    @And("I click Local Agents")
    public void iClickLocalAgents() throws IOException, InterruptedException {
        homePage.localAgent();

    }

    @And("I click Auto")
    public void iClickAuto() throws IOException, InterruptedException {
        homePage.autoButton();
    }

    @When("I click on Agent Button")
    public void iClickOnAgentButton() throws IOException, InterruptedException {
        homePage.agentButton();
    }

    @And("I select option")
    public void iSelectOption() throws IOException, InterruptedException {
       homePage.selectOption();
    }

    @And("I click Car insurance deductibles explained")
    public void iClickCarInsuranceDeductiblesExplained() throws IOException, InterruptedException {
        homePage.carInsurance();
    }

    @And("I click on Auto Popular Box")
    public void iClickOnAutoPopularBox() throws IOException, InterruptedException {
        homePage.autoPopular();
    }

    @And("I click on Bundle Save")
    public void iClickOnBundleSave() throws IOException, InterruptedException {
        homePage.bundleSave();
    }

    @And("I click on Property")
    public void iClickOnProperty() throws IOException, InterruptedException {
        homePage.property();
    }

    @And("I click on Login")
    public void iClickOnLogin() throws IOException, InterruptedException {
        homePage.loginClick();
    }

    @And("I click on Auto Insurance Link")
    public void iClickOnAutoInsuranceLink() throws IOException, InterruptedException {
        homePage.autoInsuranceLink();
    }

    @And("I click on Call Us Link")
    public void iClickOnCallUsLink() throws IOException, InterruptedException {
        homePage.callUsLink();
    }

    @And("I click on Condo")
    public void iClickOnCondo() throws IOException, InterruptedException {
        homePage.condoLink();
    }

    @And("I click on Homeowners")
    public void iClickOnHomeowners() throws IOException, InterruptedException {
        homePage.homeOwner();
    }

    @And("I click on Mobile Home")
    public void iClickOnMobileHome() throws IOException, InterruptedException {
        homePage.mobileHome();
    }

    @And("I click on Personal Loans")
    public void iClickOnPersonalLoans() throws IOException, InterruptedException {
        homePage.personalLoans();
    }

    @And("I click on Business Insurance")
    public void iClickOnBusinessInsurance() throws IOException, InterruptedException {
        homePage.businessInsurance();
    }

    @And("I click on Life")
    public void iClickOnLife() throws IOException, InterruptedException {
        homePage.lifeLink();
    }


//    @And("I click Health")
//    public void iClickHealth() throws IOException, InterruptedException {
//        homePage.health();
//    }


//
//    @Given("I am on amazon homePage")
//    public void i_am_on_amazon_home_page() throws IOException {
//    // Call Action method
//        openBrowser("https://www.amazon.com/");
//
//    }
//
//    @And("I enter {string} in searchBox")
//    public void i_enter_in_search_box(String productName) {
//        // Action method
//        homePage.enterProductName(productName);
//    }
//
//
//    @When("I click on search Button")
//    public void i_click_on_search_button() {
//    homePage.clickOnSearchButton();
//    }
//
//    @Then("I should see {string} is properly appear")
//    public void i_should_see_is_properly_appear(String expectedText) {
//    homePage.verifySearchResult("\""+expectedText+"\"");
//    }
//
//    @Then("I should not see {string} is appear")
//    public void i_should_not_see_is_appear(String expectedText) {
//        homePage.verifySearchResultNotMatch("\""+expectedText+"\"");
//    }
//
//    @Then("I verify {string} in product title")
//    public void i_verify_in_product_title(String expectedText) {
//        // Amazon.com : hand sanitizer
//        homePage.verifyPageTitle(expectedText);
//    }







}
