package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DatePickerUtils {
    public static void selectDate(List<WebElement> days, String day) {
        for (WebElement element: days) {
            if (element.getAttribute("data-day").equals(day)) {
                element.click();
            }
        }
    }
}
