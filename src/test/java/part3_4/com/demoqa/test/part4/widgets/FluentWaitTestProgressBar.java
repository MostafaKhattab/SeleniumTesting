package part3_4.com.demoqa.test.part4.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class FluentWaitTestProgressBar extends BaseTest {

    @Test
    public void fluentWaitTestProgressBar(){
        var progressBar = homePage.goToWidgets().clickProgressBar();
        progressBar.clickStartStopButton();
        String expectedResult = "Reset";
        String actualResult = progressBar.clickResetButton();
        Assert.assertEquals(actualResult, expectedResult,"\n Actual and Expected results are not the same \n");
    }

}
