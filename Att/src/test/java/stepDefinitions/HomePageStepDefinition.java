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
   
    @Given("I am on AT&T homePage")
    public void iAmOnATTHomePage() throws IOException {
        openBrowser("https://www.att.com/");
    }
    @And("I click in searchBox")
    public void iClickInSearchBox() throws InterruptedException {
        homePage.goSearchBox();
    }
    @And("I input {string} in searchBox")
    public void iInputInSearchBox(String expectedText) throws InterruptedException {
        homePage.enterProductName(expectedText);
    }

    @When("I click on search box Button")
    public void iClickOnSearchBoxButton() throws InterruptedException {
        homePage.searchButton();
    }

    @Then("I must see {string} is properly appear")
    public void iMustSeeIsProperlyAppear() throws InterruptedException {
        homePage.showTrueResult();

    }

    @But("I must not see {string} is appear")
    public void iMustNotSeeIsAppear() throws InterruptedException {
        homePage.donNotShowFalseResult();
    }

    @And("I do verify {string} in product title")
    public void iDoVerifyInProductTitle() throws InterruptedException {
        homePage.donNotShowFalseResult();
    }

    @When("I click on menu bar")
    public void iClickOnMenuBar() throws InterruptedException {
        homePage.menuBar();
    }

    @And("I click on Deals & discounts")
    public void iClickOnDealsDiscounts() throws InterruptedException {
        homePage.dealsDiscounts();
    }

    @When("I click Deals")
    public void iClickDeals() throws InterruptedException {
        homePage.deals();
    }

    @And("I verify {string} page title")
    public void iVerifyPageTitle(String expectedTitle) {
        homePage.verifyPageTitle(expectedTitle);
    }

    @Then("I verify page title as deal")
    public void iVerifyPageTitleAsDeal() throws InterruptedException {
        homePage.hpDeals();
    }

    @Then("I verify {string}page title as deal")
    public void iVerifyPageTitleAsDeal(String expectedTitle) throws InterruptedException {
        homePage.hpDeals();
    }

    @And("I click on See more Best Sellers in Toys & Games")
    public void iClickOnSeeMoreBestSellersInToysGames() {
        
    }

    @Then("I verify Best Sellers in Toys & Games is exist")
    public void iVerifyBestSellersInToysGamesIsExist() {

    }


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
