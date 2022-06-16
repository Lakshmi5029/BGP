package steps;
import com.bgp.pages.BasePage;
import com.bgp.pages.GrantPage;
import com.bgp.pages.LoginBGPPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.Map;
public class BaseSteps {
    BasePage basePage;
    LoginBGPPage loginBGPPage;
    GrantPage grantPage;
    @Step
    public void launchBGPPage() {
        basePage.open();
    }
    @Step
    public void enterLoginCredentials(Map<String, String> credentials) {
        basePage.enterUsername(credentials.get("User_Name"));
        basePage.enterPassword(credentials.get("Password"));
        basePage.clickOnSubmitButton();
    }
    @Step
    public void enterManualLoginCredentials(Map<String, String> loginDetails) {
        loginBGPPage.enterEntityId(loginDetails.get("Entity_ID"));
        loginBGPPage.enterUserId(loginDetails.get("User_ID"));
        loginBGPPage.enterUserRole(loginDetails.get("User_Role"));
        loginBGPPage.enterUserFullName(loginDetails.get("User_FullName"));
        loginBGPPage.clickOnManualLoginBtn();
    }
    @Step
    public void bgpLoginPageIsDisplayed() {
        Assert.assertTrue(loginBGPPage.getBGPPageDisplay());
    }
    @Step
    public void clickOnGetNewGrantButton() {
        grantPage.clickOnGetNewGrantOption();
    }
}
