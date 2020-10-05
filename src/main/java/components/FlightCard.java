package components;

import com.google.common.collect.Ordering;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import utils.WebDriverWaitUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightCard extends BasePage {

    @FindBy(xpath = "//li[@data-test-id='offer-listing']")
    private List<WebElement> cards;

    @FindBy(id = "sortDropdown")
    private WebElement sortDropdownBy;

    @FindBy(xpath = "//span[@data-test-id='duration']")
    private List<WebElement> durationFlights;

    public FlightCard(WebDriver driver) {
        super(driver);
    }

    public boolean sortByDurationSorted() {
        WebDriverWaitUtils.waitUntilClickableOfElement(getDriver(), sortDropdownBy);
        Select selectSortedType = new Select(sortDropdownBy);
        selectSortedType.selectByVisibleText("Duration (Shortest)");
      //  WebDriverWaitUtils.waitUntilClickableOfElement(getDriver(), sortDropdownBy);
        WebDriverWaitUtils.waitUntilVisibilityOfElements(getDriver(), durationFlights);
        List<String> timeValueResults = durationFlights.stream()
                .map(WebElement::getText)
                .filter(e -> e.matches("\\d\\dh\\s\\dm|\\dh\\s\\dm"))
                .map(s -> s.replaceAll("h","0"))
                .map(s -> s.replaceAll("[^0-9]", ""))
                .collect(Collectors.toList());

        System.out.println(timeValueResults);
        return Ordering
                .natural()
                .isOrdered(
                        new ArrayList<>(
                                timeValueResults
                                        .stream()
                                        .map(Integer::valueOf)
                                        .collect(Collectors.toList()))
                );
    }
}
