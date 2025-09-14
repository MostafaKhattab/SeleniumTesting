package com.demoqa.pages.AlertsFrameWindows;

import org.openqa.selenium.By;
import org.testng.Assert;

import static utilities.GetUtility.*;
import static utilities.SwitchToUtility.*;

public class BrowserWindowsPage extends AlertsFrameWindowsPage {
    private By newTabButton = By.id("tabButton");
    private By newTabHeading = By.id("sampleHeading");
    private By originalTabHeading = By.xpath("//div[@id='browserWindows']/h1[text()='Browser Windows']");

    public void clickNewTab(){
        click(newTabButton);
        var handles = getCurrentHandles().toArray();
        switchToWindow(handles[1].toString());
        String expectedNewTabHeading = "This is a sample page";
        String actualNewTabHeading = getTextBy(newTabHeading);
        Assert.assertEquals(expectedNewTabHeading, actualNewTabHeading,"Actual and Expected texts do not match");
        switchToWindow(handles[0].toString());
        String expectedOriginalTabHeading = "Browser Windows";
        String actualOriginalTabHeading = getTextBy(originalTabHeading);
        Assert.assertEquals(expectedOriginalTabHeading, actualOriginalTabHeading,"Actual and Expected texts do not match");
    }



}
