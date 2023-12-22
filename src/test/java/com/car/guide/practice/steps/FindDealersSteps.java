package com.car.guide.practice.steps;

import com.car.guide.practice.pages.FindDealersPage;
import com.car.guide.practice.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class FindDealersSteps {
    @And("I click ‘Find a Dealer’")
    public void iClickFindADealer() {
       new HomePage().clickOnFindDealerLink();
    }

    @Then("I navigate to ‘car-dealers’ page")
    public void iNavigateToCarDealersPage() {
        Assert.assertEquals(new FindDealersPage().getTextFromFindDealer(),"Find a Car Dealership Near You","Error");

    }

    @And("I should see the dealer names {string} are display on page")
    public void iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage(String dealersName) {
        Assert.assertEquals(new FindDealersPage().isCarDealerNameAvailable(dealersName), dealersName, "Error");
        }
    }

