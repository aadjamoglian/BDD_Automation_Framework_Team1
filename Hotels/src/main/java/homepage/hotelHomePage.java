package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import  static  homepage.hotelWebElement.*;

public class hotelHomePage extends WebAPI {
 //First Scenario
    @FindBy(how = How.XPATH, using = DealsLocator) public WebElement DealsLocatorclick;
    @FindBy(how = How.XPATH, using = HotelDealFinder) public WebElement HotelDealFinderText;
    @FindBy(how = How.XPATH, using = LasVegaslocatorBox) public WebElement LasVegaslocatorBoxClick;
    @FindBy(how = How.XPATH, using = selectLasVegaslocator) public WebElement selectLasVegaslocatorfromDropDown;
    @FindBy(how = How.XPATH, using = CheckInLocator) public WebElement CheckInLocatorclick;
    @FindBy(how = How.XPATH, using = CheckOutLocator) public WebElement CheckOutLocatorclick;
    @FindBy(how = How.XPATH, using = roomsLocator) public WebElement roomsLocatorclick;
    @FindBy(how = How.XPATH, using = AdultsLocator) public WebElement AdultsLocatorclick;
    @FindBy(how = How.XPATH, using = ChildrenLocator) public WebElement ChildrenLocatorclick;
    @FindBy(how = How.XPATH, using = ShowDealLocator) public WebElement ShowDealLocatorBoxclick;
    @FindBy(how = How.XPATH, using = LasVegasNvUnitedStateOfAmericaLocator) public WebElement LasVegasNvUnitedStateOfAmericaLocatorText;


//Thinks to do
    @FindBy(how = How.XPATH, using = ThinksToDoLocator) public WebElement ThinksToDoLocatorClick;
    @FindBy(how = How.XPATH, using = SearchThinksToDoLocator) public WebElement SearchThinksToDoLocatorText;
    @FindBy(how = How.XPATH, using = DestinationLocator) public WebElement DestinationLocatorkey;
    @FindBy(how = How.XPATH, using = DestinationLocator1) public WebElement DestinationLocatorkey1;
    @FindBy(how = How.CSS, using = FromDateLocator) public WebElement FromDateLocatorCurrentDate;
    @FindBy(how = How.CSS, using = FromDateLocatorSelectDate) public WebElement FromDateLocatorSelectDate2nd;
    @FindBy(how = How.CSS, using = FromToLocator) public WebElement FromToLocatorSelect;
    @FindBy(how = How.CSS, using = SearchButtonLocator) public WebElement SearchButtonLocatorSelect;
    @FindBy(how = How.CSS, using = RecomendationLocator) public WebElement RecomendationLocatorText;




    //First Scenario
 public void DealsLocatorSelection ()  {

  DealsLocatorclick.click();

 }

 public void getHotelDealFinderText (String expectedText) throws InterruptedException {
  Thread.sleep(2000);
  String actualText = HotelDealFinderText.getText();
  System.out.println(actualText);
  Assert.assertEquals("Product does not match", expectedText, actualText);
 }


 public void LasVegaslocatorBoxClickAndSendKey () throws InterruptedException {
  Thread.sleep(2000);
    LasVegaslocatorBoxClick.sendKeys("Las Vegas, Nevada, United States of America");



 }
    public void selectLasVegasfromDropDown () throws InterruptedException {
        Thread.sleep(2000);
        LasVegaslocatorBoxClickAndSendKey();
        Select LasVegas = new Select(selectLasVegaslocatorfromDropDown);
        LasVegas.selectByVisibleText("Las Vegas, Nevada, United States of America");
       // LasVegas .selectByIndex(1);
        selectLasVegaslocatorfromDropDown.click();


    }

//*******************************************************************************************8

    public void ThinksToDoLocatorClickOnHotelPage ()  {

        ThinksToDoLocatorClick.click();
    }

    public void GettingSearchThinksToDoLocatorText (String expectedText) throws InterruptedException {
        Thread.sleep(2000);
       String actualText= SearchThinksToDoLocatorText.getText();
        System.out.println(actualText);
        Assert.assertEquals("Product does not match", expectedText, actualText);
    }

    public void DestinationLocatorkey () throws InterruptedException {
        //Thread.sleep(2000);
        //Actions act = new Actions(driver);
        DestinationLocatorkey.sendKeys("Brooklyn");
        Thread.sleep(3000);
        //try with action class
       // act.sendKeys(Keys.ENTER).perform();
//Try with action Class
//        Actions act = new Actions(driver);
//        act.moveToElement(DestinationLocatorkey1).build().perform();
//        Thread.sleep(1000);
        //try with select class
        Select city = new Select(DestinationLocatorkey1);
        city.selectByVisibleText("Brooklyn New York, United States");
        city.deselectByIndex(0);
        DestinationLocatorkey1.click();
        Thread.sleep(1000);




    }

    public void FromDateLocatorCurrentDateSelect () throws InterruptedException {
        FromDateLocatorCurrentDate.click();
        Thread.sleep(2000);
        FromDateLocatorSelectDate2nd.click();
        Thread.sleep(2000);
    }




}