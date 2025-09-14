package part3_4.com.demoqa.test.part4.windows;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class BrowserWidnowsTest extends BaseTest {

    @Test
    public void testBrowserWindows(){
        var windowsPage = homePage.goToAlertsFrameWidnows().clickBrowserWindows();
        windowsPage.clickNewTab();
    }
}
