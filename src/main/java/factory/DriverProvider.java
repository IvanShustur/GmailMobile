package factory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class DriverProvider {
    private static AppiumDriver<AndroidElement> DRIVER;

    public static AppiumDriver<AndroidElement> getDriver() {
        if (DRIVER == null) {
            DRIVER = DriverFactory.createDriver();
        }
        return DRIVER;
    }

    public static void closeApp() {
        if (DRIVER != null) {
            DRIVER.closeApp();
            DRIVER = null;
        }
    }


    private DriverProvider() {
    }
}
