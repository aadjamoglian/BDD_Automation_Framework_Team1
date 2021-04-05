package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

// Action Method class

    // Find By Annotation: First Approach
    @FindBy(how = How.XPATH, using =searchBoxLocator ) public WebElement searchBox;
    @FindBy (how = How.XPATH, using =searchButtonLocator ) public WebElement searchButton;
    @FindBy (how = How.XPATH, using =searchTextLocator ) public WebElement searchText;


    public void verifyPageTitle(String expectedText){
        String actualText=driver.getTitle();
        Assert.assertEquals("Page Title not match",expectedText,actualText);
    }
    public void goSearchBox() throws InterruptedException {
        clickByXpath(searchBoxLocator);
        sleepFor(3);
    }
    public void enterProductName( String productName) throws InterruptedException {
        searchBox.sendKeys(productName);
        sleepFor(3);
    }

    public void searchBox(String expectedText){
        String actualText=searchText.getText();
        Assert.assertEquals("Page Title not match",expectedText,actualText);
    }
    public void searchButton() throws InterruptedException {
        clickByXpath(searchButtonLocator);
        sleepFor(3);
    }
    public void showTrueResult() throws InterruptedException {
        clickByXpath(showTrueResultLocator);
        sleepFor(3);
    }
    public void donNotShowFalseResult() throws InterruptedException {
        clickByXpath(donNotShowFalseResultLocator);
        sleepFor(3);
    }
    public void menuBar() throws InterruptedException {
        clickByXpath(menuBarLocator);
        sleepFor(3);
    }
    public void dealsDiscounts() throws InterruptedException {
        clickByXpath(dealsDiscountsLocator);
        sleepFor(3);
    }
    public void deals() throws InterruptedException {
        clickByXpath(dealsLocator);
        sleepFor(3);
    }
    public void hpDeals() throws InterruptedException {
        clickByXpath(hpDealsLocator);
        sleepFor(3);
    }

}
