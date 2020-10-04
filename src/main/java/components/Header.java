package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Header extends BasePage {

    private static final String HEADERS_CSS_BASE = "li > a#primary-header-";
    private static final String HEADERS_XPATH_BASE = "//ul[contains(concat('  ', @class, '  '), ' utility-nav') and contains(@data-selected-text, 'Currently selected')]/li";

    @FindBy(xpath = HEADERS_XPATH_BASE + "/a[@id='primary-header-package']")
    private WebElement vacationPagesLink;

    @FindBy(css = HEADERS_CSS_BASE + "hotel")
    private WebElement hotelsLink;

    @FindBy(css = HEADERS_CSS_BASE + "car")
    private WebElement carsLink;

    @FindBy(css = HEADERS_CSS_BASE + "flight")
    private WebElement flightsLink;

    @FindBy(css = HEADERS_CSS_BASE + "cruise")
    private WebElement cruisesLink;

    @FindBy(xpath = HEADERS_XPATH_BASE + "/a[@id='primary-header-activity']")
    private WebElement thingsToDoLink;

    @FindBy(xpath = HEADERS_XPATH_BASE + "/a[@id='primary-header-tripsforme']")
    private WebElement tipsForMeLink;

    @FindBy(xpath = HEADERS_XPATH_BASE + "/a[@id='primary-header-discover']")
    private WebElement discoverLink;

    @FindBy(xpath = HEADERS_XPATH_BASE + "/a[id@='primary-header-vacationRental']")
    private WebElement vacationRentalsLink;

    @FindBy(css = HEADERS_CSS_BASE + "deals")
    private WebElement travelDealsLink;

    @FindBy(css = HEADERS_CSS_BASE + "inspired")
    private WebElement getInspiredLink;

    @FindBy(css = HEADERS_CSS_BASE + "mobile")
    private WebElement mobileLink;

    public Header(WebDriver driver) {
        super(driver);
    }

    public WebElement getVacationPagesLink() {
        return vacationPagesLink;
    }

    public WebElement getHotelsLink() {
        return hotelsLink;
    }

    public WebElement getCarsLink() {
        return carsLink;
    }

    public WebElement getFlightsLink() {
        return flightsLink;
    }

    public WebElement getCruisesLink() {
        return cruisesLink;
    }

    public WebElement getThingsToDoLink() {
        return thingsToDoLink;
    }

    public WebElement getTipsForMeLink() {
        return tipsForMeLink;
    }

    public WebElement getDiscoverLink() {
        return discoverLink;
    }

    public WebElement getVacationRentalsLink() {
        return vacationRentalsLink;
    }

    public WebElement getTravelDealsLink() {
        return travelDealsLink;
    }

    public WebElement getGetInspiredLink() {
        return getInspiredLink;
    }

    public WebElement getMobileLink() {
        return mobileLink;
    }

}
