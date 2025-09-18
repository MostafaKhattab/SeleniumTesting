package com.demoqa.pages.elements;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends BasePage {

    private By webTablesMenuItem = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");
    private By linksItem = By.xpath("//li[@id='item-5']/span[text()='Links']");
    private By dynamicPropertiesItem = By.xpath("//li[@id='item-8']/span[text()='Dynamic Properties']");

    public WebtablesPage clickWebTables (){
        scrollToElementJS(webTablesMenuItem);
        click(webTablesMenuItem);
        return new WebtablesPage();
    }

    public LinksPage clickLinks (){
        scrollToElementJS(linksItem);
        click(linksItem);
        return new LinksPage();
    }

    public DynamicPropertiesPage clickDynamicProperties (){
        scrollToElementJS(dynamicPropertiesItem);
        click(dynamicPropertiesItem);
        return new DynamicPropertiesPage();
    }

}
