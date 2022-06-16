package steps;
import com.bgp.constants.Constants;
import com.bgp.constants.StoryContextKeys;
import com.bgp.pages.*;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

import java.util.Map;
public class ProposalSteps {
    ProposalPage proposalPage;
    @Step
    public void enterProposalDetails(Map<String, String> proposalDetails) {
        proposalPage.enterProjectTitle(proposalDetails.get("ProjectTitle"));
        proposalPage.enterStartDate(proposalDetails.get("StartDate"));
        proposalPage.enterEndDate(proposalDetails.get("EndDate"));
        proposalPage.enterProjectDescription(proposalDetails.get("ProjectDescription"));
        proposalPage.selectActivityItems(proposalDetails.get("Activity"));
        proposalPage.selectTargetMarketItem(proposalDetails.get("TargetMarket"));
        proposalPage.selectFirstTimeQuestionAsYes();
        Serenity.getCurrentSession().put(StoryContextKeys.proposal, proposalDetails);
    }
}

