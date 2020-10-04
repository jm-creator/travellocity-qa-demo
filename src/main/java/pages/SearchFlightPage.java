package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchFlightPage extends BasePage{

    @FindBy(xpath = "//button[@data-stid='location-field-leg1-origin-menu-trigger']")
    private WebElement leavingFromButton;

    @FindBy(xpath = "//button[@data-stid='location-field-leg1-destination-menu-trigger']")
    private WebElement goingToButton;

    @FindBy(id = "d1-btn")
    private WebElement departingDayButton;

    @FindBy(id = "d2-btn")
    private WebElement returningDayButton;

    @FindBy(xpath = "//button[@data-testid='submit-button']")
    private WebElement searchButton;

    @FindBy(xpath = "(//table[@class='uitk-new-date-picker-weeks'])[1]/tbody")
    private WebElement fromDayPicker;

    @FindBy(xpath = "//table[@class='uitk-new-date-picker-weeks'])[2]/tbody")
    private WebElement returnDayPicker;

    @FindBy(xpath = "//li[@data-index=0]/button")
    private WebElement dropDownFromCity;

    @FindBy(xpath = "(//li[@data-index=0]/button)[2]")
    private WebElement dropDownToCity;


    public SearchFlightPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLeavingFromButton() {
        return leavingFromButton;
    }

    public WebElement getGoingToButton() {
        return goingToButton;
    }

    public WebElement getDepartingDayButton() {
        return departingDayButton;
    }

    public WebElement getReturningDayButton() {
        return returningDayButton;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public List<WebElement> getDaysFromPicker() {
        return fromDayPicker.findElements(By.tagName("td"));
    }

    public WebElement getDropDownFromCity() {
        return dropDownFromCity;
    }

    public WebElement getSelectLas() {
        return dropDownToCity;
    }

    public WebElement getFromDayPicker() {
        return fromDayPicker;
    }
}
