package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewAndUsedCarSearch;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BuySteps {

    @Then("^I navigate to 'new and used car search' page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
        new NewAndUsedCarSearch().verifyNewandUsedCarPage();
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make)  {
        new NewAndUsedCarSearch().selectYourCar(make);
    }

    @And("^I Select model \"([^\"]*)\"$")
    public void iSelectModel(String model)  {
        new NewAndUsedCarSearch().selectModel(model);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String locate) {
        new NewAndUsedCarSearch().chooseYourLocation(locate);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) {
        new NewAndUsedCarSearch().selectYourRange$(price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearch().clickOnSearchButton();
    }



    @When("^I mouse hover on buy\\+sell tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mousehoveronbuynsell();
    }


    @And("^I click Search Cars link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickonsearch();
    }


    @And("^I click on used car link$")
    public void iClickOnUsedCarLink() {
        new HomePage().clickonused();
    }


    @Then("^I should see the make in \"([^\"]*)\"$")
    public void iShouldSeeTheMakeIn(String result) {
        Assert.assertEquals(new NewAndUsedCarSearch().verifyTextSuccessfully(),result,"Not able to verify the make" );
    }
}

