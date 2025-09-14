package part3_4.com.demoqa.test.part4.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

@Test
public class FramesTest extends BaseTest {

    public void testFramesBigBox(){
        var framesPage = homePage.goToAlertsFrameWidnows().clickFrames();
        String actualBigBoxText = framesPage.getTextinBigFrame();
        String expectedBigBoxText = "This is a sample page";
        Assert.assertEquals(actualBigBoxText,expectedBigBoxText,
                "\n Actual and Expected Text do not match \n");
        String actualHeaderText = framesPage.getHeaderText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText,expectedHeaderText,"\n Actual and Expected Text do not match \n");

    }

    public void testFramesSmallBox(){
        var framesPage = homePage.goToAlertsFrameWidnows().clickFrames();
        String actualSmallBoxText = framesPage.getTextinSmallFrameWebElement();
        String expectedSmallBoxText = "This is a sample page";
        Assert.assertEquals(actualSmallBoxText, expectedSmallBoxText,
                "\n Actual and Expected Text do not match \n");
        String actualHeaderText = framesPage.getHeaderText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText,expectedHeaderText,"\n Actual and Expected Text do not match \n");

    }


}
