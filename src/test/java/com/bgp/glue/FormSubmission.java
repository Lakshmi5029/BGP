package com.bgp.glue;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import steps.ProposalSteps;

import java.util.Map;
public class FormSubmission {
    @Steps
    ProposalSteps proposalSteps;
    @And("fill Proposal page")
    public void fillProposalPage(Map<String,String> proposalDetails) {
        proposalSteps.enterProposalDetails(proposalDetails);

    }
}
