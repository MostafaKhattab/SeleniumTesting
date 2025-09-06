package com.demoqa.pages.elements;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends BasePage {

    private By webTablesMenuItem = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");

    public WebtablesPage clickWebTables (){
        scrollToElementJS(webTablesMenuItem);
        click(webTablesMenuItem);
        return new WebtablesPage();
    }

}
