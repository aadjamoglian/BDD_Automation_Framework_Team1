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


    @Given("I am on CNN homePage")
    public void iAmOnCNNHomePage() throws IOException {
        openBrowser("https://www.cnn.com/");
    }

    @And("I click on search place")
    public void iClickOnSearchPlace() {
        homePage.searchCNN();
    }
    @And("I enter {string} in searchBox")
    public void iEnterInSearchBox(String productName) {
        homePage.enterProductName(productName);
    }

    @When("I click on search button")
    public void iClickOnSearchButton() {
        homePage.clickOnSearchButton();
    }

    @Then("I should see asian news is properly appearing")
    public void iShouldSeeAsianNewsIsProperlyAppearing() throws InterruptedException {
        homePage.trueDisplayResults();
    }

    @But("I should not see European news is appeared")
    public void iShouldNotSeeEuropeanNewsIsAppeared() throws InterruptedException {
        homePage.notDisplayResults();
    }

    @And("I verify CNN Official Site | CNN - Breaking News, Latest News and Videos in page title")
    public void iVerifyCNNOfficialSiteCNNBreakingNewsLatestNewsAndVideosInPageTitle(String expectedText) {
        homePage.verifySearchResult(expectedText);
    }


    @When("I click on TV")
    public void iClickOnTV() {
    }

    @Then("I watch CNN news")
    public void iWatchCNNNews() {
    }

    @And("I click on US news")
    public void iClickOnUSNews() throws InterruptedException {
        homePage.usNews();
    }

    @When("I click Crime and Justic")
    public void iClickCrimeAndJustic() throws InterruptedException {
        homePage.crimeJustice();
    }

    @And("I verify {string} in page title")
    public void iVerifyInPageTitle(String expectedTitle) {
        homePage.verifyInPageTitle(expectedTitle);
    }




}
