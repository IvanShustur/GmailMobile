package configurations;

public class PropertiesManager {
    private PropertiesManager() {
    }

    public static String getPlatformName() {return PropertiesReader.readProperties("platform_name_capability");}


    public static String getDeviceName() {
        return PropertiesReader.readProperties("device_name_capability");
    }

    public static String getUdid() {
        return PropertiesReader.readProperties("udid_capability");
    }

    public static String getAppPackage() {
        return PropertiesReader.readProperties("app_package_capability");
    }

    public static String getAppActivity() {
        return PropertiesReader.readProperties("app_activity_capability");
    }

    public static String getCommandTimeOut() {
        return PropertiesReader.readProperties("command_time_out_capability");
    }

    public static String getAppiumServer() {
        return PropertiesReader.readProperties("appium_server");
    }

    public static String getLetterFilePath() {
        return PropertiesReader.readProperties("letter_file_path");
    }


    public static String getLogFilePath() {
        return PropertiesReader.readProperties("log_file_path");
    }
}

