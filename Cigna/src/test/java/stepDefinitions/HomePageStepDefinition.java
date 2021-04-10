package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.sql.Driver;

public class HomePageStepDefinition  extends WebAPI {
    static HomePage homePage;

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }


    @Given("I am on Cigna homePage")
    public void i_am_on_cigna_home_page() throws IOException {
       openBrowser("https://www.cigna.com/");

    }

    //@Given("I enter Diabetic in searchBox")
    @Given("I enter {string} in searchBox")
    public void i_enter_diabetic_in_search_box(String productName) {
        homePage.enterProductName(productName);

    }
    @When("I click on search button")
    public void i_click_on_search_button() {
        homePage.clickOnSearchButton();
    }
    @Then("I should see Diabetic is properly appearing")
    public void i_should_see_diabetic_is_properly_appearing() {

    }
    @Then("I should not see mobile is appeared")
    public void i_should_not_see_mobile_is_appeared() {

    }
    @Then("I verify Cigna Official Site | Global Health Service Company in page title")
    public void i_verify_cigna_official_site_global_health_service_company_in_page_title(String expectedText) {
        homePage.verifySearchResult(expectedText);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }


    @And("I hover on individuals and families")
    public void iHoverOnIndividualsAndFamilies() throws InterruptedException {
        homePage.individualsFamilies();
    }

    @And("I click on plan and service")
    public void iClickOnPlanAndService() throws InterruptedException {
        homePage.planAndService();
    }

    @And("I click medicare")
    public void iClickMedicare() throws InterruptedException {
        homePage.medicare();
    }

    @And("I verify {string} in page title")
    public void iVerifyInPageTitle(String expectedTitle) {
        homePage.verifyInPageTitle(expectedTitle);
    }

    @And("I click on understanding insurance")
    public void iClickOnUnderstandingInsurance() throws InterruptedException {
        homePage.understandingInsurance();
    }

    @When("I click Full Coverage Dental Insurance")
    public void iClickFullCoverageDentalInsurance() throws InterruptedException {
        homePage.fullCoverage();
    }

    @And("I click on Member Resources")
    public void iClickOnMemberResources() throws InterruptedException {
        homePage.memberResources();
    }

    @When("I click Home Delivery Pharmacy")
    public void iClickHomeDeliveryPharmacy() throws InterruptedException {
        homePage.homeDelivery();
    }

    @And("I click on Health and Wellness")
    public void iClickOnHealthAndWellness() throws InterruptedException {
        homePage.healthWellness();
    }

    @When("I click Dental Health")
    public void iClickDentalHealth() throws InterruptedException {
        homePage.dentalHealth();
    }

    @And("I hover on Medicare")
    public void iHoverOnMedicare() throws InterruptedException {
        homePage.medicareLevel();
    }

    @And("I click on Medicare Coverage Options")
    public void iClickOnMedicareCoverageOptions() throws InterruptedException {
        homePage.medicareCoverage();
    }

    @When("I click Shop Medicare Advantage Plans")
    public void iClickShopMedicareAdvantagePlans() throws InterruptedException {
        homePage.shopMedicareAdvantagePlans();
    }

    @And("I click on Enrollment and Eligibility")
    public void iClickOnEnrollmentAndEligibility() throws InterruptedException {
        homePage.enrollmentAndEligibilityPlans();
    }

    @When("I click Medicare Advantage Enrollment and Eligibility")
    public void iClickMedicareAdvantageEnrollmentAndEligibility() throws InterruptedException {
        homePage.medicareAdvantage();
    }

    @And("I click on Understanding Medicare")
    public void iClickOnUnderstandingMedicare() throws InterruptedException {
        homePage.understandingMedicare();
    }

    @When("I click Choosing a Medicare Plan")
    public void iClickChoosingAMedicarePlan() throws InterruptedException {
        homePage.choosingMedicarePlan();
        
    }

    @And("I click on Member Resources and Services")
    public void iClickOnMemberResourcesAndServices() throws InterruptedException {
        homePage.memberResourcesAndServices();
    }

    @When("I click Customer Forms")
    public void iClickCustomerForms() throws InterruptedException {
        homePage.customerForms();
        
    }

    @And("I click on Healthy Aging")
    public void iClickOnHealthyAging() throws InterruptedException {
        homePage.healthyAging();
    }

    @When("I click Arthritis Symptoms and Treatment")
    public void iClickArthritisSymptomsAndTreatment() throws InterruptedException {
        homePage.arthritisSymptomsTreatment();
    }

    @And("I hover on Employers and Brokers")
    public void iHoverOnEmployersAndBrokers() throws InterruptedException {
        homePage.employersBrokers();
    }

    @And("I click on Plans and Services")
    public void iClickOnPlansAndServices() throws InterruptedException {
        homePage.plansAndServices();
    }

    @When("I click Medical")
    public void iClickMedical() throws InterruptedException {
        homePage.medicalPlans();
    }

    @And("I click on Who We Serve")
    public void iClickOnWhoWeServe() throws InterruptedException {
        homePage.whoWeServe();
    }

    @When("I click Small Employers \\({int}{int})")
    public void iClickSmallEmployers(int arg0, int arg1) throws InterruptedException {
        homePage.smallEmployers();
    }

    @And("I click on Why Signa")
    public void iClickOnWhySigna() throws InterruptedException {
        homePage.whyCigna();
    }

    @When("I click Why Cigna Overview")
    public void iClickWhyCignaOverview() throws InterruptedException {
        homePage.whyCignaOverview();
    }

    @And("I click on Industry Insights")
    public void iClickOnIndustryInsights() throws InterruptedException {
        homePage.industryInsights();
    }

    @When("I click Workplace Wellness")
    public void iClickWorkplaceWellness() throws InterruptedException {
        homePage.workplaceWellness();
    }

    @And("I click on Become a Broker")
    public void iClickOnBecomeABroker() throws InterruptedException {
        homePage.becomeBrokers();
    }

    @When("I click Become a Broker Overview")
    public void iClickBecomeABrokerOverview() throws InterruptedException {
        homePage.becomeBrokersOverview();
    }

    @And("I hover on Health Care Providers")
    public void iHoverOnHealthCareProviders() throws InterruptedException {
        homePage.healthCareProviders();
    }

    @And("I click on Credentialing")
    public void iClickOnCredentialing() throws InterruptedException {
        homePage.credentialing();
    }

    @When("I click Medical Credentialing")
    public void iClickMedicalCredentialing() throws InterruptedException {
        homePage.medicalCredentialing();
    }

    @And("I click on Coverage and Claims")
    public void iClickOnCoverageAndClaims() throws InterruptedException {
        homePage.coverageAndClaims();
    }

    @When("I click Claims")
    public void iClickClaims() throws InterruptedException {
        homePage.claims();
    }

    @And("I click on Pharmacy check")
    public void iClickOnPharmacyCheck() throws InterruptedException {
        homePage.pharmacy();
    }

    @When("I click Formulary Drug Lists")
    public void iClickFormularyDrugLists() throws InterruptedException {
        homePage.formularyDrugLists();
    }

    @And("I click on Provider Resources")
    public void iClickOnProviderResources() throws InterruptedException {
        homePage.providerResources();
    }

    @When("I click The Body and Mind Connection")
    public void iClickTheBodyAndMindConnection() throws InterruptedException {
        homePage.theBodyAndMindConnection();
    }

    @And("I hover on About Us")
    public void iHoverOnAboutUs() throws InterruptedException {
        homePage.aboutUs();
    }

    @And("I click on Company Profile")
    public void iClickOnCompanyProfile() throws InterruptedException {
        homePage.companyProfile();
    }

    @When("I click Leadership Team")
    public void iClickLeadershipTeam() throws InterruptedException {
        homePage.leadershipTeam();
    }

    @And("I click on Newsroom")
    public void iClickOnNewsroom() throws InterruptedException {
        homePage.newsroom();
    }

    @When("I click Studies and Reports")
    public void iClickStudiesAndReports() throws InterruptedException {
        homePage.studiesAndReports();
    }

    @And("I click on Corporate Responsibility")
    public void iClickOnCorporateResponsibility() throws InterruptedException {
        homePage.corporateResponsibility();
    }

    @When("I click Cigna in the Community")
    public void iClickCignaInTheCommunity() throws InterruptedException {
        homePage.cignaInTheCommunity();
    }

    @And("I click on Supplier Community")
    public void iClickOnSupplierCommunity() throws InterruptedException {
        homePage.supplierCommunity();
    }

    @When("I click Ariba")
    public void iClickAriba() throws InterruptedException {
        homePage.ariba();
    }

//    @And("I hover on About Us")
//    public void iHoverOnAboutUs() throws InterruptedException {
//        homePage.aboutUs();
//
//    }
//
//    @And("I click on Company Profile")
//    public void iClickOnCompanyProfile() throws InterruptedException {
//        homePage.companyProfile();
//    }
//
//    @When("I click Leadership Team")
//    public void iClickLeadershipTeam() throws InterruptedException {
//        homePage.leadershipTeam();
//    }
}
