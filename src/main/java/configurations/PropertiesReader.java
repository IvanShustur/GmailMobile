package configurations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
    private static final String PROPERTIES_FILE_PATH = "src/main/resources/config.properties";
    private static final Logger logger = LogManager.getLogger(PropertiesReader.class);
    private static final Properties properties = new Properties();

    private PropertiesReader() {
    }

    public static String readProperties(String key) {
        String value = null;
        try (InputStream input = new FileInputStream(PROPERTIES_FILE_PATH)) {
            properties.load(input);
            value = properties.getProperty(key);
        } catch (IOException e) {
            logger.error("Exception, file does`t exist");
        }
        return value;
    }
}
