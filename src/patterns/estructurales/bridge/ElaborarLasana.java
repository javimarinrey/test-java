package patterns.estructurales.bridge;

public class ElaborarLasana extends ElaborarAlimento {

    public ElaborarLasana(IElaborar implementador) {
        this.setImplementador(implementador);
    }

    @Override
    public void obtener() {
        System.out.println("Preparando lasaña...");
        this.getImplementador().procesar();
    }
}
