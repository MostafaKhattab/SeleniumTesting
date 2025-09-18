package utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility extends Utility {

    private static Actions act(){
        return new Actions(driver);
    };

    public static void dragAndDropBy(WebElement sliderItem, int x, int y){
        //Actions act = new Actions(driver);
        act().moveToElement(sliderItem).click().dragAndDropBy(sliderItem,x,y).perform();
    }

    public static void sendKeys(WebElement webElement, String text){
        //Actions act = new Actions(driver);
        act().moveToElement(webElement).click().sendKeys(webElement, Keys.chord(text)).perform();
    }
}
