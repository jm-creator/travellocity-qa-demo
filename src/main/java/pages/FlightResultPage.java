package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WebDriverWaitUtils;

public class FlightResultPage extends BasePage{

    @FindBy(css = "span.title-city-text")
    private WebElement cityTitle;

    public FlightResultPage(WebDriver driver) {
        super(driver);
    }

    public String getCityTitle() {
        WebDriverWaitUtils.waitVisibilityOfElement(getDriver(), cityTitle);
        return cityTitle.getText();
    }

}
