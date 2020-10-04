package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitUtils {
    public static boolean waitUntilClickableOfElement(WebDriver driver, WebElement element) {
        return new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(element)) != null;
    }
    public static boolean waitUntilClickableOfElement(WebDriver driver, By by) {
        return new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(driver.findElement(by))) != null;
    }

    public static boolean waitVisibilityOfElement(WebDriver driver, WebElement element) {
        return new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(element)) != null;
    }
}
