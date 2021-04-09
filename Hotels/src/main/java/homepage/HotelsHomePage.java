package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HotelsHomePageWebElement.*;

public class HotelsHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = searchBoxLocator) public WebElement searchBox;
    @FindBy(how = How.XPATH, using = flyingFromLocator) public WebElement flyingFrom;
    @FindBy(how = How.XPATH, using = destinationLocator) public WebElement Destination;
    @FindBy(how = How.XPATH, using = rentalCarSearchBar) public WebElement rentalCarPickup;
    @FindBy(how = How.XPATH, using = thingsToDoSearchBoxLocator) public WebElement thingsToDo;
    @FindBy(how = How.CSS, using = chooseLocalFileLocator) public WebElement chooseLocalFile;
    @FindBy(how = How.XPATH, using = friendsNameWebEditLocator) public WebElement friendsNameWebEdit;
    @FindBy(how = How.XPATH, using = myNameWebEditLocator) public WebElement myNameWebEdit;
    @FindBy(how = How.XPATH, using = emailWebEdit) public WebElement emailWeb;

    public void checkDeals(){
        clickOnLink("Deals");

    }
    public void checkSearchBox(String cityName) throws InterruptedException {
        sleepFor(4);
        searchBox.sendKeys(cityName);
        clickByXpath(autoSuggestLocator);
//        searchBox.sendKeys(Keys.ARROW_DOWN);
//        searchBox.sendKeys(Keys.ENTER);

    }
    public void checkInCalender(){
        //clickByXpath1(checkInCalenderLocator);
        getTextByXpath(checkInCalenderLocator);
        //getTextByName(dateLocator);
        clickByXpath1(dateLocator);
    }

    public void checkCheckoutCalender(){
        getTextByCss(checkoutCalenderLocator);
    }
    public void checkCheckoutDate(){
        clickByXpath(checkoutDateLocator);
    }

