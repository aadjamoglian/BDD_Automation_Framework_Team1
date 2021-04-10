package homepage;

import common.WebAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import static homepage.DeltaWebElement.*;

public class DeltaHomePage extends WebAPI {
    //Login To Delta
        @FindBy(how = How.CSS, using = LoginLocator) public WebElement LoginLocatorClick;
        @FindBy(how = How.CSS, using = LogInToDelata) public WebElement LogInToDelataText;
        @FindBy(how = How.XPATH, using = UserName) public WebElement UserNameKey;
        @FindBy(how = How.XPATH, using = Password) public WebElement PasswordKey;
        @FindBy(how = How.CSS, using = AllFieldAreRequire) public WebElement AllFieldAreRequireText;

        //Travel Info
        @FindBy(how = How.XPATH, using = TravelInfoLocator) public WebElement TravelInfoLocatorhover;
        @FindBy(how = How.XPATH, using = BaggageLocator) public WebElement BaggageLocatorclick;
        @FindBy(how = How.XPATH, using = BaggageTravelFeesLocator) public WebElement BaggageTravelFeesLocatorText;
        @FindBy(how = How.XPATH, using = TrackCheckedBaggageLocator) public WebElement TrackCheckedBaggageLocatorclick;
        @FindBy(how = How.XPATH, using = CheckBagStatusLocator) public WebElement CheckBagStatusLocatortext;
        @FindBy(how = How.XPATH, using = DropDownConfirmation) public WebElement DropDownConfirmationPerform;
        @FindBy(how = How.XPATH, using = SearchByLocatorConfirmation) public WebElement SearchByLocatorConfirmationselet;
        @FindBy(how = How.XPATH, using = confarmationLocator) public WebElement confarmationLocatorsendKey;
        @FindBy(how = How.XPATH, using = LastNameLocator) public WebElement LastNameLocatorSendKey;

        //  Flight Status
        @FindBy(how = How.XPATH, using = FromLocator) public WebElement FromLocatorClick;
        @FindBy(how = How.XPATH, using = FromBoxLocator) public WebElement FromBoxLocatorClick;
        @FindBy(how = How.XPATH, using = KennedyJFKLocator) public WebElement KennedyJFKLocatorSendJFK;
        @FindBy(how = How.XPATH, using = ToLocator) public WebElement ToBoxLocatorClick;
        @FindBy(how = How.XPATH, using = ToBoxLocator) public WebElement ToBoxLocatorSendKeyBHM;
        @FindBy(how = How.XPATH, using = BirMingHamAlabamaLocator) public WebElement BirMingHamAlabamaLocatorclick;
        @FindBy(how = How.XPATH, using = SearchOptionLocator) public WebElement SearchOptionLocatorText;

        //  Round Trip
        @FindBy(how = How.XPATH, using = RoundTripDropDownSingLocator) public WebElement RoundTripDropDownSingLocatorClick;
        @FindBy(how = How.XPATH, using = SelectOneWayLocator) public WebElement SelectOneWayLocatorlick;
        @FindBy(how = How.XPATH, using = TheDeltaCustomerLocator) public WebElement TheDeltaCustomerLocatorText;

        //Flight Departure
        @FindBy(how = How.XPATH, using = DepartTimeLocator) public WebElement DepartTimeLocatorClick;
        @FindBy(how = How.XPATH, using = SelectApril16Locator) public WebElement SelectApril16LocatorDate;
        @FindBy(how = How.XPATH, using = ClickDepartureDoneLocator) public WebElement ClickDepartureDoneLocatorToClose;
        @FindBy(how = How.XPATH, using = ReturnLocator) public WebElement ReturnLocatorClick;
        @FindBy(how = How.XPATH, using = ClickMay3Locator) public WebElement ClickMay3LocatorSelect;
        @FindBy(how = How.XPATH, using = ReturnDateDoneLocator) public WebElement ReturnDateDoneLocatorLocate;

        //Passenger
        @FindBy(how = How.XPATH, using = PassengerDropDown) public WebElement PassengerDropDownBox;
        @FindBy(how = How.XPATH, using = SelectPassenger4Locator) public WebElement SelectPassenger4LocatorFromDropDown;
        @FindBy(how = How.XPATH, using = ClickArrow) public WebElement ClickArrowToGoNext;
        @FindBy(how = How.XPATH, using = FlyingMadeSimpleLocator) public WebElement FlyingMadeSimpleLocatorVerify;


    public void ExploreProduct() {
        LoginLocatorClick.click();
    }


    public void LogInToDelataTextVerify(String expectedText) throws InterruptedException {
        Thread.sleep(2000);
        String actualText = LogInToDelataText.getText();
        System.out.println(actualText);

        Assert.assertEquals("Product does not match", expectedText, actualText);

    }

    public void UserNameKeySend() throws InterruptedException {
        Thread.sleep(2000);
        UserNameKey.sendKeys("Happybgt");
    }

    public void PasswordKeySend() throws InterruptedException {
        Thread.sleep(2000);
        PasswordKey.sendKeys("TY5478");
    }


    public void AllFieldAreRequireTextVerify(String expectedText) throws InterruptedException {
        Thread.sleep(2000);
        String actualText = AllFieldAreRequireText.getText();
        System.out.println(actualText);

        Assert.assertEquals("Product does not match", expectedText, actualText);


    }

    //TravelInfo

