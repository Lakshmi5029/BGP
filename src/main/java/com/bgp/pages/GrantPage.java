package com.bgp.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
public class GrantPage extends PageObject {
    @FindBy(xpath = "//h4[contains(text(),\"Get new grant\")]//ancestor::a/section/div")
    WebElementFacade getNewGrantOption;
    private String sector = "input#'%s'";
    @FindBy(xpath = "//input[@id='International Expansion']//following-sibling::div/div")
    WebElementFacade businessOverseasGrantBtn;
    @FindBy(xpath = "//input[@id='Market Readiness Assistance 2']//following-sibling::div/div")
    WebElementFacade mraGrantBtn;
    @FindBy(id = "go-to-grant")
    WebElementFacade applyGrantBtn;
    @FindBy(id = "keyPage-form-button")
    WebElementFacade proceedBtn;
    public Boolean getGrantNewOptionDisplay() {
        return getNewGrantOption.isDisplayed();
    }
    public void clickOnGetNewGrantOption() {
        this.getNewGrantOption.click();
    }
    public void clickOnBusinessOverseasGrantBtn() {
        this.businessOverseasGrantBtn.click();
    }
    public void clickOnSector(String sector) {
        this.find(By.cssSelector(sector)).click();
    }
    public void clickOnMraGrantBtn(String applyGrant) {
        this.mraGrantBtn.click();
    }
    public void clickOnApplyGrantBtn() {
        this.applyGrantBtn.click();
    }
    public void clickOnProceedBtn() {
        this.proceedBtn.click();
    }
}