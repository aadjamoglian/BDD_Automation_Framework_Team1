package stepDefinitions;

//import com.aventstack.extentreports.gherkin.model.Scenario;
import common.WebAPI;
import homepage.ATTHomepage;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.Scenario;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ATTHomepageStepDefinitions extends WebAPI {
    static ATTHomepage homePage;

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            //take scrrenshot
            final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Demo1");
        }
    }

    @BeforeStep
    public static void getInit(){
        homePage= PageFactory.initElements(driver,ATTHomepage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }


    @Given("I am on AT&T homepage")
    public void i_am_on_at_t_homepage() throws IOException {
        openBrowser("https://www.att.com/");
    }

    @Given("I enter {string} in search box.")
    public void i_enter_in_search_box(String productName) {
        homePage.searchBox(productName);
    }
    @When("I click on search button")
    public void i_click_on_search_button() {
        homePage.searchButton();
    }
    @Then("I should see {string}\" is appearing")
    public void i_should_see_is_appearing(String expectedText) {
        homePage.verifySearchResult(expectedText);
    }
    @Then("I verify {string} in product title.")
    public void i_verify_in_product_title(String expectedText) {
        homePage.verifyPageTitle(expectedText);
    }

    @Given("I click on deals")
    public void i_click_on_deals() {
        homePage.checkDeals();
    }
    @When("I click on wireless")
    public void i_click_on_wireless() {
        homePage.checkWireless();
    }
    @When("I click on explore wireless")
    public void i_click_on_explore_wireless() {
        homePage.checkExploreWireless();
    }
    @Then("I should be able to see all the wireless items")
    public void i_should_be_able_to_see_all_the_wireless_items() {
        homePage.checkWirelessRelatedItems();
    }

    @Then("I should be able to see all the Explore wireless items")
    public void i_should_be_able_to_see_all_the_explore_wireless_items() {
        homePage.checkExploreWirelessRelatedItems();
    }

    @When("I click on phones & devices")
    public void i_click_on_phones_devices() {
        homePage.checkPhonesAndDevices();
    }
    @When("I click on Low cost phone")
    public void i_click_on_low_cost_phone() {

    }
    @Then("I should be able to see all the low cost phones")
    public void i_should_be_able_to_see_all_the_low_cost_phones() {

    }

    @When("I click on compare device")
    public void i_click_on_compare_device() {
        homePage.checkCompareDevices();
    }
    @Then("I should be able to compare devices")
    public void i_should_be_able_to_compare_devices() {
        homePage.verifyCompareDevices();
    }

    @Then("I should see {string} is appearing")
    public void i_should_see_is_appearing1(String verifyTitle) {
        homePage.verifyPageTitle(verifyTitle);
    }


    @When("I click on Apple")
    public void i_click_on_apple() {
        homePage.checkApple();
    }
    @Then("I should be able to see all the Apple phones")
    public void i_should_be_able_to_see_all_the_apple_phones() {
        homePage.verifyApplePhones();
    }

    @When("I click on Samsung")
    public void i_click_on_samsung() {
        homePage.checkSamsung();
    }

    @Then("I should be able to see all the Samsung phones")
    public void i_should_be_able_to_see_all_the_samsung_phones() {
        homePage.verifySamsungPhones();
    }

    @When("I  click on store pick-up")
    public void i_click_on_store_pick_up() {
        homePage.checkStorePickup();
    }

    @When("I enter the {string} on the zipcode field")
    public void i_enter_the_on_the_zipcode_field(String string) {

    }
    @When("I click on update button")
    public void i_click_on_update_button() {

    }

    @When("I should be able to see all the available store pick=up items.")
    public void i_should_be_able_to_see_all_the_available_store_pick_up_items() {
        homePage.verifyStorePickUpItems();
    }
    @When("I click on Tablet and PC")
    public void i_click_on_tablet_and_pc() {
        homePage.checkTableAndPC();
    }
    @Then("I should be able to see all the Tablets and pcs")
    public void i_should_be_able_to_see_all_the_tablets_and_pcs() {
        homePage.verifyTabletAndPC();
    }

    @Then("I should see all the phones and device deals")
    public void i_should_see_all_the_phones_and_device_deals() {
        homePage.verifyPhonesAndDevicesProduct();
    }

    @When("I click on AT&T & prepaid")
    public void i_click_on_at_t_prepaid() {
        homePage.checkAttAndPrepaid();

    }
    @Then("I should see all the AT&T & prepaid deals")
    public void i_should_see_all_the_at_t_prepaid_deals() {
        homePage.checkAttAndPrepaidProducts();

    }
    @When("I click on Internet & TV")
    public void i_click_on_internet_tv() {
        homePage.checkInternetAndTV();
    }
    @Then("I should see all theInternet & TV deals")
    public void i_should_see_all_the_internet_tv_deals() {
        homePage.verifyInternetAndTVproducts();
    }

    @When("I click on Accessories")
    public void i_click_on_accessories() {
        homePage.checkAccessories();
    }
    @Then("I should see all the accessories deals")
    public void i_should_see_all_the_accessories_deals() {
        homePage.verifyAccessories();
    }



    @Given("I click on Business")
    public void i_click_on_business() {
        homePage.checkBusiness();
    }
    @Given("I click on bundles")
    public void i_click_on_bundles() {
        homePage.checkBundles();
    }
    @Given("I enter {string} on the service address search box")
    public void i_enter_on_the_service_address_search_box(String serviceAddress) {
        homePage.checkAddressSerachBox(serviceAddress);
    }
    @Given("I enter {string} on the zip code field")
    public void i_enter_on_the_zip_code_field(String zipcode) {
        homePage.checkAddressZipcode(zipcode);
    }
    @When("I click on check availability")
    public void i_click_on_check_availability() {
        homePage.checkAvailability();
    }
    @Then("I should be able to see all the bundles")
    public void i_should_be_able_to_see_all_the_bundles() {
        homePage.verifyBundle();
    }

    @Then("I should be able to see all the Internet Deals")
    public void i_should_be_able_to_see_all_the_internet_deals() {

    }


    @Given("I click on Internet")
    public void i_click_on_internet() {
        homePage.checkInternet();
    }

    @When("I click on  shop now")
    public void i_click_on_$_shop_now() {
        homePage.checkShopNow();
    }

    @Given("I click on voice")
    public void i_click_on_voice() {
        homePage.checkVoice();
    }
    @Then("I should be able to see all voice deals")
    public void i_should_be_able_to_see_all_voice_deals() {
        homePage.verifyVoiceDeals();
    }


    @When("I select internet speed 25")
    public void i_select_internet_speed25() throws InterruptedException {
        sleepFor(2);
        homePage.checkInternetSpeed();
    }
    @When("I select checkbox for heavy traffic on optional internet ehancement section")
    public void i_select_checkbox_for_heavy_traffic_on_optional_internet_ehancement_section() throws InterruptedException {
        sleepFor(2);
        homePage.checkHeavyTrafficCheckBox();
    }
    @When("I select AT&T phone for business under bundle options")
    public void i_select_at_t_phone_for_business_under_bundle_options() {
        homePage.checkPhoneforBusinessCheckBox();
    }

    @When("I enter service user information")
    public void i_enter_service_user_information(List<List<String>> dataTable) throws InterruptedException {
        sleepFor(5);
        Map<String, String> mapTable=tableDictionaryConverter(dataTable);
        System.out.println(mapTable.get("Service address"));
        System.out.println(mapTable.get("Business name"));
        System.out.println(mapTable.get("First name"));
        System.out.println(mapTable.get("Last name"));
        System.out.println(mapTable.get("email"));
        System.out.println(mapTable.get("phone number"));

    }

    public static synchronized Map<String, String> tableDictionaryConverter(List<List<String>> data){
        Map<String, String> mapTable= new HashMap<>();

        for (List<String> rows: data){
            mapTable.put(rows.get(0), rows.get(1));
        }
        return mapTable;
    }

    @When("I click on internet check box")
    public void i_click_on_internet_check_box() {
        homePage.checkInterestedProductCheckBox();
    }
    @When("I click on submit button")
    public void i_click_on_submit_button() {
        homePage.checkCustomerFormSubmitButton();
    }
    @Then("I should see your request has been submitted message")
    public void i_should_see_your_request_has_been_submitted_message() {
        homePage.verifySubmitMessage();
    }

    @Given("I click on  TV")
    public void i_click_on_tv() {
        homePage.checkTVLink();
    }
    @Given("I click on Channel Lineup")
    public void i_click_on_channel_lineup() {
        homePage.checkChannelLineup();
    }
    @When("I enter the channel names on the channel search bar")
    public void i_enter_the_channel_names_on_the_channel_search_bar() throws SQLException, IOException, ClassNotFoundException, InterruptedException {
        homePage.channelSearchBox();
        sleepFor(3);
        //readUserProfileFromSqlTable();
    }
    @Then("I should be able to see all the channel deals and shop now option")
    public void i_should_be_able_to_see_all_the_channel_deals_and_shop_now_option() {

    }







    @Given("I click on menu Bar")
    public void i_click_on_menu_bar() {
        homePage.checkMenuBarLink();
    }
    //    @When("I click on Internet")
//    public void i_click_on_internet1() {
//        homePage.checkInternetLink();
//    }
    @When("I mouse hover on Internet Accessories")
    public void i_mouse_hover_on_internet_accessories() {
        homePage.checkInternetAccessories();
    }
    @Then("I should see all the internet Accessories product appear")
    public void i_should_see_all_the_internet_accessories_product_appear(String expectedText) {
        homePage.verifyRelatedProducts(expectedText);
    }

    @Given("I click on  prepaid")
    public void i_click_on_prepaid() {
        homePage.checkPrepaid();
    }
    @Given("I click on prepaid plans")
    public void i_click_on_prepaid_plans() {
        homePage.checkPrepaidPlans();
    }
    @When("I click on  shop now arrow")
    public void i_click_on_shop_now_arrow() {
        homePage.checkPrepaidPlans();
    }
    @Then("I should see all the prepaid deals")
    public void i_should_see_all_the_prepaid_deals() {
        homePage.verifyPrepaidDeals();

    }


    @When("I click on business tools")
    public void i_click_on_business_tools() {
        homePage.checkBusinessTools();
    }
    @Then("I should be able to see the business tools page")
    public void i_should_be_able_to_see_the_business_tools_page() {
        homePage.verifyBusinessToolsPage();
    }

    @When("I click on business TV")
    public void i_click_on_business_tv() {
        homePage.checkBusinessTV();
    }
    @When("I click on Offices")
    public void i_click_on_offices() {
        homePage.checkOfficeLink();
    }
    @Then("I should be able to see get free quote page")
    public void i_should_be_able_to_see_get_free_quote_page() {
        homePage.verifyGetFreeQuotePage();
    }


    @When("I click on enterprise business")
    public void i_click_on_enterprise_business() {
        homePage.checkEnterpriseBusiness();
    }
    @When("I click on Mobility")
    public void i_click_on_mobility() {
        homePage.checkMobility();
    }
    @Then("I should see unlimited your way page")
    public void i_should_see_unlimited_your_way_page() {
        homePage.verifyUnlimitedYourWay();
    }

    @When("I click on internet & networking")
    public void i_click_on_internet_networking() {
        homePage.checkInternetAndNetworking();
    }
    @When("I click on complete your purchase")
    public void i_click_on_complete_your_purchase() {
        homePage.checkCompleteYourPurchaseLink();
    }
    @Then("I should see the business address form")
    public void i_should_see_the_business_address_form() {
        homePage.verifyBusinessForm();
    }

    @When("I click on voice and collaboration")
    public void i_click_on_voice_and_collaboration() {
        homePage.checkVoiceAndCollaboration();
    }
    @Then("I should see voice and collaboration page")
    public void i_should_see_voice_and_collaboration_page() {
        homePage.verifyVoiceAndCollaborationPage();
    }
    @When("I click on cyber security")
    public void i_click_on_cyber_security() {
        homePage.checkCyberSecurity();
    }
    @Then("I should see cyber security page")
    public void i_should_see_cyber_security_page() {
        homePage.verifyCyperSecurityPage();
    }


    @When("I click on Content and Entertainment")
    public void i_click_on_content_and_entertainment() {
        homePage.checkContentAndEntertainment();
    }
    @Then("I should see Content and Entertainment  page")
    public void i_should_see_content_and_entertainment_page() {
        homePage.verifyContentAndEtertainmentPage();
    }

    @When("I click on Digital capabilities")
    public void i_click_on_digital_capabilities() {
        homePage.checkDigitalCapabilities();
    }
    @Then("I should see Digital capabilities page")
    public void i_should_see_digital_capabilities_page() {
        homePage.verifyDigitalCapabilitiesPage();
    }



//
//
//    @Given("I am at At&T homepage")
//    public void i_am_at_at_t_homepage() throws IOException {
//        openBrowser("https://www.att.com/");
//
//    }
//    @Given("I click on menu Bar")
//    public void i_click_on_menu_bar() {
//        homePage.checkMenuBarLink();
//
//    }
//    @When("I click on Internet")
//    public void i_click_on_internet() {
//        homePage.checkInternetLink();
//    }
////    @When("I mouse hover on Internet Accessories")
////    public void i_mouse_hover_on_internet_accessories() {
////        homePage.checkInternetAccessories();
////    }
//    @Then("I should see all the internet Accessories product appear")
//    public void i_should_see_all_the_internet_accessories_product_appear() {
//        homePage.verifyRelatedProducts("expectedText");
//
//    }

//    @Given("I am at At&T homepage")
//    public void i_am_at_at_t_homepage() throws IOException {
//        openBrowser("https://www.att.com/");
//    }
//
//    @Given("I click on menu Bar")
//    public void i_click_on_menu_bar() {
//        homePage.checkMenuBarLink();
//
//    }
//    @When("I click on Internet")
//    public void i_click_on_internet() {
//        homePage.checkInternetLink();
//    }
//    @Then("I should see the following links: plans & prices, Equipment, Internet Bundles.")
//    public void i_should_see_the_following_links_plans_prices_equipment_internet_bundles() {
//        homePage.verifyRelatedProducts("expectedText");
//    }
//    @Then("I verify {string} in product title")
//    public void i_verify_in_product_title1(String string) {
//        homePage.
//
//    }

}
