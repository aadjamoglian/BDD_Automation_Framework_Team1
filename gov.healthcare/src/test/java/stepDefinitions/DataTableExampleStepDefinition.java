package stepDefinitions;


import common.WebAPI;
import homepage.healthCareHomePage;
import homepage.healthCareHomePage;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.support.PageFactory;

public class DataTableExampleStepDefinition extends WebAPI {
    static healthCareHomePage homePage;

    @BeforeStep
    public static void getInit() {
        homePage = PageFactory.initElements(driver, healthCareHomePage.class);
    }

}





