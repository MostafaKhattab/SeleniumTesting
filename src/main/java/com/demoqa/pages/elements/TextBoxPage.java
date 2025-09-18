package com.demoqa.pages.elements;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static utilities.ActionsUtility.sendKeys;
import static utilities.GetUtility.getTextBy;
import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.explicitWaitUntilVisible;
import static utilities.WaitUtility.fluentWaitUntilVisible;

public class TextBoxPage extends ElementsPage {
    private By fullNameField = By.id("userName");
    private By currentAddressField = By.xpath("//textarea[@id='currentAddress']");
    private By fullNameOutput = By.xpath("//div[@id='output']//p[@id='name']");
    private By emailOutput = By.xpath("//div[@id='output']//p[@id='email']");
    private By currentAddressOutput = By.xpath("//div[@id='output']//p[@id='currentAddress']");
    private By submitButton = By.id("submit");

    public String getFullName (){
        //fluentWaitUntilVisible(1,fullNameOutput);
        return getTextBy(fullNameOutput);
    }

    public String getEmail (){
        //fluentWaitUntilVisible(1,emailOutput);
        return getTextBy(emailOutput);
    }

    public String getCurrentAddress (){
        //fluentWaitUntilVisible(1,currentAddressOutput);
        return getTextBy(currentAddressOutput);
    }

    public void setFullName (String fullName){
        sendKeys(find(fullNameField), fullName);
    }

    public void setEmail (String email){
        setFullName(Keys.chord(Keys.TAB, email));
    }

    public void setCurrentAddress (String address){
        find(currentAddressField).sendKeys(address + Keys.ENTER);
    }

    public void clickSubmitButton(){
        scrollToElementJS(submitButton);
        click(submitButton);
    }


}


