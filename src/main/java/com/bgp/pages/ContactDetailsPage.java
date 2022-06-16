package com.bgp.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import com.bgp.utils.JavaScriptUtility;

import java.util.HashMap;
import java.util.Map;
public class ContactDetailsPage extends PageObject {
    JavaScriptUtility javaScriptUtility = new JavaScriptUtility(this.getDriver());
    @FindBy(xpath = "//input[@id='react-contact_info-name']")
    WebElementFacade name;
    @FindBy(xpath = "//input[@id='react-contact_info-designation']")
    WebElementFacade jobTitle;
    @FindBy(xpath = "//input[@id='react-contact_info-phone']")
    WebElementFacade contactNo;
    @FindBy(xpath = "//input[@id='react-contact_info-primary_email']")
    WebElementFacade primaryEmail;
    @FindBy(xpath = "//input[@id='react-contact_info-secondary_email']")
    WebElementFacade secondaryEmail;
    @FindBy(id = "react-contact_info-correspondence_address-copied")
    WebElementFacade mailingaddresschkbox;
    @FindBy(xpath = "//input[@id='react-contact_info-correspondence_address-postal']")
    WebElementFacade postalCode;
    @FindBy(id = "react-contact_info-copied")
    WebElementFacade sameAsContactPersonChkbox;
    @FindBy(xpath = "//input[@id='react-contact_info-offeree_name']")
    WebElementFacade offerName;
    @FindBy(xpath = "//input[@id='react-contact_info-offeree_designation']")
    WebElementFacade offerJobTitle;
    @FindBy(xpath = "//input[@id='react-contact_info-offeree_email']")
    WebElementFacade offerEmail;
    @FindBy(xpath = "//input[@id='react-contact_info-correspondence_address-block']")
    WebElementFacade blockNumber;
    @FindBy(xpath = "//input[@id='react-contact_info-correspondence_address-street']")
    WebElementFacade streetName;
    public void enterName(String name) {
        this.name.typeAndEnter(name);
    }
    public void enterJobTitle(String jobTitle) {
        this.jobTitle.typeAndEnter(jobTitle);
    }
    public void enterContactNo(String contactNo) {
        this.contactNo.typeAndEnter(contactNo);
    }
    public void enterPrimaryEmail(String primaryEmail) {
        this.primaryEmail.typeAndEnter(primaryEmail);
    }
    public void enterSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail.typeAndEnter(secondaryEmail);
    }
    public void clickOnMailAddressCheckBox() {
        this.mailingaddresschkbox.click();
    }
    public void enterPostalCode(String postalCode) {
        //this.postalCode.type(postalCode);
        WebElementFacade postal = this.find(By.xpath(postalCode));
        try {
            javaScriptUtility.enterText(postal, postalCode);
        } catch (Exception e) {
        }
    }
    public void clickOnSameAsContactCheckbox() {
        this.sameAsContactPersonChkbox.click();
    }
    public void enterOfferName(String offerName) {
        this.offerName.typeAndEnter(offerName);
    }
    public void enterOfferJobTitle(String jobOfferTitle) {
        this.offerJobTitle.typeAndEnter(jobOfferTitle);
    }
    public void enterOfferEmail(String offerEmail) {
        this.offerEmail.typeAndEnter(offerEmail);
    }
    public Map<String, String> getContactsList() {
        Map<String, String> contacts = new HashMap<String, String>();
        contacts.put("Name", this.name.getAttribute("value"));
        contacts.put("JobTitle", this.jobTitle.getAttribute("value"));
        contacts.put("ContactNo", this.contactNo.getAttribute("value"));
        contacts.put("Email", this.primaryEmail.getAttribute("value"));
        contacts.put("AlternateEmail", this.secondaryEmail.getAttribute("value"));
        contacts.put("SameAsRegisteredAddress", String.valueOf(this.mailingaddresschkbox.isEnabled()));
        contacts.put("PostalCode", this.postalCode.getAttribute("value"));
        contacts.put("Block", this.blockNumber.getAttribute("value"));
        contacts.put("Street", this.streetName.getAttribute("value"));
        contacts.put("sameAsMainContactPerson", String.valueOf(this.sameAsContactPersonChkbox.isEnabled()));
        return contacts;
    }
}
