package com.demoqa.pages.AlertsFrameWindows;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ModalDialogsPage extends AlertsFrameWindowsPage {

    private By smallModalButton = By.id("showSmallModal");
    private By largeModalButton = By.id("showLargeModal");
    private By closeButton = By.xpath("//div[@class='modal-header']//button[@class='close']");
    private By modalBody = By.xpath("//div[@class='modal-body']");
    public void clickSmallModalButton(){
        scrollToElementJS(smallModalButton);
        click(smallModalButton);
    }

    public void clickLargeModalButton(){
        scrollToElementJS(largeModalButton);
        click(largeModalButton);
    }

    public void clickCloseButton(){
        scrollToElementJS(closeButton);
        click(closeButton);
    }

    public String getModalText(){
        return find(modalBody).getText();
    }

}
