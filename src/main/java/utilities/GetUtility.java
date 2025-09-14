package utilities;

import org.openqa.selenium.By;

import java.util.Set;

public class GetUtility extends Utility{

    public static String getTextBy(By locator){
        return driver.findElement(locator).getText();
    }

    public static String getAttributeBy(By locator,String attributeName){
        return driver.findElement(locator).getAttribute(attributeName);
    }

    public static String getURL(){
        return driver.getCurrentUrl();
    }

    public static String getCurrentHandle(){
        return driver.getWindowHandle();
    }

    public static Set<String> getCurrentHandles(){
        return driver.getWindowHandles();
    }
}
