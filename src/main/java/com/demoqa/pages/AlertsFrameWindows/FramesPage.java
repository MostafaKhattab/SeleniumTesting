package com.demoqa.pages.AlertsFrameWindows;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.SwitchToUtility.*;

public class FramesPage extends AlertsFrameWindowsPage{
    private By textInFrame = By.id("sampleHeading");
    private By headerText = By.xpath("//div[@id='app']//h1[text()='Frames']");
    private String iFrameBigBox = "frame1";
    private int iFrameSmallBox = 1;
    private By iFrameSmallWebElement = By.xpath("//div[@id='frame2Wrapper']/iframe[@id='frame2']");

    public String getTextinBigFrame(){
        switchToFrame(iFrameBigBox);
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text: "+bigFrameText);
        switchToParentFrame();
        return bigFrameText;
    }

    public String getHeaderText(){
        String parentHeaderText = find(headerText).getText();
        System.out.println("Header Text: "+parentHeaderText);
        return parentHeaderText;
    }

    public String getTextinSmallFrame(){
        switchToFrame(iFrameSmallBox);
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text: "+ smallFrameText);
        switchToParentFrame();
        return smallFrameText;
    }

    public String getTextinSmallFrameWebElement(){
        scrollToElementJS(iFrameSmallWebElement);
        switchToFrame(find(iFrameSmallWebElement));
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text: "+ smallFrameText);
        switchToParentFrame();
        return smallFrameText;
    }
}
