package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class DynamicPropertiesPage extends ElementsPage {

    private By visibleAfterButton = By.id("visibleAfter");

    public String clickVisibleAfterButton (){
        int waitSeconds = 5;
        explicitWaitUntilVisible(waitSeconds,visibleAfterButton);
        scrollToElementJS(visibleAfterButton);
        click(visibleAfterButton);
        return find(visibleAfterButton).getText();
    }

}
