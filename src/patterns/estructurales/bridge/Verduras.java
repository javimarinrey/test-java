package patterns.estructurales.bridge;

public class Verduras implements IElaborar {

    public Verduras() {
    }

    @Override
    public void procesar() {
        System.out.println("Lasaña de verduras");
    }
}
