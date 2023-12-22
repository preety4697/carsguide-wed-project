package com.car.guide.practice.pages;

import com.car.guide.practice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FindDealersPage extends Utility {
    private static final Logger log = LogManager.getLogger(FindDealersPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement findDealerText;

    @CacheLookup
    @FindBy(xpath = "//p[@class='dealerBanner--dealershipName']")
    List<WebElement> carDealersNames;


    public String getTextFromFindDealer() {
        return getTextFromElement(findDealerText);
    }

    public String isCarDealerNameAvailable(String dealerName) {
        for (WebElement e : carDealersNames){
            break;
        }
        return dealerName;
    }

}
