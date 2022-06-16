package com.bgp.pages;
import com.bgp.constants.Constants;
import com.bgp.constants.StoryContextKeys;
import com.bgp.utils.JavaScriptUtility;
import java.util.Iterator;
import java.util.Set;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import java.util.*;

public class GrantsEligibilityPage extends PageObject {
    JavaScriptUtility javaScriptUtility = new JavaScriptUtility(this.getDriver());
    @FindBy(css = "label.control-label")
    List<WebElementFacade> eligibilityList;
    @FindBy(id = "save-btn")
    WebElementFacade save;
    private String yesNoButton = "//input[@id='%s']";
    private String yesNoRadioButton = "input#'%s'";
    String grantActions = "//span[contains(text(),'%s')]";
    private String sectorType = "//div[contains(text(),'%s')]";
    private String warningTextPath = ".//ancestor::div[@class='form-group']/parent::div/following-sibling::*[position()=1]/div[@class='field-warning-text']";
    private String faqlink = ".//a";
    @FindBy(xpath = "//div/div[@class='field-warning-text']")
    private List<WebElementFacade> warningLabels;

    public void clickOnSector(String sector) {
        WebElementFacade sectorElement = this.find(By.xpath(String.format(sectorType, sector)));
        sectorElement.click();
    }
    public void clickOnGrantAction(String grantAction) {
        WebElementFacade grantActionType = this.find(By.xpath(String.format(grantActions, grantAction)));
        grantActionType.click();
    }
    public List<String> getEligibilityQuestions() {
        StringBuilder result = new StringBuilder("");
        List<String> labels = new ArrayList<>();
        for (WebElementFacade qu : eligibilityList) {
            WebElementFacade aEle;
            result.append(qu.getText());
            try {
                aEle = qu.find(By.xpath(".//a"));
                result.append(aEle.getText());
            } catch (Exception e) {
                try {
                    aEle = qu.find(By.xpath(".//span"));
                    result.append(aEle.getText());
                } catch (NoSuchElementException e1) {
                }
            }
            labels.add(result.toString());
            result.setLength(0);
        }
        return labels;
    }
    public Boolean clickOnYesForEligibilityQuestions() {
        for (Constants.ELIGIBILITY_LABEL ele : Constants.ELIGIBILITY_LABEL.values()) {
            WebElementFacade yesButton = this.find(By.xpath(String.format(yesNoButton, ele.getYesid())));
            javaScriptUtility.clickOnTheElement(yesButton);
            try {
                if (yesButton.find(By.xpath(warningTextPath)).getText().equals(Constants.warningMsg))
                    return false;

            } catch (org.openqa.selenium.NoSuchElementException e) {
                Serenity.getCurrentSession().put(StoryContextKeys.warningEnabled, false);
            }
        }
        return true;
    }
    public Boolean clickOnNoForEligibilityQuestions() {
        for (Constants.ELIGIBILITY_LABEL ele : Constants.ELIGIBILITY_LABEL.values()) {
            WebElementFacade noButton = this.find(By.xpath(String.format(yesNoButton, ele.getNoid())));
            javaScriptUtility.clickOnTheElement(noButton);
            WebElementFacade warningMsgLabel = noButton.find(By.xpath(warningTextPath));
            if (warningMsgLabel.getText().equals(Constants.warningMsg)) {
                //warningMsgLabel.find(By.xpath(faqlink)).click();
                if (!this.verifyFAQPageisdisplayed(warningMsgLabel))
                    return false;
            }
        }
        Serenity.getCurrentSession().put(StoryContextKeys.warningEnabled, true);
        return true;
    }
    //Can be moved to reusable utility
    public Boolean verifyFAQPageisdisplayed(WebElementFacade warningMsgLabel) {
        String parentWindow = getDriver().getWindowHandle();
        javaScriptUtility.clickOnTheElement(warningMsgLabel.find(By.xpath(faqlink)));
        Set<String> handles = getDriver().getWindowHandles();
        Iterator<String> I1 = handles.iterator();
        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parentWindow.equals(child_window)) {
                boolean result = getDriver().switchTo().window(child_window).getCurrentUrl().equals(Constants.faqUrl);
                getDriver().close();
                getDriver().switchTo().window(parentWindow);
                return result;
            }
        }
        return false;
    }
    public void clickOnSaveBtn() {
        this.save.click();
    }
    public List<WebElementFacade> reloadAndGetListOfWarningLabels() {
        this.getDriver().navigate().refresh();
        return warningLabels;
    }
    public void clickOnAction(String action) {
        this.find(By.xpath(String.format(grantActions, action))).click();
    }
}
