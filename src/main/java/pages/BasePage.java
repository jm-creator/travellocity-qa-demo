package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import services.ICompleteFlightsForm;
import services.IFlightsService;

public abstract class BasePage {

    private WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return driver;
    }


}
