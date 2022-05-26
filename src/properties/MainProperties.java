package properties;

import java.io.InputStream;
import java.util.Properties;

public class MainProperties {

    public static void main(String[] args) {
        try {

            InputStream in = MainProperties.class.getResourceAsStream("test.properties");
            Properties properties = new Properties();
            properties.load(in);
            System.out.println(properties.getProperty("KEY_TEST"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
