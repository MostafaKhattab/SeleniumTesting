package part3_4.com.demoqa.test.part4.widgets;

import com.demoqa.pages.widgets.WidgetsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.time.Duration;

public class MouseMovementsTest extends BaseTest {

    @Test
    public void testMouseMovements() throws InterruptedException {
        int x = 180;
        int y = 0;
        var sliderPage = homePage.goToWidgets().clickSliders();
        sliderPage.moveSlider(x,y);
        String actualValue = sliderPage.getSliderValue();
        String expectedValue = "70";
        Assert.assertEquals(actualValue, expectedValue,"\n Slider value is not correct \n");
    }
}
