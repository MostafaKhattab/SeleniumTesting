package com.demoqa.pages.AlertsFrameWindows;
import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class AlertsFrameWindowsPage extends BasePage {

    private By modalDialogsMenuItem = By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");
    private By alertsMenuItem = By.xpath("//li[@id='item-1']/span[text()='Alerts']");
    private By framesMenuItem = By.xpath("//li[@id='item-2']/span[text()='Frames']");
    private By windowMenuItem = By.xpath("//li[@id='item-0']/span[text()='Browser Windows']");

    public ModalDialogsPage clickModalDialogs(){
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }

    public AlertsMenuPage clickAlerts(){
        scrollToElementJS(alertsMenuItem);
        click(alertsMenuItem);
        return new AlertsMenuPage();
    }

    public FramesPage clickFrames(){
        scrollToElementJS(framesMenuItem);
        click(framesMenuItem);
        return new FramesPage();
    }

    public BrowserWindowsPage clickBrowserWindows(){
        scrollToElementJS(windowMenuItem);
        click(windowMenuItem);
        return new BrowserWindowsPage();
    }
}
