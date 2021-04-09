package homepage;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

// Action Method class

    // Find By Annotation: First Approach
    @FindBy(how = How.ID, using = searchBoxLocator)
    public WebElement searchBox;
    @FindBy(how = How.ID, using = searchButtonLocator)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = fromSearchBoxLocator)
    public WebElement fromSearchBox;
    @FindBy(how = How.XPATH, using = toSearchBoxLocator)
    public WebElement toSearchBox;


    public void enterProductName(String productName) {
        searchBox.sendKeys(productName);
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }

    public void checkTravelInfo() {
        clickOnLink("Travel Info");

    }

    public void checkTravelPlanningCenter() {
        // getTextByXpath(travelPlanningCenterLocator);
        clickOnLink("Travel Planning Center");

    }

    public void verifyTravelPlanningCenter() {
        String actualText = "Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site";
        String expectedTest = driver.getTitle();
        Assert.assertEquals(actualText, expectedTest, "Link is not working as expected");
    }

    public void checkSaferTravel() {
        clickOnLink("Safer Travel");
    }

    public void checkMaskRequirement() {
        getTextByCss(maskRequirementLocator);
    }

    public void verifyFaceMasks() {
        String actualText = "Setting the Standard for Safer Travel | Delta Air Lines";
        String expectedTest = driver.getTitle();
        Assert.assertEquals(actualText, expectedTest, "Link is not working as expected");

    }

    public void checkAirlinePartners() {
        clickOnLink("Airline Partners");
    }

    public void checkAirFrance() {
        clickOnLink("Air France");
    }

    public void verifyAirFrance() {
        String actualText = "Air France";
        String expectedTest = driver.getTitle();
        Assert.assertEquals(actualText, expectedTest, "Link is not working as expected");
    }

    public void checkKLM() {
        clickOnLink("KLM");
    }

    public void verifyKLM() {
        String actualText = "KLM";
        String expectedTest = driver.getTitle();
        Assert.assertEquals(actualText, expectedTest, "Link is not working as expected");
    }

    public void checkVirginAtlantic() {
        getTextByXpath(virginAtlanticLocator);
    }

    public void verifyVirginAtlantic() {
        String actualText = "Overview";
        String expectedTest = driver.getTitle();
        Assert.assertEquals(actualText, expectedTest, "Link is not working as expected");

    }

    public void checkChinaEastern() {
        getTextByCss(chinaEasternLocator);
    }

    public void verifyChinaEastern() {
        String actualText = "Overview";
        String expectedTest = driver.getTitle();
        Assert.assertEquals(actualText, expectedTest, "Link is not working as expected");
    }

    public void checkKoreanAir() {
        clickOnLink("Korean Air");

    }

    public void verifyKoreanAir() {
        String actualText = "Korean Air";
        String expectedTest = driver.getTitle();
        Assert.assertEquals(actualText, expectedTest, "Link is not working as expected");
    }

    public void checkVirginAustralia() {
        getTextByXpath(virginAustraliaLocator);
    }

    public void verifyVirginAustralia() {
        String actualText = "Overview";
        String expectedTest = driver.getTitle();
        Assert.assertEquals(actualText, expectedTest, "Link is not working as expected");
    }

    public void checkAeroMexico() {
        clickOnLink("Aeromexico");
    }

    public void verifyAeroMexico() {
        String actualText = "Aeromexico";
        String expectedTest = driver.getTitle();
        Assert.assertEquals(actualText, expectedTest, "Link is not working as expected");
    }

    public void checkLatam() {
        getTextByCss(latamLocator);
    }

    public void verifyLatam() {
        String actualText = "Overview";
        String expectedTest = driver.getTitle();
        Assert.assertEquals(actualText, expectedTest, "Link is not working as expected");
    }

    public void checkWestJet() {
        clickOnLink("WestJet");
    }

    public void verifyWestJet() {
        String actualText = "WestJet";
        String expectedTest = driver.getTitle();
        Assert.assertEquals(actualText, expectedTest, "Link is not working as expected");
    }

    public void checkBaggage() {
        clickByXpath1(checkBaggageLocator);
    }

    public void verifyBaggageAndTravelFees() {
        String actualText = "Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site";
        String expectedTest = driver.getTitle();
        Assert.assertEquals(actualText, expectedTest, "Link is not working as expected");
    }

    public void checkBook() {
        clickOnLink("BOOK");
    }

    public void checkFrom() {
        clickByXpath1(fromLocator);
    }

    public void checkDTWForDeparting() {
        clickOnLink("DTW");
    }

    public void checkFromSearchBox(String departingAirport) throws InterruptedException {
        fromSearchBox.sendKeys(departingAirport);
        sleepFor(4);
        fromSearchBox.sendKeys(Keys.ARROW_DOWN);
        fromSearchBox.sendKeys(Keys.ENTER);
    }

    public void checkTo() {
        clickByXpath1(toLocator);
    }

    public void checkToSearchBox(String returningAirport) throws InterruptedException {
        toSearchBox.sendKeys(returningAirport);
        sleepFor(4);
        toSearchBox.sendKeys(Keys.ARROW_DOWN);
        toSearchBox.sendKeys(Keys.ENTER);
    }

    public void checkCalender() {
        clickByXpath1(calenderLocator);
    }

    public void checkDepartureDate() {
        clickByXpath1(departureDateLocator);
    }

    public void checkReturningDate() {
        clickByXpath(returningDateLocator);
    }

    public void checkDoneButton() {
        clickByXpath(doneButtonLocator);
    }

    public void checkAeroButton() {
        clickByXpath(aeroButtonLocator);
    }

    public void verifyAvailableFlights() {
        String expectedText = "Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working");
    }

    public void checkOneWay() {
        clickByXpath(oneWayDropDownLocator);
        clickByXpath(oneWaySelectorLocator);
    }

    public void checkTwoPassengersOption() {
        clickByXpath(passengerDropDownLocator);
        clickByXpath(passengerDropDownSelectorLocator);
    }

    public void checkCarryOnBaggage() {
        clickOnLink("Carry-On Baggage");
    }

    public void verifyOneCarryOnBaggage() {
        String actualText = "Carry-On Luggage Size, Weight & Dimension Restrictions : Delta Air Lines";
        String expectedTest = driver.getTitle();
        Assert.assertEquals(actualText, expectedTest, "Link is not working as expected");
    }

    public void trackCheckedBaggage(){
        clickOnLink("Track Checked Baggage");
    }

    public void verifyBagInformation() {
        String actualText = "Baggage Service Office : Find and Book Airline Ticket : Delta Airlines";
        String expectedTest = driver.getTitle();
        Assert.assertEquals(actualText, expectedTest, "Link is not working as expected");
    }





}