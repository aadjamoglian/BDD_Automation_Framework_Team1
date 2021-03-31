package homepage;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homepage.ProgressiveWebElement.*;
import static homepage.ProgressiveWebElement.*;

public class ProgressiveHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = zipcodeSearchBoxLocator) public WebElement zipcodeSearchBox;
    @FindBy(how = How.XPATH, using = localAgentZipcodeLocator) public WebElement localAgent;
    @FindBy(how = How.XPATH, using = dentalInsuranceZipcodeLocator) public WebElement dentalInsuranceZipcode;
    @FindBy(how = How.XPATH, using = findPlansSearchBoxLocator) public WebElement findPlansSearchBox;
    @FindBy(how = How.XPATH, using = applicantDOBLocator) public WebElement DOBLocator;
    @FindBy(how = How.XPATH, using = homeownerZipcodeLocator) public WebElement homeownerZipcodes;
    @FindBy(how = How.XPATH, using = homeAddressSearchBoxLocator) public WebElement homeaddressSearchBox;
    @FindBy(how = How.XPATH, using = commercialAutoZipcodeLocator) public WebElement commercialAutoZipcode;
    @FindBy(how = How.TAG_NAME, using = whatDoYouDoSearchBoxLocator) public WebElement whatDoYouDoSearchBox;
    @FindBy(how = How.XPATH, using = whatDoYouDoSearchButtonLocator) public WebElement whatDoYouDoSearchButton;
    @FindBy(how = How.XPATH, using = bundleZipcodeLocator) public WebElement bundleZipcode;
    @FindBy(how = How.XPATH, using = pwcZipcodeLocator) public WebElement pwcZipcode;


    public void checkExploreProducts(){
        clickByXpath(exploreProductsLocator);
    }
    public void checkAutoLink(){
        clickByXpath1(autoLocator);
//        Actions action= new Actions(driver);
//        action.moveToElement(driver.findElement(By.xpath(autoLocator))).perform();

    }
    public void checkZipcodeSearBox(String zipcode){
        zipcodeSearchBox.sendKeys(zipcode);

    }

    public void checkStartQuoteButton(){
        clickByXpath(startMyQuoteLocator);

    }

    public void verifyCarModelPage(){
        String actualText="Add Vehicle";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    public void checkGetQuoteButton(){
        clickByXpath(getQuoteLocator);
    }
    public void verifystartmyQuoteForm(){
        String actualText="Car Insurance: Free Auto Insurance Quotes | Progressive";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkClaimsLink(){
        clickByXpath(claimsLocator);
    }
    public void checkClaimsOverviewLocator(){
        clickByXpath(claimsOverviewLocator);
    }
    public void checkReportClaim(){
        clickByXpath(reportClaimLocator);
    }
    public void verifyLogInPage(){
        String actualText="File or View Your Insurance Claim | Progressive";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    public void checkAutoProcessLink(){
        clickOnLink("Auto Process");
    }
    public void verifyAutoProcessPage(){
        String actualText="Auto Insurance Claims Process | Progressive";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkRoadSideAssistance(){
        clickOnLink("Roadside Assistance");
    }
    public void checkClaimThroughProgressiveApp(){
        clickByXpath(claimThroughProgressiveAppLocator);

    }
    public void verifyDownloadPage(){
        String actualText="App for iPhone & Android – Pay Bills, Manage Your Account & More | Progressive";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    public void checkCatastropheLink(){
        clickOnLink("Catastrophe");
    }
    public void checkLoginLink(){
        clickByXpath(logInLinkLocator);
    }
    public void verifyLoginPage(){
        String actualText="Catastrophe Claims - Progressive's Catastrophe (CAT) Team | Progressive";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkAboutUs(){
        clickByXpath(aboutUsLocator);
    }
    public void checkCorporateResponsibility(){
        clickByXpath(corporateResponsibility);
    }
    public void verifyCorporateResponsibilityPage(){
        String actualText="Corporate Responsibility | Progressive";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkInvestorsLink(){
        clickByXpath(investorsLocator);
    }
    public void verifyInvestorsPage(){
        String actualText="Investor Relations | Progressive";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkCareer(){
        clickByXpath(careerLocator);
    }
    public void checkFindACareer(){
        clickOnLink("Find a career");
    }
    public void verifyJobOpeningPage(){
        String actualText="Job Search";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");

    }
    public void checkLocalAgent(){
        clickByXpath(localAgentsLocator);
    }
    public void checkLocalAgentZipcode(String localAgentZipcode){
        localAgent.sendKeys(localAgentZipcode);
    }
    public void checkFindAnAgentButton(){
        clickByXpath(findAnAgentLocator);
    }
    public void verifyAgentList(){
        String actualText="Benefits of a Local Insurance Agent | Progressive Agent";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkNewsroom(){
        clickByXpath(newsroomLocator);
    }
    public void verifyNewsroomPage(){
        String actualText="Recent News Releases & Coverage | Progressive Newsroom";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    public void checkDental(){
        clickByXpath(dentalLocator);
    }
    public void checkDentalInsuranceSearchBox(String dentalZipcode) throws InterruptedException {
        sleepFor(3);
        dentalInsuranceZipcode.sendKeys(dentalZipcode);
    }
    public void checkGetDentalQuote(){
        clickByXpath(getDentalQuoteLocator);
    }
    public void checkFindPlansSearchBox(String findPlansZipcode){
        findPlansSearchBox.sendKeys(findPlansZipcode);
    }
    public void checkFemaleRadioButton() throws InterruptedException {
        sleepFor(3);
        clickByXpath(femaleRadioButton);
    }
    public void checkApplicantDOB(String applicantDOB){
        DOBLocator.sendKeys(applicantDOB);
    }
    public void checkCoverageCalender(){
        clickByXpath(coverageCalenderLocator);
        clickByXpath(coverageDateLocator);
    }
    public void checkDentalPlans(){
        clickByXpath(findDentalPlansLocator);
    }
    public void verifyAvailablePlans(){
        String actualText="Health Insurance Quote Page - Dental Insurance";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkHomeowners(){
        clickByXpath(homeownersLocator);
    }
    public void checkHomeownersZipcode(String homeownerZipcode){
        homeownerZipcodes.sendKeys(homeownerZipcode);
    }
    public void checkHomeownersInsuranceQuote() throws InterruptedException {
        sleepFor(5);
        clickByXpath(homeownersInsuranceQuoteLocator);
    }
    public void checkHomeAddress(String homeAddress) throws InterruptedException {
        sleepFor(4);
        homeaddressSearchBox.sendKeys(homeAddress);
        homeaddressSearchBox.sendKeys(Keys.ARROW_DOWN);
        homeaddressSearchBox.sendKeys(Keys.ENTER);
    }
    public void checkLetsGoButton(){
        clickByXpath(letsGoButtonLocator);
    }

    public void checkNoRadioButton() throws InterruptedException {
        sleepFor(3);
        clickByXpath(noRadioButtonLocator);
    }
    public void CheckHomeOwnersCalender(){
        clickByXpath(homeOwnersInsuranceCalenderLocator);
        clickByXpath(calenderNextButton);
        clickByXpath(homeownersDateLocator);
    }
    public void checkNextButton() throws InterruptedException {
        sleepFor(5);
        clickByCss(nextButtonLocator);
    }
    public void verifyHomeBasicsPage(){
        String actualText="Bolt - Progressive";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkmotorcyclce(){
        clickByXpath(motorCycleLocator);
    }
    public void verifyMotorbikeModelPage(){
        String actualText="Name And Address";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    public void checkMobileHome(){
        clickByXpath(mobileHomeLocator);
    }
    public void verifyMobileHome(){
        String actualText="Specialty Homeowners";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkCommercialAuto(){
        clickOnLink("Commercial Auto");
    }
    public void checkCommericalAutoZipcode(String caZipcode){
        commercialAutoZipcode.sendKeys( caZipcode);
    }

    public void verifyCommercialAutoList(){
        String actualText="Vehicles - Progressive Quote";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    public void checkCommericialAutoQuoteLink(){
        clickByXpath(commercialAUtoQuoteLocator);
    }
    public void checkWorkersCompensationRadioButton(){
        clickByXpath(workersCompensationRadioButton);
    }
    public void checkWorkersCompensation(){
        clickOnLink("Workers’ Compensation");
    }

    public void checkContinueButton(){
        clickByCss(continueButtonLocator);
    }
    public void verifyWhatDoYouDoPage(){
        String actualText="Product | Progressive Business Quote Explorer";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkProfessionalLiability(){
        clickOnLink("Professional Liability");
    }
    public void checkProfessionalLiabilityRadioButton(){
        clickByXpath(professionalLiabiltyRadioButton);
    }
    public void checkGeneralLiability(){
        clickOnLink("General Liability");
    }
    public void checkGeneralLiabilityRadioButton(){
        clickByXpath(generalLiabilityRadioButton);
    }
    public void checkWhatDoYouDoSearchBox(String profession) throws InterruptedException {
        sleepFor(4);
        whatDoYouDoSearchBox.sendKeys(profession);
        clickByXpath(whatDoYouDoSearchButtonLocator);
    }
    public void checkTeacherRadioButton(){
        clickByXpath(teacherRadioButtonLocator);
    }
    public void checkWhatDoYouDoContinueButton(){
        clickByXpath(whatDoYouDoContinueLocator);
    }
    public void verifyBusinessInfoForm(){
        String actualText="Business Type | Progressive Business Quote Explorer";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkBusinessOwnersPolicy(){
        clickOnLink("Business Owners Policy");
    }
    public void verifyLetsGetStartedPage(){
        String actualText="Business Owners Policy | Progressive Commercial";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    public void checkBusinessInsurance(){
        clickOnLink("Business Insurance");
    }
    public void letsGetsStartedPage(){
        String actualText="Business Insurance | Progressive Commercial";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkSnowmobile(){
        clickOnLink("Snowmobile");
    }
    public void verifyDriverInfo(){
        String actualText="Snowmobile Insurance: Get a Quote Online | Progressive";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkBoat(){
        clickOnLink("Boat");
    }
    public void verifyBoatDriverInfo(){
        String actualText="Snowmobile Insurance: Get a Quote Online | Progressive";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkClassicCar(){
        clickOnLink("Classic Car");
    }
    public void verifyClassicCarDriverInfo(){
        String actualText="Get a Quote for Classic Car Insurance | Progressive";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkGolfCar(){
        clickOnLink("Golf Cart");
    }
    public void verifyGolfCarDriverInfo(){
        String actualText="Golf Cart Insurance: Get a Quote Online | Progressive";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    public void checkTrailerLink(){
        clickOnLink("RV/Trailer");
    }
    public void verifyTrailerLists(){
        String actualText="RV Insurance: Get a Free Quote Online | Progressive";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkSegwayLink(){
        clickOnLink("Segway");
    }
    public void verifySegwayDriverInfo(){
        String actualText="Segway Insurance | Progressive";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    public void checkBundleLink(){
        clickOnLink("Auto + Property");
    }
    public void checkBundleZipcode(String bundleZip){
        bundleZipcode.sendKeys(bundleZip);
    }

    public void verifyDriverInf(){
        String actualText="Home & Auto Insurance Bundle | Progressive";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    public void checkHomeSecurity(){
        clickOnLink("Home Security");
    }

    public void checkBuyOnline(){
        clickByXpath(buyOnlineButton);
    }
    public void checkHouseLink(){
        clickByXpath(houseLocator);
    }
    public void checkHouseSize(){
        clickByXpath(houseSizeLocator);
    }
    public void checkNumberofDoors(){
        clickByXpath(numberOfDoorsLocator);
    }
    public void verifySubmitEmailPage(){
        String actualText="Progressive | Home Security Systems | Wireless Home Security | Burglar Alarms | SimpliSafe";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }
    public void checkPWCLink(){
        clickOnLink("PWC");
    }
    public void verifyPWCinfo(){
        String actualText="PWC Insurance for Jet Skis, WaveRunners & More | Progressive";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    public void checkPwcSearchBox(String pwcZip){
        pwcZipcode.sendKeys(pwcZip);
    }
    public void pwcGetQuotes(){
        clickByXpath(pwcGetQuoteLocator);
    }







}
