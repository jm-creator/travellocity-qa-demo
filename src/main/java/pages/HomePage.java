package pages;

import components.Header;
import org.openqa.selenium.WebDriver;
import pagesPaths.fligths.HomeToFlightsHeader;
import services.ICompleteFlightsForm;
import services.IFlightsService;

public class HomePage extends BasePage {

    private Header header;

    public IFlightsService getiFlightsService() {
        return iFlightsService;
    }

    private IFlightsService iFlightsService;


    public HomePage(WebDriver driver) {
        super(driver);
        header = new Header(driver);
        this.iFlightsService = new HomeToFlightsHeader();
    }


    public Header getHeader() {
       return header;
    }

}
