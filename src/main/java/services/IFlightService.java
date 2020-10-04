package services;

import components.Header;
import org.openqa.selenium.WebElement;
import pages.FlightResultPage;
import pages.HomePage;
import pages.SearchFlightPage;
import utils.WebDriverWaitUtils;

public interface IFlightService {

    default SearchFlightPage goToSearchFlightPage(HomePage homePage) {
        Header header = homePage.getHeader();
        header.getFlightsLink().click();
        return new SearchFlightPage(homePage.getDriver());
    }

    default FlightResultPage goToFlightResultPage(SearchFlightPage searchFlightPage, String fromCity, String toCity) {
        WebDriverWaitUtils.waitUntilClickableOfElement(searchFlightPage.getDriver(), searchFlightPage.getLeavingFromButton());

        WebElement leavingFromButton = searchFlightPage.getLeavingFromButton();
        leavingFromButton.click();
        leavingFromButton.sendKeys(fromCity);
        WebDriverWaitUtils.waitUntilClickableOfElement(searchFlightPage.getDriver(), searchFlightPage.getDropDownFromCity());
        searchFlightPage.getDropDownFromCity().click();

        WebElement goingToButton = searchFlightPage.getGoingToButton();
        goingToButton.click();
        goingToButton.sendKeys(toCity);
        WebDriverWaitUtils.waitUntilClickableOfElement(searchFlightPage.getDriver(), searchFlightPage.getSelectLas());
        searchFlightPage.getSelectLas().click();


        searchFlightPage.getSearchButton().click();

        return new FlightResultPage(searchFlightPage.getDriver());
    }

}
