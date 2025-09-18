package part3_4.com.demoqa.test.part4.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class TextBoxKeyboardEventsTest extends BaseTest {
    @Test
    public void textBoxKeyboardEventsTest() throws InterruptedException {
        var textBoxPage = homePage.goToElements().clickTextBox();
        String expectedFullName = "John Doe";
        String expectedEmail = "johndoe@example.com";
        String expectedCurrentAddress = "123 John Doe st" +
                " Selenium City" +
                " Java";
        //Thread.sleep(2000);
        textBoxPage.setFullName(expectedFullName);
        textBoxPage.setEmail(expectedEmail);
        textBoxPage.setCurrentAddress("123 John Doe st");
        textBoxPage.setCurrentAddress("Selenium City");
        textBoxPage.setCurrentAddress("Java");
        textBoxPage.clickSubmitButton();
        String actualFullName = textBoxPage.getFullName();
        String actualEmail = textBoxPage.getEmail();
        String actualCurrentAddress = textBoxPage.getCurrentAddress();
        System.out.println("ActualFullName: " + actualFullName);
        System.out.println("ActualEmail: " + actualEmail);
        System.out.println("ActualCurrentAddress: " + actualCurrentAddress);
        Assert.assertEquals(actualFullName, "Name:"+expectedFullName,"\n Expected and Actual FullName do not match \n");
        Assert.assertEquals(actualEmail, "Email:"+expectedEmail,"\n Expected and Actual Email do not match \n");
        Assert.assertEquals(actualCurrentAddress, "Current Address :"+expectedCurrentAddress,"\n Expected and Actual Current Address do not match \n");
    }
}
