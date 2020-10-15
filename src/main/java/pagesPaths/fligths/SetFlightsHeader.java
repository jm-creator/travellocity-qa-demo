package pagesPaths.fligths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.FlightResultPage;
import pages.SearchFlightPage;
import services.ICompleteFlightsForm;
import utils.WebDriverWaitUtils;

public class SetFlightsHeader implements ICompleteFlightsForm<SearchFlightPage> {
    @Override
    public FlightResultPage setInfoAndSearchFlights(SearchFlightPage searchFlightPage, String fromCity, String toCity) {
        WebDriverWait wait = new WebDriverWait(searchFlightPage.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(searchFlightPage.getLeavingFromButton()));

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
