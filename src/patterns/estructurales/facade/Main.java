package patterns.estructurales.facade;

/**
 * Este patrón nos permite acceder a un subsistema de forma más sencilla.
 */
public class Main {
    public static void main(String[] args) {
        Facade fachada = new Facade();
        fachada.arrancarCoche();
    }
}
