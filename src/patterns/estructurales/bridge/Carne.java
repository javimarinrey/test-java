package patterns.estructurales.bridge;

public class Carne implements IElaborar {

    public Carne() {
    }

    @Override
    public void procesar() {
        System.out.println("Lasaña de carne");
    }
}
