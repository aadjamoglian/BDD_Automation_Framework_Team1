package deltahomepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static deltahomepage.DeltaHomePageWebElement.*;

public class DeltaHomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = fromSearchBoxLocator) public WebElement fromSearchBox;
    @FindBy(how = How.XPATH, using = toSearchBoxLocator) public WebElement toSearchBox;
    @FindBy(how = How.XPATH, using = originSearchBoxLocator) public WebElement originSearchBox;
    @FindBy(how = How.XPATH, using = dealsDestinationSearchbox) public WebElement dealsDestinationSearchBox;
    @FindBy(how = How.XPATH, using = dealsDepartDateLocator) public WebElement dealsDepartDate;

    public void checkBook(){
        clickOnLink("BOOK");
    }

    public void checkFromLink() throws InterruptedException {
       clickByCss(fromLocator);
        sleepFor(4);
    }
    public void checkToLink(){
        clickByCss(toLocator);
    }
    public void checkFromSearchBox(String departure){
        fromSearchBox.sendKeys(departure);
        fromSearchBox.sendKeys(Keys.ARROW_DOWN);
        fromSearchBox.sendKeys(Keys.ENTER);
    }
    public void checkToSearchBox(String destination) throws InterruptedException {
        toSearchBox.sendKeys(destination);
        sleepFor(3);
        toSearchBox.sendKeys(Keys.ARROW_DOWN);
        toSearchBox.sendKeys(Keys.ENTER);
    }
    public void checkCalender() throws InterruptedException {
        sleepFor(3);
        clickByCss(calenderLocator);
    }

    public void checkDepartDate(){
        clickByXpath1(departDateLocator);

    }
    public void checkReturnDate(){
        clickByXpath1(returnDateLocator);
    }
    public void checkDoneButton(){
        clickByXpath1(calenderDoneButton);
    }
    public void checkProceed(){
        clickByXpath1(proceedLocator);
    }
    public void verifyAvailableZFLights(){
        String actualText="Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    public void checkOneWay(){
        clickByXpath(dropDownLocator);
        clickByXpath(oneWayLocator);
    }
    public void checkOnewayDepartDate(){
        clickByXpath(onewayDepartDateLocator);
    }
    public void checkNumberOfPassenger(String passenger){
        //clickByXpath(passenger);
        clickByXpath(passengerDropDownLocator);
        clickByXpath(numperOfPassengerLocator);
    }
    public void verifyOnewayFlights(){
        String actualText="Flight Results : Find & Book Airline Tickets : Delta Air Lines";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkCareers(){
        //scrollDown();
        clickByXpath(careersLocator);
        //clickOnLink("Careers");
    }
    public void checksearchCareer(){
        clickByXpath(searchCareerLocator);
    }
    public void verifyOpenPosition(){
        String actualText="Job Search | Delta Air Lines, Inc.";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkTravelInfo(){
        clickOnLink("Travel Info");
    }
    public void checkBaggage(){
        clickOnLink("Baggage");
    }
    public void checkBaggageFees(){
        clickByXpath(checkedBaggageFees);
    }
    public void verifyBaggagePrice(){
        String actualText="Baggage Policy and Fees | Delta Air Lines";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkCarryOnBaggage(){
        clickOnLink("Carry-On Baggage");
    }
    public void verifyCarryOnBaggageInfoPage(){
        String actualText="Carry-On Luggage Size, Weight & Dimension Restrictions : Delta Air Lines";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkTrackedBaggage(){
        clickOnLink("Track Checked Baggage");
    }

    public void checkBagGuarantee(){
        clickByXpath(bagGuaranteeLocator);
    }
    public void verifyBagsOnTimeForm(){
        String actualText="Submission: 20 Minutes Baggage Claim: Delta Airlines";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkSpecialItem(){
        clickOnLink("Special Items");
    }
    public void verifySpecialItemPage(){
        String actualText="Rules and Restrictions for Special Items : Delta Air Lines";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkExcessAndOverweightBaggage(){
        clickOnLink("Excess & Overweight Baggage");
    }
    public void checkExcessBaggageGuidelines(){
        clickByXpath(excesBaggageGuidelinesLocator);
    }
    public void verifyExcessBaggageInfoPage(){
        String actualText="Excess & Overweight Baggage : Delta Air Lines";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkProhibitedANdRestrictedItems(){
        clickOnLink("Prohibited or Restricted Items");
    }
    public void checkTobbacoOrMarijuanaLink(){
        clickByXpath(tobaccoOrMarijuanaLocator);
    }
    public void verifyGuidelinesForTobaccoOrmarijuana(){
        String actualText="Flying with Tobacco, E-Cigarettes or Marijuana: Delta Air Lines";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkLostOrDamagedBags(){
        clickOnLink("Delayed, Lost, or Damaged Bags");
    }
    public void checkSubmitClaimLink(){
        clickByXpath(submitClaimLink);
    }
    public void verifyClaimForm(){
        String actualText="Online Baggage Claim : Delta Air Lines";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkEmbargoesAndLimitations(){
        clickOnLink("Embargoes & Limitations");
    }
    public void verifyEmbargoesAndLimitationsPage(){
        String actualText="Embargoes & Limitations : Delta Air Lines";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkTravelChanges(){
        clickByXpath(travelChnagesLocator);
    }
    public void verifyTravelChangesFeePage(){
        String actualText="Baggage Policy and Fees | Delta Air Lines";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkTravelServices(){
        clickByXpath(travelServicesLocator);
    }
    public void verifyTravelServicesPage(){
        String actualText="Baggage Policy and Fees | Delta Air Lines";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkFirstCheckedBags(){
        clickOnLink("First Checked Bag Free");
    }
    public void verifyFirstCheckedBagsInfoPage(){
        String actualText="First Checked Bag Free";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    public void checkVacationDeals() throws InterruptedException {
        sleepFor(4);
        scrollDown();
        //clickOnLink("Vacation Deals");
        clickByXpath(vacationDealsLocator);
    }
    public void checkOriginLink(){
        clickByXpath(originLocator);
    }
    public void checkOriginSearchBox(String origin){
        originSearchBox.sendKeys(origin);
        originSearchBox.sendKeys(Keys.ARROW_DOWN);
        originSearchBox.sendKeys(Keys.ENTER);

    }
    public void checkDestinationSearchBox(String destination){
        dealsDestinationSearchBox.sendKeys(destination);
        dealsDestinationSearchBox.sendKeys(Keys.ARROW_DOWN);
        dealsDestinationSearchBox.sendKeys(Keys.ENTER);
    }
    public void checkDepartCalender(){
        waitUntilClickAble(dealsDepartCalenderLocator);
       // clickByXpath(dealsDepartCalenderLocator);
    }
    public void checkDealsDepartDate() throws InterruptedException {
        sleepFor(5);
        //waitUntilClickAble(dealsDepartDateLocator);
        clickByXpath1(dealsDepartDateLocator);
    }
    public void checkReturnCalender() throws InterruptedException {
        sleepFor(3);
        clickByXpath(returnCalenderLocator);
    }
    public void checkreturnDate() throws InterruptedException {
        sleepFor(5);
        clickByXpath1(returnDateLocators);
    }
    public void checkDealsSearchButton(){
        clickByXpath1(dealsSearchButtonLocator);
    }
    public void checkDragableItems(Integer num1, Integer num2){
       WebElement drag= driver.findElement(By.xpath(dragButton));
       WebElement drop= driver.findElement(By.xpath(dropButton));
        Actions action= new Actions(driver);
        action.dragAndDrop(drag,drop).perform();
    }

    public void checkFirstClassFlight(){
        clickOnLink("First Class");
    }
    public void checkFirstClassBookNow(){
        clickByXpath1(firstClassBookNowLocator);
    }
    public void verifyAvailableFirstClassFlights(){
        String actualText="Book a Flight : Best Fare Guarantee on Airline Tickets : \u200EDelta Air Lines";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkDeltaOne(){
        clickOnLink("Delta One®");
    }
    public void checkDeltaOneBookNow(){
        clickByXpath1(deltaOneBookNowLocator);
    }
    public void verifyBookingPage(){
        String actualText="Book a Flight : Best Fare Guarantee on Airline Tickets : \u200EDelta Air Lines";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }









}
