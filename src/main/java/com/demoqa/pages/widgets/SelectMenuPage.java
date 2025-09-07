package com.demoqa.pages.widgets;
import org.openqa.selenium.By;

import java.util.List;

import static utilities.DropDownUtility.*;
import static utilities.JavaScriptUtility.*;

public class SelectMenuPage extends WidgetsPage {

    private By standardMultiSelect = By.id("cars");

    public void selectStandardMulti(String text){
        scrollToElementJS(standardMultiSelect);
        selectByVisibleText(standardMultiSelect,text);
    }

    public void selectStandardMulti(int index){
        scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect,index);
    }

    public void deselectStandardMulti(String text){
        scrollToElementJS(standardMultiSelect);
        deselectByVisibleText(standardMultiSelect,text);
    }

    public void deselectStandardMulti(int index){
        scrollToElementJS(standardMultiSelect);
        deselectByIndex(standardMultiSelect,index);
    }

    public List<String> getAllSelectedStandardMultiOptions(){
        return getAllSelectedOptions(standardMultiSelect);
    }

}