    public void TravelInfoLocatorhoverPerform() {
        Actions action = new Actions(driver);
        action.moveToElement(TravelInfoLocatorhover).build().perform();
    }

    public void BaggageLocatorclickOn() throws InterruptedException {
        Thread.sleep(2000);
        BaggageLocatorclick.click();

    }


    public void GettingBaggageTravelFeesLocatorText(String expectedText) throws InterruptedException {
        Thread.sleep(2000);
        String actualText = BaggageTravelFeesLocatorText.getText();
        System.out.println(actualText);
        Assert.assertEquals("Product does not match", expectedText, actualText);
    }

    public void TrackCheckedBaggageLocatorclickOn() throws InterruptedException {
        Thread.sleep(2000);
        TrackCheckedBaggageLocatorclick.click();

    }

    public void gettingCheckBagStatusLocatortext(String expectedText) throws InterruptedException {
        Thread.sleep(2000);
        String actualText = CheckBagStatusLocatortext.getText();
        System.out.println(actualText);
        Assert.assertEquals("Product does not match", expectedText, actualText);
    }

    public void SearchByLocatorConfirmationselet() throws InterruptedException {
        Thread.sleep(2000);
        DropDownConfirmationPerform.click();
        //Select select = new Select(SearchByLocatorConfirmationselet);
        //select.selectByVisibleText("Confirmation Number");
        //select.deselectByIndex(2);
        SearchByLocatorConfirmationselet.click();

    }

    public void ConfarmationLocatorSendKey() throws InterruptedException {
        Thread.sleep(2000);
        confarmationLocatorsendKey.sendKeys("uy7458");

    }

    public void LastNameLocatorsendKey() throws InterruptedException {
        Thread.sleep(2000);
        LastNameLocatorSendKey.sendKeys("Biswas");

    }

    //FlightStatus

    public void YourOriginFromLocatorClick() {
        FromLocatorClick.click();

    }


    public void FromBoxLocatorClickOn() throws InterruptedException {
        Thread.sleep(2000);
        FromBoxLocatorClick.sendKeys("JFK");

    }

    public void KennedyJFKLocatorSendKeyJFK() throws InterruptedException {
        Thread.sleep(2000);
        KennedyJFKLocatorSendJFK.click();

    }

    public void ToBoxLocatorClickOn() throws InterruptedException {
        Thread.sleep(2000);
        ToBoxLocatorClick.click();

    }

    public void ToBoxLocatorSendKeyBHMOn() throws InterruptedException {
        Thread.sleep(2000);
        ToBoxLocatorSendKeyBHM.sendKeys("BHM");

    }

    public void BirMingHamAlabamaLocatorclick() throws InterruptedException {
        Thread.sleep(2000);
        BirMingHamAlabamaLocatorclick.click();

    }

    public void GettingSearchOptionLocatorText(String expectedText) throws InterruptedException {
        Thread.sleep(2000);
        String actualText = SearchOptionLocatorText.getText();
        System.out.println(actualText);
        Assert.assertEquals("Product does not match", expectedText, actualText);
    }

    public void RoundTripDropDownSingLocatorClickOn() throws InterruptedException {
        Thread.sleep(2000);
        RoundTripDropDownSingLocatorClick.click();

    }

    public void SelectOneWayLocatorlickOn() throws InterruptedException {
        Thread.sleep(2000);
        SelectOneWayLocatorlick.click();

    }

    public void GettingTheDeltaCustomerLocatorText(String expectedText) throws InterruptedException {
        Thread.sleep(3000);
        String actualText = TheDeltaCustomerLocatorText.getText();
        System.out.println(actualText);
        Assert.assertEquals("Product does not match", expectedText, actualText);
    }

    //Flight Departure and Return Date
    public void DepartTimeLocatorClickOn() throws InterruptedException {
        Thread.sleep(2000);
        DepartTimeLocatorClick.click();

    }
    public void SelectApril16LocatorDateOn() throws InterruptedException {
        Thread.sleep(2000);
        SelectApril16LocatorDate.click();

    }
    public void ClickDepartureDoneLocatorToCloseOn() throws InterruptedException {
        Thread.sleep(2000);
        ClickDepartureDoneLocatorToClose.click();

    }
    public void ReturnLocatorClickon() throws InterruptedException {
        Thread.sleep(2000);
        ReturnLocatorClick.click();

    }
    public void ClickMay3LocatorSelect() throws InterruptedException {
        Thread.sleep(2000);
        ClickMay3LocatorSelect.click();

    }
    public void ReturnDateDoneLocatorLocateon() throws InterruptedException {
        Thread.sleep(2000);
        ReturnDateDoneLocatorLocate.click();

    }
//Passenger
    public void PassengerDropDownBoxSelect() throws InterruptedException {
    Thread.sleep(2000);
        PassengerDropDownBox.click();

    }
    public void SelectPassenger4LocatorFromDropDownBox() throws InterruptedException {
        Thread.sleep(2000);
        SelectPassenger4LocatorFromDropDown.click();

    }
    public void ClickArrowToGoNextPage () throws InterruptedException {
        Thread.sleep(2000);
        ClickArrowToGoNext.click();

    }
    public void FlyingMadeSimpleLocatorVerify(String expectedText) throws InterruptedException {
        Thread.sleep(4000);
        String actualText = FlyingMadeSimpleLocatorVerify.getText();
        System.out.println(actualText);

        Assert.assertEquals("Product does not match", expectedText, actualText);


    }


}
