package com.bgp.pages;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
public class ProposalPage extends PageObject {
    @FindBy(id = "react-project-title")
    WebElementFacade projectTitle;
    @FindBy(id = "react-project-is_first_time_expand-true")
    WebElementFacade selectFirstTimeQuestion;
    @FindBy(id = "react-project-start_date")
    WebElementFacade startDate;
    @FindBy(id = "react-project-end_date")
    WebElementFacade endDate;
    @FindBy(id = "react-project-description")
    WebElementFacade projectDescription;
    @FindBy(id = "//div[starts-with(@id,'react-select-project-primary_market--option')]")
    List<WebElementFacade> targetMarketDropDown;
    String targetValue = "//div[starts-with(@id,'react-select-project-primary_market--option')]";
    @FindBy(xpath = "//div[starts-with(@id,'react-select-project-activity--option')]")
    List<WebElementFacade> activityItems;
    //label[@id='react-project-activity-label']//parent::div//parent::div//following-sibling::div//span[@class='Select-arrow']
    @FindBy(xpath = "//label[@id='react-project-activity-label']//parent::div//parent::div//following-sibling::div//span[@class='Select-arrow']")
    WebElementFacade selectActivityArrow;
    @FindBy(xpath = "//label[@id='react-project-primary_market-label']//parent::div//parent::div//following-sibling::div//span[@class='Select-arrow']")
    WebElementFacade selectMarketArrow;
    public void ClickOnSelectArrow() {
        this.selectActivityArrow.click();
    }
    public void selectFirstTimeQuestionAsYes() {
        this.selectFirstTimeQuestion.click();
    }
    public void enterProjectTitle(String projectTitle) {
        this.projectTitle.typeAndEnter(projectTitle);
    }
    public void enterStartDate(String startDate) {
        this.startDate.typeAndEnter(startDate);
    }
    public void enterEndDate(String endDate) {
        this.endDate.typeAndEnter(endDate.toString());
    }
    public void enterProjectDescription(String pjtDesc) {
        this.projectDescription.typeAndEnter(pjtDesc);
    }
    public void selectTargetMarketItem(String targetMarketItem) {
        selectMarketArrow.click();
        this.findAll(By.xpath("//div[starts-with(@id,'react-select-project-primary_market--option')]")).stream().filter(ele -> ele.getText().equals(targetMarketItem)).findAny().get().click();
        //this.targetMarketDropDown.stream().filter(ele->ele.getText().equals(targetMarketItem)).findAny().get();
    }
    public void selectActivityItems(String activityItem) {
        selectActivityArrow.click();
        this.activityItems.stream().filter(ele -> ele.getText().equals(activityItem)).findAny().get().click();
    }
}
