package patterns.comportamiento.state;

public class EstadoRojo extends EstadoSemaforo {
    @Override
    public void mostrar() {
        System.out.println("Luz rojo");
    }
}
