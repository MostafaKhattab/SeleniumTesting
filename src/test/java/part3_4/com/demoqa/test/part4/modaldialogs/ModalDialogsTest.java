package part3_4.com.demoqa.test.part4.modaldialogs;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static com.base.BasePage.delay;

public class ModalDialogsTest extends BaseTest {

    @Test
    public void testModalDialogs(){
        var modalDialogsPage = homePage.goToAlertsFrameWidnows().clickModalDialogs();
        modalDialogsPage.clickSmallModalButton();
        String actualModalText = modalDialogsPage.getModalText();
        String expectedModalText = "This is a small modal. It has very less content";
        Assert.assertEquals(actualModalText, expectedModalText,"\nActual & Expected Modal Text Do Not Match\n");
        delay(1000);
        modalDialogsPage.clickCloseButton();
    }
}
