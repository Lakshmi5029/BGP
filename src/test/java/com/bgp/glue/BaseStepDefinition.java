package com.bgp.glue;
import com.bgp.pages.LoginBGPPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.BaseSteps;

import java.util.Map;
public class BaseStepDefinition {
    @Steps
    BaseSteps baseSteps;
    LoginBGPPage loginBGPPage;
    @Given("launch application url")
    public void launchApplicationUrl() {
        baseSteps.launchBGPPage();
    }
    @When("user login to basic login page")
    public void userLoginToBasicLoginPage(Map<String, String> credentials) {
        baseSteps.enterLoginCredentials(credentials);
    }
    @Given("BGP login page is displayed")
    public void bgpLoginPageIsDisplayed() {
        baseSteps.bgpLoginPageIsDisplayed();
    }
    @When("user login to BGP")
    public void userLoginToBGP(Map<String, String> loginDetails) {
        loginBGPPage.clickOnLoginBtn();
        baseSteps.enterManualLoginCredentials(loginDetails);
    }
    @And("click on getNewGrant button")
    public void clickOnGetNewGrantButton() {
        baseSteps.clickOnGetNewGrantButton();
    }
}
