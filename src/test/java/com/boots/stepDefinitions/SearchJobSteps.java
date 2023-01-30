/*
package com.boots.stepDefinitions;

import com.boots.TestComponents.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.AssertJUnit.assertTrue;


public class SearchJobSteps extends BaseTest {

    private static final By JOB_SEARCH_FORM = By.cssSelector("#form-job-search");
    private static final By SELECT_DISTANCE_JOB = By.cssSelector("#name2");
    private static final By LOCATION_JOB = By.cssSelector("#location");




    @Given("^Search jobs filters are displayed$")
    public void searchJobFiltersDisplayed(){
        waitForExpectedElement(JOB_SEARCH_FORM);
        assertTrue(isElementDisplayedBySeconds(JOB_SEARCH_FORM,5));
    }


    @When("check for parameters displayed")
    public void checkForParametersDisplayed() {
        //need to check for what data need to verify

    }

    @Then("select distance is not clickable")
    public void selectDistanceIsNotClickable() {
        assertFalse(isElementClickable(SELECT_DISTANCE_JOB));
    }

    @Then("enter town, city or postcode option now select distance is clickable")
    public void enterTownCityOrPostcodeOptionNowSelectDistanceIsClickable() {
        waitClearAndEnterText(LOCATION_JOB,"London");
        assertTrue(isElementClickable(SELECT_DISTANCE_JOB));
    }
}

*/
