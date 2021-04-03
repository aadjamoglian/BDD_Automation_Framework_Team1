package atthomepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static atthomepage.AttHomePageWebElement.*;

public class ATTHomepage extends WebAPI {

    @FindBy(how = How.XPATH, using = searchBoxLocator) public WebElement searchBox;
    @FindBy(how = How.CSS, using = searchButtonLocator) public WebElement searchButton;
    @FindBy(how = How.CLASS_NAME, using = searchTextLocator) public WebElement searchText;
    @FindBy(how = How.XPATH, using = addressSearchBoxLocator) public WebElement addressSearchBox;
    @FindBy(how = How.XPATH, using = addressZipcodeLocator) public WebElement addressZipcode;

    public void searchBox(String productName){
        searchBox.sendKeys(productName);
    }

    public void searchButton(){
        searchButton.click();
    }

    public void verifySearchResult(String expectedText){
        String actualText="iphone 12";
        Assert.assertEquals(actualText,expectedText,"Product not showing as expected");
    }

    public void verifyPageTitle(String expectedText){
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText,"Page title do not match");
    }

    public void checkMenuBarLink(){
        getTextByXpath(menuBarLocator);
    }
    public void checkInternetLink(){
        clickByLinkText("Internet");
    }
    public void checkInternetAccessories(){
       clickByXpath1(internetAccessoriesLocator);
        //clickOnLink("Internet accessories");

    }

    public void verifyRelatedProducts(String expectedText){
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"product title do not match");
    }

    public void checkDeals(){
        getTextByXpath(dealsLocator);
    }
    public void checkWireless(){
        clickOnLink("Wireless");
    }
    public void checkExploreWireless(){
        clickByXpath1(exploreWireless);
    }
    public void checkExploreWirelessRelatedItems(){
        String actualText="AT&T Wireless – Latest Phones & Best Wireless Plans";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }
    public void checkWirelessRelatedItems(){
        String actualText="Explore wireless";
        String expectedText=driver.findElement(By.xpath(exploreWireless)).getText();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    public void checkPhonesAndDevices(){
        //clickByXpath(phoneAndDevicesLocator);
        clickOnLink("Phones & devices");
    }

    public void checkLowCostPhone(){
        clickByXpath1(lowCostPhonesLocator);
    }
    public void verifyLowCostPhones(){
        String actualText="Compare Devices";
        String expectedText=driver.findElement(By.xpath(compareDevicesLocator)).getText();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }
    public void checkCompareDevices(){
        //clickByCss(compareDevicesLocator);
        clickOnLink("Compare devices");
    }
    public void verifyCompareDevices(){
        String actualText="Phones, Cell Phones, & Smartphones from AT&T";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    public void checkApple(){
        clickByXpath1(appleLocator);
    }
    public void verifyApplePhones(){
        String actualText="Apple Phones -- Get the New iPhone 12 from AT&T";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }
    public void checkSamsung(){
        //getTextByXpath(samsungLocator);
//        clickByLinkText("Samsung");
        clickByXpath1(samsungphoneLocator);
    }

    public void verifySamsungPhones(){
        String actualText="Samsung";
        String expectedText=driver.findElement(By.xpath(samsungLocator)).getText();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }
    public void checkStorePickup(){
        clickOnElement1(storePickUpLocator);
    }


    public void verifyStorePickUpItems(){
        String actualText="Where are you?\n" + "ZIP Code\n" + "Update";
        String expectedText=driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]")).getText();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    public void verifyPhonesAndDevicesProduct(){
        String actualText="Phones, Cell Phones, & Smartphones from AT&T";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");

    }
    public void checkTableAndPC(){
        clickOnLink("Tablets & PCs");
    }
    public void verifyTabletAndPC(){
        String actualText="Tablets from AT&T";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }
    public void checkAttAndPrepaid(){
        getTextByXpath(attAndPrepaidLocator);
    }

    public void checkAttAndPrepaidProducts(){
        String actualText="Phones, Cell Phones, & Smartphones from AT&T";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    public void checkInternetAndTV(){
        //clickByCss(internetAndTVLocator);
        clickOnLink("Internet & TV");
    }
    public void verifyInternetAndTVproducts(){
        String actualText="AT&T Internet & TV Deals - New & Existing Customer Offers";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }
    public void checkAccessories(){
        clickByXpath1(accessoriesLocator);
    }
    public void verifyAccessories(){
        String actualText="Cases";
        String expectedText=driver.findElement(By.xpath(casesLocator)).getText();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    public void checkBusiness(){
        clickOnLink("Business");
    }

    public void checkBundles(){
        clickOnLink("Bundles");
    }

    public void checkAddressSerachBox(String serviceAddress){
        addressSearchBox.sendKeys(serviceAddress);
        clickByXpath1(addressAutoSuggestLocator);
    }
    public void checkAddressZipcode(String zipcode){
        //typeByXpath(addressZipcodeLocator,zipcode);
        //addressZipcode.sendKeys(zipcode);
    }
    public void checkAvailability(){
        clickByXpath1(checkAvailabilityLocator);
    }

    public void verifyBundle(){
        String actualText="AT&T Small Business - Shop Wireline Internet";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working ");
    }

    public void checkInternet(){
        clickOnLink("Internet");
    }
    public void checkShopNow(){
        clickByXpath($50ShopNowLocator);
    }
    public void verifyInternetDeals(){
        String actualText="AT&T Small Business - Shop Wireline Internet";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working ");
    }
    public void checkVoice(){
        clickOnLink("Voice");
    }
    public void verifyVoiceDeals(){
        String actualText="AT&T Small Business - Shop Wireline Internet";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working ");
    }

    public void checkInternetSpeed(){
        clickByXpath(internet25Locator);
    }

    public void checkHeavyTrafficCheckBox(){
        clickByXpath1(heavyTrafficCheckBox);
    }

    public void checkPhoneforBusinessCheckBox(){
        clickByXpath1(phoneForBusinessCheckBox);
    }

    public void checkInterestedProductCheckBox(){
        clickByXpath1(interestedProductLocator);
    }
    public void checkCustomerFormSubmitButton(){
        clickByXpath1(customerFromSubmitButton);
    }
    public void verifySubmitMessage(){
        String actualText="AT&T Small Business - Shop Wireline Internet";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working ");
    }
    public void checkTVLink(){
        clickOnLink("TV");
    }
    public void checkChannelLineup(){
        clickOnLink("Channel lineup");
    }
    public void channelSearchBox(){
        clickByXpath(channelSearchBoxLocator);

    }

    public void checkPrepaid(){
        clickOnLink("Prepaid");
    }
    public void checkPrepaidPlans(){
        clickOnLink("Prepaid plans");
    }
    public void checkPrepaidShopNow(){
        clickOnLink("Shop now");
    }
    public void verifyPrepaidDeals(){
        String actualText="Prepaid Phone Plans, including Unlimited  I AT&T PREPAID";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working ");
    }

    public void checkBusinessTools(){
        clickOnLink("Business Tools");
    }
    public void verifyBusinessToolsPage(){
        String actualText="Business Solutions & Services at AT&T";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working ");
    }
    public void checkBusinessTV(){
        clickOnLink("Business TV");
    }
    public void checkOfficeLink(){
        clickOnLink("Offices");
    }
    public void verifyGetFreeQuotePage(){
        String actualText="DIRECTV Business | Commercial TV Packages | 888-303-9117";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working ");
    }
    public void checkEnterpriseBusiness(){
        clickOnLink("Enterprise Business");
    }
    public void checkMobility(){
        clickOnLink("Mobility");
    }
    public void verifyUnlimitedYourWay(){
        String actualText="AT&T Mobility Solutions, Mobile Business Services & Support";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working ");
    }
    public void checkInternetAndNetworking(){
        clickOnLink("Internet & Networking");
    }
    public void checkCompleteYourPurchaseLink(){
        clickByXpath(completeYourPurchaseLocator);
    }
    public void verifyBusinessForm(){
        String actualText="Business Internet & Network Solutions at AT&T Business";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working ");
    }
    public void checkVoiceAndCollaboration(){
        clickOnLink("Voice and collaboration");
    }

    public void verifyVoiceAndCollaborationPage(){
        String actualText="VOIP, Voice, Video & Chat Solutions at AT&T Business.";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working ");
    }
    public void checkCyberSecurity(){
        clickOnLink("Cybersecurity");
    }
    public void verifyCyperSecurityPage(){
        String actualText="Cybersecurity - Network Solutions & Services at AT&T Business.";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working ");
    }
    public void checkContentAndEntertainment(){
        clickOnLink("Content and entertainment");
    }
    public void verifyContentAndEtertainmentPage(){
        String actualText="DIRECTV for Business & Custom Content Streaming at AT&T Business";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working ");
    }
    public void checkDigitalCapabilities(){
        clickOnLink("Digital capabilities");
    }
    public void verifyDigitalCapabilitiesPage(){
        String actualText="Billing, Reporting & Management Platform For AT&T Business Services.";
        String expectedText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working ");
    }






}
