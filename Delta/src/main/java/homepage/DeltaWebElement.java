package homepage;

public class DeltaWebElement {

    public static final String LoginLocator = ".login-btn.btn.btn-danger";
    public static final String LogInToDelata = ".px-5.d-flex.align-items-end.loginHeaderText";
    public static final String UserName = "//*[@id=\"userId\"]";
    public static final String Password = "//*[@id=\"password\"]";
    public static final String AllFieldAreRequire = ".px-5.allFieldsRequiredText.ng-star-inserted";
    //Travel info********
    //mouseHover Over
    public static final String TravelInfoLocator = "//*[@id=\"headSectab1\"]";
    public static final String BaggageLocator = "//*[@id=\"secondary-static-link-3\"]";
    public static final String BaggageTravelFeesLocator = "//*[@id=\"maincontent\"]/div[1]/div/div/div/div/div[1]/span";
    public static final String TrackCheckedBaggageLocator = "//*[@id=\"maincontent\"]/div[2]/div/div/ul/li[3]/a";
    public static final String CheckBagStatusLocator = "//*[@id=\"checkbagStatusID\"]/h2";
    //select Class
    public static final String DropDownConfirmation = "//span[@class='select-ui-icon']";
    public static final String SearchByLocatorConfirmation = "//*[@id=\"ui-list-searchByBagDropdown1\"]";
    public static final String confarmationLocator = "//*[@id=\"inputBagTagNumber\"]";
    public static final String LastNameLocator = "//*[@id=\"inputBagLastName\"]";

    //Flight Status

    public static final String FromLocator = "//span[normalize-space()='From']";
    public static final String FromBoxLocator = "//input[@id='search_input']";
    public static final String KennedyJFKLocator = "//*[@id=\"airport-serach-panel\"]/div/div[2]/div/ul/li[1]/a";
    public static final String ToLocator = "//span[normalize-space()='To']";
    public static final String ToBoxLocator = "//*[@id=\"search_input\"]";
    public static final String BirMingHamAlabamaLocator ="//*[@id=\"airport-serach-panel\"]/div/div[2]/div/ul/li/a/span[2]";
    public static final String SearchOptionLocator = "//div[@class='d-none d-lg-block col-lg-2 searchOptionLabel ng-star-inserted']";

    //Round Trip
    public static final String RoundTripDropDownSingLocator = "//*[@id=\"booking\"]/form/div[1]/div/div[1]/div[1]/div[2]/span/span[1]/span[1]";
    public static final String SelectOneWayLocator = "//*[@id=\"ui-list-selectTripType1\"]";
    public static final String TheDeltaCustomerLocator = " //div[contains(text(),'THE DELTA CUSTOMER EXPERIENCE')]";

    //Flight departure
    public static final String DepartTimeLocator = "//*[@id=\"calDepartLabelCont\"]";
    public static final String SelectApril16Locator = "//a[@aria-label='16 April 2021, Friday']";
    public static final String ClickDepartureDoneLocator = "//button[normalize-space()='done']";
    public static final String ReturnLocator = "//*[@id=\"calReturnLabelCont\"]/span[2]";
    public static final String ClickMay3Locator = "//a[@aria-label='3 May 2021, Monday']";
    public static final String ReturnDateDoneLocator = "//button[normalize-space()='done']";


    //Passenger
    public static final String PassengerDropDown = "//*[@id=\"booking\"]/form/div[1]/div/div[1]/div[1]/div[4]/span/span[1]/span[1]";
    public static final String SelectPassenger4Locator = "//*[@id=\"ui-list-passengers3\"]";
    public static final String ClickArrow ="//*[@id=\"btn-book-submit\"]";
    public static final String FlyingMadeSimpleLocator =" //h3[normalize-space()='Flying Made Simple']";


}
