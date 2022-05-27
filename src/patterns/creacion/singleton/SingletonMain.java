package patterns.creacion.singleton;

import java.util.Properties;

public class SingletonMain {

    public static void main(String[] args) {
        Properties properties = SingletonPatternMultiThreads.getInstance().getProperties();
        System.out.println(properties.getProperty("ENVIRONMENT"));
    }

}
