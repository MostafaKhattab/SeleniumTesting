package part3_4.com.demoqa.test.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static com.base.BasePage.delay;

public class LinksTest extends BaseTest {
    @Test
    public void linksTest(){
        var linksPage = homePage.goToElements().clickLinks();
        linksPage.clickLink();
        String linkResponse = linksPage.getLinkResponse();
        Assert.assertEquals(linkResponse,"Link has responded with staus 400 and status text Bad Request","\n Actual result does not match expected result. \n");
    }
}
