package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = zipCodeLocationLocator)
    public WebElement zipCodeLocation;
    @FindBy(how = How.XPATH, using = zipCode1Locator)
    public WebElement zipCode1;
    @FindBy(how = How.XPATH, using = firstNameLocator)
    public WebElement firstName;
    @FindBy(how = How.XPATH, using = lastNameLocator)
    public WebElement lastName;
    @FindBy(how = How.XPATH, using = dateOfBirthLocator)
    public WebElement dateOfBirth;


    public void checkClaims() {
        getTextByCss(claimsLocator);
    }

    public void checkClaimsOverView() {
        getTextByXpath("//*[@id=\"ClaimsNavigation\"]/div[1]/div[1]/ul/li[1]/a");

    }

    public void checkAuto() {
        clickOnLink("Auto");
    }

    public void verifyRepair() {
        String actualText = "Progressive: Ranked One Of The Best Insurance Companies | Progressive";
        String expectedTest = driver.getTitle();
        Assert.assertEquals(actualText, expectedTest, "Link is not working as expected");
    }

    public void checkExploreProducts() {
        clickByXpath(exploreProductLocator);
    }

    public void checkATV() {
        clickOnLink("ATV/UTV");
    }

    public void checkZipCodeLocation(String zipCode) {
        zipCodeLocation.sendKeys(zipCode);
    }

    public void verifyGetAQuote() {
        String actualText = "Low-cost ATV Insurance from the #1 Motorcycle Insurer | Progressive";
        String expectedTest = driver.getTitle();
        Assert.assertEquals(actualText, expectedTest, "Link is not working as expected");
    }

    public void checkZipCode1(String autoZipcode) {
        zipCode1.sendKeys(autoZipcode);
    }

//    public void checkGetAQuote() {
//        clickByXpath(getAQuoteLocator);
//    }

    public void checkAuto1() {
        clickByXpath(auto1Locator);
    }

    public void checkFirstName(String firstNameBox) {
        firstName.sendKeys(firstNameBox);
    }

    public void checkLastName(String lastNameBox) {
        lastName.sendKeys(lastNameBox);
    }

    public void checkDateOfBirth(String dateOfBirthBox) {
        dateOfBirth.sendKeys(dateOfBirthBox);
    }

    public void verifyMailingAddressOption() {
        String actualText = "Name And Address";
        String expectedTest = driver.getTitle();
        Assert.assertEquals(actualText, expectedTest, "Link is not working as expected");
    }

    public void checkBoat() {
        clickByXpath(boatLocator);
    }

    public void checkFishingBoat() {
        clickByCss(fishingBoatLocator);
    }

    public void checkBoatInsuranceRequirement() {
        clickOnLink("boat insurance requirements");
    }

    public void checkMoreTypes() {
        clickByXpath("//button[@id='expandingButton1']");
    }

    public void checkMotorCycle() {
        clickByCss(motorCycleLocator);
    }

    public void checkFindAgent() {
        clickByXpath(findAgentLocator);
    }

    public void verifyLocalInsuranceAgent() {
        String actualText = "Motorcycle Insurance: Get a Quote Online | Progressive";
        String expectedTest = driver.getTitle();
        Assert.assertEquals(actualText, expectedTest, "Link is not working as expected");
    }

    public void checkHomeOwners() {
        clickByXpath("//*[@id=\"ExploreProductsNavigation\"]/div[1]/div[2]/ul[1]/li[3]/a");
    }

    public void checkHomeInsurance() {
        clickByXpath("//a[contains(text(),'compare homeowners insurance rates')]");
    }

}