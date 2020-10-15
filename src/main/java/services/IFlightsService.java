package services;

import pages.BasePage;
import pages.SearchFlightPage;

public interface IFlightsService <T extends BasePage> {
    SearchFlightPage flightPath(T page);
}
