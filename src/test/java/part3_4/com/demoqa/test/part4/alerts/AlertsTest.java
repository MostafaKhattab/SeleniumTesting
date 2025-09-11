package part3_4.com.demoqa.test.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.*;

@Test
public class AlertsTest extends BaseTest {


    public void testInformationAlert(){
        String expectedAlertText = "You clicked a button";
        var informationAlert = homePage.goToAlertsFrameWidnows().clickAlerts();
        informationAlert.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(),expectedAlertText,
                "\n Actual and Expected messages do not match. \n");
        acceptAlert();
    }


    public void testConfirmationAlert(){
        String cancelExpectedMessage = "You selected Cancel";
        String confirmExpectedMessage = "You selected Ok";
        var confirmationAlert = homePage.goToAlertsFrameWidnows().clickAlerts();
        confirmationAlert.clickConfirmationAlertButton();
        acceptAlert();
        //dismissAlert();
        String actualResults = confirmationAlert.getConfirmResultMessage();
        Assert.assertEquals(actualResults,confirmExpectedMessage,
                "\n Actual and Expected messages do not match. \n");

    }

    public void testPromptAlert(){
        var promptAlert = homePage.goToAlertsFrameWidnows().clickAlerts();
        promptAlert.clickPromptAlertButton();
        String expectedResult = "You entered ";
        String insertText= "Joe Doe";
        insertTextAlert(insertText);
        acceptAlert();
        String actualResults = promptAlert.getPromptResultMessage();
        Assert.assertEquals(actualResults, expectedResult + insertText,
                "\n Actual and Expected messages do not match. \n");
    }
}
