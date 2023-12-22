package com.car.guide.practice.steps;

import com.car.guide.practice.pages.HomePage;
import com.car.guide.practice.pages.NewAndUsedCarSearchPage;
import com.car.guide.practice.pages.ProductPage;
import com.car.guide.practice.pages.UsedCarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BuySteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I mouse hover on “buy+sell” tab")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHoverOnBuyAndSellLink();
    }

    @And("I click ‘Search Cars’ link")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnCarSearchLink();
    }

    @Then("I navigate to ‘new and used car search’ page")
    public void iNavigateToNewAndUsedCarSearchPage() {
        Assert.assertEquals(new NewAndUsedCarSearchPage().getTextFromNewAndUsedCarSearchPage(),"New & Used Car Search - carsguide" , "Error");
    }


    @And("I click on Find My Next Car tab")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickOnFindMyNextCarTab();
    }

    @And("I click ‘Used’ link")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedCarLink();
    }

    @Then("I navigate to ‘Used Cars For Sale’ page")
    public void iNavigateToUsedCarsForSalePage() {
        Assert.assertEquals(new UsedCarPage().getTextFromUsedCarForSale(),"Used Cars For Sale", "Error");
    }

    @And("I select make {string}")
    public void iSelectMakeMake(String make) {
        new NewAndUsedCarSearchPage().selectMake(make);
    }
        
    @And("I select model {string}")
    public void iSelectModelModel(String model) {
        new NewAndUsedCarSearchPage().selectModel(model);
    }

    @And("I select location {string}")
    public void iSelectLocationLocation(String location) {
        new NewAndUsedCarSearchPage().selectCarLocation(location);
    }

    @And("I select price {string}")
    public void iSelectPricePrice(String price) {
        new NewAndUsedCarSearchPage().selectCarPrice(price);
    }



    @Then("I should see the make {string} in results")
    public void iShouldSeeTheMakeMakeInResults(String make) {
        Assert.assertTrue(new ProductPage().getTextFromResults().contains(make));

    }
}
