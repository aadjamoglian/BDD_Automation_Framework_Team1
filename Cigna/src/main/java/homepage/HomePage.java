package homepage;

import common.WebAPI;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

// Action Method class

    // Find By Annotation: First Approach
    @FindBy(how = How.CSS, using =searchBoxLocator) public WebElement searchBox;
    @FindBy (how = How.XPATH, using =searchButtonLocator) public WebElement searchButton;
    @FindBy (how = How.XPATH, using =searchTextLocator) public WebElement searchText;

    public void verifyInPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        org.testng.Assert.assertEquals(actualTitle, expectedTitle,"Title not matched");
    }
    public void enterProductName( String productName){
        searchBox.sendKeys(productName);
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }

    public void verifySearchResult(String expectedText){
        String actualText=searchText.getText();
        Assert.assertEquals("Product does not match",expectedText,actualText);
    }


    public void individualsFamilies() throws InterruptedException {
        mouseHoverByXpath(individualsFamiliesLocator);
        sleepFor(3);
    }
    public void planAndService() throws InterruptedException {
       clickByXpath(planAndServiceLocator);
       sleepFor(3);
    }
    public void medicare() throws InterruptedException {
       clickByXpath(medicareLocator);
        sleepFor(3);
    }
    public void understandingInsurance() throws InterruptedException {
        clickByXpath(understandingInsuranceLocator);
        sleepFor(3);
    }
    public void fullCoverage() throws InterruptedException {
        clickByXpath(fullCoverageLocator);
        sleepFor(3);
    }
    public void memberResources() throws InterruptedException {
        clickByCss(memberResourcesLocator);
        sleepFor(3);
    }
    public void homeDelivery() throws InterruptedException {
        clickByXpath(homeDeliveryLocator);
        sleepFor(3);
    }
    public void healthWellness() throws InterruptedException {
        clickByCss(healthWellnessLocator);
        sleepFor(3);
    }
    public void dentalHealth() throws InterruptedException {
        clickByXpath(dentalHealthLocator);
        sleepFor(3);
    }
    public void medicareLevel() throws InterruptedException {
        mouseHoverByXpath(medicareLevelLocator);
        sleepFor(3);
    }
    public void medicareCoverage() throws InterruptedException {
        clickById(medicareCoverageTabLocator);
        sleepFor(3);
    }
    public void shopMedicareAdvantagePlans() throws InterruptedException {
        clickByXpath(shopMedicareAdvantagePlansLocator);
        sleepFor(3);
    }
    public void enrollmentAndEligibilityPlans() throws InterruptedException {
        clickByCss(enrollmentAndEligibilityPlansLocator);
        sleepFor(3);
    }
    public void medicareAdvantage() throws InterruptedException {
        clickByXpath(medicareAdvantageLocator);
        sleepFor(3);
    }
    public void understandingMedicare() throws InterruptedException {
        clickByXpath(understandingMedicareLocator);
        sleepFor(3);
    }
    public void choosingMedicarePlan() throws InterruptedException {
        clickByXpath(choosingMedicarePlanLocator);
        sleepFor(3);
    }
    public void memberResourcesAndServices() throws InterruptedException {
        clickByXpath(memberResourcesAndServicesLocator);
        sleepFor(3);
    }
    public void customerForms() throws InterruptedException {
        clickByCss(customerFormsLocator);
        sleepFor(3);
    }
    public void healthyAging() throws InterruptedException {
        clickByCss(healthyAgingLocator);
        sleepFor(3);
    }
    public void arthritisSymptomsTreatment() throws InterruptedException {
        clickByXpath(arthritisSymptomsTreatmentLocator);
        sleepFor(3);
    }
    public void employersBrokers() throws InterruptedException {
        mouseHoverByXpath(employersBrokersLocator);
        sleepFor(3);
    }
    public void plansAndServices() throws InterruptedException {
        clickByXpath(plansAndServicesLocator);
        sleepFor(3);
    }
    public void medicalPlans() throws InterruptedException {
        clickByCss(medicalPlansLocator);
        sleepFor(3);
    }
    public void whoWeServe() throws InterruptedException {
        clickByXpath(whoWeServeLocator);
        sleepFor(3);
    }
    public void smallEmployers() throws InterruptedException {
        clickByXpath(smallEmployersLocator);
        sleepFor(3);
    }
    public void whyCigna() throws InterruptedException {
        clickByXpath(whyCignaLocator);
        sleepFor(3);
    }
    public void whyCignaOverview() throws InterruptedException {
        clickByXpath(whyCignaOverviewLocator);
        sleepFor(3);
    }
    public void industryInsights() throws InterruptedException {
        clickByXpath(industryInsightsLocator);
        sleepFor(3);
    }
    public void workplaceWellness() throws InterruptedException {
        clickByXpath(workplaceWellnessLocator);
        sleepFor(3);
    }
    public void becomeBrokers() throws InterruptedException {
        clickByXpath(becomeBrokersLocator);
        sleepFor(3);
    }
    public void becomeBrokersOverview() throws InterruptedException {
        clickByXpath(becomeBrokersOverviewLocator);
        sleepFor(3);
    }
    public void healthCareProviders() throws InterruptedException {
        mouseHoverByXpath(healthCareProvidersLocator);
        sleepFor(3);
    }
    public void credentialing() throws InterruptedException {
        clickByCss(credentialingLocator);
        sleepFor(3);
    }
    public void medicalCredentialing() throws InterruptedException {
        clickByLinkText(medicalCredentialingLocator);
        sleepFor(3);
    }
    public void coverageAndClaims() throws InterruptedException {
        clickByXpath(coverageAndClaimsLocator);
        sleepFor(3);
    }
    public void claims() throws InterruptedException {
        clickByLinkText(claimsLocator);
        sleepFor(3);
    }
    public void pharmacy() throws InterruptedException {
        clickByXpath(pharmacyLocator);
        sleepFor(3);
    }
    public void formularyDrugLists() throws InterruptedException {
        clickByXpath(formularyDrugListsLocator);
        sleepFor(3);
    }
    public void providerResources() throws InterruptedException {
        clickByXpath(providerResourcesLocator);
        sleepFor(3);
    }
    public void theBodyAndMindConnection() throws InterruptedException {
        clickByXpath(theBodyAndMindConnectionLocator);
        sleepFor(3);
    }
    public void aboutUs() throws InterruptedException {
        mouseHoverByXpath(aboutUsLocator);
        sleepFor(3);
    }
    public void companyProfile() throws InterruptedException {
        clickByXpath(companyProfileLocator);
        sleepFor(3);
    }
    public void leadershipTeam() throws InterruptedException {
        clickByXpath(leadershipTeamLocator);
        sleepFor(3);
    }
//public void aboutUs() throws InterruptedException {
//        clickByXpath(aboutUsLocator);
//        sleepFor(3);
//}
//    public void companyProfile() throws InterruptedException {
//        clickByXpath(companyProfileLocator);
//        sleepFor(3);
//    }
//    public void leadershipTeam() throws InterruptedException {
//        clickByXpath(leadershipTeamLocator);
//        sleepFor(3);
//    }




    public void newsroom() throws InterruptedException {
        clickByXpath(newsroomLocator);
        sleepFor(3);
    }
    public void studiesAndReports() throws InterruptedException {
        clickByXpath(studiesAndReportsLocator);
        sleepFor(3);
    }
    public void corporateResponsibility() throws InterruptedException {
        clickByXpath(corporateResponsibilityLocator);
        sleepFor(3);
    }
    public void cignaInTheCommunity() throws InterruptedException {
        clickByXpath(cignaInTheCommunityLocator);
        sleepFor(3);
    }
    public void supplierCommunity() throws InterruptedException {
        clickByXpath(supplierCommunityLocator);
        sleepFor(3);
    }
    public void ariba() throws InterruptedException {
        clickByXpath(aribaLocator);
        sleepFor(3);
    }





}
