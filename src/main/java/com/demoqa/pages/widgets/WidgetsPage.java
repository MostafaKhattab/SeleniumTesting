package com.demoqa.pages.widgets;
import com.base.BasePage;
import com.demoqa.pages.elements.WebtablesPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends BasePage {
    private By selectMenuItem = By.xpath("//li[@id='item-8']/span[text()='Select Menu']");
    private By datePickerItem = By.xpath("//li[@id='item-2']/span[text()='Date Picker']");

    public SelectMenuPage clickSelectMenu (){
        scrollToElementJS(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
    }

    public DatePickerPage clickDatePicker (){
        scrollToElementJS(datePickerItem);
        click(datePickerItem);
        return new DatePickerPage();
    }

}
