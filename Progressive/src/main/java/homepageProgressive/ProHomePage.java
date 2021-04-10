package homepageProgressive;

import common.WebAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import  static  homepageProgressive.proWebElement.*;

public class ProHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = ExploreProduct) public WebElement ExploreProductbox;
    @FindBy(how = How.XPATH, using = VehicalLocator) public WebElement VehicalText;
    @FindBy(how = How.XPATH, using = ExploreProductText) public WebElement GetExploreProductText;

    //2nd case Auto Click
    @FindBy(how = How.XPATH, using = AutoClick) public WebElement AutoClickInPage;
    @FindBy(how = How.XPATH, using = AutoText) public WebElement GetAutoText;
    @FindBy(how = How.XPATH, using = EnterZipCode) public WebElement EnterZipCodeInBox;
    @FindBy(how = How.XPATH, using = GetACodeClickLocator) public WebElement GetACodeClick;
    @FindBy(how = How.XPATH, using = NameAndBirthTextLocator) public WebElement NameAndBirthText;

    // 3rd Enter Personal Information to get the Auto Code
    @FindBy(how = How.XPATH, using = FirstNameLocator) public WebElement SendKeyInFirstName;
    @FindBy(how = How.XPATH, using = LastNameLocator) public WebElement SendKeyInLasttName;
    @FindBy(how = How.XPATH, using = SuffixLocator) public WebElement SuffixLocatorClick;

    //Progressive customer login
    @FindBy(how = How.XPATH, using = LoginLocator) public WebElement clickLoginLocator;
    @FindBy(how = How.XPATH, using = userIdLocator) public WebElement senduserIdLocator;
    @FindBy(how = How.XPATH, using = passwordLocator) public WebElement sendpasswordLocator;
    @FindBy(how = How.XPATH, using = welcomeTextLocator) public WebElement getwelcomeTextLocator;
    @FindBy(how = How.XPATH, using = loginLinkLocator) public WebElement loginLink;
    //claim Overview
    @FindBy(how = How.XPATH, using = claimLocator) public WebElement clickclaimLocator;
    @FindBy(how = How.XPATH, using = claimstextLocator) public WebElement getclaimstextLocator;
    @FindBy(how = How.XPATH, using = claimOverviewLocator) public WebElement clickclaimOverviewLocator;
    @FindBy(how = How.XPATH, using = progressiveClaim) public WebElement getprogressiveClaimText;

    //Answer
    @FindBy(how = How.XPATH, using = AnswerLocator) public WebElement AnswerLocatorButtonclick;
    @FindBy(how = How.XPATH, using = progressiveAnswerLocator) public WebElement progressiveAnswerLocatorText;
    @FindBy(how = How.XPATH, using = seeAlltopicboxLocator) public WebElement seeAlltopicboxLocatorButtonClick;
    @FindBy(how = How.XPATH, using = amIcoveredLocator) public WebElement amIcoveredLocatorclick;
    @FindBy(how = How.XPATH, using = RenterInsuranceCoverTheftLocator) public WebElement RenterInsuranceCoverTheftLocatorclick;
    @FindBy(how = How.XPATH, using = RenterInsuranceCoverTheftLocatorText) public WebElement getRenterInsuranceCoverTheftLocatorText;

    // data Step defination
    @FindBy(how = How.XPATH, using = LifeLocator) public WebElement LifeLocatorClick;
    @FindBy(how = How.XPATH, using = SelectTypeOfLifeInsurance) public WebElement SelectTypeOfLifeInsuranceText;
    @FindBy(how = How.XPATH, using = zipcodeLocator) public WebElement zipcodeLocatorSend;
    @FindBy(how = How.ID, using = GetquoteLocator) public WebElement GetquoteLocatorBox;
    @FindBy(how = How.NAME, using = FirstNameLocator1) public WebElement FirstName1Send;
    @FindBy(how = How.NAME, using = LastNameLocator1) public WebElement lastName1Send;
    @FindBy(how = How.XPATH, using = TellUsAboutYourSelf) public WebElement TellUsAboutYourSelftext;


    //  1st test case
    public void ExploreProduct() {
        ExploreProductbox.click();
    }

    public void verifyVehical(String expectedText) throws InterruptedException {
        Thread.sleep(2000);
        String actualText = VehicalText.getText();
        System.out.println(actualText);

        Assert.assertEquals("Product does not match", expectedText, actualText);

    }

    public void verifyExploreProduct(String expectedText) throws InterruptedException {

        Thread.sleep(2000);
        String actualText = GetExploreProductText.getText();
        System.out.println(actualText);

        Assert.assertEquals("Product does not match", expectedText, actualText);

    }

    //2nd case Auto Click

    public void AutoClickCase() {
        AutoClickInPage.click();

    }

    public void verifyAutoTextCase(String expectedText) throws InterruptedException {
        Thread.sleep(2000);
        String actualText = GetAutoText.getText();
        Assert.assertEquals("Product does not match", expectedText, actualText);
    }

    public void SendKeyInZipCode() throws InterruptedException {
        Thread.sleep(2000);
        EnterZipCodeInBox.sendKeys("19342");
    }

    public void GetACodeClickLocatorCase() {

        GetACodeClick.click();
    }

    public void verifyNameAndBirthText(String expectedText) throws InterruptedException {
        Thread.sleep(2000);
        String actualText = NameAndBirthText.getText();
        Assert.assertEquals("Product does not match", expectedText, actualText);

    }

    // 3rd Enter Personal Information to get the Auto Code
    public void FirstNameSendKey() {
        SendKeyInFirstName.sendKeys("Happy");

    }

    public void LastNameSendKey() throws InterruptedException {
        Thread.sleep(2000);
        SendKeyInLasttName.sendKeys("Das");
    }

    public void Suffix() throws InterruptedException {
        Thread.sleep(3000);
        //select dropdown using select method
        Select suffix = new Select(SuffixLocatorClick);
        suffix.selectByVisibleText("Sr");
        suffix.selectByIndex(2);
    }

    //progressive login button
    public void progressiveLoginButton() {

        clickLoginLocator.click();
    }

    //This method for Data table example (converting the regular login)
    public void SetuserId() throws InterruptedException {
        Thread.sleep(2000);
        senduserIdLocator.sendKeys("Happy");
        // senduserIdLocator.sendKeys(UserId);
    }

    public void SetPassword() throws InterruptedException {
        Thread.sleep(2000);
        sendpasswordLocator.sendKeys("hs458");
    }


    public void getWelcomeText(String expectedText) throws InterruptedException {
        Thread.sleep(2000);
        String actualText = getwelcomeTextLocator.getText();
        Assert.assertEquals("Product does not match", expectedText, actualText);

    }

    public void clickloginLink() throws InterruptedException {
        Thread.sleep(2000);
        loginLink.click();
    }


    //claim overview
    public void verifyclaimLocator() throws InterruptedException {
        Thread.sleep(2000);
        clickclaimLocator.click();

    }

    public void verifyclaimTextLocator(String expectedText) throws InterruptedException {
        Thread.sleep(2000);
        String actualText = getclaimstextLocator.getText();
        Assert.assertEquals("Product does not match", expectedText, actualText);


    }


    public void verifyclaimoverviewLocator() throws InterruptedException {
        Thread.sleep(2000);
        clickclaimOverviewLocator.click();


    }

    public void verifyprogressiveclaim(String expectedText) throws InterruptedException {
        Thread.sleep(2000);
        String actualText = getprogressiveClaimText.getText();
        Assert.assertEquals("Product does not match", expectedText, actualText);


    }


    //Answer


    public void AnswerLocatorButtonclickInProgressivePage() throws InterruptedException {
        Thread.sleep(2000);
        AnswerLocatorButtonclick.click();
    }

    public void verifyprogressiveAnswerLocatorText(String expectedText) throws InterruptedException {
        Thread.sleep(2000);
        String actualText = progressiveAnswerLocatorText.getText();
        Assert.assertEquals("Product does not match", expectedText, actualText);


    }

    public void seeAlltopicboxLocatorButtonClickOn() throws InterruptedException {
        Thread.sleep(2000);
        seeAlltopicboxLocatorButtonClick.click();


    }

    public void amIcoveredLocatorclickOn() throws InterruptedException {
        Thread.sleep(2000);
        amIcoveredLocatorclick.click();

    }

    public void RenterInsuranceCoverTheftLocatorclickOn() throws InterruptedException {
        Thread.sleep(2000);
        RenterInsuranceCoverTheftLocatorclick.click();
    }

    public void getRenterInsuranceCoverTheftLocatorTextOn(String expectedText) throws InterruptedException {
        Thread.sleep(2000);
        String actualText = getRenterInsuranceCoverTheftLocatorText.getText();
        Assert.assertEquals("Product does not match", expectedText, actualText);


    }

    // data defination feature
    public void LifeLocatorClickMethod() throws InterruptedException {
        Thread.sleep(2000);
        LifeLocatorClick.click();

    }

    public void SelectTypeOfLifeInsuranceGetText(String expectedText) throws InterruptedException {
        Thread.sleep(2000);
        String actualText = SelectTypeOfLifeInsuranceText.getText();
        Assert.assertEquals("Product does not match", expectedText, actualText);


    }

    public void zipcodeLocatorSendMethod(String ZipCode) throws InterruptedException {
        Thread.sleep(2000);
        zipcodeLocatorSend.sendKeys(ZipCode);
    }


    public void GetquoteLocatorBoxClick() throws InterruptedException {
        Thread.sleep(2000);
        GetquoteLocatorBox.click();
    }


    public void FirstName1SendKey(String  FirstName) throws InterruptedException {
        Thread.sleep(2000);
        FirstName1Send.sendKeys( FirstName);
    }
    public void lastName1SendKey(String  LastName) throws InterruptedException {
        Thread.sleep(2000);
        lastName1Send.sendKeys( LastName);
    }
    public void TellUsAboutYourSelfGettext(String expectedText) throws InterruptedException {
        Thread.sleep(2000);
        String actualText = TellUsAboutYourSelftext.getText();
        Assert.assertEquals("Product does not match", expectedText, actualText);


    }

}