package factory;

import configurations.PropertiesManager;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilitiesFactory {

    public static DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PropertiesManager.getPlatformName());
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, PropertiesManager.getDeviceName());
        capabilities.setCapability(MobileCapabilityType.UDID, PropertiesManager.getUdid());
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, PropertiesManager.getCommandTimeOut());
        capabilities.setCapability("appPackage", PropertiesManager.getAppPackage());
        capabilities.setCapability("appActivity", PropertiesManager.getAppActivity());
        return capabilities;
    }
}
