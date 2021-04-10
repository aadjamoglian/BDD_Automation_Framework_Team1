package homepageProgressive;

public class proWebElement {

    public static final String  ExploreProduct = "//*[@id=\"explore\"]";
    public static final String  VehicalLocator = "//p[text()='Vehicle']";
    public static final String  ExploreProductText = "//*[@id=\"TabOne\"]";

    //2 nd code Auto Click
   // public static final String AutoClick = "//*[@id=\"main\"]/div[1]/div[2]/ul[1]/li[1]/a/p[1]/span";
    public static final String AutoClick ="//a[@data-tracking-label='auto_section']//span[@class='last-word']";
    public static final String AutoText = "//*[@id=\"quote-title\"]";
    public static final String EnterZipCode = "//*[@id=\"zipCode_overlay\"]";
    public static final String GetACodeClickLocator = "//*[@id=\"qsButton_overlay\"]";
    public static final String NameAndBirthTextLocator ="//div[@class='section-sub-header name-sub-header']";

    // 3rd Enter Personal Information to get the Auto Code
    public static final String FirstNameLocator ="//*[@id=\"NameAndAddressEdit_embedded_questions_list_FirstName\"]";
    public static final String LastNameLocator ="//*[@id=\"NameAndAddressEdit_embedded_questions_list_LastName\"]";
    public static final String SuffixLocator="//*[@id=\"NameAndAddressEdit_embedded_questions_list_Suffix\"]";

    //login to progressive Account
    public static final String LoginLocator=" //a[normalize-space()='Log In']";
    public static final String userIdLocator="//*[@id=\"login\"]/pui-textbox/label/div/input";
    public static final String passwordLocator=" //input[@id='inputPassword']";
    public static final String welcomeTextLocator="//h2[normalize-space()='Welcome']";
    public static final String loginLinkLocator="//span[normalize-space()='Log In']";

    //Claim Overview
    public static final String claimLocator="//*[@id=\"claims\"]";
    public static final String claimstextLocator="//*[@id=\"ClaimsNavigation\"]/div[1]/div[1]/p";
    public static final String claimOverviewLocator="//*[@id=\"ClaimsNavigation\"]/div[1]/div[1]/ul/li[1]/a";
    public static final String progressiveClaim="//*[@id=\"main\"]/div[1]/div[1]/h1";

    //Answer
    public static final String AnswerLocator="//*[@id=\"answers\"]";
    public static final String progressiveAnswerLocator="//*[@id=\"AnswersNavigation\"]/div/p[1]";
    public static final String seeAlltopicboxLocator="//*[@id=\"AnswersNavigation\"]/div/a";
    public static final String amIcoveredLocator="//*[@id=\"site\"]/div[2]/main/div/section/div[1]/nav/div[2]/div[2]";
    public static final String RenterInsuranceCoverTheftLocator="//div[contains(@class,'card card-parent card--large')]//img[@alt='A burglar breaks into an apartment']";
    public static final String RenterInsuranceCoverTheftLocatorText="//*[@id=\"site\"]/div[2]/header/div/div/div[1]/div/h1";

//Data Step Defination method locator
public static final String LifeLocator= "//body/div[@id='site']/main[@id='main']/div[1]/div[2]/ul[2]/li[1]/a";
public static final String SelectTypeOfLifeInsurance= "//body/div[@id='site']/div[3]/div[1]/div[1]/div[4]/div[1]/form[1]/div[1]/div[1]/h3[1]";
public static final String zipcodeLocator= "//*[@id=\"zipCode_overlay_subproducts\"]";
public static final String GetquoteLocator= "qsButton_overlay_subproducts";
public static final String FirstNameLocator1= "InsuredPerson.FirstName.mask";
public static final String LastNameLocator1= "InsuredPerson.LastName.mask";
public static final String TellUsAboutYourSelf= "//*[@id=\"app-root\"]/div[1]/div/section/div/div[1]/div/h1";





}
