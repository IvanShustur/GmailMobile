package utils;

import configurations.PropertiesManager;
import utils.entities.Letter;


public class FileManager {

    public static Letter getLetter() {
        return FileReader.readObject(PropertiesManager.getLetterFilePath(), Letter.class);
    }

    private FileManager() {
    }
}
