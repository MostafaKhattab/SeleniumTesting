package com.demoqa.pages.elements;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class LinksPage extends ElementsPage {
    private By basRequestlink = By.id("bad-request");
    private By linkResponse = By.id("linkResponse");

    public void clickLink() {
        scrollToElementJS(basRequestlink);
        clickJS(basRequestlink);
    }

    public String getLinkResponse(){
        delay(2000);
        scrollToElementJS(linkResponse);
        return find(linkResponse).getText();
    }

}
