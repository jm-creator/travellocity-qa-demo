package ui;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.WebDriverUtils;

public abstract class BaseTest {

    private WebDriver driver;

    @BeforeMethod
    @Parameters
    public void setUp(@Optional(value = "CHROME") String browser) {
        driver = WebDriverUtils.Driver.valueOf(browser).build();
        driver.get(getBaseUrl());
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = false)
    public void shutdown() {
        //if (driver != null) driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getBaseUrl() {
        return "https://www.travelocity.com/";
    }
}
