package utils;

import factory.DriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WaitUtils {
    private WaitUtils() {
    }

    private static WebDriverWait getWait() {
        return new WebDriverWait(DriverProvider.getDriver(), 50);
    }

    public static WebElement forVisibilityOf(WebElement element) {
        return getWait().ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.visibilityOf(element));
    }


    public static List<WebElement> forVisibilityOfList(List<WebElement> webElementList) {
        return getWait().ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.visibilityOfAllElements(webElementList));
    }

    public static Boolean waitTextToBe(By locator, String text) {
        return getWait().ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.textToBe(locator, text));
    }





    public static WebElement elementToBeClickable(WebElement pageElement) {
        return getWait()
                .ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.elementToBeClickable(pageElement));
    }
}
