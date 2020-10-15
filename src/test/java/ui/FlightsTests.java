package ui;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;
import pagesPaths.fligths.HomeToFlightsHeader;
import pagesPaths.fligths.SetFlightsHeader;
import services.ICompleteFlightsForm;
import services.IFlightsService;
import ui.BaseTest;

public class FlightsTests extends BaseTest {
    @DataProvider(name = "city")
    public Object[][] flightData() {
        return new Object[][] {
                new Object[] {"NNYC", "LLAS"}
        };
    }


    @Test(dataProvider = "city")
    public void sortByDurationFlightResultPageTest(String from, String where){
     HomePage homePage = new HomePage(getDriver());
     homePage.getiFlightsService().flightPath(homePage.getHeader());
     SearchFlightPage searchFlightPage = new SearchFlightPage(getDriver());
     FlightResultPage flightResultPage =
     searchFlightPage.getiCompleteFlightsForm().setInfoAndSearchFlights(searchFlightPage,from,where);
     Assert.assertTrue(flightResultPage.getFlightCard().sortByDurationSorted());
    }



}
