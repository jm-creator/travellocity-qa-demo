package ui;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.FlightResultPage;
import pages.HomePage;
import pages.SearchFlightPage;
import services.IFlightService;
import utils.WebDriverWaitUtils;

public class TestUno extends BaseTest implements IFlightService {
    @DataProvider(name = "city")
    public Object[][] flightData() {
        return new Object[][] {
                new Object[] {"NNYC", "LLAS", "Select your departure to Las Vegas"},
             //   new Object[] {"LLAS", "NNY", "Select your departure to New York"},
               // new Object[] {"CCAL", "LLAS", "Select your departure to Las Vegas"}
        };
    }

    @Test(dataProvider = "city")
    public void testInterface(String fromCity, String toCity, String expectedTitle) {
        FlightResultPage flightResultPage = goToFlightResultPage(goToSearchFlightPage(new HomePage(getDriver())), fromCity, toCity);
        Assert.assertEquals(flightResultPage.getCityTitle(), expectedTitle);
       Assert.assertTrue(flightResultPage.getFlightCard().sortByDurationSorted(),"some cards are " +
               "nor order by price");
    }
}
