package part3_4.com.demoqa.test.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.util.List;

public class DropdownTest extends BaseTest {

    @Test
    public void testMultiSelectDropDown() {
        var selectMenu = homePage.goToWidgets().clickSelectMenu();
        selectMenu.selectStandardMulti("Saab");
        selectMenu.selectStandardMulti(3);
        selectMenu.selectStandardMulti("Volvo");
        selectMenu.deselectStandardMulti(3);
        List<String> actualSelectedOptions = selectMenu.getAllSelectedStandardMultiOptions();
        Assert.assertTrue(actualSelectedOptions.contains("Saab"));
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertFalse(actualSelectedOptions.contains("Audi"),"\n Actual Selected Option Does Not Contain Audi \n");

    }
}
