package part3_4.com.demoqa.test.part4.dynamicproperties;

import com.demoqa.pages.elements.DynamicPropertiesPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DynamicPropertiesTest extends BaseTest {

    @Test
    public void testExplicitWait() {
        var dynamicPropertiesPage = homePage.goToElements().clickDynamicProperties();
        String expectedText = "Visible After 5 Seconds";
        String actualText = dynamicPropertiesPage.clickVisibleAfterButton();
        Assert.assertEquals(actualText, expectedText,"Actual and Expected text do not match");
    }

}
