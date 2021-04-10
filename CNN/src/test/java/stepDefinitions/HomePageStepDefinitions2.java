package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class HomePageStepDefinitions2 extends WebAPI {


    static HomePage homePage;
    @BeforeStep
    public static void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Given("I am on CNN homePage")
    public void iAmOnCNNHomePage () throws IOException {
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


        static Actions actions;

//        @Given("I am on Cnn home page")
//        public void i_am_on_cnn_home_page() throws IOException, InterruptedException {
//            openBrowser("https://www.cnn.com/");
//
//        }

        @When("I click on US text link in the navbar items")
        public void i_click_on_us_text_link_in_the_navbar_items() {
            homePage.us.click();

        }

        @Then("I should see {string} appears as current page title")
        public void i_should_see_appears_as_current_page_title(String text) {
            assertEqualsByPageTitle(text);
        }

    private void assertEqualsByPageTitle(String text) {
    }


        @When("I click on World in the navbar items")
        public void iClickOnWorldInTheNavbarItems() {
            homePage.world.click();
        }

        @When("I click on Health text link in the navbar items")
        public void iClickOnHealthTextLinkInTheNavbarItems() {
            homePage.health.click();
        }

        @When("I click on Entertainment link in the navbar items")
        public void iClickOnEntertainmentLinkInTheNavbarItems() {
            homePage.entertainment.click();
        }

        @When("I click on Style text link in the navbar items")
        public void iClickOnStyleTextLinkInTheNavbarItems() {
            homePage.style.click();
        }

        @When("I click on Travel link in the navbar items")
        public void iClickOnTravelLinkInTheNavbarItems() {
            homePage.travel.click();
        }

        @When("I click on Sports in the navbar items")
        public void iClickOnSportsInTheNavbarItems() {
            homePage.sports_link.click();
        }

        @When("I click on Video in the navbar items")
        public void iClickOnVideoInTheNavbarItems() {
            homePage.videos.click();
        }

        @And("I click LIVE TV")
        public void iClickLIVETV() {
            homePage.live_tv.click();
        }

        @When("I click on play icon")
        public void iClickOnPlayIcon() {
            homePage.play_icon.click();

        }

        @Then("I should be able to watch live content")
        public void iShouldBeAbleToWatchLiveContent() {
            assertDisplayed(homePage.container_flex);
        }

    private void assertDisplayed(WebElement container_flex) {
    }


    @And("I click on Edition dropdown from the navbar items")
        public void iClickOnEditionDropdownFromTheNavbarItems() throws InterruptedException {
            homePage.edition.click();
            sleepFor(2);
        }

        @When("I click on International from the dropdown")
        public void iClickOnInternationalFromTheDropdown() {
            homePage.international_edition.click();
        }

        @And("I click on search icon in the main navbar")
        public void iClickOnSearchIconInTheMainNavbar() {
            homePage.search_btn_1.click();
        }

        @And("I search for {string}")
        public void iSearchFor(String arg0) {
            //sendKeys(homePage.search_input_1, arg0);
            homePage.search_input_1.sendKeys(Keys.ENTER);

        }

        @And("I click on US radio button")
        public void iClickOnNewsRadioButton() {
            homePage.news_radio_btn.click();

        }

        @And("I click on plus icon in the sub navigation bar to extend the dropdown")
        public void iClickOnPlusIconInTheSubNavigationBarToExtendTheDropdown() {
            homePage.plus_extend.click();
        }

        @When("I click on Relevance from the dropdown")
        public void iClickOnRelevanceFromTheDropdown() {
            homePage.relevance.click();
        }

        @Then("I should see all the news related to {string} displayed on the screen")
        public void iShouldSeeAllTheNewsRelatedToDisplayedOnTheScreen(String arg0) throws InterruptedException {
            asserEquals(driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div[2]/div/div[1]/strong")), arg0);
        }

        @And("I click on HAMBURGER_MENU in the navbar")
        public void iClickOnHAMBURGER_MENUInTheNavbar() {
            //clickById(HAMBURGER_MENU);

        }

        @And("I scroll down and click on WEATHER LINK")
        public void iScrollDownAndClickOnWEATHERLINK() throws InterruptedException {
            scrollDownThePage("window.scrollBy(0,600)");
            //clickByLinkText(WEATHER_LINK);
        }

        @And("I enter {string} in the search box")
        public void iEnterInTheSearchBox(String arg0) {
            //sendKeys(homePage.search_input, arg0);
        }

        @When("I click on Get ForeCast")
        public void iClickOnGetForeCast() throws InterruptedException {
            //clickByXpath(BTN_SEARCH);
            sleepFor(2);
        }

        @Then("I should see all {string} displayed as current selected location on the page")
        public void iShouldSeeAllDisplayedAsCurrentSelectedLocationOnThePage(String arg0) throws InterruptedException {
            asserEquals(homePage.final_text, arg0 + "\n" + "Make Default\n" + " ");

        }

        @When("I click on °C to change temperature to celsius")
        public void iClickOnCToChangeTemperatureToCelsius() {
            //clickByXpath(BTN_TEMP);
        }

        @Then("I should be able to see temperature changed to celsius in my screen")
        public void iShouldBeAbleToSeeTemperatureChangedToCelsiusInMyScreen() throws InterruptedException {
            sleepFor(2);
           // assertByAttributeValue(homePage.celsius_active, "class", BTN_CELSIUS_ASSERTION);

        }

        @And("I scroll down to the footer")
        public void iScrollDownToTheFooter() throws InterruptedException {
            scrollDownThePage("window.scrollBy(0,600)");

        }

        @When("I click on facebook icon in the footer")
        public void iClickOnFacebookIconInTheFooter() {
            childWindowHandler(homePage.facebook_link);
        }

    private void childWindowHandler(WebElement facebook_link) {
    }

    @Then("I should be able to see {string} appears as current page title")
        public void iShouldBeAbleToSeeAppearsAsCurrentPageTitle(String arg0) {
            assertEqualsByPageTitle(arg0);
        }

        @And("I click on BUSINESS in the navbar")
        public void iClickOnBUSINESSInTheNavbar() {
            homePage.business_link.click();
        }


        @And("I See all link under Markets text link")
        public void iSeeAllLinkUnderMarketsTextLink() {
            //clickByLinkText(SEE_ALL);
        }

        @And("I click on most popular stocks")
        public void iClickOnMostPopularStocks() {
            //clickByXpath(MACYS_LINK);
        }

        @When("I select {string} from the dropdown under Quote in the Macy's Inc Container")
        public void iSelectFromTheDropdownUnderQuoteInTheMacySIncContainer(String arg0) {
            selectOptionByVisibleText(homePage.finance_dd, arg0);
        }

        @Then("I should be able to see the graph changed to show {string} market change")
        public void iShouldBeAbleToSeeMonthChange(String arg0) {
            assertSelected(homePage.selected_option);

        }

    private void assertSelected(WebElement selected_option) {
    }

    @And("I click on Politics in the navbar")
        public void iClickOnPoliticsInTheNavbar() {
            homePage.politics.click();
        }

        @And("I click on US Elections in the politics page")
        public void iClickOnUSElectionsInThePoliticsPage() {
            homePage.us_elections.click();
        }

        @And("I scroll down the page")
        public void iScrollDownThePage() throws InterruptedException {
            scrollDownThePage("window.scrollBy(0,600)");
        }

    private void scrollDownThePage(String s) {
    }

    @And("I hover over colorado's map")
        public void iHoverOverColoradoSMap() {
            WebElement canvas = homePage.canvas;
            actions = new Actions(driver);

        }

        @When("I click on the map")
        public void iClickOnTheMap() {
            actions.moveToElement(homePage.canvas, -100, 0).click().build().perform();
        }

        @Then("I should see {string} as winner of the state of colorado")
        public void iShouldSeeAsWinnerOfTheStateOfColorado(String arg0) throws InterruptedException {
            asserEquals(homePage.co_map_after, "Biden");
        }

        @When("I hover over the NFL link")
        public void iHoverOverTheNFLLink() {
        }

        @Then("I should be able to hover over all the links under the collapsible menu")
        public void iShouldBeAbleToHoverOverAllTheLinksUnderTheCollapsibleMenu() {
            homePage.hoverOverElements();
        }

//        @And("I click on user icon in the main nav bar")
//        public void iClickOnUserIconInTheMainNavBar() {
//
//        }

        @And("I enter email {string} in the email web edit field")
        public void iEnterEmailInTheEmailWebEditField(String email) {
            homePage.email.sendKeys(email);
        }

        @And("I enter password {string} in the password web edit field")
        public void iEnterPasswordInThePasswordWebEditField(String password) {
            homePage.password.sendKeys(password);
        }

        @When("I click On Login in")
        public void iClickOnLoginIn() {
            homePage.login.click();
        }

        @Then("I should see an error message appears on the screen")
        public void iShouldSeeAnErrorMessageAppearsOnTheScreen() throws InterruptedException {
            asserEquals(homePage.wrong_credentials, "You have entered an invalid username or password.");
        }

    private void asserEquals(WebElement wrong_credentials, String s) {
    }

    @And("I enter user details as")
        public void i_enter_user_details_as(DataTable dataTable) {
            List<Map<String, String>> map = dataTable.asMaps(String.class, String.class);
            //System.out.println(map);
            //System.out.println(map.get(0).get("email"));
            // homepage.email.sendKeys();
            for (Map<String, String> element : map) {
            }
            //homepage.email.sendKeys(map.get(0).get("email"));
            //homepage.password.sendKeys(map.get(0).get("password"));
            homePage.email.sendKeys(map.get(1).get("email"));
            homePage.password.sendKeys(map.get(1).get("password"));
        }

    @And("I click on user icon in the main navigation bar")
    public void iClickOnUserIconInTheMainNavigationBar() {
        WebElement svgObject = homePage.user_icon;
        Actions builder = new Actions(driver);
        builder.click(svgObject).build().perform();

    }
}



