package patterns.creacion.singleton;

import java.util.Properties;

/**
 * Para aplicaciones que utilicen multi-hilos (threads) no creen diferentes instancias de la clase
 */
public class SingletonPatternMultiThreads {

    /* Atributos */
    private Properties properties;

    private static SingletonPatternMultiThreads instance;

    /* Constructor */
    private SingletonPatternMultiThreads(){
        properties = new Properties();
        properties.setProperty("ENVIRONMENT", "TEST");
    }

    public static SingletonPatternMultiThreads getInstance() {
        if (instance == null) {
            // Bloqueo a nivel de clase, otros hilos no pueden acceder a esta clase.
            // Se asegura de que crea una sola instancia.
            synchronized (SingletonPatternMultiThreads.class) {
                if (instance == null) {
                    instance = new SingletonPatternMultiThreads();
                }
            }
        }
        return instance;
    }

    public Properties getProperties() {
        return properties;
    }
}
