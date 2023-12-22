package com.car.guide.practice.pages;

import com.car.guide.practice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class UsedCarPage extends Utility {
    private static final Logger log = LogManager.getLogger(UsedCarPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement usedCarForSaleText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement usedCarMake;
    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement usedCarModel;
    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement usedCarLocation;
    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement usedCarPrice;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextUsedCar;

    public void selectUsedCarMake(String make){
        selectByVisibleTextFromDropDown(usedCarMake,make);
    }
    public void selectUsedCarModel(String model){
        selectByVisibleTextFromDropDown(usedCarModel, model);
    }
    public void selectUsedCarLocation(String location){
        selectByVisibleTextFromDropDown(usedCarLocation, location);
    }
    public void selectUsedCarPrice(String price){
        selectByVisibleTextFromDropDown(usedCarPrice, price);
    }
    public void clickOnFindMyNextUsedCar(){
        clickOnElement(findMyNextUsedCar);
    }
    public String getTextFromUsedCarForSale(){
        return getTextFromElement(usedCarForSaleText);
    }

}
