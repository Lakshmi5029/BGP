package steps;
import com.bgp.pages.BusinessImpactPage;
import net.thucydides.core.annotations.Step;

import java.util.Map;
public class BusinessImpactSteps {
    BusinessImpactPage businessImpactPage;
    @Step
    public void enterBusinessImpact(Map<String, String> businessImpact) {
        businessImpactPage.enterFYEndDate(businessImpact.get("FyEndDate"));
        businessImpactPage.enterOverSeasSales(businessImpact.get("OverSeasSales"));
        businessImpactPage.enterOverSeasInvestments(businessImpact.get("OverSeasInvestment"));
        businessImpactPage.enterRationalRemarks(businessImpact.get("RationalRemarks"));
        businessImpactPage.enterNonTangibleBenefits(businessImpact.get("NonTangibleBenefits"));
    }
}

