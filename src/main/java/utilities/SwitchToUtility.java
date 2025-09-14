package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class SwitchToUtility extends Utility{
    private static WebDriver.TargetLocator switchTo(){
        return driver.switchTo();
    }

    public static String getAlertText(){
        return  switchTo().alert().getText();
    }

    public static void acceptAlert(){
        switchTo().alert().accept();
    }

    public static void dismissAlert(){
        switchTo().alert().dismiss();
    }

    public static void insertTextAlert(String text){
        switchTo().alert().sendKeys(text);
    }

    public static void switchToFrame(String frameName){
        switchTo().frame(frameName);
    }

    public static void switchToFrame(int frameNumber){
        switchTo().frame(frameNumber);
    }

    public static void switchToFrame(WebElement frameWebElement){
        switchTo().frame(frameWebElement);
    }

    public static void switchToParentFrame(){
        switchTo().parentFrame();
    }

    public static void switchToDefaultFrame(){
        switchTo().defaultContent();
    }

    public static void switchToWindow(String windowName){
        switchTo().window(windowName);
    }




}
