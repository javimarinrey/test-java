package patterns.creacion.singleton;

/**
 * Para aplicaciones que utilicen multi-hilos (threads) no creen diferentes instancias de la clase
 */
public class SingletonPatternMultiThreads {

    private static SingletonPatternMultiThreads instance;

    private SingletonPatternMultiThreads(){}

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
}
