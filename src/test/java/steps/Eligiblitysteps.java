package steps;
import com.bgp.constants.Constants;
import com.bgp.constants.StoryContextKeys;
import com.bgp.pages.BasePage;
import com.bgp.pages.GrantsEligibilityPage;
import com.bgp.pages.LoginBGPPage;
import com.bgp.pages.GrantPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Eligiblitysteps {
    BasePage basePage;
    GrantsEligibilityPage grantsEligibilityPage;
    GrantPage grantPage;
    @Step
    public void launchBGPPage() {
        basePage.open();
    }
    @Step
    public void VerifyGrantsPageIsDisplayed() {
        Assert.assertTrue(grantPage.getGrantNewOptionDisplay());
    }
    @Step
    public void clickOnTheSelectGrant(String selectGrant) {
        grantPage.clickOnBusinessOverseasGrantBtn();
    }
    @Step
    public void clickOnTheApplyGrant() {
        grantPage.clickOnApplyGrantBtn();
    }
    @Step
    public void verifyEligibilityCriteriaQuestions() {
        List<String> test = grantsEligibilityPage.getEligibilityQuestions();
        Assert.assertTrue("verify eligibility questions are displayed", Arrays.stream(Constants.ELIGIBILITY_LABEL.values()).map(item -> item.getLabel()).collect(Collectors.toList()).containsAll(test));
    }
    @Step
    public void ClickOnYesEligiblityQuestion() {
        Assert.assertTrue(grantsEligibilityPage.clickOnYesForEligibilityQuestions());
    }
    @Step
    public void ClickOnNoEligiblityQuestion() {
        Assert.assertTrue(grantsEligibilityPage.clickOnNoForEligibilityQuestions());
    }
    @Step
    public void clickOnSaveButton() {
        grantsEligibilityPage.clickOnSaveBtn();
    }
    @Step
    public void verifyPageReload() {
        if ((Boolean) Serenity.getCurrentSession().get(StoryContextKeys.warningEnabled))
            Assert.assertTrue(grantsEligibilityPage.reloadAndGetListOfWarningLabels().size() > 0);
        else
            Assert.assertTrue(grantsEligibilityPage.reloadAndGetListOfWarningLabels().size() == 0);
    }
    @Step
    public void clickOnSector(String sector)
    {
        grantsEligibilityPage.clickOnSector(sector);
    }

    @Step
    public void clickOnGrantAction(String grantAction)
    {
        grantsEligibilityPage.clickOnGrantAction(grantAction);
    }

    @Step
    public void clickOnMraGrantBtn(String applyGrant)
    {
        grantPage.clickOnMraGrantBtn(applyGrant);
    }

    @Step
    public void clickOnApplyGrantBtn()
    {
        grantPage.clickOnApplyGrantBtn();
    }

    @Step
    public void clickOnProceedBtn()
    {
        grantPage.clickOnProceedBtn();
    }

}


