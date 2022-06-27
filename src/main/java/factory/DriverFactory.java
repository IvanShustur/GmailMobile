package factory;

import configurations.PropertiesManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static final Logger log = LogManager.getLogger(DriverFactory.class);

    protected static AppiumDriver<AndroidElement> createDriver() {
        AndroidDriver<AndroidElement> driver;
        driver = new AndroidDriver<>(getURL(), CapabilitiesFactory.getCapabilities());
        setWait(driver, 30);
        driver.currentActivity();
        return driver;
    }

    private static URL getURL() {
        try {
            return new URL(PropertiesManager.getAppiumServer());
        } catch (MalformedURLException e) {
            log.error(e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void setWait(WebDriver driver, int time) {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    private DriverFactory() {
    }
}
