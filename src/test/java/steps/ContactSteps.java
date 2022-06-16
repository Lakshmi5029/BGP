package steps;
import com.bgp.constants.Constants;
import com.bgp.constants.StoryContextKeys;
import com.bgp.pages.*;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.Map;
public class ContactSteps {
    GrantsEligibilityPage grantsEligibilityPage;
    ContactDetailsPage contactDetailsPage;
    @Step
    public void clickOnContactDetails(Constants.grantActions grantOption) {
        grantsEligibilityPage.clickOnGrantAction(grantOption.getGrantOption());
    }
    @Step
    public void enterContactDetails(Map<String, String> contactDetails) {
        contactDetailsPage.enterName(contactDetails.get("Name"));
        contactDetailsPage.enterJobTitle(contactDetails.get("JobTitle"));
        contactDetailsPage.enterContactNo(contactDetails.get("ContactNo"));
        contactDetailsPage.enterPrimaryEmail(contactDetails.get("Email"));
        contactDetailsPage.enterSecondaryEmail(contactDetails.get("AlternateEmail"));
        contactDetailsPage.clickOnMailAddressCheckBox();
        contactDetailsPage.enterPostalCode(contactDetails.get("PostalCode"));
        contactDetailsPage.clickOnSameAsContactCheckbox();
        Serenity.getCurrentSession().put(StoryContextKeys.contact, contactDetails);
    }

    @Step
    public void verifyContactDetails()
    {
        Map<String,String> expContact = (Map<String, String>) Serenity.getCurrentSession().get(StoryContextKeys.contact);
        Map<String,String> actContact = contactDetailsPage.getContactsList();
        Assert.assertTrue("verify entered contacts are preserved after save",expContact.equals(actContact));
    }
}

