package part3_4.com.demoqa.test.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DateTest extends BaseTest {

    @Test
    public void testSelectingDate(){
        String month = "December";
        String monthNumber="12";
        String day = "31";
        String year = "2034";
        var datepickerpage = homePage.goToWidgets().clickDatePicker();
        datepickerpage.clickSelectDate();
        datepickerpage.selectMonth(month);
        datepickerpage.selectYear(year);
        datepickerpage.clickDay(day);

        String actualDate = datepickerpage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        Assert.assertEquals(actualDate, expectedDate,"\n Actual & Expected dates do not match \n Actual Date "+actualDate+"\n Expected Date "+expectedDate+"\n");
    }
}
