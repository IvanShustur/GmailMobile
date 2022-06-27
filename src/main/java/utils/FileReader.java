package utils;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class FileReader {
    private FileReader() {
    }

    public static <T> T readObject(String filePath, Class<T> tClass) {
        T t = null;
        try {
            t = new ObjectMapper().readValue(new File(filePath), tClass);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t;
    }
}
