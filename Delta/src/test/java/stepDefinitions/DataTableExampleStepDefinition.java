package stepDefinitions;

import common.WebAPI;
import homepage.DeltaHomePage;
import homepage.DeltaHomePage;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.support.PageFactory;

public class DataTableExampleStepDefinition extends WebAPI {
    static DeltaHomePage homePage;

    @BeforeStep
    public static void getInit() {
        homePage = PageFactory.initElements(driver, DeltaHomePage.class);
    }

}




