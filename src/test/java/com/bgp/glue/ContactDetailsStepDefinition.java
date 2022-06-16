package com.bgp.glue;
import com.bgp.constants.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.ContactSteps;
import steps.Eligiblitysteps;

import java.util.Map;
public class ContactDetailsStepDefinition {
    @Steps
    ContactSteps contactSteps;
    @And("click on (ELIGIBLITY|CONTACT_DETAILS|PROPOSAL|BUSINESS_IMPACT|COST|DECLARE_REVIEW) page$")
    public void clickOnContactDetailsPage(Constants.grantActions grantAction) {
        contactSteps.clickOnContactDetails(grantAction);
    }
    @And("fill contacts details")
    public void fillContactsDetails(Map<String, String> contactDetails) {
        contactSteps.enterContactDetails(contactDetails);
    }
    @Then("verify contacts details are saved")
    public void verifyContactsDetailsAreSaved() {
        contactSteps.verifyContactDetails();
    }
}