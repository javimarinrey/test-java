package patterns.creacion.singleton;

/**
 * Singleton es un patrón de diseño creacional que nos permite asegurarnos de que una clase tenga una única instancia,
 * a la vez que proporciona un punto de acceso global a dicha instancia.
 */
public class SingletonPattern {

    private static SingletonPattern instance;

    // El constructor privado no permite que se genere un constructor por defecto.
    private SingletonPattern(){}

    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
}