//    public void checkGuestAndRooms(){
//        //clickByXpath1(roomLocator);
//        dropDown(roomLocator);
//    }
//    public void selectAdults(){
//        WebElement ddown= driver.findElement(By.cssSelector("#q-room-0-adults"));
//        Select select= new Select(ddown);
//        select.selectByIndex(2);
//
//    }

    public void checkPackeagesAndFlights(){
        clickOnLink("Packages & Flights");
    }

    public void checkFlightsOnly(){
        clickByXpath(flightsANdHotelsOnlyLocator);

    }
    public void checkOneWay(){
        clickByXpath1(oneWayLocator);
    }

    public void checkFlyingFrom(String flyingLocation){
        //takeEnterKeys(flyingLocation);
        //driver.findElement(By.cssSelector(flyingFromLocator)).sendKeys(Keys.ENTER);
        //clickOnElement(flyingFromLocator);
        flyingFrom.sendKeys(flyingLocation);
        clickByXpath1(detroitAirportLocator);
    }
    public void checkDestination(String destination){
        Destination.sendKeys(destination);
        clickByXpath1(miamiAirportLocator);
    }
    public void checkDepartingCalender(){
        clickByXpath1(departingCalenderLocator);
        clickByXpath1(departingDateLocator);
    }
    public void checkFlightSearchButton() throws InterruptedException {
        clickByXpath1(flightSearchButtonLocator);
        sleepFor(5);
    }
    public void verifyAvailableFlightPackage(){
        String actualText="Miami (and vicinity) Hotel Search Results | Hotels.com";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    public void checkCarRentals(){
        clickOnLink("Car Rental");
    }
    public void checkRentalCarSearchBar(String pickupLocation) throws InterruptedException {
        sleepFor(5);
        rentalCarPickup.sendKeys(pickupLocation);
        //  clickByXpath(autoSuggest);
        rentalCarPickup.sendKeys(Keys.ARROW_DOWN);
        rentalCarPickup.sendKeys(Keys.ENTER);
    }
    public void pickupCalender(){
        clickByXpath(pickupCalenderLocator);
    }
    public void pickupDate(){
        clickByXpath(picupDateLocator);
    }
    public void checkDropOfCalender(){
        clickByXpath(dropofCalender);
    }
    public void checkDropOfDate(){
        clickByXpath(dropOfDate);
    }


    public void checkThingsToDo(){
        clickOnLink("Things to do");
    }
    public void checkThingsToDoSearchBox(String placeName) throws InterruptedException {
        sleepFor(5);
        thingsToDo.sendKeys(placeName);
        thingsToDo.sendKeys(Keys.ARROW_DOWN);
        thingsToDo.sendKeys(Keys.ENTER);
    }
    public void checkFromCalender() throws InterruptedException {
        sleepFor(5);
        clickByCss(thingsToDoFromCalender);
    }
    public void checkFromDate(){
        clickByXpath(thingsToDoFromDate);
    }
    public void checkToCalender(){
        clickByXpath(thingsToDoToCalender);
    }
    public void checkToDate(){
        clickByXpath(thingsToDoDate);
        clickByXpath(calenderSearchLocator);
    }
    public void checkThingsToDoSearchButton(){
        clickByXpath(thingsToDoSearchLocator);
    }
    public void verifyThingsToDoItems(){
        String actualText="Things to do in Miami (and vicinity) | Hotels";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkGiftCard(){
        clickOnLink("Gift Cards");
    }
    public void checkBuyNow() throws InterruptedException {
        //scrollDown();
        sleepFor(5);
        clickByXpath(buyNowLocator);
    }
    public void checkForMe(){
        clickByXpath(giftForMeLocator);
    }
    public void checkPickGiftCard(){
        clickByXpath(pickAGiftCardLocator);
    }
    public void checkDigitalCard(){
        clickByXpath(sendADigitalCardLocator);
    }
    public void checkHowMuch(){
        clickByXpath(giftCardAmountLocator);
    }


    public void checkGiftCardAmount(){
        clickByXpath(fiftyDollarLocator);

    }

    public void checkAddToCart(){
        clickByXpath(addToCardLocator);
    }
    public void verifyReviewYourCard(){
        String actualText="Hotels.com Gift Cards by CashStar";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    public void checkUploadYourOwnPhoto(){
        clickByXpath(uploadYourOwnPhotoLocator);
    }
    public void checkCheckBox(){
        clickByXpath(checkBoxLocator);
    }
    public void checkChoosePhoto(){
        clickByXpath(choosePhotoLocator);
    }
    public void checkLocalFile() throws InterruptedException {
        // clickByXpath(chooseLocalFileLocator);
        typeOnInputBox(chooseLocalFileLocator,pictureLocator);
        //upLoadFile1(chooseLocalFileLocator,pictureLocator);
        // chooseLocalFile.sendKeys(pictureLocator, Keys.ENTER);
        sleepFor(5);

    }
    public void checkUploadDone() throws InterruptedException {
        sleepFor(5);
        clickByXpath(fileUplaodDoneLocator);
    }

    public void checkFriendLink(){
        clickByXpath(friendLocator);
    }

    public void enterFriendsName(String friendName){
        friendsNameWebEdit.sendKeys(friendName);
    }

    public void enterSenderName(String myName){
        myNameWebEdit.sendKeys(myName);
    }
    public void checkAddAMessage(){
        clickByXpath(addaMessageLocator);
    }
    public void checkWhereItsGoing(){
        clickByXpath(whereItIsGoingLocator);
    }
    public void checkEmailWebEdit(String friendsEmail){
        emailWeb.sendKeys(friendsEmail);
    }

    public void checkPhysicalGiftCard(){
        clickByXpath(physicalGiftCardLocator);
    }
    public void checkShipping(){
        clickByXpath(shippingLocator);
    }

    public void checkUSPSLocator(){
        clickByXpath(uspsLocator);
    }
    public void checkCheckoutPage(){
        String actualText="Hotels.com Gift Cards by CashStar";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkRewards(){
        clickOnLink("Hotels.com® Rewards");
    }

    public void checkJoinNow(){
        clickOnLink("Join Now");
    }
    public void verifyCreateAccount(){
        String actualText="Hotels.com - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

}
