package com.bgp.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
public class BusinessImpactPage extends PageObject {
    @FindBy(id = "react-project_impact-fy_end_date_0")
    WebElementFacade fyEndDate;
    @FindBy(id = "react-project_impact-overseas_sales_0")
    WebElementFacade overSeasSalesAmtOne;
    @FindBy(id = "react-project_impact-overseas_sales_1")
    WebElementFacade overSeasSalesAmtTwo;
    @FindBy(id = "react-project_impact-overseas_sales_2")
    WebElementFacade overSeasSalesAmtThree;
    @FindBy(id = "react-project_impact-overseas_sales_3")
    WebElementFacade overSeasSalesAmtFour;
    @FindBy(id = "react-project_impact-overseas_investments_0")
    WebElementFacade overSeasInvestmentOne;
    @FindBy(id = "react-project_impact-overseas_investments_1")
    WebElementFacade overSeasInvestmentTwo;
    @FindBy(id = "react-project_impact-overseas_investments_2")
    WebElementFacade overSeasInvestmentThree;
    @FindBy(id = "react-project_impact-overseas_investments_3")
    WebElementFacade overSeasInvestmentFour;
    @FindBy(id = "react-project_impact-rationale_remarks")
    WebElementFacade rationaleRemarks;
    @FindBy(id = "react-project_impact-benefits_remarks")
    WebElementFacade nonTangibleBenefits;
    public void enterFYEndDate(String endDate) {
        this.fyEndDate.type(endDate);
    }
    public void enterOverSeasSales(String OverSeasSales) {
        this.overSeasSalesAmtOne.type(OverSeasSales);
        this.overSeasSalesAmtTwo.type(OverSeasSales);
        this.overSeasSalesAmtThree.type(OverSeasSales);
        this.overSeasSalesAmtFour.type(OverSeasSales);
    }
    public void enterOverSeasInvestments(String OverSeasInvestment) {
        this.overSeasInvestmentOne.type(OverSeasInvestment);
        this.overSeasInvestmentTwo.type(OverSeasInvestment);
        this.overSeasInvestmentThree.type(OverSeasInvestment);
        this.overSeasInvestmentFour.type(OverSeasInvestment);
    }
    public void enterRationalRemarks(String Rationalremarks) {
        this.rationaleRemarks.type(Rationalremarks);
    }
    public void enterNonTangibleBenefits(String nonTangibleBenefits) {
        this.rationaleRemarks.type(nonTangibleBenefits);
    }
}
