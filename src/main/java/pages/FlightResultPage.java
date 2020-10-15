package pages;

import components.FlightCard;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utils.WebDriverWaitUtils;

import java.util.List;

public class FlightResultPage extends BasePage{

    @FindBy(css = "span.title-city-text")
    private WebElement cityTitle;

    @FindBy(id = "flightModuleList")
    private WebElement ulResultsContainer;

    private FlightCard flightCard;


    public FlightResultPage(WebDriver driver) {
        super(driver);
        flightCard = new FlightCard(getDriver());
    }

    public FlightCard getFlightCard(){
        return flightCard;
    }

    public String getCityTitle() {
        WebDriverWaitUtils.waitVisibilityOfElement(getDriver(), cityTitle);
        return cityTitle.getText();
    }





}
