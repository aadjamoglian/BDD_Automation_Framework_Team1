package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

// Action Method class

    // Find By Annotation: First Approach
    @FindBy(how = How.ID, using =searchBoxLocator ) public WebElement searchBox;
    @FindBy (how = How.ID, using =searchButtonLocator ) public WebElement searchButton;



    public void enterProductName( String productName){
        searchBox.sendKeys(productName);
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }

    public void verifySearchResult(String expectedText){
        //String actualText=searchText.getText();
       // Assert.assertEquals("Product does not match",expectedText,actualText);
    }

    public void verifySearchResultNotMatch(String expectedText){
       // String actualText=searchText.getText();
        //Assert.assertNotEquals("Product does not match",expectedText,actualText);
    }

    public void verifyPageTitle(String expectedText){
        String actualText=driver.getTitle();
        Assert.assertEquals("Page Title not match",expectedText,actualText);
    }
    public void exploreProducts() throws InterruptedException {
        clickByLinkText(exploreProductsLocator);
        sleepFor(3);
    }
    public void claims() throws InterruptedException {
        clickByXpath(claimsLocator);
        sleepFor(3);
    }
    public void claimsMenu() throws InterruptedException {
        clickByLinkText(claimsMenuLocator);
        sleepFor(3);
    }
    public void aboutUs() throws InterruptedException {
        clickByXpath(aboutUsLocator);
        sleepFor(3);
    }
    public void aboutUsMenu() throws InterruptedException {
        clickByLinkText(aboutUsMenuLocator);
        sleepFor(3);
    }
    public void answer() throws InterruptedException {
        clickByXpath(answerLocator);
        sleepFor(3);
    }
    public void answerMenu() throws InterruptedException {
        clickByLinkText(answerMenuLocator);
        sleepFor(3);
    }
    public void seeAllTopics() throws InterruptedException, IOException {
        clickByXpath(seeAllTopicsLocator);
        sleepFor(3);
        takeScreenShot();
    }
//    public void autoBox() throws InterruptedException, IOException {
//        clickByXpath(autoBoxLocator);
//        sleepFor(3);
//    }
    public void enterZipCode() throws InterruptedException, IOException {
        typeByXpath(enterZipCodeLocator,"91335");
        sleepFor(3);
    }
    public void getAQuote() throws InterruptedException, IOException {
        clickByXpath(getAQuoteLocator);
        sleepFor(3);
    }
    public void see30PlusProducts() throws InterruptedException, IOException {
        clickByXpath(see30PlusProductsLocator);
        sleepFor(3);
    }
//    public void health() throws InterruptedException, IOException {
//        clickByXpath(healthLocator);
//        sleepFor(3);
//    }
public void autoHome() throws InterruptedException, IOException {
        clickByXpath(autoHomeLocator);
        sleepFor(3);
}
    public void findAnAgent() throws InterruptedException, IOException {
        clickByXpath(findAnAgentLocator);
        sleepFor(3);
    }
    public void investors() throws InterruptedException, IOException {
        clickByLinkText(investorsLocator);
        sleepFor(3);
        scrollToBottom();
        sleepFor(3);
    }
    public void contactUs() throws InterruptedException, IOException {
        clickByXpath(contactUsLocator);
        sleepFor(3);
        scrollToBottom();
        sleepFor(3);
    }
    public void becomeAPartner() throws InterruptedException, IOException {
        clickByXpath(becomeAPartnerLocator);
        sleepFor(3);
        scrollToBottom();
        sleepFor(3);
    }
    public void newsRoom() throws InterruptedException, IOException {
        clickByXpath(newsRoomLocator);
        sleepFor(3);
        scrollToBottom();
        sleepFor(3);
    }
    public void ATVUTVLink() throws InterruptedException, IOException {
        clickByXpath(ATVUTVLocator);
        sleepFor(3);

    }
    public void claimsOverview() throws InterruptedException, IOException {
        clickByXpath(claimsOverviewLocator);
        sleepFor(3);

    }

    public void claimsLink() throws InterruptedException, IOException {
        clickByXpath(claimsLinkLocator);
        sleepFor(3);

    }
    public void localAgent() throws InterruptedException, IOException {
        clickByXpath(localAgentLocator);
        sleepFor(3);

    }
    public void autoButton() throws InterruptedException, IOException {
        clickByXpath(autoButtonLocator);
        sleepFor(3);

    }
    public void agentButton() throws InterruptedException, IOException {
        clickByXpath(agentButtonLocator);
        sleepFor(3);

    }
    @FindBy (how = How.XPATH, using =selectOptionLocator) public WebElement selectOption;
    public void selectOption() throws InterruptedException, IOException {
        selectOptionByVisibleText(selectOption,"ATV");
        clickByXpath(selectOptionLocator);
        sleepFor(3);

    }
    public void carInsurance() throws InterruptedException, IOException {
        clickByXpath(carInsuranceLocator);
        sleepFor(3);

    }
    public void autoPopular() throws InterruptedException, IOException {
        clickByXpath(autoPopularLocator);
        sleepFor(3);

    }
    public void bundleSave() throws InterruptedException, IOException {
        clickByXpath(bundleSaveLocator);
        sleepFor(3);

    }
    public void property() throws InterruptedException, IOException {
        clickByXpath(propertyLocator);
        sleepFor(3);

    }
    public void loginClick() throws InterruptedException, IOException {
        clickByXpath(loginLocator);
        sleepFor(3);

    }
    public void autoInsuranceLink() throws InterruptedException, IOException {
        clickByXpath(autoInsuranceLinkLocator);
        sleepFor(3);

    }
    public void callUsLink() throws InterruptedException, IOException {
        clickByXpath(callUsLinkLocator);
        sleepFor(3);

    }
    public void condoLink() throws InterruptedException, IOException {
        clickByXpath(condoLinkLocator);
        sleepFor(3);

    }
    public void homeOwner() throws InterruptedException, IOException {
        clickByXpath(homeOwnerLocator);
        sleepFor(3);

    }
    public void mobileHome() throws InterruptedException, IOException {
        clickByXpath(mobileHomeLocator);
        sleepFor(3);

    }
    public void personalLoans() throws InterruptedException, IOException {
        clickByXpath(personalLoansLocator);
        sleepFor(3);

    }
    public void businessInsurance() throws InterruptedException, IOException {
        clickByXpath(businessInsuranceLocator);
        sleepFor(3);

    }
    public void lifeLink() throws InterruptedException, IOException {
        clickByXpath(lifeLinkLocator);
        sleepFor(3);

    }





}
