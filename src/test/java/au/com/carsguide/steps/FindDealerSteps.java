package au.com.carsguide.steps;

import au.com.carsguide.pages.DealerPage;
import au.com.carsguide.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class FindDealerSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @And("^I click on 'Find a Dealer' page$")
    public void iClickOnFindADealerPage() {
        new HomePage().clickonFindDealer();
    }


    @And("^I should see the dealers name \"([^\"]*)\" are displayed on page$")
    public void iShouldSeeTheDealersNameAreDisplayedOnPage(Boolean dealr) {
        new DealerPage().verifyDealersNamesDisplayed(dealr);
    }

    @When("^I  a mouse hover on buy\\+sell tab$")
    public void iAMouseHoverOnBuySellTab() {
        new HomePage().mousehoveronbuynsell();
    }

    @Then("^I navigate to 'car-dealers' page and verify \"([^\"]*)\"$")
    public void iNavigateToCarDealersPageAndVerify(String mess) {
        Assert.assertEquals(mess,new DealerPage().verifycardealer());
    }
}
