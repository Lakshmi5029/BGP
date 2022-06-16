package com.bgp.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
public class LoginBGPPage extends PageObject {

    @FindBy(id = "login-button")
    WebElementFacade login;
    @FindBy(id = "entityId")
    WebElementFacade entityId;
    @FindBy(id = "userId")
    WebElementFacade userId;
    @FindBy(id = "userRole")
    WebElementFacade userRole;
    @FindBy(id = "userFullName")
    WebElementFacade userFullName;
    @FindBy(css = "button.btn-primary")
    WebElementFacade manualLogin;

    public Boolean getBGPPageDisplay()
    {
        return login.isDisplayed();
    }

    public void clickOnLoginBtn()
    {
        this.login.click();
    }

    public void enterEntityId(String entityId)
    {
        this.entityId.typeAndEnter(entityId);
    }

    public void enterUserId(String userId)
    {
        this.userId.typeAndEnter(userId);
    }

    public void enterUserRole(String userRole)
    {
        this.userRole.typeAndEnter(userRole);
    }

    public void enterUserFullName(String fullName)
    {
        this.userFullName.type(fullName);
    }

    public void clickOnManualLoginBtn()
    {
        this.manualLogin.click();
    }
}
