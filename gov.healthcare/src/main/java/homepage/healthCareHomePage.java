package homepage;
import common.WebAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static homepage.HealthCareWebElement.*;


public class healthCareHomePage extends WebAPI{
    // referane for data source class
    DataSource dataSource;

    @FindBy(how = How.XPATH, using = HealthInsuranceLocator) public WebElement HealthInsurancePerform;
    @FindBy(how = How.XPATH, using = GetShortInsuranceLocator) public WebElement GetShortInsurancePerform;
   // @FindBy(how = How.XPATH, using = HowLongDoYourCoverageLocator) public WebElement HowLongDoYourCoverageLocatorText;
    @FindBy(how = How.XPATH, using = LessThanAYearLocator) public WebElement LessThanAYearLocatorButton;
    @FindBy(how = How.XPATH, using = NextLocator) public WebElement NextLocatorClick;
    @FindBy(how = How.ID, using = FemaleLocator) public WebElement FemaleLocatorCheck;
    @FindBy(how = How.XPATH, using = NextLocator1) public WebElement NextLocator1Perform;
    @FindBy(how = How.XPATH, using = TabaccoLacator) public WebElement TabaccoLacatorButton;
    @FindBy(how = How.ID, using = NextLocator2) public WebElement NextLocator2Perform;
    @FindBy(how = How.XPATH, using = SelectDateOfBirth) public WebElement SelectDateOfBirthSendKey;
    @FindBy(how = How.ID, using = NextLocator3) public WebElement NextLocator3Perform;
    @FindBy(how = How.XPATH, using = EnterIncomeLocator) public WebElement EnterIncomeLocatorKey;
    @FindBy(how = How.ID, using = NextLocator4) public WebElement NextLocator4Perform;
    @FindBy(how = How.XPATH, using = AdditionFamilyMemberLocator) public WebElement AdditionFamilyMemberLocatorOn;
    @FindBy(how = How.ID, using = NextLocator5) public WebElement NextLocator5Perform;
    @FindBy(how = How.XPATH, using = SendEmailLocator) public WebElement SendEmail;
    @FindBy(how = How.XPATH, using = NextLocator6) public WebElement NextLocator6Perform;
    @FindBy(how = How.XPATH, using = GetTextYourProgressLocator) public WebElement GetTextYourProgress;
    //get data from xlsx
    @FindBy(how = How.XPATH, using = FirstNameLocator) public WebElement FirstNameLocatorRead;
    @FindBy(how = How.XPATH, using = LastNameLocator) public WebElement LastNameLocatorRead;
    @FindBy(how = How.XPATH, using = EmailLocator) public WebElement EmailLocatorRead;
    @FindBy(how = How.XPATH, using = addressLocator) public WebElement addressLocatorRead;
    @FindBy(how = How.XPATH, using = PhoneNumberLocator) public WebElement PhoneNumberLocatorRead;

//Mouse Hover
    public void HealthInsurancePerform(){
       Actions actions = new Actions(driver);
       actions.moveToElement(HealthInsurancePerform).build().perform();
    }
     public void HealthInsurance(){
         WebDriverWait wait = new WebDriverWait(driver, 5);
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(GetShortInsuranceLocator)));
         GetShortInsurancePerform.click();
    }
//    public void GettingHowLongDoYourCoverageLocatorText(String expectedText) throws InterruptedException {
//        Thread.sleep(2000);
//        String actualText = HowLongDoYourCoverageLocatorText.getText();
//        Assert.assertEquals("Product does not match", expectedText, actualText);
//    }
    public void LessThanAYearLocatorButtonPerform() throws InterruptedException {
        Thread.sleep(1000);
        LessThanAYearLocatorButton.click();
    }
    public void NextLocatorClick() throws InterruptedException {
        Thread.sleep(1000);
        NextLocatorClick.click();
    }
    public void FemaleLocatorCheck() throws InterruptedException {
        Thread.sleep(1000);
        FemaleLocatorCheck.click();
    }
    public void NextLocator1Perform() throws InterruptedException {
        Thread.sleep(1000);
        NextLocator1Perform.click();
    }
    public void TabaccoLacatorButton() throws InterruptedException {
        Thread.sleep(1000);
        TabaccoLacatorButton.click();
    }
    public void NextLocator2Perform() throws InterruptedException {
        Thread.sleep(1000);
        NextLocator2Perform.click();
    }
    public void SelectDateOfBirthSendKey() throws InterruptedException {
        Thread.sleep(2000);
        SelectDateOfBirthSendKey.sendKeys("02/12/1990");
    }
    public void NextLocator3Perform() throws InterruptedException {
        Thread.sleep(1000);
        NextLocator3Perform.click();
    }
    public void EnterIncomeLocatorKeySend() throws InterruptedException {
        Thread.sleep(1000);
        EnterIncomeLocatorKey.sendKeys("45000");
    }
    public void NextLocator4Perform() throws InterruptedException {
        Thread.sleep(1000);
        NextLocator4Perform.click();
    }
    public void AdditionFamilyMemberLocatorOn() throws InterruptedException {
        Thread.sleep(1000);
        AdditionFamilyMemberLocatorOn.click();
    }
    public void NextLocator5Perform() throws InterruptedException {
        Thread.sleep(1000);
        NextLocator5Perform.click();
    }
    public void SendEmailKey() throws InterruptedException {
        Thread.sleep(1000);
        SendEmail.sendKeys("happy@yahoo.com");
    }
    public void NextLocator6Perform() throws InterruptedException {
        Thread.sleep(2000);
        NextLocator6Perform.click();
    }
    public void GettingTextYourProgress(String expectedText) throws InterruptedException {
        Thread.sleep(2000);
        String actualText = GetTextYourProgress.getText();
        System.out.println(actualText);
        Assert.assertEquals("Product does not match", expectedText, actualText);
    }
    // get data read from xlsx
    public void provideHealthCareFirstName() throws Exception {
        ArrayList<String> aList= dataSource.getDataFromexcel("healthcareInformation");
        System.out.println(aList.get(1));
        FirstNameLocatorRead.sendKeys(aList.get(1));
    }
    public void provideHealthCareLastName() throws Exception {
        ;
        ArrayList<String> aList = dataSource.getDataFromexcel("healthcareInformation");
        Thread.sleep(1000);
        System.out.println(aList.get(2));
        LastNameLocatorRead.sendKeys(aList.get(2));
    }
    public void provideHealthCareEmailName() throws Exception {
        ArrayList<String> aList = dataSource.getDataFromexcel("healthcareInformation");
        Thread.sleep(1000);
        System.out.println(aList.get(3));
        EmailLocatorRead.sendKeys(aList.get(3));
    }
    public void provideHealthCareAddress() throws Exception {
        ArrayList<String> aList = dataSource.getDataFromexcel("healthcareInformation");
        Thread.sleep(1000);
        System.out.println(aList.get(4));
        addressLocatorRead.sendKeys(aList.get(4));
    }
    public void provideHealthCarePhoneNumber() throws Exception {
        ArrayList<String> aList = dataSource.getDataFromexcel("healthcareInformation");
        Thread.sleep(1000);
        System.out.println(aList.get(5));
        PhoneNumberLocatorRead.sendKeys(aList.get(5));
    }


    }


