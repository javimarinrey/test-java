package patterns.creacion.singleton;

/**
 * Otra forma de implementar un Singleton con Enum.
 * Se crea la instancia una única vez, es accesible globalmente, es bajo demanada o "lazy" y sin problemas en multihilo.
 */
public enum SingletonEnum {
    INSTANCE;

    // Atributos
    private int num;

    // Constructor
    private SingletonEnum() {
        this.num = 7;
        System.out.println("Construido");
    }

    public void metodo() {
        System.out.println("Numero: " + this.num);
    }
}
