package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class FlightCard extends BasePage {

    @FindBy(xpath = "//li[@data-test-id='offer-listing']")
    private List<WebElement> cards;




    public FlightCard(WebDriver driver) {
        super(driver);
    }
}
