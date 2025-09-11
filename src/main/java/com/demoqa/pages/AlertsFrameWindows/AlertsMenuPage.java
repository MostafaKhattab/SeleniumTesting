package com.demoqa.pages.AlertsFrameWindows;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class AlertsMenuPage extends AlertsFrameWindowsPage{

    private By informationAlertButton = By.id("alertButton");
    private By confirmationAlertButton = By.id("confirmButton");
    private By confirmText = By.id("confirmResult");
    private By promptAlertButton = By.id("promtButton");
    private By promptResult = By.id("promptResult");

    public void  clickInformationAlertButton(){
        scrollToElementJS(informationAlertButton);
        click(informationAlertButton);
    }

    public void  clickConfirmationAlertButton(){
        scrollToElementJS(confirmationAlertButton);
        click(confirmationAlertButton);
    }

    public void clickPromptAlertButton(){
        scrollToElementJS(promptAlertButton);
        click(promptAlertButton);
    }

    public String getConfirmResultMessage(){
        return find(confirmText).getText();
    }

    public String getPromptResultMessage(){
        return find(promptResult).getText();
    }
}
