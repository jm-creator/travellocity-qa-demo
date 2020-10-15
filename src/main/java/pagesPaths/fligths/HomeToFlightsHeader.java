package pagesPaths.fligths;
import components.Header;
import pages.BasePage;
import pages.SearchFlightPage;
import services.IFlightsService;


public class HomeToFlightsHeader implements IFlightsService<Header> {

    @Override
    public SearchFlightPage flightPath(Header headerPage) {
        headerPage.getFlightsLink().click();
        return new SearchFlightPage(headerPage.getDriver());

    }
}


