package property;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Doston Bokhodirov, Fri 2:02 AM. 2/4/2022
 */
public abstract class BaseProperty {
    protected Properties property = new Properties();

    protected BaseProperty(String path) {
        load(path);
    }

    private void load(String path) {
        try {
            FileReader fileReader = new FileReader(path);
            property.load(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String get(String key) {
        return property.getProperty(key);
    }
}
