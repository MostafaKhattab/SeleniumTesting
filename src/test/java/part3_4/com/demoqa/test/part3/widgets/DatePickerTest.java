package part3_4.com.demoqa.test.part3.widgets;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.widgets.DatePickerPage;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DatePickerTest extends BaseTest {

    @Test
    public void testDatePicker() {
        var datePickerPage = new HomePage().goToWidgets().clickDatePicker();
    }
}
