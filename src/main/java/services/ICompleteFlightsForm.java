package services;

import pages.BasePage;
import pages.FlightResultPage;
import pages.SearchFlightPage;


public interface ICompleteFlightsForm <T extends BasePage>{

    FlightResultPage setInfoAndSearchFlights(T page, String fromCity, String toCity);
}
