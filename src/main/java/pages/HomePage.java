package pages;

import components.Header;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private Header header;

    public HomePage(WebDriver driver) {
        super(driver);
        header = new Header(driver);
    }

    public Header getHeader() {
       return header;
    }

}
