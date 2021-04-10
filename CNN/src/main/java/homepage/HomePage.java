package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

// Action Method class

    // Find By Annotation: First Approach
    @FindBy(how = How.XPATH, using =searchCNNLocator ) public WebElement searchBox;
    @FindBy (how = How.XPATH, using =searchButtonLocator ) public WebElement searchButton;
    @FindBy (how = How.XPATH, using =searchTextLocator ) public WebElement searchText;
    @FindBy (how = How.NAME, using =productNameLocator) public WebElement productName;

    public void verifyInPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        org.testng.Assert.assertEquals(actualTitle, expectedTitle,"Title not matched");
    }

    public void verifySearchResult(String expectedText){
        String actualText=searchText.getText();
        Assert.assertEquals("Product does not match",expectedText,actualText);
    }

    public void searchCNN(){
        searchBox.click();
    }

    public void enterProductName( String productName){
        searchBox.sendKeys(productName);
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }

    public void trueDisplayResults() throws InterruptedException {
        clickByXpath(trueDisplayResultsLocator);
        sleepFor(3);
    }
    public void notDisplayResults() throws InterruptedException {
        clickByXpath(notDisplayResultsLocator);
        sleepFor(3);
    }
    public void liveTVLocator() throws InterruptedException {
        clickByXpath(liveTVLocator);
        sleepFor(3);
    }
    public void usNews() throws InterruptedException {
        clickByXpath(usLocator);
        sleepFor(3);
    }
    public void crimeJustice() throws InterruptedException {
        clickByXpath(crimeJusticeLocator);
        sleepFor(3);
    }

        @FindBy(how = How.ID, using = HAMBURGER_MENU)
        public WebElement hamburger_menu;
        @FindBy(how = How.LINK_TEXT, using = SPORTS_LINK)
        public WebElement sports_link;
        @FindBy(how = How.LINK_TEXT, using = WEATHER_LINK)
        public WebElement weather_link;
        @FindBy(how = How.XPATH, using = SEARCH_INPUT)
        public WebElement search_input;
        @FindBy(how = How.XPATH, using = BTN_SEARCH)
        public WebElement btn_search;
        @FindBy(how = How.XPATH, using = FINAL_TXT_RES)
        public WebElement final_text;
        @FindBy(how = How.XPATH, using = BTN_TEMP)
        public WebElement btn_temp;
        @FindBy(how = How.XPATH, using = CELSIUS_LOCATOR)
        public WebElement celsius_active;
        @FindBy(how = How.XPATH, using = FACEBOOK_LINK)
        public WebElement facebook_link;
        @FindBy(how = How.LINK_TEXT, using = BUSINESS)
        public WebElement business_link;
        @FindBy(how = How.LINK_TEXT, using = SEE_ALL)
        public WebElement see_all;
        @FindBy(how = How.XPATH, using = MACYS_LINK)
        public WebElement macys_link;
        @FindBy(how = How.ID, using = FINANCE_DD)
        public WebElement finance_dd;
        @FindBy(how = How.LINK_TEXT, using = US)
        public WebElement us;
        @FindBy(how = How.LINK_TEXT, using = WORLD)
        public WebElement world;
        @FindBy(how = How.LINK_TEXT, using = POLITICS)
        public WebElement politics;
        @FindBy(how = How.LINK_TEXT, using = OPINION)
        public WebElement opinion;
        @FindBy(how = How.LINK_TEXT, using = HEALTH)
        public WebElement health;
        @FindBy(how = How.LINK_TEXT, using = ENTERTAINMENT)
        public WebElement entertainment;
        @FindBy(how = How.LINK_TEXT, using = STYLE)
        public WebElement style;
        @FindBy(how = How.LINK_TEXT, using = TRAVEL)
        public WebElement travel;
        @FindBy(how = How.LINK_TEXT, using = VIDEOS)
        public WebElement videos;
        @FindBy(how = How.XPATH, using = PLAY_ICON)
        public WebElement play_icon;
        @FindBy(how = How.XPATH, using = LIVE_TV)
        public WebElement live_tv;
        @FindBy(how = How.XPATH, using = CONTAINER_FLEX)
        public WebElement container_flex;
        @FindBy(how = How.XPATH, using = INTERNATIONAL_EDITION)
        public WebElement international_edition;
        @FindBy(how = How.XPATH, using = EDITION)
        public WebElement edition;
        @FindBy(how = How.XPATH, using = PLUS_EXTEND)
        public WebElement plus_extend;
        @FindBy(how = How.XPATH, using = NEWS_RADIO_BUTTON)
        public WebElement news_radio_btn;
        @FindBy(how = How.XPATH, using = RELEVANCE)
        public WebElement relevance;
        @FindBy(how = How.XPATH, using = SEARCH_BTN1)
        public WebElement search_btn_1;
        @FindBy(how = How.XPATH, using = SEARCH_INPUT1)
        public WebElement search_input_1;
        @FindBy(how = How.XPATH, using = SELECTED_OPTION)
        public WebElement selected_option;
        @FindBy(how = How.XPATH, using = CANVAS)
        public WebElement canvas;
        @FindBy(how = How.LINK_TEXT, using = US_ELECTIONS)
        public WebElement us_elections;
        @FindBy(how = How.XPATH, using = CO_MAP_AFTER)
        public WebElement co_map_after;
        @FindBy(how = How.XPATH, using = USER_ICON)
        public WebElement user_icon;
        @FindBy(how = How.XPATH, using = EMAIL_INPUT)
        public WebElement email;
        @FindBy(how = How.XPATH, using = PASSWORD_INPUT)
        public WebElement password;
        @FindBy(how = How.XPATH, using = LOGIN)
        public WebElement login;
        @FindBy(how = How.XPATH, using = WRONG_CREDENTIALS)
        public WebElement wrong_credentials;


        public void hoverOverElements() {
            WebElement el1 = driver.findElement(By.xpath("//*[@id=\"nfl\"]/a"));
            Actions act = new Actions(driver);
            act.moveToElement(el1).build().perform();
            for (int i = 1; i <= 8; i++) {
                List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"nfl\"]/section/div[2]/div[" + i + "]/nav/ol/li"));
                Actions actions = new Actions(driver);
                for (WebElement el : list) {
                    actions.moveToElement(el).build().perform();
                }
            }
        }

        public void sportPage() throws InterruptedException {
            clickById(HAMBURGER_MENU);
            scrollDownThePage("window.scrollBy(0,600)");
            clickByLinkText(SPORTS_LINK);

        }

    private void scrollDownThePage(String s) {
    }

    public void weather() throws InterruptedException {
            clickById(HAMBURGER_MENU);
            clickByLinkText(WEATHER_LINK);
            //sendKeys(search_input, "Los Angeles,CA");
            clickByXpath(BTN_SEARCH);
        }

        public void switchTemperature() throws InterruptedException {
            clickById(HAMBURGER_MENU);
            clickByLinkText(WEATHER_LINK);
            clickByXpath(BTN_TEMP);
        }

        public void stockMarket() {
            clickByLinkText(BUSINESS);
            clickByLinkText(SEE_ALL);
            clickByXpath(MACYS_LINK);
            selectOptionByVisibleText(finance_dd, "3 month");

        }
    }


