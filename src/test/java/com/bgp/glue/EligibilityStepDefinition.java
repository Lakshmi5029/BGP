package com.bgp.glue;
import com.bgp.constants.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.Eligiblitysteps;
public class EligibilityStepDefinition {
    @Steps
    Eligiblitysteps eligiblitySteps;
    @And("verify Grants page is displayed")
    public void verifyGrantsPageIsDisplayed() {
        eligiblitySteps.VerifyGrantsPageIsDisplayed();
    }
    @And("click on (IT) sector$")
    public void clickOnITSector(Constants.SECTOR sector) {
        eligiblitySteps.clickOnSector(sector.getSector());
    }
    public void ClickOnGrantAction(Constants.grantActions grantAction) {
        eligiblitySteps.clickOnGrantAction(grantAction.getGrantOption());
    }
    @And("click on the (BRING_MY_BUSINESS|UPGRADE_KEY_BUSINESS|ENHANCE_TOURISTS) grantto option$")
    public void clickOnTheBRING_MY_BUSINESSGranttoOption(Constants.SELECT_GRANT grant) {
        eligiblitySteps.clickOnTheSelectGrant(grant.getSelectGrantLabel());
    }
    @And("click on the (MARKET_READINESS_ASSISTANCE|MARKET_ACCESS) Grant type$")
    public void clickOnTheMARKET_READINESS_ASSISTANCEGrantType(Constants.APPLY_GRANT selectApplyGrant) {
        eligiblitySteps.clickOnMraGrantBtn(selectApplyGrant.getSelectApplyGrant());
    }
    @And("click on apply button")
    public void clickOnApplyButton() {
        eligiblitySteps.clickOnApplyGrantBtn();
    }
    @And("click on Proceed button")
    public void clickOnProceedButton() {
        eligiblitySteps.clickOnProceedBtn();
    }
    @Then("verify eligibility questions are displayed")
    public void verifyEligibilityQuestionsAreDisplayed() {
        eligiblitySteps.verifyEligibilityCriteriaQuestions();
    }
    @When("click on Yes for all the questions$")
    public void clickOnYesForAllQuestionsString() {
        eligiblitySteps.ClickOnYesEligiblityQuestion();
    }
    @When("click on FAQ link")
    public void clickOnFAQ() {
    }
    @And("click on No for all the questions and verify FAQ page is displayed")
    public void clickOnNoForAllTheQuestionsAndVerifyFAQPageIsDisplayed() {
        eligiblitySteps.ClickOnNoEligiblityQuestion();
    }
    @And("click on Save button")
    public void clickOnSaveButton() {
        eligiblitySteps.clickOnSaveButton();
    }
    @And("verify provided credentials are displayed after refresh")
    public void verifyProvidedCredentialsAreDisplayedAfterRefresh() {
        eligiblitySteps.verifyPageReload();
    }
}
