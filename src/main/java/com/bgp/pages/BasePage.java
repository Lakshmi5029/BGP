package com.bgp.pages;
import com.bgp.utils.ActionsUtility;
import com.bgp.utils.JavaScriptUtility;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("https://qa-internet.bgp.onl/")
public class BasePage extends PageObject {
    JavaScriptUtility javaScriptUtility = new JavaScriptUtility(this.getDriver());
    ActionsUtility actionsUtility = new ActionsUtility(this.getDriver());
    private final String parent = ".modal-dialog";
    private final String userName = ".//input[@Id='signInFormUsername']";
    private final String password = ".//input[@Id='signInFormPassword']";
    private final String signIn = ".//input[@name='signInSubmitButton']";
    public void enterUsername(String username) {
        javaScriptUtility.enterText(this.find(By.cssSelector(parent)).findElements(By.xpath(this.userName)).get(0), "public");
    }
    public void enterPassword(String password) {
        javaScriptUtility.enterText(this.find(By.cssSelector(parent)).findElements(By.xpath(this.password)).get(0), "Let$BeC001");
    }
    public void clickOnSubmitButton() {
        javaScriptUtility.clickOnTheElement(this.find(By.cssSelector(parent)).findElement(By.xpath(signIn)));
    }
}
