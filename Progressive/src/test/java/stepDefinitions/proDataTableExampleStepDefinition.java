package stepDefinitions;

import common.WebAPI;
import homepageProgressive.ProHomePage;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class proDataTableExampleStepDefinition extends WebAPI {
    static ProHomePage proHomePage;

    @BeforeStep
    public static void getInit(){
        proHomePage= PageFactory.initElements(driver,ProHomePage.class);
    }




    @When("I click on life product link")
    public void i_click_on_life_product_link() throws InterruptedException {
        proHomePage.LifeLocatorClickMethod();

    }
    @Then("I should see {string}")
    public void i_should_see(String  expectedText) throws InterruptedException {
        proHomePage.SelectTypeOfLifeInsuranceGetText(expectedText);

    }
    @Then("I enter user Zipcode")
    public void i_enter_user_zipcode(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        List<List<String>> data = dataTable.asLists(String.class);
        String ZipCode = data.get(1).get(0);
//        System.out.println(email);
        proHomePage.zipcodeLocatorSendMethod(ZipCode);
    }
    @Then("I click on get a Quote button")
    public void i_click_on_get_a_quote_button() throws InterruptedException {
        proHomePage.GetquoteLocatorBoxClick();



    }
    @Then("I enter First name")
    public void i_enter_first_name(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        List<List<String>> data = dataTable.asLists(String.class);
        String FirstName = data.get(1).get(0);
//        System.out.println(email);
        proHomePage.FirstName1SendKey( FirstName);

    }
    @Then("I enter Last name")
    public void i_enter_last_name(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        List<List<String>> data = dataTable.asLists(String.class);
        String LastName = data.get(1).get(0);
//        System.out.println(email);
        proHomePage.lastName1SendKey( LastName);
    }
    @Then("I verify the {string} text on that Page")
    public void i_verify_the_text_on_that_page(String expectedtext) throws InterruptedException {

        proHomePage.TellUsAboutYourSelfGettext(expectedtext);


    }





}
