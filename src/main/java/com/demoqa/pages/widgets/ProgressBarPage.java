package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.GetUtility.getTextBy;
import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.fluentWaitUntilVisible;

public class ProgressBarPage extends WidgetsPage{
    private By startStopButton = By.id("startStopButton");
    private By resetButton = By.id("resetButton");

    public void clickStartStopButton() {
        scrollToElementJS(startStopButton);
        click(startStopButton);
    }

    public String clickResetButton() {
        fluentWaitUntilVisible(30,resetButton);
        scrollToElementJS(resetButton);
        String resetButtonText = getTextBy(resetButton);
        click(resetButton);
        return resetButtonText;
    }



}
