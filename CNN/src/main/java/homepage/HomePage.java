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
    @FindBy(how = How.XPATH, using =searchCNNLocator ) public WebElement searchBox;
    @FindBy (how = How.XPATH, using =searchButtonLocator ) public WebElement searchButton;
    @FindBy (how = How.XPATH, using =searchTextLocator ) public WebElement searchText;
    @FindBy (how = How.NAME, using =productNameLocator) public WebElement productName;

    public void verifyInPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        org.testng.Assert.assertEquals(actualTitle, expectedTitle,"Title not matched");
    }

    public void verifySearchResult(String expectedText){
        String actualText=searchText.getText();
        Assert.assertEquals("Product does not match",expectedText,actualText);
    }

    public void searchCNN(){
        searchBox.click();
    }

    public void enterProductName( String productName){
        searchBox.sendKeys(productName);
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }

    public void trueDisplayResults() throws InterruptedException {
        clickByXpath(trueDisplayResultsLocator);
        sleepFor(3);
    }
    public void notDisplayResults() throws InterruptedException {
        clickByXpath(notDisplayResultsLocator);
        sleepFor(3);
    }
    public void liveTVLocator() throws InterruptedException {
        clickByXpath(liveTVLocator);
        sleepFor(3);
    }
    public void usNews() throws InterruptedException {
        clickByXpath(usLocator);
        sleepFor(3);
    }
    public void crimeJustice() throws InterruptedException {
        clickByXpath(crimeJusticeLocator);
        sleepFor(3);
    }
}
