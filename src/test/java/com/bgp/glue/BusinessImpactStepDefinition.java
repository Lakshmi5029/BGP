package com.bgp.glue;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import steps.BusinessImpactSteps;

import java.util.Map;
public class BusinessImpactStepDefinition {
    @Steps
    BusinessImpactSteps businessImpactSteps;
    @And("fill BusinessImpact page")
    public void fillBusinessImpact(Map<String, String> businessImpact) {
        businessImpactSteps.enterBusinessImpact(businessImpact);
    }
}
