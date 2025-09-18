package com.demoqa.pages.widgets;
import org.openqa.selenium.By;

import static utilities.ActionsUtility.dragAndDropBy;
import static utilities.GetUtility.getAttributeBy;

public class SlidersPage extends WidgetsPage {
    private By sliderItem = By.xpath("//div[@id='sliderContainer']//input[@type='range']");
    private By sliderValue = By.id("sliderValue");

    public void moveSlider(int x, int y) throws InterruptedException {
        Thread.sleep(2000);
        dragAndDropBy(find(sliderItem),x,y);

    }

    public String getSliderValue() {
        return getAttributeBy(sliderValue,"value");
    }
}
